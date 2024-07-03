import java.util.*;
class TestElseIf{
  public static void main(String[] args){
   int marks;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter marks: ");
   marks = sc.nextInt();
   if(marks <= 100 && marks >= 85){
     System.out.println("Distinction");
   }else if(marks <= 84 && marks >= 65){
     System.out.println("First Class");
   }else if(marks <= 64 && marks >= 35){
     System.out.println("Second class");
   }else{
     System.out.println("See you soon");
   }
  }
}