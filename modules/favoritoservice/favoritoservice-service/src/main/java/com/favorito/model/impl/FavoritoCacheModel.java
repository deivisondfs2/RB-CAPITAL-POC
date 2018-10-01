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

package com.favorito.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.favorito.model.Favorito;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Favorito in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Favorito
 * @generated
 */
@ProviderType
public class FavoritoCacheModel implements CacheModel<Favorito>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavoritoCacheModel)) {
			return false;
		}

		FavoritoCacheModel favoritoCacheModel = (FavoritoCacheModel)obj;

		if (favoritoId == favoritoCacheModel.favoritoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, favoritoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{favoritoId=");
		sb.append(favoritoId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", favoritos_itenscol=");
		sb.append(favoritos_itenscol);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Favorito toEntityModel() {
		FavoritoImpl favoritoImpl = new FavoritoImpl();

		favoritoImpl.setFavoritoId(favoritoId);
		favoritoImpl.setUserId(userId);

		if (favoritos_itenscol == null) {
			favoritoImpl.setFavoritos_itenscol("");
		}
		else {
			favoritoImpl.setFavoritos_itenscol(favoritos_itenscol);
		}

		favoritoImpl.resetOriginalValues();

		return favoritoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		favoritoId = objectInput.readLong();

		userId = objectInput.readLong();
		favoritos_itenscol = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(favoritoId);

		objectOutput.writeLong(userId);

		if (favoritos_itenscol == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(favoritos_itenscol);
		}
	}

	public long favoritoId;
	public long userId;
	public String favoritos_itenscol;
}