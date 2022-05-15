package com.designpatterns.template;

/**
 * @author Jiahao Wang
 * @Description 钩子方法的体现
 * @create 2022-05-15 18:35
 */
public class PureSoyaMilk extends SoyaMilk {

	// 这个不用执行，就啥也不写就行了
	@Override
	void addIngredient() {
	}

	Boolean wantIngredient() {
		return false;
	}
}
