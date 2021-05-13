
public class SumOfFactors {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				int n=Integer.parseInt(args[0]);
				int sum=0;
				for(int i=1;i<=n;i++) {
					if(n%i==0)
					sum=sum+i;
				}
				System.out.print(sum);
			}
			catch(Exception e){
				System.out.println("error");
			}

		}
}