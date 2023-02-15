package for3;

public class useshirt {
	public static void main(String[] args) {
		shirt s1=new shirt();
		s1.brand="PeterEngland";
		s1.price=1499;
		s1.color="white";
		s1.ischecked=true;
		
		shirt s2=new shirt();
		s2.brand="Netplay";
		s2.price=899;
		s2.color="blue";
		s2.ischecked=false;
		
		shirt s3=new shirt();
		s3.brand="levis";
		s3.price=1999;
		s3.color="black";
		s3.ischecked=true;
		shirt[] shirts= {s1,s2,s3};
		for(shirt s: shirts ) {
			if(s.ischecked==true) {
				System.out.println(s.brand);
			}
		}
		
		
	}

}
