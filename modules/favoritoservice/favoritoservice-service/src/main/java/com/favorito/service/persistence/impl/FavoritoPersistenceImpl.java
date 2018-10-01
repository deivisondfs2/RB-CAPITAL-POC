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

package com.favorito.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.favorito.exception.NoSuchFavoritoException;

import com.favorito.model.Favorito;
import com.favorito.model.impl.FavoritoImpl;
import com.favorito.model.impl.FavoritoModelImpl;

import com.favorito.service.persistence.FavoritoPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the favorito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FavoritoPersistence
 * @see com.favorito.service.persistence.FavoritoUtil
 * @generated
 */
@ProviderType
public class FavoritoPersistenceImpl extends BasePersistenceImpl<Favorito>
	implements FavoritoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FavoritoUtil} to access the favorito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FavoritoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
			FavoritoModelImpl.FINDER_CACHE_ENABLED, FavoritoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
			FavoritoModelImpl.FINDER_CACHE_ENABLED, FavoritoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
			FavoritoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public FavoritoPersistenceImpl() {
		setModelClass(Favorito.class);
	}

	/**
	 * Caches the favorito in the entity cache if it is enabled.
	 *
	 * @param favorito the favorito
	 */
	@Override
	public void cacheResult(Favorito favorito) {
		entityCache.putResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
			FavoritoImpl.class, favorito.getPrimaryKey(), favorito);

		favorito.resetOriginalValues();
	}

	/**
	 * Caches the favoritos in the entity cache if it is enabled.
	 *
	 * @param favoritos the favoritos
	 */
	@Override
	public void cacheResult(List<Favorito> favoritos) {
		for (Favorito favorito : favoritos) {
			if (entityCache.getResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
						FavoritoImpl.class, favorito.getPrimaryKey()) == null) {
				cacheResult(favorito);
			}
			else {
				favorito.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all favoritos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FavoritoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the favorito.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Favorito favorito) {
		entityCache.removeResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
			FavoritoImpl.class, favorito.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Favorito> favoritos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Favorito favorito : favoritos) {
			entityCache.removeResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
				FavoritoImpl.class, favorito.getPrimaryKey());
		}
	}

	/**
	 * Creates a new favorito with the primary key. Does not add the favorito to the database.
	 *
	 * @param favoritoId the primary key for the new favorito
	 * @return the new favorito
	 */
	@Override
	public Favorito create(long favoritoId) {
		Favorito favorito = new FavoritoImpl();

		favorito.setNew(true);
		favorito.setPrimaryKey(favoritoId);

		return favorito;
	}

	/**
	 * Removes the favorito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param favoritoId the primary key of the favorito
	 * @return the favorito that was removed
	 * @throws NoSuchFavoritoException if a favorito with the primary key could not be found
	 */
	@Override
	public Favorito remove(long favoritoId) throws NoSuchFavoritoException {
		return remove((Serializable)favoritoId);
	}

	/**
	 * Removes the favorito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the favorito
	 * @return the favorito that was removed
	 * @throws NoSuchFavoritoException if a favorito with the primary key could not be found
	 */
	@Override
	public Favorito remove(Serializable primaryKey)
		throws NoSuchFavoritoException {
		Session session = null;

		try {
			session = openSession();

			Favorito favorito = (Favorito)session.get(FavoritoImpl.class,
					primaryKey);

			if (favorito == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFavoritoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(favorito);
		}
		catch (NoSuchFavoritoException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Favorito removeImpl(Favorito favorito) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(favorito)) {
				favorito = (Favorito)session.get(FavoritoImpl.class,
						favorito.getPrimaryKeyObj());
			}

			if (favorito != null) {
				session.delete(favorito);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (favorito != null) {
			clearCache(favorito);
		}

		return favorito;
	}

	@Override
	public Favorito updateImpl(Favorito favorito) {
		boolean isNew = favorito.isNew();

		Session session = null;

		try {
			session = openSession();

			if (favorito.isNew()) {
				session.save(favorito);

				favorito.setNew(false);
			}
			else {
				favorito = (Favorito)session.merge(favorito);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
			FavoritoImpl.class, favorito.getPrimaryKey(), favorito, false);

		favorito.resetOriginalValues();

		return favorito;
	}

	/**
	 * Returns the favorito with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the favorito
	 * @return the favorito
	 * @throws NoSuchFavoritoException if a favorito with the primary key could not be found
	 */
	@Override
	public Favorito findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFavoritoException {
		Favorito favorito = fetchByPrimaryKey(primaryKey);

		if (favorito == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFavoritoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return favorito;
	}

	/**
	 * Returns the favorito with the primary key or throws a {@link NoSuchFavoritoException} if it could not be found.
	 *
	 * @param favoritoId the primary key of the favorito
	 * @return the favorito
	 * @throws NoSuchFavoritoException if a favorito with the primary key could not be found
	 */
	@Override
	public Favorito findByPrimaryKey(long favoritoId)
		throws NoSuchFavoritoException {
		return findByPrimaryKey((Serializable)favoritoId);
	}

	/**
	 * Returns the favorito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the favorito
	 * @return the favorito, or <code>null</code> if a favorito with the primary key could not be found
	 */
	@Override
	public Favorito fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
				FavoritoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Favorito favorito = (Favorito)serializable;

		if (favorito == null) {
			Session session = null;

			try {
				session = openSession();

				favorito = (Favorito)session.get(FavoritoImpl.class, primaryKey);

				if (favorito != null) {
					cacheResult(favorito);
				}
				else {
					entityCache.putResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
						FavoritoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
					FavoritoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return favorito;
	}

	/**
	 * Returns the favorito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param favoritoId the primary key of the favorito
	 * @return the favorito, or <code>null</code> if a favorito with the primary key could not be found
	 */
	@Override
	public Favorito fetchByPrimaryKey(long favoritoId) {
		return fetchByPrimaryKey((Serializable)favoritoId);
	}

	@Override
	public Map<Serializable, Favorito> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Favorito> map = new HashMap<Serializable, Favorito>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Favorito favorito = fetchByPrimaryKey(primaryKey);

			if (favorito != null) {
				map.put(primaryKey, favorito);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
					FavoritoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Favorito)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FAVORITO_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Favorito favorito : (List<Favorito>)q.list()) {
				map.put(favorito.getPrimaryKeyObj(), favorito);

				cacheResult(favorito);

				uncachedPrimaryKeys.remove(favorito.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(FavoritoModelImpl.ENTITY_CACHE_ENABLED,
					FavoritoImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the favoritos.
	 *
	 * @return the favoritos
	 */
	@Override
	public List<Favorito> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Favorito> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Favorito> findAll(int start, int end,
		OrderByComparator<Favorito> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Favorito> findAll(int start, int end,
		OrderByComparator<Favorito> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Favorito> list = null;

		if (retrieveFromCache) {
			list = (List<Favorito>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FAVORITO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAVORITO;

				if (pagination) {
					sql = sql.concat(FavoritoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Favorito>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Favorito>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the favoritos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Favorito favorito : findAll()) {
			remove(favorito);
		}
	}

	/**
	 * Returns the number of favoritos.
	 *
	 * @return the number of favoritos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FAVORITO);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FavoritoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the favorito persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FavoritoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_FAVORITO = "SELECT favorito FROM Favorito favorito";
	private static final String _SQL_SELECT_FAVORITO_WHERE_PKS_IN = "SELECT favorito FROM Favorito favorito WHERE favoritoId IN (";
	private static final String _SQL_COUNT_FAVORITO = "SELECT COUNT(favorito) FROM Favorito favorito";
	private static final String _ORDER_BY_ENTITY_ALIAS = "favorito.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Favorito exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(FavoritoPersistenceImpl.class);
}