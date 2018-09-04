import edu.princeton.cs.algs4.WeightedQuickUnionUF;
//定义 Percolation 的数据结构
public class Percolation {
    private WeightedQuickUnionUF grid;
    private WeightedQuickUnionUF gridBack;
    private int N;
    private boolean[] NN; //数值类型为布尔型，因为水槽要么有水要么没有水

    public Percolation(int n){
       this.N = N;
       NN = new boolean[N*N];
       grid = new WeightedQuickUnionUF(N*N + 4);
       gridBack = new WeightedQuickUnionUF(N*N + 1);
       for(int i =0; i<N;i++)
           for(int j =0; j<N; j++)
               NN[i*N+j] = false;
    }                // create n-by-n grid, with all sites blocked

    public void open(int row, int col){

    }    // open site (row, col) if it is not open already

    public boolean isOpen(int row, int col){
        return true;
    }  // is site (row, col) open?

    public boolean isFull(int row, int col){
        return true;
    }  // is site (row, col) full?

    public int numberOfOpenSites(){

    }       // number of open sites

    public boolean percolates(){
        return true;
    }              // does the system percolate?

}