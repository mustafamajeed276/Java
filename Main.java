interface MyInterFace
{
    public void method1();
    public void method2();
}
class Main implements MyInterFace
{
    public void method1()
    {
        System.out.println("Implementation of method1");
    }
    public void method2()
    {
        System.out.println("Implementation of method2");
    }
    public static void main(String args[])
    {
        MyInterFace obj = new Main();
        obj.method1();
        obj.method2();
    }
}