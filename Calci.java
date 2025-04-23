public class Calci {
    public static void main(String[] args) {
        int a= 10;
        int b=5;
        int sum=a+b;
        int diff=a-b;
        int multi=a*b;
        int div=a/b;
        String magic="===========Magic===========";
        System.out.println("===========Method 1===========");
        System.out.println("Addition of a&b: "+sum);
        System.out.println("Subtraction of a&b: "+diff);
        System.out.println("Multiplication of a&b: "+multi);
        System.out.println("Division of a&b: "+div);
        System.out.println("===========Method 2===========");
        System.out.println("Addition of a&b: "+(a+b));
        System.out.println("Subtraction of a&b: "+(a-b));
        System.out.println("Multiplication of a&b: "+(a*b));
        System.out.println("Division of a&b: "+(a/b));
        System.out.println("Remainder of a&b: "+(a%b));
        System.out.println(magic);
        System.out.println("Addition: "+sum+" Subtraction: "+diff+" Multiplication: "+multi+" Division"+div);
    }
}
