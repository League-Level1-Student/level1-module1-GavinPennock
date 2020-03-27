package _05_vault;

public class vault {
int secretCode=10245;
public vault(int anything){
	this.secretCode=anything;
}
public boolean tryCode(int num){
	if(num==secretCode) {
		System.out.println("correct");
		return true;
	}else {
	
	return false;
	}
}
public static void main(String[] args) {
	vault vault=new vault(99999);
	vault.tryCode(10245);
}
}
