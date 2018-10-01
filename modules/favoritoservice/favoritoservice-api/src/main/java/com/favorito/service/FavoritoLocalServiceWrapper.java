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

package com.favorito.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FavoritoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FavoritoLocalService
 * @generated
 */
@ProviderType
public class FavoritoLocalServiceWrapper implements FavoritoLocalService,
	ServiceWrapper<FavoritoLocalService> {
	public FavoritoLocalServiceWrapper(
		FavoritoLocalService favoritoLocalService) {
		_favoritoLocalService = favoritoLocalService;
	}

	/**
	* Adds the favorito to the database. Also notifies the appropriate model listeners.
	*
	* @param favorito the favorito
	* @return the favorito that was added
	*/
	@Override
	public com.favorito.model.Favorito addFavorito(
		com.favorito.model.Favorito favorito) {
		return _favoritoLocalService.addFavorito(favorito);
	}

	/**
	* Creates a new favorito with the primary key. Does not add the favorito to the database.
	*
	* @param favoritoId the primary key for the new favorito
	* @return the new favorito
	*/
	@Override
	public com.favorito.model.Favorito createFavorito(long favoritoId) {
		return _favoritoLocalService.createFavorito(favoritoId);
	}

	/**
	* Deletes the favorito from the database. Also notifies the appropriate model listeners.
	*
	* @param favorito the favorito
	* @return the favorito that was removed
	*/
	@Override
	public com.favorito.model.Favorito deleteFavorito(
		com.favorito.model.Favorito favorito) {
		return _favoritoLocalService.deleteFavorito(favorito);
	}

	/**
	* Deletes the favorito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favoritoId the primary key of the favorito
	* @return the favorito that was removed
	* @throws PortalException if a favorito with the primary key could not be found
	*/
	@Override
	public com.favorito.model.Favorito deleteFavorito(long favoritoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _favoritoLocalService.deleteFavorito(favoritoId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _favoritoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _favoritoLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _favoritoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.favorito.model.impl.FavoritoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _favoritoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.favorito.model.impl.FavoritoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _favoritoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _favoritoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _favoritoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.favorito.model.Favorito fetchFavorito(long favoritoId) {
		return _favoritoLocalService.fetchFavorito(favoritoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _favoritoLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the favorito with the primary key.
	*
	* @param favoritoId the primary key of the favorito
	* @return the favorito
	* @throws PortalException if a favorito with the primary key could not be found
	*/
	@Override
	public com.favorito.model.Favorito getFavorito(long favoritoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _favoritoLocalService.getFavorito(favoritoId);
	}

	/**
	* Returns a range of all the favoritos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.favorito.model.impl.FavoritoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favoritos
	* @param end the upper bound of the range of favoritos (not inclusive)
	* @return the range of favoritos
	*/
	@Override
	public java.util.List<com.favorito.model.Favorito> getFavoritos(int start,
		int end) {
		return _favoritoLocalService.getFavoritos(start, end);
	}

	/**
	* Returns the number of favoritos.
	*
	* @return the number of favoritos
	*/
	@Override
	public int getFavoritosCount() {
		return _favoritoLocalService.getFavoritosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _favoritoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _favoritoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _favoritoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the favorito in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param favorito the favorito
	* @return the favorito that was updated
	*/
	@Override
	public com.favorito.model.Favorito updateFavorito(
		com.favorito.model.Favorito favorito) {
		return _favoritoLocalService.updateFavorito(favorito);
	}

	@Override
	public FavoritoLocalService getWrappedService() {
		return _favoritoLocalService;
	}

	@Override
	public void setWrappedService(FavoritoLocalService favoritoLocalService) {
		_favoritoLocalService = favoritoLocalService;
	}

	private FavoritoLocalService _favoritoLocalService;
}