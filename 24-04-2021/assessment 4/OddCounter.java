import java.util.Scanner;

public class OddCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		    
	        int a[]=new int[10];
	        try {
	        System.out.println("Enter "+a.length+" values into Array");
	        
	        for(int i=0;i<a.length;i++) 
	        {
	            a[i]=s.nextInt();
	        }
	        
	        System.out.println(getOddCount(a));
	    }
	        catch(Exception e) {
	            System.out.println("-1");
	        }

	}

	private static int getOddCount(int[] a) {
		// TODO Auto-generated method stub
		
		 int count=0;
	        for(int i=0;i<a.length;i++) {
	            if(a[i]%2!=0)
	                count++;
	        }
	        return count;
	    }
}
