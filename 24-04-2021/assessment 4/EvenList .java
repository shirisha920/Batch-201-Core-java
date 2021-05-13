import java.util.Scanner;
public class EvenList {
	static int j=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int len=s.nextInt();
        int a[]=new int[len];
        System.out.println("Enter "+len+" values into Array");
        
        for(int i=0;i<len;i++) 
        {
            a[i]=s.nextInt();
        }
        
        int[] b=getEvenArray(a);
        
        for(int i=0;i<j;i++)
        {
            System.out.print(b[i]+" ");
        }
        
    }

 

	private static int[] getEvenArray(int a[]) {
		// TODO Auto-generated method stub
		
		int b[]=new int[a.length];
        if(a.length!=10)
        {
            return  null;
        }
        else 
        {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                b[j]=a[i];
                j++;
            }
        }
        return b;
        }
    }
			
}
	