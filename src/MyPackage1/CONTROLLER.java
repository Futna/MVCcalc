package MyPackage1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class CONTROLLER {
	
	private VIEW viewObj;
	private MODEL modelObj;
	
	public CONTROLLER(VIEW V ,MODEL M) {
		this.viewObj=V;
		this.modelObj=M;
		
		this.viewObj.addListener(new additionListener());
		this.viewObj.subListener(new subListener());
		this.viewObj.modListener(new modListener());
		this.viewObj.mulListener(new MultiplyListener());
		this.viewObj.divListener(new divListener());
		this.viewObj.sqrListener(new sqrListener());



		
	}
	
	
	class MultiplyListener implements ActionListener {
		@Override
	      public void actionPerformed(ActionEvent e) {
	    	  double FirstNum=0.0 ;
	    	  double  SecondNum=0.0 ; 
	    	  
	          try {
	        	  if (viewObj.getnumOfOperation() == 4) {
						modelObj.mulNum(FirstNum, SecondNum);
						}
	        	  FirstNum =viewObj.getFirstNum();
	        	  SecondNum = viewObj.getSecondNum();
	        		modelObj.mulNum(FirstNum,SecondNum);
	        		viewObj.setResultNum(modelObj.getResultValue());
	              
	          } catch (NumberFormatException nfex) {
		             JOptionPane.showMessageDialog(null,"Please enter a number, not string !!");
	          }
	      }
	  }
	
	
	
	class additionListener implements ActionListener {
		@Override
	      public void actionPerformed(ActionEvent e) {
	    	  double FirstNum=0.0 ;
	    	  double  SecondNum=0.0 ; 
	    	  
	          try {
	        	  if (viewObj.getnumOfOperation() == 1) {
						modelObj.mulNum(FirstNum, SecondNum);
						}
	        	  FirstNum =viewObj.getFirstNum();
	        	  SecondNum = viewObj.getSecondNum();
	        		modelObj.addNum(FirstNum,SecondNum);
	        		viewObj.setResultNum(modelObj.getResultValue());
	              
	          } catch (NumberFormatException nfex) {
		             JOptionPane.showMessageDialog(null,"Please enter a number, not string !!");
	          }
	      }
	  }
	
	
	class subListener implements ActionListener {
		@Override
	      public void actionPerformed(ActionEvent e) {
	    	  double FirstNum=0.0 ;
	    	  double  SecondNum=0.0 ; 
	    	  
	          try {
	        	  if (viewObj.getnumOfOperation() == 2) {
						modelObj.mulNum(FirstNum, SecondNum);
						}
	        	  FirstNum =viewObj.getFirstNum();
	        	  SecondNum = viewObj.getSecondNum();
	        		modelObj.subNum(FirstNum,SecondNum);
	        		viewObj.setResultNum(modelObj.getResultValue());
	              
	          } catch (NumberFormatException nfex) {
		             JOptionPane.showMessageDialog(null,"Please enter a number, not string !!");
	          }
	      }
	  }
	
	
	
	class divListener implements ActionListener {
		@Override
	      public void actionPerformed(ActionEvent e) {
	    	  double FirstNum=0.0 ;
	    	  double  SecondNum=0.0 ; 
	    	  
	          try {
	        	  FirstNum =viewObj.getFirstNum();
		        	  SecondNum = viewObj.getSecondNum();
	        		modelObj.divNum(FirstNum,SecondNum);
	        		if(modelObj.flag==true)viewObj.clrResultNum();
	        		else {
	        			viewObj.setResultNum(modelObj.getResultValue());
	        		}
	          }
	          
	          catch (NumberFormatException n) {
		             JOptionPane.showMessageDialog(null,"Please enter a number, not string !!");
	          }
	      }
	  }
	
	
	
	class modListener implements ActionListener {
		@Override
	      public void actionPerformed(ActionEvent e) {
	    	  double FirstNum=0.0 ;
	    	  double  SecondNum=0.0 ; 
	    	  
	          try {
	        	  FirstNum =viewObj.getFirstNum();
	        	  SecondNum = viewObj.getSecondNum();
	        		modelObj.modNum(FirstNum,SecondNum);
	        		viewObj.setResultNum(modelObj.getResultValue());
	              
	          } catch (NumberFormatException nfex) {
	             JOptionPane.showMessageDialog(null,"Please enter a number, not string !!");
	          }
	      }
	  }
	
	
	class sqrListener implements ActionListener {
		@Override
	      public void actionPerformed(ActionEvent e) {
	    	  double FirstNum=0.0 ;
	    	
	          try {
	        	  FirstNum =viewObj.getFirstNum();
				  modelObj.sqrNum( FirstNum);
				  if(modelObj.flag==true) {
					  viewObj.clrResultNum();
				  }
				  else {
					  viewObj.setResultNum(modelObj.getResultValue());
				  }

	          } 
	          catch (NumberFormatException n) {
		             JOptionPane.showMessageDialog(null,"Please enter a number, not string !!");
	          }
			
		}
		
	}

}

