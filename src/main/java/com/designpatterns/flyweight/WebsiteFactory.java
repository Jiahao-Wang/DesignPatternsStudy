package com.designpatterns.flyweight;

import java.util.HashMap;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 13:44
 */
public class WebsiteFactory {

	private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

	public Website getWebsiteCategory(String type) {
		if (!pool.containsKey(type)) {
			pool.put(type, new ConcreteWebsite(type));
		}
		return (Website) pool.get(type);
	}

	public int getWebsiteSize() {
		return pool.size();
	}
}
