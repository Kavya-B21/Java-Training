import java.util.*;

public class Main {
    public static void main(String[] args) {
      Set<String> set = new HashSet<>();
      set.add("Apple");
      set.add("Banana");
      set.add("apple");  
      set.add("app");
      System.out.println(set);
      set.remove("Apple");
      System.out.println(set.contains("Apple"));
      System.out.println(set.size());
  }
}