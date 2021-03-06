package com.happybird.electronic.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


/**
 * 数据存储类型.<br/>
 * 在使用该方法之前, 需要先调用{@link #init(Context)}初始化一下. <br/>
 * <br/>
 * 如果应用程序的Application是继承自{@link BaseApplication}, 则不需要再进行初始化了, 可以直接使用
 * 
 * 
 */
public class ValueStorage {
	private static SharedPreferences sharedPreferences;
	private static Editor editer;

	private ValueStorage() {

	}

	public static void init(Context c) {
		sharedPreferences = c.getSharedPreferences(c.getPackageName(),
				Context.MODE_PRIVATE);
		editer = sharedPreferences.edit();
		editer.commit();
	}

	/**
	 * 如果不存在, 则返回0
	 * 
	 * @param key
	 * @return 某个键对应的值
	 */
	public int getInt(String key) {
		return sharedPreferences.getInt(key, 0);
	}

	public static int getInt(String key, int defVuale) {
		return sharedPreferences.getInt(key, defVuale);
	}

	public static void put(String key, int value) {
		editer.putInt(key, value);
		editer.commit();
	}

	/**
	 * 如果不存在, 则返回0
	 * 
	 * @param key
	 * @return 某个键对应的值
	 */
	public static long getLong(String key) {
		return sharedPreferences.getLong(key, 0);
	}

	public static long getLong(String key, long defValue) {
		return sharedPreferences.getLong(key, defValue);
	}

	public static void put(String key, long value) {
		editer.putLong(key, value);
		editer.commit();
	}

	/**
	 * 如果不存在, 则返回 null
	 * 
	 * @param key
	 * @return 某个键对应的值
	 */
	public static String getString(String key) {
		return sharedPreferences.getString(key, null);
	}

	public static String getString(String key, String defValue) {
		return sharedPreferences.getString(key, defValue);
	}

	public static void put(String key, String value) {
		editer.putString(key, value);
		editer.commit();
	}

	/**
	 * 如果不存在, 则返回false
	 * 
	 * @param key
	 * @return 某个键对应的值
	 */
	public static boolean getBoolean(String key) {
		return sharedPreferences.getBoolean(key, false);
	}

	public static boolean getBoolean(String key, boolean defValue) {
		return sharedPreferences.getBoolean(key, defValue);
	}

	public static void put(String key, boolean value) {
		editer.putBoolean(key, value);
		editer.commit();
	}

	public static void remove(String key) {
		editer.remove(key);
		editer.commit();
	}

}
