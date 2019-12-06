package com.pengttyy.pattern.java_pattern.creational.abstractFactory;
/**
 * 快餐
 * @author Kai Peng
 *
 */
public  abstract class Snack {
   
   protected Rice rice;
   protected Parts parts;

   public abstract void prepare();
   
   public abstract void cut();
   
   public abstract void cook();
   
   
   
	
}
