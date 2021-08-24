import java.util.*;

public class ArrayTest {
    public static void main(String[] args){
        Stack animals= new Stack();
        animals.push("Cow");
        animals.push("Goats");
        animals.push("Rabbit");

        animals.forEach(animal->{
            System.out.println(animal);
        });
    }
}
