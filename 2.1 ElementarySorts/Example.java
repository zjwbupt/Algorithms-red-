public class Example{
	public static void sort(Comparable[] a){

	}
	private static boolean less(Comparable v, Comparable w){
		return v.comparaTo(w) < 0;
	}

	private static void exch(){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void show(){
		for(int i = 0; i<a.length; i++){
			StdOut.print(a[i] + "");
		}
		StdOut.println();
	}

	public static boolean isSorted(){
		for(int i = 0; i<a.length; i++){
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}

	public static void main(String[] args){
		String[] a = In.readStrings();
		sort(a);
		assert isSorted();
		show(a);
	}
}