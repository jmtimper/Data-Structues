package test.HashMapPractice;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * practicing basics of hashmaps and getting confortable with their functionality
 */
public class HashmapPractice {

    /**
     * path to test folder
     */
    String filename = "C:\\Users\\Jeremy\\development\\git\\DataStructures\\src\\input\\twotime.txt";

    /**
     * sets up a Hashmap<String, String> for testing
     * @return map
     */
    private HashMap<String, String> setUp(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("First", "First INSERTED");
        map.put("Second", "Second INSERTED");
        map.put("Third", "Third INSERTED");
        return map;
    }

    /**
     * Below example shows basic HashMap functionalities like creating object, adding entries,
     * getting values by passing key, checking is hashmap is empty or not,
     * deleting an element and size of the HashMap.
     */
    @Test
    public void practiceOne(){
        HashMap<String, String> map = setUp();
        assertEquals("{Second=Second INSERTED, Third=Third INSERTED, First=First INSERTED}", map.toString());
        assertFalse(map.isEmpty());
        assertEquals("Second INSERTED", map.get("Second"));
        map.remove("Third");
        assertEquals("{Second=Second INSERTED, First=First INSERTED}", map.toString());
    }

    /**
     * Below example shows how to read add elements from HashMap.
     * The method keySet() returns all key entries as a set object.
     * Iterating through each key, we can get corresponding value object.
     */
    @Test
    public void practiceTwo(){
        HashMap<String, String> map = setUp();
        Set<String> set = map.keySet();
        for(String k: set)
            System.out.println("Key: " + k + " Value: "  + map.get(k));
        assertEquals(3, set.size());
    }

    /**
     * Below example shows how to copy another collection to HashMap.
     * putAll() method helps us to copy another collections to HashMap object.
     */
    @Test
    public void practiceThree(){
        HashMap<String, String> map = setUp();
        HashMap<String, String> subMap = new HashMap<>();
        subMap.putAll(map);
        assertEquals(map, subMap);
    }


    /**
     * Below example shows how to find whether specified key exists or not.
     * By using containsKey() method you can find out the key existance.
     */
    @Test
    public void practiceFour(){
        HashMap<String, String> map = setUp();
        assertTrue(map.containsKey("First"));
        assertTrue(map.containsValue("First INSERTED"));
        assertFalse(map.containsKey("Fifth"));
        assertFalse(map.containsValue("FURST INSERTED"));
    }

    /**
     * Below example shows how to delete all elements from the given HashMap at one call.
     * By calling clear() method, we can delete all key-value pairs from HashMap.
     */
    @Test
    public void practiceFive(){
        HashMap<String, String> map = setUp();
        assertEquals(3, map.size());
        map.clear();
        assertEquals(0, map.size());
    }

    /**
     * reads in a text file and puts each word into a key
     * iterate the integer if there is duplicates
     */
    @Test
    public void practiceSix(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner file = null;
        try{
            file = new Scanner(new File(filename));
        } catch (Exception e){
            fail("cannot create scanner!");
        }
        while(file.hasNextLine()){
            Scanner line = new Scanner(file.nextLine().replace(",", ""));
            while(line.hasNext()) {
                String key = line.next();
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }
        }
        assertEquals(5, (int)map.get("back"));
        assertEquals("{half=1, community.=2, tippity=1, whole=2, blockbuster=1, picture.=1, I've=1, when=2, years=2, dominate.=1, eagles=1, climb=1, mountain=1, me=1, only=1, killer=1, international=1, in=2, like=1, Violence=1, gotta=2, ruthlessness=1, this=1, 1990=1, an=1, steps=1, I'm=3, We’re=1, superstar.=1, 1=1, 2=1, at=1, guess=1, 6=1, 8=1, 70s=1, champion=1, other=2, game=4, times.=1, what?=1, forward.=1, hop=1, back=5, I=2, video=4, two=2, we’re=1, speed=1, out=1, into=2, world=1, 1994=1, yea=1, top=1, 1993=1, and=2, of=4, muscle=1, Let’s=1, have=1, 1990s=1, wants=1, man=1, said=1, foot=1, a=6, gaming=3, multiple=1, sleazy=1, say=1, domain.=1, rhythm=1, many=3, Trust=1, consecutive=1, really=1, way=1, momentum=1, mountain...but=1, the=11, let’s=1, with=2, Lamborghini=1, VT...everyone's=1, fly=1, up.=1, Diablo=1, online=2, step=1, combined=1, time=2, to=2, You=2, powerhouse=1}", map.toString());
    }

}
