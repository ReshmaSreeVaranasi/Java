package javacore;
class Example{
    void add() {
        int a=4,b=6;
        System.out.println("Add is: "+(a+b));
    }
    int  addition() {
        int a=3,b=5;
        return  a+b;
    }
     int  mul(int a,int b) {
         return a * b;
     }
     void sub(int a,int b){
        System.out.println("Sub is:"+(a-b));
    }

}
public class SampleProg {
   public static void main(String[] args)  {
       System.out.println("Hello World");
       Example e=new Example();
       e.add();
      System.out.println("Res is:"+e.addition());
       e.mul(2,9);
       e.sub(4,5);
   }
}
