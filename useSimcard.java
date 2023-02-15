package for3;

public class useSimcard {
	public static void main(String[] args) {
		Simcard s1=new Simcard();
		s1.registerdName="arun";
		s1.simNumber=837475658l;
		s1.simPrice=150;
		s1.isNano=false;
		
		Simcard s2=new Simcard();
		s2.registerdName="Satheesh";
		s2.simNumber=811040101l;
		s2.simPrice=250;
		s2.isNano=true;
		
		Simcard s3=new Simcard();
		s3.registerdName="manoj";
		s3.simNumber=94785231071l;
		s3.simPrice=200;
		s3.isNano=false;
		
		Simcard[] simcards= {s1,s2,s3};
		Simcard tep=null;
		for(Simcard s: simcards) {
			if(s.simNumber==811040101) {
			tep=s;	
		}
	}
		System.out.println(tep.registerdName+" "+tep.simNumber+" "+tep.simPrice+" "+tep.isNano);

}}
class Simcard {
	long simNumber;
	String registerdName;
	int simPrice;
	boolean isNano;
	
}