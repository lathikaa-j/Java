import java.util.*;
class Practice
{
    public static void main(String args[])
    {
        Map<String,Integer> bday = new HashMap<>();
        bday.put("Jothi", 13);
        bday.put("Banu", 30);
        bday.put("Keerthi", 28);
        bday.put("Lathi", 19);
        bday.put("Keerthi", 29);
        System.out.println(bday.get("Lathi"));
        System.out.println(bday.keySet());
        System.out.println(bday.values());

        for(String key: bday.keySet())
            System.out.println(key+ ":" + bday.get(key));
    }
}
