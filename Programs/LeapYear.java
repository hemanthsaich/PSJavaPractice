import java.util.*;
class LeapYear{

    //Using Method
    static boolean checkLeap(int year){
        if( ( year % 400 == 0) || (year % 100 != 0 && year % 4 ==0 )){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start year: ");
        int startYear = sc.nextInt();
		System.out.print("Enter end year: ");
        int endYear = sc.nextInt();
		int count = 0;
		if(startYear > endYear){
			System.out.println("Invalid Range");
		}else{
			for(int i = startYear; i <= endYear; i++){
			
				boolean flag = checkLeap(i);
				if (flag){
					System.out.println(i+" " );

				}
				count++;
			}
			System.out.println(count+" leap years are there.");
		}
        
        //Direct check
        // if( ( year % 400 == 0) || (year % 4 ==0 && year % 100 != 0)){
        //     System.out.println("Leap Year");
        // }else{
        //     System.out.println("Not a leap year");
        // }
    }
}