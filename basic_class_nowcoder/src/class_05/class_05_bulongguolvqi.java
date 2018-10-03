package class_05;
///**
/**
 * 布隆过滤器
 * 一个int32个bit
 * bit类型的数组
 * 一个url经过多个hash函数得到hashcode % m 在bit数组中相应位置画黑（数组要足够大，空间越大失误率越小）
 * m为bit数组大小
 * m = - (n*lnp)/ ( (ln2)^2 )  n为样本量，p为失误率的要求
 * k = ln2*m/n  k为所需hash函数个数（向上取整）
 * 
 *  实际失误率 （1-e^z)^k    z=-n*k/m
 */
public class class_05_bulongguolvqi {

	public static void main(String[] args) {
		int []arr = new int [1000];//32000
		
		int index = 30000;
		int intIndex = index / 32;
		
		int bitIndex  = index % 32;
		
		System.out.println(intIndex);
		System.out.println(bitIndex);//放在那个桶
		
		arr[intIndex] = (arr[intIndex] | (1 << bitIndex));

	}

}
