package com.pengttyy.pattern.java_pattern.creational.factoryMethod;

public class MLotusRootFriedMeat implements Snack{
	
	private String name;
	
	public MLotusRootFriedMeat(){
		   this.name = "M莲藕炒肉";
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
