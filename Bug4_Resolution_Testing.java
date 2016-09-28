import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Bug4_Resolution_Testing {

	Player p1;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		new Player("Khue",100,18);
	}

}
