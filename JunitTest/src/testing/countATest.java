package testing;

import junit.framework.TestCase;

public class countATest extends TestCase {
	
	public void test(){
		JunitTesting test=new JunitTesting();
		int output =test.countA("Alphabet");
		assertEquals(2, output);
	}

}
