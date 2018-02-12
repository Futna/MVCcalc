package MyPackage1;

import javax.swing.JOptionPane;

public class MODEL {

	
	private double resultValue;
	public boolean flag=false;
	
	public void addNum (double firstNum , double secondNum) {
		flag=false;
		this.resultValue=firstNum+secondNum ;
		
	}
	
	public void subNum (double firstNum , double secondNum) {
		flag=false;
		this.resultValue=firstNum-secondNum ;
		
	}
	
	public void modNum (double firstNum , double secondNum) {
		flag=false;
		this.resultValue=firstNum%secondNum ;
		
	}
	
	public void mulNum (double firstNum , double secondNum) {
		flag=false;
		this.resultValue=firstNum*secondNum ;
		
	}
	
	public void divNum (double firstNum , double secondNum) {
		flag=false;
		if (secondNum == 0.0)	{
		JOptionPane.showMessageDialog(null, "Divide by 0 !!");
		flag=true;
		}
		else {
			flag=false;
			this.resultValue=firstNum/secondNum ;
		}
		
	}
	
	public void sqrNum (double firstNum ) {
		flag=false;
		if (firstNum < 0.0) {
			flag=true;
			JOptionPane.showMessageDialog(null, "The Number is Negative !!");
		}
		this.resultValue= Math.sqrt(firstNum);
	}
	
	public double getResultValue () {
		return this.resultValue;
	}
	
}

