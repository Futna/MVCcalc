package MyPackage1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import javax.swing.JOptionPane;
import org.junit.*;
import org.junit.Test;



public class MODELTest {
	VIEW view =new VIEW();
	MODEL model= new MODEL();
	CONTROLLER controller=new CONTROLLER(view,model);


	@Test
	public void testAddNum() {
		//fail("Not yet implemented");
		model.addNum(2.0, 7.0);
	    assertEquals(9.0,model.getResultValue(),0.0);
	}

	@Test
	public void testSubNum() {
		//fail("Not yet implemented");
      	model.subNum(9.0,4.0);
		assertEquals(5.0,model.getResultValue(),0.0);
	}

	@Test
	public void testModNum() {
	//	fail("Not yet implemented");
	}

	@Test
	public void testMulNum() {
		//fail("Not yet implemented");
		model.mulNum(2.0, 5.0);
		assertEquals(10.0,model.getResultValue(),0.0);
	}

	@Test
	public void testDivNum() {
		//fail("Not yet implemented");
		model.divNum(9.0, 0.0);
		assertTrue(model.flag);
	}

	@Test
	public void testSqrNum() {
		//fail("Not yet implemented");
		model.sqrNum(-7);
		assertEquals(true,model.flag);
	}

}
