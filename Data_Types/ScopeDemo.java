package Data_Types;

public class ScopeDemo {
    // instance variable, global scope
    float pi = 3.14f;

    void circleArea() {
        int r = 10;
        float area = pi * r * r;
        System.out.println("area of circle is " + area);
    }

    public static void main(String[] args) {
        ScopeDemo sd = new ScopeDemo();
        sd.circleArea();
        // sd.area();
    }
    /*
     * void area()
     * {
     * System.out.println("circle area is/t"+area);
     * System.out.println("pi value is "+pi);
     * 
     * }
     */

}
