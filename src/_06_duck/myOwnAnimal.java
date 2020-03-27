package _06_duck;

public class myOwnAnimal {
int grassEaten=100;
String name="hamburger";
public void eatGrass() {
	System.out.println("mmmm grass i've eaten "+grassEaten+" acres");
}
public void lieDown() {
	System.out.println(name+" lies down "+name+" goes to sleep");
}
myOwnAnimal(String name, int grassEaten) {
  	this.name = name;
  	this.grassEaten = grassEaten;
}
public static void main(String[] args) {
myOwnAnimal cow=new myOwnAnimal("hamburger",100);	
cow.eatGrass();
cow.lieDown();
}
}
