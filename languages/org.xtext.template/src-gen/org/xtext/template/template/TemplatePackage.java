/**
 */
package org.xtext.template.template;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.template.template.TemplateFactory
 * @model kind="package"
 * @generated
 */
public interface TemplatePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "template";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/template/Template";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "template";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TemplatePackage eINSTANCE = org.xtext.template.template.impl.TemplatePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.TemplateFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.TemplateFileImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getTemplateFile()
   * @generated
   */
  int TEMPLATE_FILE = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE__IMPORT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE__BODY = 3;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.ParameterImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 2;

  /**
   * The feature id for the '<em><b>Defaultexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEFAULTEXP = 3;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.RichStringImpl <em>Rich String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.RichStringImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getRichString()
   * @generated
   */
  int RICH_STRING = 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>Rich String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.RichStringLiteralImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getRichStringLiteral()
   * @generated
   */
  int RICH_STRING_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL__VALUE = XbasePackage.XSTRING_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Rich String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_LITERAL_FEATURE_COUNT = XbasePackage.XSTRING_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.RichStringForLoopImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getRichStringForLoop()
   * @generated
   */
  int RICH_STRING_FOR_LOOP = 4;

  /**
   * The feature id for the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_FOR_LOOP__FOR_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION;

  /**
   * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_FOR_LOOP__EACH_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION;

  /**
   * The feature id for the '<em><b>Declared Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_FOR_LOOP__DECLARED_PARAM = XbasePackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM;

  /**
   * The number of structural features of the '<em>Rich String For Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_FOR_LOOP_FEATURE_COUNT = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.template.template.impl.RichStringIfImpl <em>Rich String If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.template.template.impl.RichStringIfImpl
   * @see org.xtext.template.template.impl.TemplatePackageImpl#getRichStringIf()
   * @generated
   */
  int RICH_STRING_IF = 5;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_IF__IF = XbasePackage.XIF_EXPRESSION__IF;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_IF__THEN = XbasePackage.XIF_EXPRESSION__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_IF__ELSE = XbasePackage.XIF_EXPRESSION__ELSE;

  /**
   * The number of structural features of the '<em>Rich String If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RICH_STRING_IF_FEATURE_COUNT = XbasePackage.XIF_EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.template.template.TemplateFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.template.template.TemplateFile
   * @generated
   */
  EClass getTemplateFile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.template.template.TemplateFile#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see org.xtext.template.template.TemplateFile#getPackage()
   * @see #getTemplateFile()
   * @generated
   */
  EAttribute getTemplateFile_Package();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.TemplateFile#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see org.xtext.template.template.TemplateFile#getImportSection()
   * @see #getTemplateFile()
   * @generated
   */
  EReference getTemplateFile_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.template.template.TemplateFile#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.template.template.TemplateFile#getParams()
   * @see #getTemplateFile()
   * @generated
   */
  EReference getTemplateFile_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.TemplateFile#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.template.template.TemplateFile#getBody()
   * @see #getTemplateFile()
   * @generated
   */
  EReference getTemplateFile_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.template.template.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.template.template.Parameter#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.xtext.template.template.Parameter#getAnnotations()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.template.template.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.template.template.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.template.template.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.template.template.Parameter#getDefaultexp <em>Defaultexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defaultexp</em>'.
   * @see org.xtext.template.template.Parameter#getDefaultexp()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Defaultexp();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.RichString <em>Rich String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String</em>'.
   * @see org.xtext.template.template.RichString
   * @generated
   */
  EClass getRichString();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.RichStringLiteral <em>Rich String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String Literal</em>'.
   * @see org.xtext.template.template.RichStringLiteral
   * @generated
   */
  EClass getRichStringLiteral();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.RichStringForLoop <em>Rich String For Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String For Loop</em>'.
   * @see org.xtext.template.template.RichStringForLoop
   * @generated
   */
  EClass getRichStringForLoop();

  /**
   * Returns the meta object for class '{@link org.xtext.template.template.RichStringIf <em>Rich String If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rich String If</em>'.
   * @see org.xtext.template.template.RichStringIf
   * @generated
   */
  EClass getRichStringIf();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TemplateFactory getTemplateFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.TemplateFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.TemplateFileImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getTemplateFile()
     * @generated
     */
    EClass TEMPLATE_FILE = eINSTANCE.getTemplateFile();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_FILE__PACKAGE = eINSTANCE.getTemplateFile_Package();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_FILE__IMPORT_SECTION = eINSTANCE.getTemplateFile_ImportSection();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_FILE__PARAMS = eINSTANCE.getTemplateFile_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_FILE__BODY = eINSTANCE.getTemplateFile_Body();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.ParameterImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__ANNOTATIONS = eINSTANCE.getParameter_Annotations();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Defaultexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DEFAULTEXP = eINSTANCE.getParameter_Defaultexp();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.RichStringImpl <em>Rich String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.RichStringImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getRichString()
     * @generated
     */
    EClass RICH_STRING = eINSTANCE.getRichString();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.RichStringLiteralImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getRichStringLiteral()
     * @generated
     */
    EClass RICH_STRING_LITERAL = eINSTANCE.getRichStringLiteral();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.RichStringForLoopImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getRichStringForLoop()
     * @generated
     */
    EClass RICH_STRING_FOR_LOOP = eINSTANCE.getRichStringForLoop();

    /**
     * The meta object literal for the '{@link org.xtext.template.template.impl.RichStringIfImpl <em>Rich String If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.template.template.impl.RichStringIfImpl
     * @see org.xtext.template.template.impl.TemplatePackageImpl#getRichStringIf()
     * @generated
     */
    EClass RICH_STRING_IF = eINSTANCE.getRichStringIf();

  }

} //TemplatePackage
