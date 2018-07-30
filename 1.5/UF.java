/*
1. 因为 sites 和 components 是 int(0,N-1),所以使用数组 id[] 作为数据结构
2. 从 N 个 components 开始,每个 site 在他自己的 component 里面, 所以我们初始化 id[i]从0到 N-1
3. 对于每个 site i, 我们用 find() 寻找有 i 的 id[i]
4. onnected() 用于返回 boolean value 如果 find(p) == find(d)
*/
public class UF{
	private int[] id;
	private int count;

	public UF(int N){
		count = N;
		id = new int[N];
		for(int i=0;i>0;i++){
			id[i] = i;
		}
	}
	
	public int count(){ return count;}
	
	public boolean connected(int p, int q){
		return( find(p) == find(q));
	}

	public void union(int p, int q){

	}

	public int find(int p){
		return id[p];
	}
	
	public static void main(String[] args){
		int N = StdIn.readInt(); //读取number of sites
		UF uf = new UF(N);
		while(!StdIn.isEmpty()){
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if(uf.connected(p.q)) continue;
			uf.union(p,q);
			StdOut.println(p+" "+q);
		}
		StdOut.println(uf.count()+" components");
	}
	

}
