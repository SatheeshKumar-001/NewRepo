package for3;

public class useWaterbottle {
	public static void main(String[] args) {
		Waterbottle w1=new Waterbottle();
		w1.brand="Tubeware";
		w1.color="blue";
		w1.price=149;
		w1.isSteel=false;
		w1.capacity=1;
		
		Waterbottle w2=new Waterbottle();
		w2.brand="Milton";
		w2.color="silver";
		w2.price=400;
		w2.isSteel=true;
		w2.capacity=1.5f;
		
		Waterbottle w3=new Waterbottle();
		w3.brand="Steel";
		w3.color="black";
		w3.price=200;
		w3.isSteel=false;
		w3.capacity=1.2f;
		
		Waterbottle[] waterbottles= {w1,w2,w3};
		for(Waterbottle w: waterbottles) {
			if(w.price%2==0) {
				System.out.println(w.brand);
			}
			
		}
	}

}
class Waterbottle {
	String brand;
	String color;
	int price;
	boolean isSteel;
	float capacity;
}