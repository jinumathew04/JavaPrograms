package DataStructures;


class KeyValuePair2{
    String key;
    String value;

    public KeyValuePair2(String key, String value){
        this.key = key;
        this.value = value;
    }
}

public class HashTableNew {
    static int size = 0;
    static KeyValuePair2[] def = new KeyValuePair2[99999999];

    public void insertItem(String word, String definition) {
        int index = hshCode(word);
        while (def[index] != null && !def[index].key.equals("DELETED")) {
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

    public String find(String key) {
        int index = hshCode(key);
        while (def[index] != null && !def[index].key.equals(key)) {
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

    public void removeItem(String key){
        int index = hshCode(key);
        while (def[index] != null && !def[index].key.equals(key)) {
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
        HashTableNew h = new HashTableNew();
        h.insertItem("rose","flower");
        h.insertItem("apple","fruit");
        h.insertItem("carrot","vegetable");
        System.out.println(h.find("apple"));
        System.out.println(h.find("apples"));
        h.removeItem("apple");
        System.out.println(h.find("apple"));
        h.removeItem("mango");
    }
}
