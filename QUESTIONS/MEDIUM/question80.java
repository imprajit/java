 import java.util.HashMap;
import java.util.Map;
class Main{
    public static void main(String[]args)
    {
HashMap<String, Integer> map = new HashMap<>();
map.put("Alice", 25);
map.put("Bob", 30);
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ":" + entry.getValue());
}
    }
}