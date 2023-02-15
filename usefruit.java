package for3;

public class usefruit {
	public static void main(String[] args) {
		fruit f1=new fruit();
		f1.name="mango";
		f1.isHybrid=true;
		f1.price=85;
		f1.kilogram=1;
		
		fruit f2=new fruit();
		f2.name="apple";
		f2.isHybrid=false;
		f2.price=105;
		f2.kilogram=1;
		
		fruit f3=new fruit();
		f3.name="orange";
		f3.isHybrid=true;
		f3.price=90;
		f3.kilogram=1;
		
	/* fruit [] fruits= {f1,f2,f3};
		int max=0;
	      for(fruit f: fruits){
	    	  if(f.price>max) {
	    		  max=f.price;
	    	  }
	      }
	    	  System.out.println("max price"+max);
	      }
}*/
		fruit[] fruits= {f1,f2,f3};
		int min=fruits[0].price;
		for(fruit f: fruits) {
			if(f.price<=min) {
				min=f.price;
			}
		}
		System.out.println("min price "+min);
	}
}

 class fruit {
	String name;
	boolean isHybrid;
	int price;
	int kilogram;
}