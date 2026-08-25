package javacore;

public class ConDemo {
   int rollNo  ;
   String name;
   public ConDemo(int i,String n) {
       this.rollNo=i;
       this.name=n;
       System.out.println("Variables are ready");
    }
    void showDetails() {
       System.out.println("This shows details");
       System.out.println("The roll no is : "+this.rollNo);
        System.out.println("The name is:" +this.name);
    }
public static void main(String[] args){
    ConDemo cd=new ConDemo(123,"Sai");
    cd.showDetails();
}
}
