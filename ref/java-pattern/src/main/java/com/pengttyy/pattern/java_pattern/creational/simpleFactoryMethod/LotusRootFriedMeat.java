package com.pengttyy.pattern.java_pattern.creational.simpleFactoryMethod;

public class LotusRootFriedMeat implements Snack{
	
	private String name;
	
	public LotusRootFriedMeat(){
		   this.name = "莲藕炒肉";
	       System.out.println(name+"快餐初始化！");		
		}
		
		public void cutFood(){
			System.out.println(name+"快餐切菜!");
		}
		
		public void cookRice(){
			System.out.println(name+"快餐煮饭！");
		}
		
		public void cooking(){
			System.out.println(name+"快餐炒菜！");
		}
}
