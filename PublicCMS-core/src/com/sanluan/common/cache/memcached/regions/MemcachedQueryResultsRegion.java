package com.sanluan.common.cache.memcached.regions;

import java.util.Properties;

import org.hibernate.cache.spi.QueryResultsRegion;
import org.hibernate.cfg.Settings;

import com.sanluan.common.cache.memcached.Memcached;

public class MemcachedQueryResultsRegion extends MemcachedGeneralDataRegion implements QueryResultsRegion {

	public MemcachedQueryResultsRegion(String regionName, Properties properties, Settings settings,
			Memcached memcached) {
		super(regionName, properties, settings, memcached);
	}
}
