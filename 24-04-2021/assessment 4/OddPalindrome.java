import java.util.Scanner;

public class OddPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int startNum,endNum;
	        Scanner s=new Scanner(System.in);
	        System.out.println("enter start number:");
	        startNum=s.nextInt();
	        System.out.println("enter end Number:");
	        endNum=s.nextInt();
		 try {
	            if((startNum>=100||endNum<=999)&&(startNum<endNum))
	                System.out.println(getOddPalindrome(startNum,endNum));
	            else
	                System.out.println(10/0);
	        }
	        catch(Exception e) {
	            System.out.println("Error");
	        }
	    }

	
	public static String getOddPalindrome(int startNum,int endNum) {

        String str="";
        for(int i=startNum;i<=endNum;i++) 
        {
            if(i%2!=0)  
            {
                if(isPalindrome(i)) 
                {
                    str=str+i+",";
                }
            }
        }
        return str;
    }

 

    private static boolean isPalindrome(int i) 
    {
        if(i%10==i/100)
            return true;
        else
            return false;
    }
		
	

}
