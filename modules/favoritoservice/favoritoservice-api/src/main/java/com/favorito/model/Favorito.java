/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.favorito.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Favorito service. Represents a row in the &quot;favoritos_itens&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FavoritoModel
 * @see com.favorito.model.impl.FavoritoImpl
 * @see com.favorito.model.impl.FavoritoModelImpl
 * @generated
 */
@ImplementationClassName("com.favorito.model.impl.FavoritoImpl")
@ProviderType
public interface Favorito extends FavoritoModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.favorito.model.impl.FavoritoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Favorito, Long> FAVORITO_ID_ACCESSOR = new Accessor<Favorito, Long>() {
			@Override
			public Long get(Favorito favorito) {
				return favorito.getFavoritoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Favorito> getTypeClass() {
				return Favorito.class;
			}
		};
}