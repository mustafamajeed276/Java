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

class Cuboid extends Objects {
  
    void showShape() {
        System.out.println("Object type is Cuboid.");
    }
}

class Prism extends Objects {
    
    void showShape() {
        System.out.println("Object type is Prism.");
    }

}

public class object {
    public static void main(String args[]) {
        Objects obj = new Sphere();
        obj.showShape();
        obj = new Cuboid();
        obj.showShape();
        obj = new Prism();
        obj.showShape();
        obj.shape();
    }
}
