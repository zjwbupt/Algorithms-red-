//正整数N --- 二进制表示并且转换为一个String类型的值s
public class ex119{
	public static void main(String[] args){
		int N = StdIn.readInt();
		String s = "";
		for(int n=N; n>0; n/=2)
			s = (n%2)+s;
	}
}