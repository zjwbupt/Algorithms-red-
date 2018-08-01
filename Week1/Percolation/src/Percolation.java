import edu.princeton.cs.algs4.WeightedQuickUnionUF;
//定义 Percolation 的数据结构
public class Percolation {
    private WeightedQuickUnionUF grid;
    public Percolation(int n){
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