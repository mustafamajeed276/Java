class Parent{
    public void sayHello(){
        System.out.println("Hello from parent");
    }
}

class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from Child");
    }
}

class override1{
    public static void main(String[] args){
        //Parent p = new Child();
        Parent p = new Parent();
        p.sayHello();
    }
}