package bus;

public class Calculator {
	private int op1;
	private int op2;
	public Calculator()
	{
		this.op1 = 00;
		this.op2 = 00;
	}
	public Calculator(int op1, int op2)
	{
		this.op1 = op1;
		this.op2 = op2;
	}
	//source -> add geter and ster
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	
	
	public int getOp1()
	{
		return this.op1;
	}
    public void setOp1(int op1)
{
	this.op1 =op1;
}
    public String ToString()
    {
    	String state;
    	state = "\n " + this.op1 + this.op2;
    	return state;
    }
    public int add()
    {
    	return this.op1 + this.op2;
    }
    public int sub()
    {
    	return this.op1 - this.op2;
    }
}
