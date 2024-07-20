package IntPrep;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "[{([)]}]()";
		System.out.print(balancedParanthesis(str));

	}
	public static boolean balancedParanthesis (String str) {
		Stack<Character> st = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			}else {
				if (st.isEmpty()) {
					return false;
				}
		
				char lastOpen = st.pop();
				if (lastOpen == '(' && ch != ')') {
					return false;
				}
				else if (lastOpen == '[' && ch != ']') {
					return false;
				}
				else if (lastOpen == '{' && ch != '}') {
					return false;
				}
			}
		}
		return st.size() == 0;
	}
}
