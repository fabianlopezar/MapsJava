package mapsjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author fabian_esteban.lopez
 */
public class MapsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> mapNombres = new HashMap<>();
        TreeMap<Integer, String> mapNombres1 = new TreeMap<>();
        LinkedHashMap<Integer, String> mapNombres2 = new LinkedHashMap<>();

        mapNombres.put(6, "David");
        mapNombres.put(5, "Alejandro");
        mapNombres.put(1, "Maria");
        mapNombres.put(7, "Sofia");
        mapNombres.put(60, "Andrea");

        mapNombres1.put(6, "David");
        mapNombres1.put(5, "Alejandro");
        mapNombres1.put(1, "Maria");
        mapNombres1.put(7, "Sofia");
        mapNombres1.put(60, "Andrea");

        mapNombres2.put(6, "David");
        mapNombres2.put(5, "Alejandro");
        mapNombres2.put(1, "Maria");
        mapNombres2.put(7, "Sofia");
        mapNombres2.put(60, "Andrea");

        Iterator<Map.Entry<Integer, String>> iterator = mapNombres.entrySet().iterator();
        Iterator<Map.Entry<Integer, String>> iterator1 = mapNombres1.entrySet().iterator();
        Iterator<Map.Entry<Integer, String>> iterator2 = mapNombres2.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> entry1 = iterator1.next();
            System.out.println("Key = " + entry1.getKey() + ", value = " + entry1.getValue());
        }
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> entry2 = iterator2.next();
            System.out.println("Key = " + entry2.getKey() + ", value = " + entry2.getValue());
        }

    }

}
