package com.im.server.register.center.common.manager;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CommonCache {

	private static final String CAPTCHA_KEY_PREFIX = "CAPTCHA_KEY!";
	@Autowired
	protected RedisTemplate<Object, Object> redisTemplate;

	public void putDefault(String key, String text) {
		put(key, text, 300);// 设置5分钟有效
	}

	public void put(String key, String text) {
		redisTemplate.execute(new RedisCallback<String>() {
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] redisKey = redisTemplate.getStringSerializer().serialize(CAPTCHA_KEY_PREFIX + key);
				connection.set(redisKey, redisTemplate.getStringSerializer().serialize(text));
				return null;
			}
		});
	}

	/**
	 * 指定有效时长
	 * 
	 * @param key
	 * @param text
	 * @param validityTime
	 */
	public void put(String key, String text, int validityTime) {
		redisTemplate.execute(new RedisCallback<String>() {
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] redisKey = redisTemplate.getStringSerializer().serialize(CAPTCHA_KEY_PREFIX + key);
				connection.set(redisKey, redisTemplate.getStringSerializer().serialize(text));
				connection.expire(redisKey, validityTime);// 设置有效时间
				return null;
			}
		});
	}

	public String get(String key) {
		return redisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] byte_key = redisTemplate.getStringSerializer().serialize(CAPTCHA_KEY_PREFIX + key);
				if (connection.exists(byte_key)) {
					byte[] value = connection.get(byte_key);
					String text = redisTemplate.getStringSerializer().deserialize(value);
					return text;
				}
				return null;
			}
		});
	}

	public void delete(String key) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.del(redisTemplate.getStringSerializer().serialize(CAPTCHA_KEY_PREFIX + key));
				return null;
			}
		});
	}

	/***************************************************/
	
	public void putInHash(String id, String key, String value) {
		redisTemplate.execute(new RedisCallback<String>() {
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				redisTemplate.opsForHash().put(id, key, value);
				return null;
			}
		});
	}

	public Object getFromHash(String id, String key) {
		return redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				Object o = redisTemplate.opsForHash().get(id, key);
				return o;
			}
		});
	}

	/***************************************************/
	
	public void addInSet(String key, String value) {
		redisTemplate.execute(new RedisCallback<String>() {
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				redisTemplate.opsForSet().add(key, value);
				return null;
			}
		});
	}

	public void deleteSet(String key, String value) {
		redisTemplate.execute(new RedisCallback<String>() {
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				redisTemplate.opsForSet().remove(key, value);
				return null;
			}
		});
	}

	public void deleteSet(String key, Object... values) {
		redisTemplate.execute(new RedisCallback<String>() {
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				redisTemplate.opsForSet().remove(key, values);
				return null;
			}
		});
	}

	public Set<Object> getSet(String key) {
		Set<Object> set = redisTemplate.execute(new RedisCallback<Set<Object>>() {
			public Set<Object> doInRedis(RedisConnection connection) throws DataAccessException {
				Set<Object> resultSet = redisTemplate.opsForSet().members(key);
				if (resultSet == null) {
					resultSet = new HashSet<Object>();
				}
				return resultSet;
			}
		});
		return set;
	}
}
