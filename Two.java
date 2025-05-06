class Mammals{
    void mam(){
        System.out.println("Inside mammals class");
    }
}

class Lion extends Mammals{
    void roar(){
        System.out.println("Inside Lion class");
    }
}

class Human extends Mammals{
    void hum(){
        System.out.println("Inside Human");
    }
}

class Two{
    public static void main(String args[]){
        Lion obj=new Lion();
        obj.hum();
        obj.roar();
        obj.mam();        
    }
}