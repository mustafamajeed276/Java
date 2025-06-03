import java.util.ArrayList;

class arraylst {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cheeta");
        animals.add("Tiger");
        System.out.println("=========Printing current array========");
        System.out.println(animals);
        animals.clear();
        System.out.println("========Printing cleared array========");
        System.out.println("Empty array : " +animals);
        if(animals.isEmpty()){
            System.out.println("Array is empty");
        }
        else{
            System.out.println("Array is not empty");
        }

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheeta");

        System.out.println("THe size of the array is " +animals.size());
        System.out.println("Adding more elements" +animals.add("Dog"));
        animals.remove(2);
        System.out.println(animals);

    }
}