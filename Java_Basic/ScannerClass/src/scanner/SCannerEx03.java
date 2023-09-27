package scanner;

import java.io.File;
import java.util.Scanner;

public class SCannerEx03 {
public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(new File("data3.txt"));
	int cnt =0;
	int totalSum=0;
	
	while(sc.hasNextLine()) {
		String line = sc.nextLine();
		Scanner sc2 = new Scanner(line).useDelimiter(",");
		int sum=0;
		
		while(sc2.hasNextInt()) {
			sum += sc2.nextInt();
		}
		System.out.println(line + ", sum = "+sum);
		totalSum += sum;
		cnt++;
		sc2.close();
	}
	System.out.println("Line : "+ cnt + ", Total: "+ totalSum);
	
	sc.close();
	
}
}
