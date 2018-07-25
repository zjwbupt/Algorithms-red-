public class ex118 {
	public static void main(String[] args){
		System.out.println(('b')); //输出结果是b
		System.out.println(('a'+'b')); //输出结果是195，网上说默认是会转换为相加后的数字输出，所以应该是ab=195？
		System.out.println((char)('a'+4)); //猜测：char(x)将x转换为对应数值的字母，所以a=1，a+4 = 5，对应e
	}

}