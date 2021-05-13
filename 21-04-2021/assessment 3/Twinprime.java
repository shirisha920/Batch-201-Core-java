

public class Twinprime {
	public static String getTwinprime(int n1,int n2) {
		for(int i=n1;i<=n2;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					count=count+1;
			}
			if(count==2)
				System.out.print(i+","+" ");
		}
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(getTwinprime(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
			
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
