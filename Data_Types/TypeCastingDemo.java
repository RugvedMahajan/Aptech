package Data_Types;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // code for implict conversion (int-float)
        int a = 10;
        System.out.println("a value is\t" + a);
        float b = a;
        System.out.println("b value is\t" + b);

        // code for explicit conversion(float-int)
        float c = 3.14f;
        System.out.println("float c value is\t" + c);
        int d = (int)c;
        System.out.println("int d value is\t" + d);

    }
}
