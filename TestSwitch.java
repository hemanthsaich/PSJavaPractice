import java.util.*;
class TestSwitch{
    public static void main(String[] args){
        String veggies = "caroot";
        switch("parrot"){
            case "carrot":
                System.out.println("carrot purchased");
                // break;           
            case "beans":
                System.out.println("beans purchased");
                break;            
            case "beetroot":
                System.out.println("beetroot purchased");
                // break;                  
            case "potato":
                System.out.println("potato purchased");
                // break;
            default:
                System.out.println("Eggs purchased");
        }
        System.out.println("Program executed");
    }
}