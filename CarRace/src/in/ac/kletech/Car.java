package in.ac.kletech;

	class Car
	{
		String color;
		String name;
		int noOfSeats;
		int maxSpeed;
		double speed=0;
	 	
	 Car(String color, String name, int noOfSeats, int maxSpeed)
	 {
	        this.color = color;
	        this.name = name;
	        this.noOfSeats = noOfSeats;
	        this.maxSpeed = maxSpeed;
	 }
	    void accelerate()
	    {//do nothing
	        
	    }
	    void powerBreak()
	    {//do nothing
	        
	    }
	}

	class  BMW extends Car
	{
	    BMW(String color, String name, int noOfSeats, int maxSpeed)
	    {
	        super(color, name, noOfSeats, maxSpeed);
	    }
	    void accelerate()
	    {speed=speed+2;
	     if(speed>=maxSpeed)
	     speed=maxSpeed;
	        
	    }
	    void powerBreak()
	    {speed=speed-45;
	     if(speed<0)
	     speed=0;   
	    }
		
	}
	class  Ferrari extends Car
	{
	    Ferrari(String color, String name, int noOfSeats, int maxSpeed)
	    {
	        super(color, name, noOfSeats, maxSpeed);
	    }
	    void accelerate()
	    {speed=speed+3;
	     if(speed>=maxSpeed)
	     speed=maxSpeed;
	        
	    }
	    void powerBreak()
	    {speed=speed-50;
	     if(speed<0)
	     speed=0;   
	    }
	}
	



