import java.util.Stack;

public class ParaMatchingTest {
	public static Stack<Character> stack;
	public static boolean outStatus;


	public static void main(String ... strings) {
		//String inArr =  "{{[]}}";
		//String inArr[]= {"{}[","[]"};
		String inArr[] = {"({}[])",
				"(({()})))",
				"({(){}()})()({(){}()})(){()}",
				"{}()))(()()({}}{}",
				"}}}}",
				"))))",
				"{{{",
				"(((",
				"[]{}(){()}((())){{{}}}{()()}{{}{}}",
				"[[]][][]",
				"}{"};
		//String inArr[] = {"{}()))(()()({}}{}"};
		//String inArr[] = {"{}()))(()()({}}{}","}}}}"};
		//String inArr[] = {"(({()})))", "({(){}()})()({(){}()})(){()}", "{}()))(()()({}}{}","}}}}"};
		
		/*int openAsciiCurly=123;
		int openAsciiSqual=91;
		int openAsciiBracket=40;*/
		ParaMatchingTest ob = new ParaMatchingTest();
		for(int i=0;i<inArr.length;i++) {
			outStatus = ob.isMatching(inArr[i]);
			System.out.println(inArr[i] +  "       ==>   outStatus:: "+ outStatus);	
		}
		
		
	}
	
	public boolean isMatching(String inArr) {
		init();
		char charA[] = inArr.toCharArray();
		if(!(charA.length%2==0)) return false;
		int openAscii = 0;
		int closeAscii = 0;
		for(int i=0;i<charA.length;i++) {
			if(charA[i] == '{' || charA[i] == '[' || charA[i] == '(') {
				stack.push(charA[i]);
				//System.out.println("Stack:: " + stack);
			} else  {
				if(stack.isEmpty()) {
					return false;
				}
				else  {
					char c = 0;
					closeAscii=(int) charA[i];
					c = (char) stack.peek();
				    openAscii = c;
						
					if(openAscii/10 == closeAscii/10) {
						stack.pop();					
					}
					else  {
						return false;						
					}
				}
		}
		}
		return outStatus;
		
	}
	
	public void init() {
		outStatus=true;
		stack = new Stack<>();
	}
}