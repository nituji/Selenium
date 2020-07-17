package interviewpackage;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orignumber=407;
		int temp=orignumber;
		int arms=0;
		int rem;
		while(temp>0) {
			rem=temp%10;
			arms+=rem*rem*rem;
			temp=temp/10;
		
		}
if(orignumber==arms) {
	System.out.println("armstrong");
}
else {
	System.out.println("Not armstrong");
	
}
	}

}
