package DataStructures;


class KeyValuePair2{
    String key;
    String value;

    public KeyValuePair2(String word, String definition){
        this.key = word;
        this.value = definition;
    }
}

public class HashtableNew {
    static int size = 0;
    static KeyValuePair2[] def = new KeyValuePair2[99999999];

    public static void insertItem(String word, String definition) {
        int index = hshCode(word);
        while (def[index] != null && def[index].key != "DELETED") {
            index++;
            if(index == def.length){
                index = 0;
            }
        }
        def[index] = new KeyValuePair2(word,definition);
        size++;

        if((size/def.length) > 0.7){
            KeyValuePair2[] temp = def;
            def = new KeyValuePair2[2*99999999];
            int size = 0;
            for( int i=0; i<temp.length; i++){
                if(temp[i] != null){
                    insertItem(temp[i].key,temp[i].value);
                }
            }
        }
    }

    public static String find(String key) {
        int index = hshCode(key);
        while (def[index].key != key || def[index] != null) {
            index++;
            if (index == def.length) {
                index = 0;
            }
        }
        if (def[index] != null) {
            return def[index].value;
        } else {
            return null;
        }
    }

    public static void removeItem(String key){
        int index = hshCode(key);
        while (def[index].key != key || def[index] != null) {
            index++;
            if (index == def.length) {
                index = 0;
            }
        }
        if(def[index] != null){
            def[index].key = "DELETED";
            def[index].value = "DELETED";
            size--;
        }
    }

    static int hshCode(String key){
        int hashVal = 0;
        for(int i=0; i < key.length();  i++){
            hashVal = (127 * hashVal + key.charAt(i)) % 16908799;
        }
        return hashVal;
    }

    public static void main(String[] args) {

    }
}
