package ch11;

import java.util.*;

class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		while (true) {
			System.out.println(">>");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();

				if ("".equals(input))
					continue;

				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q또는 Q - 프로그램 종료");
					System.out.println("history - 최근 입력한 명령어를" + MAX_SIZE + "개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input);

					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();

					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
				} else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("입력 오류입니다");

			}

		}
	}// main

	public static void save(String input) {
		if (!"".equals(input))
			q.offer(input);

		if (q.size() > MAX_SIZE)
			q.remove();
	}

}// class
