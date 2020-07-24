package github_pack;


public class Git_First {
	
void sum(int a , int b) {
		
		System.out.println("sum of a and b " +(a+b));
	}
	
void sum(float a , float b) {
		
		System.out.println("sum of a and b"+ (a+b));
	}

public static void main(String[] args) {
	Git_First ex = new Git_First();
	ex.sum(6, 6);
	ex.sum(6.9F, 6.8F);

}
}
