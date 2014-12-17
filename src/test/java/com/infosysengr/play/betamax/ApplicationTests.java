package com.infosysengr.play.betamax;

import co.freeside.betamax.Betamax;
import co.freeside.betamax.Recorder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class ApplicationTests {

	@Rule
	public Recorder recorder = new Recorder();

	@Test
	@Betamax(tape="printsOutTraffic")
	public void printsOutTraffic() throws Exception {
		Application.main(null);
	}

}
