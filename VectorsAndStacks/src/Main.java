
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        
        Vector<String> vector = new Vector<String>();
        
        ArrayList<String> list = new ArrayList<String>();
        
        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("PHP");
        
       /* for(String s : vector){
            System.out.println(s);
        }*/
        
       /* ListIterator<String> iterator = vector.listIterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */
       
      /*  Enumeration<String> enumeration = vector.elements();
        
        while (enumeration.hasMoreElements()) {
            //String nextElement = enumeration.nextElement();
            System.out.println(enumeration.nextElement());
        }
        */
        //System.out.println("İlk Eleman: " + vector.firstElement());
        //System.out.println("Son Eleman: " + vector.lastElement());
       
        
        
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        
        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");
        
      /*  for (String s : stack ) {
            System.out.println(s);
        }
        */
      /*
      Enumeration<String> enumeration = stack.elements();
      
        while (enumeration.hasMoreElements()) {
            String nextElement = enumeration.nextElement();
            
        }
        
        */
        
        System.out.println(stack.peek());
        System.out.println("Son eleman çıkarılıyor: "+stack.pop());
        
        for ( String s : stack ) {
            System.out.println(s);
        }
        
        System.out.println(stack.empty());
        
        System.out.println("");

        while(!stack.empty()){
            System.out.println("Eleman çıkarılıyor: " + stack.pop());
        }
    
        System.out.println(stack.pop());
    
    }
}
