//Single Inheritence: Acquring Properties from single parent class 
class A{
    void method1(){
    System.out.println("Inside Parent class");
    }
}

class B extends A{
    void method2(){
    System.out.println("Inside Child class");
    }

    public static void main(String[] args){
        B obj = new B();
        obj.method1();
        obj.method2();
    }
}