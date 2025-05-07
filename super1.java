class SuperClass
{
    int number = 56;
}

class SubClass extends SuperClass
{
    int number = 96;
    void printNumber(){
        System.out.println(number);
        System.out.println(super.number);
    }
}

class super1{
   public static void main(String args[]){
    SubClass sub= new SubClass();
    sub.printNumber();
   }
}