package class_08;
/**
 * 
 * 一个数字串，能转变成多少种字母串，有多少种转换方式，数字串对应1-a,2-b等
 * 例如1111可以转变成aaaa,aka,kaa,kk，共四种解法
 */
public class FaceBook {
	
	public static int number(char[] chs, int i) {
		if (i == chs.length) {
			return 1;
		}
		if (chs[i] == '0') {
			return 0;
		}
		if (chs[i] == '1') {
			int res = number(chs, i + 1);
			if(i + 1 < chs.length) {
				res += number(chs, i + 2);
			}
			return res;
		}
		if (chs[i] == '2') {
			int res = number(chs, i + 1);
			if (i + 1 < chs.length 
					&& (chs[i + 1]  >= '0' && chs[i + 1]  <= '6')) {
				res += number(chs, i + 2);
			}
			return res;
		}
		return number(chs, i+1);
	}

}
