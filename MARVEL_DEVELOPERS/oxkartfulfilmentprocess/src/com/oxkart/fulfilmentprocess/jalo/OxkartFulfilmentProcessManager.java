/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.oxkart.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.oxkart.fulfilmentprocess.constants.OxkartFulfilmentProcessConstants;

public class OxkartFulfilmentProcessManager extends GeneratedOxkartFulfilmentProcessManager
{
	public static final OxkartFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (OxkartFulfilmentProcessManager) em.getExtension(OxkartFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
