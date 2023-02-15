package for3;

public class usePencil {
	public static void main(String[] args) {
		Pencil p1=new Pencil();
		p1.brand="Apsara";
		p1.price=15;
		p1.lidSize=0.5f;
		p1.isColour=true;
		p1.barcode=12345678901l;
		
		Pencil p2=new Pencil();
		p2.brand="Camel";
		p2.price=20;
		p2.lidSize=0.7f;
		p2.isColour=false;
		p2.barcode=98765432109l;
		
		Pencil p3=new Pencil();
		p3.brand="nataraj";
		p3.price=5;
		p3.lidSize=0.9f;
		p3.isColour=true;
		p3.barcode=68675767562l;
		
		Pencil p4=new Pencil();
		p4.brand="faber castel";
		p4.price=35;
		p4.lidSize=0.6f;
		p4.isColour=false;
		p4.barcode=1020304050l;
		
		Pencil p5=new Pencil();
		p5.brand="HP";
		p5.price=25;
		p5.lidSize=0.5f;
		p5.isColour=true;
		p5.barcode=12345678901l;
	
		Pencil[] pencils= {p1,p2,p3,p4,p5};
		for(int i=0;i<pencils.length;i++) {
		//	System.out.println(pencils[i].brand);
		//	System.out.println(pencils[i].price);
		//  System.out.println(pencils[i].lidSize);
		//	System.out.println(pencils[i].isColour);
		//	System.out.println(pencils[i].barcode);
			System.out.println(pencils[i].brand+pencils[i].price+pencils[i].lidSize+pencils[i].isColour+pencils[i].barcode);
		}
	}

		}


