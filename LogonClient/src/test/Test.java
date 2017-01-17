package test;

import com.bt.passcard.login.LogonService;
import com.bt.passcard.login.LogonServiceService;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LogonService logonService = new LogonServiceService()
				.getLogonServicePort();
		Boolean result = logonService.logonCheck("amin", "admin");
		System.out.println(result);
	}

}
