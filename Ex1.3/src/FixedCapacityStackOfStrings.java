public class FixedCapacityStackOfStrings {
    private String[] a;
    private int n; //size
    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public void push(String item){
        a[n++] = item;
    }

    public String pop(){
        return a[--n];
    }

    public boolean isFull()
    {
        return n == a.length;
    }
}
