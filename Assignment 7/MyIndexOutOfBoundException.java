package Assignment_7;
import java.util.ArrayList;

public class MyIndexOutOfBoundException extends IndexOutOfBoundsException{

    MyIndexOutOfBoundException(int begin, int end, int index){
        super("Error Message: Index: " + index + ", but Lower bound: " + begin + ", Upper bound: " + end + "\n");
    }
    public static void main(String[] args){

        MyArrayList a = new MyArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.newOne(2);
        System.out.println(a.get(1));
    }
}


class MyArrayList{

    ArrayList<Integer> list;
    int end;
    int start;

    MyArrayList(){
        this.list = new ArrayList<>();
        this.start = 0;
        this.end = 0;
    }

    public void add(int i){
        this.list.add(i);
        this.end++;
    }

    public int get(int index){
        check(index);
        return this.list.get(index);
    }

    public void newOne(int index){
        check(index);
        this.start = index;
    }

    private void check(int index){
        if(index > end || index < start)
            throw new MyIndexOutOfBoundException(start,end,index);
    }

}
