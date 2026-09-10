package javacore;

public class StringOutOfBoundException {
    public static void main(String[] args) {

                String str = "Hello";

                try {
                    System.out.println(str.charAt(9));
                }
                catch (StringIndexOutOfBoundsException e) {
                    System.out.println("String index is out of bound");
                }
                
            }
        }
