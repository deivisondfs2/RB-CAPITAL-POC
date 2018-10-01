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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Favorito service. Represents a row in the &quot;favoritos_itens&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.favorito.model.impl.FavoritoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.favorito.model.impl.FavoritoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Favorito
 * @see com.favorito.model.impl.FavoritoImpl
 * @see com.favorito.model.impl.FavoritoModelImpl
 * @generated
 */
@ProviderType
public interface FavoritoModel extends BaseModel<Favorito> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a favorito model instance should use the {@link Favorito} interface instead.
	 */

	/**
	 * Returns the primary key of this favorito.
	 *
	 * @return the primary key of this favorito
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this favorito.
	 *
	 * @param primaryKey the primary key of this favorito
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the favorito ID of this favorito.
	 *
	 * @return the favorito ID of this favorito
	 */
	public long getFavoritoId();

	/**
	 * Sets the favorito ID of this favorito.
	 *
	 * @param favoritoId the favorito ID of this favorito
	 */
	public void setFavoritoId(long favoritoId);

	/**
	 * Returns the user ID of this favorito.
	 *
	 * @return the user ID of this favorito
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this favorito.
	 *
	 * @param userId the user ID of this favorito
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this favorito.
	 *
	 * @return the user uuid of this favorito
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this favorito.
	 *
	 * @param userUuid the user uuid of this favorito
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the favoritos_itenscol of this favorito.
	 *
	 * @return the favoritos_itenscol of this favorito
	 */
	@AutoEscape
	public String getFavoritos_itenscol();

	/**
	 * Sets the favoritos_itenscol of this favorito.
	 *
	 * @param favoritos_itenscol the favoritos_itenscol of this favorito
	 */
	public void setFavoritos_itenscol(String favoritos_itenscol);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Favorito favorito);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Favorito> toCacheModel();

	@Override
	public Favorito toEscapedModel();

	@Override
	public Favorito toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}