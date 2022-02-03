package java_project;
import java.util.Scanner;
abstract class Converter {
	abstract double convert(int type,double value );
}

class Currency extends Converter{
	double convert(int type,double value ) {
		double amt=0;
		if(type == 1) {
			amt=value*74.31;
		}
		else if(type == 2) {
			amt=value*84.91;
		}
		else if(type == 3) {
			amt=value*0.65;
		}
		else if(type == 4) {
			amt=value*0.013;
		}
		else if(type == 5) {
			amt=value*0.012;
		}
		else if(type == 6) {
			amt=value*1.54;
		}
		return amt;
	}
	}

class Distance extends Converter{
	double convert(int type,double value ) {
		double distance=0;
		if(type == 1) {
			distance=value*0.001;
		}
		else if(type == 2) {
			distance=value*1.60934;
		}
		else if(type == 3) {
			distance=value*1000;
		}
		else if(type == 4) {
			distance=value*0.621371;
		}
		return distance;
	}
}

class Time extends Converter{
	double convert(int type,double value ) {
		double time=0;
		if(type == 1) {
			time=value*60;
		}
		else if(type == 2) {
			time=value*3600;
		}
		else if(type == 3) {
			time=value*0.0166667;
		}
		else if(type == 4) {
			time=value*0.000277778;
		}
		return time;
	}
}

class ConverterTest
{
  public static void main(String[] args)
  {
	  double result=0;
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("SELECT CONVERSION TYPE :" );
	  System.out.println("1.Curency Conversion" );
	  System.out.println("2.Distance Conversion" );
	  System.out.println("3.Time Conversion" );
	  System.out.println();
	  int type = sc.nextInt();
	  
	  if (type == 1) {
		  System.out.println("CONVERT FROM :" );
		  System.out.println("1.DOLLAR to INR" );
		  System.out.println("2.EURO to INR" );
		  System.out.println("3.YEN to INR" );
		  System.out.println("4.INR to DOLLAR" );
		  System.out.println("5.INR to EURO" );
		  System.out.println("6.INR to YEN" );
		  int option = sc.nextInt();
		  System.out.println();
		  System.out.println("Enter the Value :");
		  double value = sc.nextDouble();

		  Converter obj = new Currency();
		  result=obj.convert(option,value);
		  System.out.printf("%.2f",result);

	  }
	  
	  else if(type == 2) {
		  System.out.println("CONVERT FROM :" );
		  System.out.println("1.METER to KILOMERER" );
		  System.out.println("2.MILES to KILOMETER" );
		  System.out.println("3.KILOMETER to METER " );
		  System.out.println("4.KILOMETER to MILES" );
		  int option = sc.nextInt();
		  System.out.println();
		  System.out.println("Enter the Value :");
		  double value = sc.nextDouble();

		  Converter obj = new Distance();
		  result=obj.convert(option,value);
		  System.out.printf("%.2f",result);
	  }
	  
	  else if(type == 3) {
		  System.out.println("CONVERT FROM :" );
		  System.out.println("1.HOURS to MINUTES" );
		  System.out.println("2.HOURS to SECONDS" );
		  System.out.println("3.MINUTES TO HOURS" );
		  System.out.println("4.SECONDS TO HOURS" );
		  int option = sc.nextInt();
		  System.out.println();
		  System.out.println("Enter the Value :");
		  double value = sc.nextDouble();

		  Converter obj = new Time();
		  result=obj.convert(option,value);
		  System.out.printf("%.2f",result);
	  }
	  
	  else {
		  System.out.println("SELECT A VALID OPTION");
	  }
	  sc.close();
  }
}

