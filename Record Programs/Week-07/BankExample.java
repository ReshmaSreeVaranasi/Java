
package javacore;

import java.util.Scanner;

class RBI {
    double rate = 4.0;

    double getRate() {
        return rate;
    }
}

class SBI extends RBI {
    double getRate() {
        return 7.0;
    }
}

class ICICI extends RBI {
    double getRate() {
        return 6.5;
    }
}

class PNB extends RBI {
    double getRate() {
        return 6.0;
    }
}

public class BankExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String name = sc.nextLine();

        RBI b;

        if (name.equalsIgnoreCase("RBI")) {
            b = new RBI();
        } else if (name.equalsIgnoreCase("SBI")) {
            b = new SBI();
        } else if (name.equalsIgnoreCase("ICICI")) {
            b = new ICICI();
        } else if (name.equalsIgnoreCase("PNB")) {
            b = new PNB();
        } else {
            System.out.println("Invalid bank name");
            sc.close();
            return;
        }

        System.out.println("RBI rate of interest is : " + b.getRate() + "%");

        sc.close();
    }
}


Enter the Bank name to find the rate of Interest : RBI
RBI rate of interest is : 4.0%
