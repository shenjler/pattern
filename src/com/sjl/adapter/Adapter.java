package com.sjl.adapter;

public class Adapter extends Adaptee implements Target{
		@Override
		public void method1() {
			this.method2();
		}
}
