package chap05_array;

public class _03_arrayExample {
	public static void main(String[] args) {
		// 3. chArr의 요소 중 소문자는 대문자로, 대문자는 소문자로 변환하여 convertArr에 저장하세요.
		char[] chArr = {'b', 'I', 't', 'C'};
		// => B i T c 로 변환
		char[] convertArr = new char[4];
		
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
				convertArr[i] = Character.toLowerCase(chArr[i]);
				// toLowerCase = 대문자로 변환
				System.out.println(convertArr[i]);
			} else{
				convertArr[i] = Character.toUpperCase(chArr[i]);
				// toUpperCase = 소문자로 변환
				System.out.println(convertArr[i]);
			}
		}
		
		

	}
}
