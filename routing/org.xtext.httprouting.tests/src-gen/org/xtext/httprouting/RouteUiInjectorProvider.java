/*
* generated by Xtext
*/
package org.xtext.httprouting;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class RouteUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.httprouting.ui.internal.RouteActivator.getInstance().getInjector("org.xtext.httprouting.Route");
	}
	
}
