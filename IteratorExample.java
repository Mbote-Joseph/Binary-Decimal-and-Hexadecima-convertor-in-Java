import java.util.*;

public class IteratorExample {
    public static void main(String[] args){
        Stack names = new Stack();
        names.push("Joseph");
        names.push("Claudia");
        names.push("Juma");

        Iterator iterator=names.iterator();
        while(iterator.hasNext()){
            Object value= iterator.next();
            System.out.println(value);
        }
    }
}
