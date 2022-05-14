package com.designpatterns.builder.onemorething;

/**
 * @author Jiahao Wang
 * @Description 如果 new 一个类需要传入很多很多参数，可以用 Builder 链式编程，增加可读性
 * @create 2022-05-14 18:59
 */
public class Phone {

	private String cpu;
	private String screen;
	private String memory;
	private String motherboard;

	// 注意这里 private
	private Phone(Builder builder) {
		cpu = builder.cpu;
		screen = builder.screen;
		memory = builder.memory;
		motherboard = builder.motherboard;
	}

	public static final class Builder {
		private String cpu;
		private String screen;
		private String memory;
		private String motherboard;

		public Builder() {
		}

		// return 一个 Builder，让其他参数可以继续往里面传值
		public Builder cpu(String val) {
			cpu = val;
			return this;
		}

		public Builder screen(String val) {
			screen = val;
			return this;
		}

		public Builder memory(String val) {
			memory = val;
			return this;
		}

		public Builder motherboard(String val) {
			motherboard = val;
			return this;
		}

		// 调用 Phone 里私有的构造器，把自己（此 Builder）传进去，让构造器获取自己的属性
		public Phone build() {
			return new Phone(this);
		}

	}

	@Override
	public String toString() {
		return "Phone{" +
				"cpu='" + cpu + '\'' +
				", screen='" + screen + '\'' +
				", memory='" + memory + '\'' +
				", motherboard='" + motherboard + '\'' +
				'}';
	}
}