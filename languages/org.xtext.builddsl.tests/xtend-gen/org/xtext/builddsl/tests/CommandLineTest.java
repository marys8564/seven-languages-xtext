/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.xtext.builddsl.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.builddsl.BuildDSLInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(BuildDSLInjectorProvider.class)
@SuppressWarnings("all")
public class CommandLineTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testStringParameterWithDefault() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("param String projectName = \'Hello\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Start {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("println(projectName)");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    final String file = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("[Task \'Start\']");
    _builder_1.newLine();
    _builder_1.append("Hello");
    _builder_1.newLine();
    this.assertExecute(file, "Start", _builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("[Task \'Start\']");
    _builder_2.newLine();
    _builder_2.append("MyProject");
    _builder_2.newLine();
    this.assertExecute(file, "Start --projectName MyProject", _builder_2.toString());
  }
  
  @Test
  public void testFileParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.File");
    _builder.newLine();
    _builder.newLine();
    _builder.append("param File file");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Check {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(file == null) ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("showHelp(null)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else if(file.exists)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\'yes\')");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\'no\')");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String file = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("[Task \'Check\']");
    _builder_1.newLine();
    _builder_1.append("Build \'MyFile\'");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("Tasks:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Check");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("Parameters:");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("--file <File>");
    _builder_1.newLine();
    _builder_1.newLine();
    this.assertExecute(file, "Check", _builder_1.toString());
    String _property = System.getProperty("user.dir");
    String _plus = ("Check --file " + _property);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("[Task \'Check\']");
    _builder_2.newLine();
    _builder_2.append("yes");
    _builder_2.newLine();
    this.assertExecute(file, _plus, _builder_2.toString());
  }
  
  @Test
  public void testDependencies() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Bar depends Baz {");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Foo depends Bar {");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Baz {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task FooBar depends Bar {");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    final String file = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("[Task \'Baz\']");
    _builder_1.newLine();
    _builder_1.append("[Task \'Bar\']");
    _builder_1.newLine();
    _builder_1.append("[Task \'Foo\']");
    _builder_1.newLine();
    this.assertExecute(file, "Foo", _builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("[Task \'Baz\']");
    _builder_2.newLine();
    _builder_2.append("[Task \'Bar\']");
    _builder_2.newLine();
    _builder_2.append("[Task \'FooBar\']");
    _builder_2.newLine();
    this.assertExecute(file, "FooBar", _builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("[Task \'Baz\']");
    _builder_3.newLine();
    this.assertExecute(file, "Baz", _builder_3.toString());
  }
  
  @Test
  public void testCompileJava() {
    final String tmpDir = System.getProperty("java.io.tmpdir");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.append("import java.io.File");
    _builder.newLine();
    _builder.append("import static org.xtext.builddsl.lib.JavaCompiler.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("param File source");
    _builder.newLine();
    _builder.append("param File dest");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Pre {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task Compile depends Pre {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("javac [");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("sources += source");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("destination = dest");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("]\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    final String file = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("[Task \'Pre\']");
    _builder_1.newLine();
    _builder_1.append("[Task \'Compile\']");
    _builder_1.newLine();
    _builder_1.append("compiling Java files...success.");
    _builder_1.newLine();
    this.assertExecute(file, ("Compile --source testdata/org/xtext/builddsl/tests/SimpleMain.java --dest " + tmpDir), _builder_1.toString());
  }
  
  protected void assertExecute(final CharSequence file, final String cmdline, final String expectedOutput) {
    try {
      final ArrayList<Class<? extends Object>> classes = CollectionLiterals.<Class<?>>newArrayList();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          Class<? extends Object> _compiledClass = it.getCompiledClass();
          classes.add(_compiledClass);
        }
      };
      this._compilationTestHelper.compile(file, _function);
      final Class<? extends Object> clazz = IterableExtensions.<Class<? extends Object>>head(classes);
      ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream();
      final ByteArrayOutputStream out = _byteArrayOutputStream;
      final PrintStream backup = System.out;
      PrintStream _printStream = new PrintStream(out);
      System.setOut(_printStream);
      try {
        final Object instance = clazz.newInstance();
        Class<? extends Object> _superclass = clazz.getSuperclass();
        Method[] _declaredMethods = _superclass.getDeclaredMethods();
        final Function1<Method,Boolean> _function_1 = new Function1<Method,Boolean>() {
          public Boolean apply(final Method it) {
            String _name = it.getName();
            boolean _equals = Objects.equal(_name, "doBuild");
            return Boolean.valueOf(_equals);
          }
        };
        Method _findFirst = IterableExtensions.<Method>findFirst(((Iterable<Method>)Conversions.doWrapArray(_declaredMethods)), _function_1);
        final Procedure1<Method> _function_2 = new Procedure1<Method>() {
          public void apply(final Method it) {
            try {
              it.setAccessible(true);
              String[] _split = cmdline.split(" ");
              it.invoke(instance, ((Object) _split));
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        ObjectExtensions.<Method>operator_doubleArrow(_findFirst, _function_2);
      } finally {
        System.setOut(backup);
      }
      String _string = out.toString();
      Assert.assertEquals(expectedOutput, _string);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
