/*
* generated by Xtext
*/
package org.xtext.template;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TemplateUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.template.ui.internal.TemplateActivator.getInstance().getInjector("org.xtext.template.Template");
	}
	
}
