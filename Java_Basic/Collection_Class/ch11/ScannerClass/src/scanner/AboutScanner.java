package scanner;
import java.util.Scanner;

public class AboutScanner {
	public static void main(String[] args) {
		
		
		/*
		 
		 Scanner(String source)
		 Scanner(File source)
		 Scanner(InputStream source)
		 Scanner(Readable source)
		 Scanner(ReadableByteChannel source)
		 Scanner(Path source)
		 
		 *Delimiter : 구분자
		 *regex : 문자열의 일정한 패턴을 표현하는 일종의 형식 언어
		 Scanner useDelimiter(pattern pattern)
		 Scanner useDelimiter(String pattern)
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		String[] argArr= null;
		
		while(true) {
			String prompt = ">>";
			System.out.println(prompt);
			
			//화면으로부터 라인단위로 입력받는다.
			String input = sc.nextLine();
			
			input = input.trim();		// 입력받은 값에서 불필요한 앞뒤 공백을 제거한다.
			argArr = input.split(" +");	//입력받은 내용을 공백을 구분자로 자른다.
			
			String command = argArr[0].trim();
			
			//명령어를 소문자로 변환한다.
			command = command.toLowerCase();
			if("".equals(command)) continue;
			
			if(command.equals("q")) {
				System.exit(0);
			} else {
				for (int i=0;i<argArr.length;i++) {
					System.out.println(argArr[i]);
				}
			}
		}
	}
}
