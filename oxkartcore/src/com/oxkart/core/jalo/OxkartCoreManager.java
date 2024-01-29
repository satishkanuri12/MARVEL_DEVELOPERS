/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.oxkart.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.oxkart.core.constants.OxkartCoreConstants;
import com.oxkart.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class OxkartCoreManager extends GeneratedOxkartCoreManager
{
	public static final OxkartCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (OxkartCoreManager) em.getExtension(OxkartCoreConstants.EXTENSIONNAME);
	}
}
