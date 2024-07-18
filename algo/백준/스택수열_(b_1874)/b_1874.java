import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> stackList = new ArrayList<Integer>();
		ArrayList<String> record = new ArrayList<String>();
		int indexNum = 1;
		boolean available = true;
		
		for (int i = 0; i < n; i++) {
			
			int stackNum = sc.nextInt();
			
			while(indexNum <= stackNum) {
				stackList.add(indexNum);
				record.add("+");
				indexNum += 1;
			}
			
			if (stackNum == stackList.get(stackList.size()-1)) {
				stackList.remove(stackList.size()-1);
				record.add("-");
			}
			
			else {
				available = false;
				break;
			}
			
		}
		
		if(!available) 
			System.out.println("NO");
		else {
			for (String r : record) 
				System.out.println(r);
		}
		
	}
	
}