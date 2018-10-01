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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Favorito}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Favorito
 * @generated
 */
@ProviderType
public class FavoritoWrapper implements Favorito, ModelWrapper<Favorito> {
	public FavoritoWrapper(Favorito favorito) {
		_favorito = favorito;
	}

	@Override
	public Class<?> getModelClass() {
		return Favorito.class;
	}

	@Override
	public String getModelClassName() {
		return Favorito.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("favoritoId", getFavoritoId());
		attributes.put("userId", getUserId());
		attributes.put("favoritos_itenscol", getFavoritos_itenscol());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long favoritoId = (Long)attributes.get("favoritoId");

		if (favoritoId != null) {
			setFavoritoId(favoritoId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String favoritos_itenscol = (String)attributes.get("favoritos_itenscol");

		if (favoritos_itenscol != null) {
			setFavoritos_itenscol(favoritos_itenscol);
		}
	}

	@Override
	public Object clone() {
		return new FavoritoWrapper((Favorito)_favorito.clone());
	}

	@Override
	public int compareTo(Favorito favorito) {
		return _favorito.compareTo(favorito);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _favorito.getExpandoBridge();
	}

	/**
	* Returns the favorito ID of this favorito.
	*
	* @return the favorito ID of this favorito
	*/
	@Override
	public long getFavoritoId() {
		return _favorito.getFavoritoId();
	}

	/**
	* Returns the favoritos_itenscol of this favorito.
	*
	* @return the favoritos_itenscol of this favorito
	*/
	@Override
	public String getFavoritos_itenscol() {
		return _favorito.getFavoritos_itenscol();
	}

	/**
	* Returns the primary key of this favorito.
	*
	* @return the primary key of this favorito
	*/
	@Override
	public long getPrimaryKey() {
		return _favorito.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _favorito.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this favorito.
	*
	* @return the user ID of this favorito
	*/
	@Override
	public long getUserId() {
		return _favorito.getUserId();
	}

	/**
	* Returns the user uuid of this favorito.
	*
	* @return the user uuid of this favorito
	*/
	@Override
	public String getUserUuid() {
		return _favorito.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _favorito.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _favorito.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _favorito.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _favorito.isNew();
	}

	@Override
	public void persist() {
		_favorito.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_favorito.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_favorito.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_favorito.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_favorito.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the favorito ID of this favorito.
	*
	* @param favoritoId the favorito ID of this favorito
	*/
	@Override
	public void setFavoritoId(long favoritoId) {
		_favorito.setFavoritoId(favoritoId);
	}

	/**
	* Sets the favoritos_itenscol of this favorito.
	*
	* @param favoritos_itenscol the favoritos_itenscol of this favorito
	*/
	@Override
	public void setFavoritos_itenscol(String favoritos_itenscol) {
		_favorito.setFavoritos_itenscol(favoritos_itenscol);
	}

	@Override
	public void setNew(boolean n) {
		_favorito.setNew(n);
	}

	/**
	* Sets the primary key of this favorito.
	*
	* @param primaryKey the primary key of this favorito
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_favorito.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_favorito.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this favorito.
	*
	* @param userId the user ID of this favorito
	*/
	@Override
	public void setUserId(long userId) {
		_favorito.setUserId(userId);
	}

	/**
	* Sets the user uuid of this favorito.
	*
	* @param userUuid the user uuid of this favorito
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_favorito.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Favorito> toCacheModel() {
		return _favorito.toCacheModel();
	}

	@Override
	public Favorito toEscapedModel() {
		return new FavoritoWrapper(_favorito.toEscapedModel());
	}

	@Override
	public String toString() {
		return _favorito.toString();
	}

	@Override
	public Favorito toUnescapedModel() {
		return new FavoritoWrapper(_favorito.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _favorito.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavoritoWrapper)) {
			return false;
		}

		FavoritoWrapper favoritoWrapper = (FavoritoWrapper)obj;

		if (Objects.equals(_favorito, favoritoWrapper._favorito)) {
			return true;
		}

		return false;
	}

	@Override
	public Favorito getWrappedModel() {
		return _favorito;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _favorito.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _favorito.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_favorito.resetOriginalValues();
	}

	private final Favorito _favorito;
}