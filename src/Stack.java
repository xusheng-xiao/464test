import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> values = new ArrayList<>();

    public void push(int i){
        values.add(i);
    }

    public int pop(){
        int r = values.get(values.size() - 1);
        values.remove(values.size() - 1);
        return r;
    }

    public int size() {
        return values.size();
    }
}
