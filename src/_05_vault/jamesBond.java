package _05_vault;

public class jamesBond {
public int findCode(vault vault) {
	for(int i=0;i<1000000;i++) {
		vault.tryCode(i);
		if(vault.tryCode(i)) {
			System.out.println(i);
			return i;
		}
	}
	return -1;
	
}
public static void main(String[] args) {
	vault vault=new vault(99999);
	jamesBond bond=new jamesBond();
	bond.findCode(vault);
}
}
