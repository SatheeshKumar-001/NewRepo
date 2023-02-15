package for3;

public class usefan {
	public static void main(String[] args) {
		fan f1=new fan();
		f1.brand="usha";
		f1.price=2000;
		f1.color="Red";
		f1.isWarranty=false;
		
		fan f2=new fan();
		f2.brand="Havells";
		f2.price=4000;
		f2.color="white";
		f2.isWarranty=true;
		
		fan f3=new fan();
		f3.brand="cropton";
		f3.price=3000;
		f3.color="blue";
		f3.isWarranty=false;
		
		/*fan[] fans= {f1,f2,f3};
		for(int i=0;i<fans.length;i++) {
			System.out.println(fans[i].price+(fans[i].price*5/100));
		}
		
	}*/
		/*fan[] fans= {f1,f2,f3};
		for(int i=0;i<fans.length;i++) {
			System.out.println(fans[i].price-(fans[i].price*5/100));
		}
		
	}
}*/     fan[] fans= {f1,f2,f3};
		for(fan f:fans) {
			System.out.println(f.brand);
		}
	}
}





