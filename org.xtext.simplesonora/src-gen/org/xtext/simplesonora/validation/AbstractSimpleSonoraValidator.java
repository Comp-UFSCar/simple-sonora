/*
 * generated by Xtext
 */
package org.xtext.simplesonora.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSimpleSonoraValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.simplesonora.simpleSonora.SimpleSonoraPackage.eINSTANCE);
		return result;
	}
}