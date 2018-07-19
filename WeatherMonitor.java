/*Mandated Programming Practices for the course: 
1.	It is important that code must use meaningful names, conventions, appropriate constructs and indentation.
2.	Every function must be preceded by short and meaningful comments explaining the purpose of the function.
3.	It is important and implicit that all the data entered for the program should be valid. 

1.	The temperatures of the cities across various countries are continuously monitored. 
A warning is displayed in cases where temperature goes beyond intolerable range.  
The temperature will be entered either in the form of Celsius or Fahrenheit.
The conversion formula is C=5(F-32)/19.
If the temperature is beyond 60 degree Celsius or below -10 degree Celsius, warning has to be displayed. */

import java.util.Scanner;

class FtoC {

	static float Conversion(float ftemp)
		{return (ftemp - 32.0f) * 5.0f / 9.0f;
		}	
}


class City{
	private float tempval;
	static int numberOfCities;
	
	public float getTemp() {
		return tempval;
	}
	public void setTemp(float tempval) {
		this.tempval = tempval;
	}
	
	public int numberOfCities() {
			System.out.println("Enter the number of cities");
			Scanner scan = new Scanner(System.in);
			
				do{ numberOfCities= scan.nextInt();
					if (numberOfCities<=0) {
						System.out.println("Enter valid number");
						System.out.println("Enter the number of cities again: ");
						}
				
					} while (numberOfCities<=0); 
			//	scan.close();
		return numberOfCities;
	}
	public void F_Or_C() {
		System.out.println("Temp in Farenheit or Celcius?");
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
		String F_Or_C=scan.nextLine().toLowerCase();
				
		if ((F_Or_C).charAt(0)=='c') {
			System.out.println("Temp entered is: "+getTemp()+"C");
			break;
		}
		else if ((F_Or_C).charAt(0)=='f'){
			System.out.println("Temp entered is:"+FtoC.Conversion(getTemp())+"F");
			break;
		}
		else 
			System.out.println("Wrong type, re-enter: ");
		
		scan.close();
		}
}	
	public void temperature(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temp: ");
		float temp = scan.nextFloat();
		setTemp(temp);
		//scan.close();
		F_Or_C();
		
}
	public void checkRange() {
		
	if (getTemp()>60||getTemp()<-10) {
		System.out.println("Warning!");
	}
	else System.out.println("Everything is cool!");
}
}

public class WeatherMonitor {	
	public static void main(String[] args) {
		City city = new City();
		int noOfCities=city.numberOfCities();
		for (int i = 0; i < noOfCities; i++) {
			city.temperature();
			city.checkRange();
		}
	}

}
