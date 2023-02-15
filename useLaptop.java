package for3;
public class useLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="hp";
		l1.price=30000;
		l1.ramSize=4;
		l1.isTouch=false;
		
		Laptop l2=new Laptop();
		l2.brand="Lenova";
		l2.price=45000;
		l2.ramSize=6;
		l2.isTouch=false;
		
		Laptop l3=new Laptop();
		l3.brand="apple";
		l3.price=80000;
		l3.ramSize=9;
		l3.isTouch=true;
		
		Laptop[] laptops={l1,l2,l3};
	
		for(Laptop l: laptops) {
			if(l.ramSize>8 && l.isTouch==true) {
				System.out.println(l.brand+l.price);
			}

			}
	}
			}


 class Laptop {
	String brand;
	int price;
	boolean isTouch;
	int ramSize;
}
