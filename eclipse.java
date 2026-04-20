

class Person {
    public String name;
   protected int age ;
    private String  SocialSecurityNumber ;
    String Address ;
    Person(String name,int age,String   SocialSecurityNumber,String Address )
    {
    	this.name = name;
    	this.age = age;
    	this.SocialSecurityNumber = SocialSecurityNumber;
    	this.Address = Address;
    	System.out.println("Details of the Employee ");
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println( SocialSecurityNumber);
    	System.out.println(Address);
    }
  
 }
class Employee extends Person 
{
	Employee(String name,int age,String SocialSecurityNumber,String Address)
	{
		super(name,age,SocialSecurityNumber,Address);
		//System.out.println("Hello Employee");
	}
}

public class eclipse {

	public static void main(String[] args) {
	Employee e1 = new Employee("Prajit",12,"3jiett3","India,TamilNadu,Chennai");
	
	
	}

}
