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

package com.favorito.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.favorito.exception.NoSuchFavoritoException;

import com.favorito.model.Favorito;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the favorito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.favorito.service.persistence.impl.FavoritoPersistenceImpl
 * @see FavoritoUtil
 * @generated
 */
@ProviderType
public interface FavoritoPersistence extends BasePersistence<Favorito> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FavoritoUtil} to access the favorito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the favorito in the entity cache if it is enabled.
	*
	* @param favorito the favorito
	*/
	public void cacheResult(Favorito favorito);

	/**
	* Caches the favoritos in the entity cache if it is enabled.
	*
	* @param favoritos the favoritos
	*/
	public void cacheResult(java.util.List<Favorito> favoritos);

	/**
	* Creates a new favorito with the primary key. Does not add the favorito to the database.
	*
	* @param favoritoId the primary key for the new favorito
	* @return the new favorito
	*/
	public Favorito create(long favoritoId);

	/**
	* Removes the favorito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favoritoId the primary key of the favorito
	* @return the favorito that was removed
	* @throws NoSuchFavoritoException if a favorito with the primary key could not be found
	*/
	public Favorito remove(long favoritoId) throws NoSuchFavoritoException;

	public Favorito updateImpl(Favorito favorito);

	/**
	* Returns the favorito with the primary key or throws a {@link NoSuchFavoritoException} if it could not be found.
	*
	* @param favoritoId the primary key of the favorito
	* @return the favorito
	* @throws NoSuchFavoritoException if a favorito with the primary key could not be found
	*/
	public Favorito findByPrimaryKey(long favoritoId)
		throws NoSuchFavoritoException;

	/**
	* Returns the favorito with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param favoritoId the primary key of the favorito
	* @return the favorito, or <code>null</code> if a favorito with the primary key could not be found
	*/
	public Favorito fetchByPrimaryKey(long favoritoId);

	@Override
	public java.util.Map<java.io.Serializable, Favorito> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the favoritos.
	*
	* @return the favoritos
	*/
	public java.util.List<Favorito> findAll();

	/**
	* Returns a range of all the favoritos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoritoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favoritos
	* @param end the upper bound of the range of favoritos (not inclusive)
	* @return the range of favoritos
	*/
	public java.util.List<Favorito> findAll(int start, int end);

	/**
	* Returns an ordered range of all the favoritos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoritoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favoritos
	* @param end the upper bound of the range of favoritos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of favoritos
	*/
	public java.util.List<Favorito> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favorito> orderByComparator);

	/**
	* Returns an ordered range of all the favoritos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavoritoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favoritos
	* @param end the upper bound of the range of favoritos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of favoritos
	*/
	public java.util.List<Favorito> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favorito> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the favoritos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of favoritos.
	*
	* @return the number of favoritos
	*/
	public int countAll();
}