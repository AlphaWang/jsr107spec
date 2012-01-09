/**
 *  Copyright (c) 2011 Terracotta, Inc.
 *  Copyright (c) 2011 Oracle and/or its affiliates.
 *
 *  All rights reserved. Use is subject to license terms.
 */

package javax.cache.event;

/**
 * Invoked if a cache entry is created,
 * for example through a {@link javax.cache.Cache#put(Object, Object)} operation or the action of a {@link javax.cache.CacheLoader}.
 * If an entry for the key existed prior to the operation it is not invoked, as this ia an update.
 * @param <K> the type of keys maintained by the associated cache
 * @param <V> the type of values maintained by the associated cache
 * @see CacheEntryUpdatedListener
 * @author Yannis Cosmadopoulos
 * @author Greg Luck
 * @since 1.0
 */
public interface CacheEntryCreatedListener<K, V> extends CacheEntryListener<K, V> {

    /**
     * Called after the entry has been created (put into the cache where no previous mapping existed).
     * This method is not called if a batch operation was performed.
     *
     * @param event The entry just added.
     * @see #entriesCreated(Iterable)
     * @since 1.0
     */
    void entryCreated(CacheEntryEvent<? extends K, ? extends V> event);

    /**
     * Called after the entries have been created (put into the cache where no previous mapping existed).
     *
     * @param events The entries just added.
     * @since 1.0
     */
    void entriesCreated(Iterable<CacheEntryEvent<? extends K, ? extends V>> events);
}
