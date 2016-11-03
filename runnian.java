 import java.util.*;
 
 public class runnian
 {
 		public static void main(String[] args)
 		{
 				Scanner sc = new Scanner(System.in);
 				int year = Integer.parseInt(sc.nextLine());
 				if((year%4==0&&year%100!=0)||year%400==0)
 					System.out.println(year);
 				else
 					System.out.println("ERROR");
 				
 		}	
 }