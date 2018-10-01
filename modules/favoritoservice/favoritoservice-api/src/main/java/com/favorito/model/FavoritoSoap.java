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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class FavoritoSoap implements Serializable {
	public static FavoritoSoap toSoapModel(Favorito model) {
		FavoritoSoap soapModel = new FavoritoSoap();

		soapModel.setFavoritoId(model.getFavoritoId());
		soapModel.setUserId(model.getUserId());
		soapModel.setFavoritos_itenscol(model.getFavoritos_itenscol());

		return soapModel;
	}

	public static FavoritoSoap[] toSoapModels(Favorito[] models) {
		FavoritoSoap[] soapModels = new FavoritoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FavoritoSoap[][] toSoapModels(Favorito[][] models) {
		FavoritoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FavoritoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FavoritoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FavoritoSoap[] toSoapModels(List<Favorito> models) {
		List<FavoritoSoap> soapModels = new ArrayList<FavoritoSoap>(models.size());

		for (Favorito model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FavoritoSoap[soapModels.size()]);
	}

	public FavoritoSoap() {
	}

	public long getPrimaryKey() {
		return _favoritoId;
	}

	public void setPrimaryKey(long pk) {
		setFavoritoId(pk);
	}

	public long getFavoritoId() {
		return _favoritoId;
	}

	public void setFavoritoId(long favoritoId) {
		_favoritoId = favoritoId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getFavoritos_itenscol() {
		return _favoritos_itenscol;
	}

	public void setFavoritos_itenscol(String favoritos_itenscol) {
		_favoritos_itenscol = favoritos_itenscol;
	}

	private long _favoritoId;
	private long _userId;
	private String _favoritos_itenscol;
}