/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcDistributionChamberElementType;
import org.bimserver.models.ifc2x3tc1.IfcDistributionChamberElementTypeEnum;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Chamber Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDistributionChamberElementTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcDistributionChamberElementTypeImpl extends IfcDistributionFlowElementTypeImpl
		implements IfcDistributionChamberElementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionChamberElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionChamberElementTypeEnum getPredefinedType() {
		return (IfcDistributionChamberElementTypeEnum) eGet(
				Ifc2x3tc1Package.Literals.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE__PREDEFINED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcDistributionChamberElementTypeEnum newPredefinedType) {
		eSet(Ifc2x3tc1Package.Literals.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE__PREDEFINED_TYPE, newPredefinedType);
	}

} //IfcDistributionChamberElementTypeImpl
