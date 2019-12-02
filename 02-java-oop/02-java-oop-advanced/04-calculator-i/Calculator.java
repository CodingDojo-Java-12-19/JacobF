import java.io.Serializable;

public class Calculator implements java.io.Serializable {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private double operandOne;
    private double operandTwo;
    private String operator;
    private double result;
    
    public Calculator() {
    }
    
    public Calculator(double operandOne, String operator, double operandTwo) {
        this.operandOne = operandOne;
        this.operator = operator;
        this.operandTwo = operandTwo;
    }

    public void setOperandOne(double param) {
        this.operandOne = param;
    }

    public void setOperandTwo(double param) {
        this.operandTwo = param;
    }

    public void setOperator(String param) {
        this.operator = param;
    }

    public void performOperation() {
        if (this.operator == "+") {
            this.result = this.operandOne + this.operandTwo;
        } else if (this.operator == "-") {
            this.result = this.operandOne - this.operandTwo;
        } else {
            System.out.println("Invalid operator type");
        }
    }

    public double getResults() {
        return this.result;
    }
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperandOne(10.5);
        c.setOperandTwo(5.2);
        c.setOperator("+");
        c.performOperation();
        System.out.println(c.getResults());
    }
}