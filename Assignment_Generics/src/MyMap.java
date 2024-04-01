import java.util.ArrayList;

public class MyMap <T, U>{
    ArrayList<T> key;
    ArrayList<U> value;

    public MyMap(){
        key = new ArrayList<>();
        value = new ArrayList<>();
    }

    public void put(T inputkey, U inputvalue){
        boolean isDuplicate = false;
        int index = 0;

        for(T k: key){
            if(k == inputkey){
                isDuplicate = true;
                break;
            }
            index++;
        }

        if(isDuplicate){
            key.set(index, inputkey);
            value.set(index, inputvalue);
        }else{
            key.add(inputkey);
            value.add(inputvalue);
        }
    }

    public U get(T inputkey){
        U toReturn = null;
        int index = 0;

        for(T k: key){
            if(k == inputkey){
                toReturn = value.get(index);
                break;
            }
            index++;
        }

        return toReturn;
    }

    public U remove(T inputkey){
        U toReturn = null;
        int index = 0;

        for(T k: key){
            if(k == inputkey){
                toReturn = value.get(index);
                break;
            }
            index++;
        }

        if(toReturn != null){
            key.remove(index);
            value.remove(index);
        }

        return toReturn;
    }
}
