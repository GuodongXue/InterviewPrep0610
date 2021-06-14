import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DeleteSpecificElement {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Apple");

        list.add("banana");
        System.out.println(list);

        for(Iterator<String> it = list.iterator(); it.hasNext();){
            String str = it.next();
            if(str.contains("A")){
                list.remove(str);
            }

        }
        System.out.println(list);
    }

}
