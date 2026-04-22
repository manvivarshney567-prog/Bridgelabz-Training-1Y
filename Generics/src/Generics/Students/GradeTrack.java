package Generics.Students;

import java.util.HashMap;
import java.util.Map;

public class GradeTrack {
    public static void main(String[] args) {
        Map<String, Double> m=new HashMap<>();
        m.put("ABC",89.2);
        m.put("XYZ",82.3);
        m.put("Nishtha",77.8);
        m.put("Manvi",94.3);
        m.put("SK",73.3);
        System.out.println("List of students:"+m);
        m.put("Vaishnavi",88.9);
        System.out.println("Harsh new Grade value: "+ m.get("Vaishnavi"));
        m.remove("XYZ");
        m.remove("SK");
        System.out.println("List of student after removing student with grade value less then 85%: \n"+m);
    }
}