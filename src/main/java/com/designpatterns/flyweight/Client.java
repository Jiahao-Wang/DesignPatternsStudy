package com.designpatterns.flyweight;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 13:46
 */
public class Client {
	public static void main(String[] args) {

		WebsiteFactory websiteFactory = new WebsiteFactory();

		Website website1 = websiteFactory.getWebsiteCategory("网页");
		website1.use(new User("Tom"));

		Website website2 = websiteFactory.getWebsiteCategory("网页");
		website2.use(new User("Jerry"));

		Website website3 = websiteFactory.getWebsiteCategory("博客");
		website3.use(new User("Bill"));

		System.out.println(websiteFactory.getWebsiteSize());
	}
}
