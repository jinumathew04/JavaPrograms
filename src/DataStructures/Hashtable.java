package DataStructures;

class Word{
    String w;

    public Word(String key){
        this.w = key;
    }
    int hshCode(){
        int hashVal = 0;
        for(int i=0; i<this.w.length();  i++){
            hashVal = (127 * hashVal + this.w.charAt(i)) % 16908799;
        }
        return hashVal;
    }
}
class Definition{
    String d;

    public Definition(String def){
        this.d = def;
    }
}

class KeyValuePair{
    Word key;
    Definition value;

    public KeyValuePair(Word word, Definition definition){
        this.key = word;
        this.value = definition;
    }
}

public class Hashtable {
    static int size = 0;
    static KeyValuePair[] def = new KeyValuePair[99999999];

    public static void insertItem(Word word, Definition definition){
        int index = word.hshCode();
        while (def[index] != null && !def[index].key.w.equals("DELETED")) {
            index++;
            if(index == def.length){
                index = 0;
            }
        }
        def[index]= new KeyValuePair(word,definition);
        size++;

        if((size/def.length) > 0.7){
            KeyValuePair[] temp = def;
            def = new KeyValuePair[2*99999999];
           int size = 0;
           for( int i=0; i<temp.length; i++){
               if(temp[i] != null){
                  insertItem(temp[i].key,temp[i].value);
               }
           }
        }
    }

    public static Definition find(Word key) {
        int index = key.hshCode();
        while (def[index] != null && !def[index].key.w.equals(key.w)) {
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

    public static void removeItem(Word key){
        int index = key.hshCode();
        while (def[index] != null && !def[index].key.w.equals(key.w)) {
            index++;
            if (index == def.length) {
                index = 0;
            }
        }
        if(def[index] != null){
            def[index].key.w = "DELETED";
            def[index].value.d = "DELETED";
            size--;
        }
    }



    public static void main(String[] args) {

    }
}
