package basic_class_02;

/**
 * 
 * 题目：
	给定一个字符串str1， 只能往str1的后面添加字符变成str2。
	要求1： str2必须包含两个str1， 两个str1可以有重合， 但是不
	能以同一个位置开头。
	要求2： str2尽量短
	最终返回str2
 *
 */
public class Code_02_KMP_ShortestHaveTwice {

	public static String answer(String str) {
		if (str == null || str.length() == 0) {
			return "";
		}
		char[] chas = str.toCharArray();
		if (chas.length == 1) {
			return str + str;
		}
		if (chas.length == 2) {
			return chas[0] == chas[1] ? (str + String.valueOf(chas[0])) : (str + str);
		}
		int endNext = endNextLength(chas);
		return str + str.substring(endNext);
	}

	public static int endNextLength(char[] chas) {
		int[] next = new int[chas.length + 1];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while (pos < next.length) {
			if (chas[pos - 1] == chas[cn]) {
				next[pos++] = ++cn;
			} else if (cn > 0) {
				cn = next[cn];
			} else {
				next[pos++] = 0;
			}
		}
		return next[next.length - 1];
	}

	public static void main(String[] args) {
		String test1 = "a";
		System.out.println(answer(test1));

		String test2 = "aa";
		System.out.println(answer(test2));

		String test3 = "ab";
		System.out.println(answer(test3));

		String test4 = "abcdabcd";
		System.out.println(answer(test4));

		String test5 = "abracadabra";
		System.out.println(answer(test5));

	}

}
