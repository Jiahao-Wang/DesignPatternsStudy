package com.designpatterns.template;

/**
 * @author Jiahao Wang
 * @Description 定义了一个算法流程骨架
 * @create 2022-05-15 18:27
 */
public abstract class SoyaMilk {

	// 加了这个 if 就是钩子方法，子类可以重写判定条件来决定要不要执行
	final void make() {
		select();
		if (wantIngredient()) {
			addIngredient();
		}
		soak();
		cook();
	}

	void select() {
		System.out.println("select");
	}

	abstract void addIngredient();

	void soak() {
		System.out.println("soak");
	}

	void cook() {
		System.out.println("cook");
	}

	Boolean wantIngredient() {
		return true;
	}
}
