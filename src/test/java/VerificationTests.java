import org.junit.Test;

/**
 * Created by 796812 on 6/25/2015.
 */
public class VerificationTests {
	@Test
	public void testFieldCreation() {
		String fieldPrefix = "SP_STATUS_CODE_";
		for (int cntr = 1; cntr < 11; cntr++) {
			System.out.println(fieldPrefix + String.format("%02d", cntr));
		}
	}
}
