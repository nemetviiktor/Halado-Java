package calculatorapi;

import lombok.Data;

@Data
public class Calculation {
	private int leftOperand;
	private int rightOperand;
	private char operator;
	public int getLeftOperand() {
		return leftOperand;
	}
	public void setLeftOperand(int leftOperand) {
		this.leftOperand = leftOperand;
	}
	public int getRightOperand() {
		return rightOperand;
	}
	public void setRightOperand(int rightOperand) {
		this.rightOperand = rightOperand;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	
}
