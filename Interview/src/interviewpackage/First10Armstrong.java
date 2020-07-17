package interviewpackage;

public class First10Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<1000;i++)
		{  
			int temp=i;
			int arms=0;
			int rem;
			while(temp>0) {
				rem=temp%10;
				arms+=rem*rem*rem;
				temp=temp/10;
			
			}
	    if(i==arms) {
		System.out.println(i);
	       }
		   
	
		}

	}

}
