abstract class Objects{
    abstract void showShape();
    public void shape(){
        System.out.println("Im form abstract class")
    }
}

class Sphere extends Objects{
    void showShape(){
       System.out.println("Object type is sphere.") 
    }
}

class Cuboid extends Objects{
    
}
