import java.util.Stack;
class Expression 
{
	String expr;
	String e;
	char symbol;
	Stack<Integer> S=new Stack<>();
	Stack<preceedence> s;
	static int isp[]={0,19,12,12,13,13,13,0};
	static int icp[]={20,19,12,12,13,13,13,0};
	int n;
	Expression(String ne)
	{
		expr=ne;		
		s=new Stack<>();
		n= 0;
	}
	 

	preceedence getToken()
	{
		if(n==expr.length())
			return preceedence.eos;
		symbol=expr.charAt(n++);
		
		switch(symbol)
		{
			case '(' : return preceedence.lparen ;
			
			case ')' : return preceedence.rparen ;
			case '+' : return preceedence.plus;
			case '-' : return preceedence.minus;
			case '/' : return preceedence.divide;
			case '*' : return preceedence.times;
			case '%' : return preceedence.mod;
			case ' ' : 
			case '\n': 
			case '\t':return preceedence.eos;
			default : return preceedence.operand;
		}
	}
	
	void toPostfix()
	{
		e="";
		s.push(preceedence.eos); // place eos on stack
		
		preceedence token;
		for(token=getToken();token!=preceedence.eos;token=getToken())
		{
			if(token==preceedence.operand){
				//System.out.print(symbol);
				e+=symbol;}
			else if(token==preceedence.rparen)
			{
				while(s.peek()!=preceedence.lparen){
					//System.out.print(s.pop().value);
					e+=s.pop().value;}
				s.pop();
				
			}
			else
			{
				while(isp[s.peek().ordinal()]>=icp[token.ordinal()]){
					//System.out.print(s.pop().value);
					e+=s.pop().value;}
				s.push(token);
			}
		}
		while((token=s.pop())!=preceedence.eos){
			//System.out.print(token.value);
			e+=token.value;}
		
		System.out.println();
				
	}
	void displayPostFix()
	{
		System.out.println(e);
	}
	void evaluatePostfix()
	{
		if(e!=null)
			expr=e;
		n=0;
		preceedence token;
		int op1,op2;
		token=getToken();
		while(token!=preceedence.eos)
		{
			if(token==preceedence.operand)
				S.push(symbol-'0');
			else
			{
				op2=S.pop();
				op1=S.pop();
				switch(token)
				{
				case plus: S.push(op2+op1);
							break;
				case minus: S.push(op1-op2);
							break;
				case times: S.push(op1*op2);
							break;
				case divide:S.push(op1/op2);
							break;
				case mod :S.push(op1%op2);
							break;
				default:break;
				}
			}	
		token=getToken();
		}
		System.out.println(S.pop());
	}
}

