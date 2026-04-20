//package package_one;

class Count 
{
	static int count = 0;
	int InstanceNumber = 0;

    Count()
 {
	 count=count+1;
	 InstanceNumber = InstanceNumber + 1;
 }
    void display()
    {
    	System.out.println("Static count:"+count);
    	System.out.println("InstanceNumber:"+InstanceNumber);
    }
}
public class statics {

	public static void main(String[] args) {
		Count c1 = new Count();
		
		Count c2 = new Count();
		c2.display();
		c1.display();
	}
	
	
}

