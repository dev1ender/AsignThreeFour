

class  parent{
	parent(){
		System.out.println("this  is parent class counstructor");
	}
	
	static{
		System.out.println("This is static block parent");
		}
}

class child extends parent{
	child(){
		System.out.println("This is child class counstructor");
	}
	static{
		System.out.println("This is static block child");
		}
}

public class AsignThreeFourOne {
	static{
		System.out.println("This is static block");
		}

	public static void main(String[] args) {
		
		child chid = new child();
		

	}

}
