package _06_duck;

public class duck {
int numberOfFriends=10;
String favoriteFood="donuts";
public void quack(){
	System.out.println("quack "+favoriteFood+" quack");	
}
public void waddle() {
	System.out.println("the duck waddled to the pond with his "+numberOfFriends+" friends");
}
duck(String favoriteFood, int numberOfFriends) {
  	this.favoriteFood = favoriteFood;
  	this.numberOfFriends = numberOfFriends;
}
public static void main(String[] args) {
	duck duck=new duck("donuts",100);
	duck.waddle();
	duck.quack();
}
}
