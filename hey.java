class hey {
    public static void main(String[] args) {
        int oddcount=0;
        int evencount=0;
        for(int i=1;i<=10;i=i+1)
        {
            System.out.println(i);
        if(i %2==0)    
          {
              evencount=evencount+1;
              System.out.println("Even number:"+i);
          }
          else
          {
             oddcount=oddcount+1;
              System.out.println("Odd number:"+i);
          }
         System.out.println("Total odd:"+oddcount);
         System.out.println("Total even:"+evencount);
        }
    }
}