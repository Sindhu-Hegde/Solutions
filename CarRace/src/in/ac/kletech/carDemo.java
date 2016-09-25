package in.ac.kletech;

class carDemo
{
	public static void main(String[] args) 
	{
		Ferrari f=new Ferrari("red", "rocket", 2, 350);
         BMW b=new BMW("white", "king", 2, 300);
         for(int i=0;i<=150;i++)
         {
        	 f.accelerate();
        	 b.accelerate();
        	 System.out.println(i+"th seconds speed");
        	 System.out.println("Ferrari="+f.speed+" BMW="+b.speed);
                     
         }
        System.out.println("applying break");
        for(int i=0;i<=7;i++)
         {
        	f.powerBreak();
        	b.powerBreak();
        	System.out.println(i+"th seconds speed after break apply");
        	System.out.println("Ferrari="+f.speed+" BMW="+b.speed);
                     
         }
	}
    
}
