
  interface playable {
	  void play();
  }
   class Guitar implements playable {
	  public  void play()
	   {
		   System.out.println("Just play a guitar");
	   }
	   
   }
   class pioano implements playable{
	   public void play()
	   {
		   System.out.println("Just play a piano");
	   }
   }
public class just {

	public static void main(String[] args) {
		pioano p1 = new pioano();
		p1.play();
		Guitar g1 = new Guitar();
		g1.play();
	}
	
	
}

