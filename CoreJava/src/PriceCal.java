

	import java.util.Scanner;

	public class PriceCal {

		public static void main(String[] args) {
			int TotalPrice=0;
			for(int i=0; i<=100;i++)
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Enetr the bottel price : ");
				int price=s.nextInt();	
				Scanner s1=new Scanner(System.in);
				System.out.println("Enetr the number of bottel : ");
				int numberOfBottel=s1.nextInt();
				int total=price*numberOfBottel;		
				System.out.println("Total="+total);
				TotalPrice=total+TotalPrice;
				Scanner newInput=new Scanner(System.in);
				System.out.println("are you want to calculate other bottle price Type Yes or Type Other than Yes ");
				String Input=newInput.nextLine();
				if(Input.equalsIgnoreCase("Yes"))
				{
					System.out.println("continue");
					continue;
				}
				else
				{
					break;
				}
			}
			
			System.out.println("Complete Total Price="+TotalPrice);
		}
		
	}