import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("black");
        color.add("green");
        for(int i = 0; i < color.size(); i++){
            System.out.println(color.get(i));
        }
        color.add(0, "yellow");
        System.out.println();
        for(int i = 0; i < color.size(); i++){
            System.out.println(color.get(i));
        }
        System.out.println();
        System.out.println(color.get(1));
        color.set(0, "blue");
        System.out.println();
        for(int i = 0; i < color.size(); i++){
            System.out.println(color.get(i));
        }
        System.out.println();
        System.out.println(color.remove(2));
        System.out.println();
        for(int i = 0; i < color.size(); i++){
            System.out.println(color.get(i));
        }
        System.out.println();
        System.out.println(color.contains("black"));
        System.out.println(color.contains("green"));
        System.out.println();

        Collections.sort(color);
        for(String i : color){
            System.out.println(i);
        }
        ArrayList<String> color2 = (ArrayList)color.clone();
        System.out.println();
        for(String i : color2){
            System.out.println(i);
        }
        System.out.println();
        Collections.reverse(color);
        for(String i : color){
            System.out.println(i);
        }
        System.out.println();
        System.out.println(color.equals(color2));
        System.out.println();
        color.clear();
        System.out.println(color.isEmpty());
        System.out.println();
        color.ensureCapacity(100);
        System.out.println(color.size());
        color.add("red");
        color.add("black");
        color.add("green");
        color.trimToSize();
        System.out.println(color.size());

    }
}