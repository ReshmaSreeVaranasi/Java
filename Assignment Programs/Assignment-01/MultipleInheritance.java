package javacore;
interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }

    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }

    void ownProperty() {
        System.out.println("Child has own property");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Child mi = new Child();

        mi.fatherProperty();
        mi.motherProperty();
        mi.ownProperty();
    }
}
