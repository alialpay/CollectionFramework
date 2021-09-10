
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetMain {
    public static void main(String[] args) {
       /* 
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
        
        //HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("Php");
        
        //LinkedHashSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("Php");
        
       //TreeSet 
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("Php");
        
        
        System.out.println("HashSet***************************karışık yazdırdı");
        for (String s: set1) {
            System.out.println(s);
        }
        System.out.println("LinkedHashSet***************************ekleme sırası");
        for (String s: set2) {
            System.out.println(s);
        }
        System.out.println("TreeSet***************************alfabetik yazdırdı");
        for (String s: set3) {
            System.out.println(s);
        }
        System.out.println("");
        System.out.println(set1.contains("Go"));
        System.out.println(set1.contains("Java"));
        System.out.println("");
        
        System.out.println(set1.isEmpty());
        
        System.out.println("");
        
        set1.remove("Java");
        System.out.println("HashSet***************************karışık yazdırdı");
        for (String s: set1) {
            System.out.println(s);
        }
        */
        
        
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        
        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("Javascript");
        set1.add("Php");
        
        
        set2.add("Go");
        set2.add("Java");
        set2.add("Css");
        
        
        Set<String> fark = new HashSet<String>(set2);
        
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);
        
        System.out.println("");
        Set<String> kesisim = new HashSet<String>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);
        
    }
}
