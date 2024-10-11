import java.util.ArrayList;
import java.util.List;

class Node {
    int key;
    int value;

    Node (int key,int value){
        this.key = key;
        this.value = value;
    }
}
 
class HashTable {
    private int size;
    private List<List<Node>> table;

    HashTable(int size){
        this.size = size;
        this.table = new ArrayList<>(size);

        for(int i=0; i<size; i++){
            table.add(new ArrayList<>());
        }
    }

    int hashFunction(int key){
        //System.out.println(key % size);
        return key % size;
    }

    void insert(int key,int value){
        int index = hashFunction(key);
        List<Node>list = table.get(index);
        list.add(new Node(key,value));
    }

    int search(int key){
        int index = hashFunction(key);
        List<Node>list = table.get(index);
        for(Node node : list){
            if(node.key == key){
                return node.value;
            }
        }
        return -1;
    }
}

public class hashing {
    public static void main(String args[]){
        int tableSize = 2;
        int key = 7;

        HashTable hs = new HashTable(tableSize);
        hs.insert(2, 100);
        hs.insert(3, 600);
        hs.insert(5, 200);
        hs.insert(7, 700);

        int result = hs.search(key);

        if(result == -1){
            System.out.println("Value is not found in array");
        }else{
            System.out.println("%d value is %d".formatted(key,result));
        }


    }
}
