
//parent class defined 
class  parent{
	//Counstructor of parent class is defind
	parent(){
		System.out.println("this  is parent class counstructor");
	}
	//static block defiend in parent class
	static{
		System.out.println("This is static block parent");
		}
}

//child class defined which inherit the parent clss
class child extends parent{
	//child class counstructor defined
	child(){
		System.out.println("This is child class counstructor");
	}
	//static blockk is deefined in child class
	static{
		System.out.println("This is static block child");
		}
}

//class that have main method
public class AsignThreeFourOne {
	//static block of main class is defind
	static{
		System.out.println("This is static block");
		}
	//main method defind
	public static void main(String[] args) {
		
		//creating the object of child class for coustrutor calling
		child chid = new child();
		

	}

}
