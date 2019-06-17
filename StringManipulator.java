public class StringManipulator{
	public String trimAndConcat(String s1, String s2){
		String s3 = s1.trim() + s2.trim();
		return s3;
	}
	public Integer getIndexorNull(String s4, char c){
		if (s4.indexOf(c) >= 0){
			return s4.indexOf(c);
		}
		else {
			return null;
		}
	}
	public Integer getIndexorNull(String sa, String sb){
		if (sa.indexOf(sb) >= 0){
			return sa.indexOf(sb);
		}
		else {
			return null;
		}
	}
	public String concatSubstring(String sc, int a, int b, String sd){
		return sc.substring(a, b).concat(sd);
	}
}