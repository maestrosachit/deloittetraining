package q3;
import java.util.Scanner;
class UserMainCode
{
 	static boolean checkTripplets(int[] a)
 	{
 		//for loop initialization
 		for(int i = 0, len = a.length; i < len ; ++i)
 		{
 			if(i == (len - 2))
       		break;
 			if((a[i] == a[i+1]) && (a[i] == a[i+2]))
       		return true;
       	
 			}
 		return false;
 		}
}
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String str="null";
		
		int l = scanner.nextInt();
		
		int[] a = new int[l];
		for(int i = 0 ; i < l ; ++i)
			a[i]=scanner.nextInt();
		
		if(UserMainCode.checkTripplets(a))
			str="TRUE";
		else
			str="FALSE";
		System.out.println(str);
		
		scanner.close();
	}

}