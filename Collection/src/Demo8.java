interface Animal {
 void sound();
 void eat();
}

class Dog implements Animal {
 @Override
 public void sound() {
 System.out.println("Dog Woof!");
 }

 @Override
 public void eat() {
 System.out.println("Dog eats bones");
 }
}

class Cat implements Animal {
 @Override
 public void sound() {
 System.out.println("Cat meows!");
 }

 @Override
 public void eat() {
 System.out.println("Cat eats fish");
 }
}

public class Demo8 {
 public static void main(String[] args) {
 Dog dog = new Dog();
 Cat cat = new Cat();

 dog.sound();
 dog.eat();

 cat.sound();
 cat.eat();
 }
}
