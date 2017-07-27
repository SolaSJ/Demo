package com.rf.zzc.demo1;

public class Person {
	//属性
		int age;
		String name;
		private float height;//pravate（修饰符，私有的）是隐藏，使调用者无法调用
		int hand;
		public void speak(){//注意没有static了，不在是静态的
			//this代表的是本对象，谁调用就是谁
			System.out.println(this.name+"是其中一员");
		}
		//对外提供设置身高的方法
		//属性私有的 pravate 修饰符 只能在本类当中使用
	//方法
		public void setHeight(float f){
			
			 this.height=f;//吧设置的值赋值给当前对象
		}
		//对外提供获取身高的方法
		public float getHeight(){
			return this.height;//返回当前对象的身高
		}
		
		//toString转换为字符串来输出也可以在前面输出语句中加入（toString())来改变，得到的结果一样
		
		//有参构造方法
		public Person(String name,float height,int age){
			this.name=name;
			this.height=height;
			this.age=age;
			
			
			
		}
		public Person(String name){
			this.name=name;
			
			
			
		}
		//无参构造方法
		public Person(){
			
		}
		//重载；1：方法名相同 2：参数的个数不同 3：参数的类型不同或者顺序不同
		//创建一个用户类，五个用户，有用户名。密码，余额属性
		
		@Override
		public String toString() {
			return "Person [age=" + age + ", name=" + name + ", height=" + height + ", hand=" + hand + "]";
		}
				
	

}
