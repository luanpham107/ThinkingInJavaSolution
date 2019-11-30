package chap08Polymorphism.ex02;

public class Circle extends Shape {
    @Override public void draw() {
        System.out.println("Override Circle.draw()"); }
    @Override public void erase() {
        System.out.println("Override Circle.erase()"); }
}