package com.ibm.mq.samples.jms.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ibm.mq.samples.jms.JmsPutGetodocker;

public class TestJmsPutGetodocker {

	JmsPutGetodocker jms = null;
	@BeforeEach
	void setUp() throws Exception {
		jms = new JmsPutGetodocker();
	}

	@Test
	void putMessageTest() {
		jms.putMessage("jelou");
		jms.putMessage("chatuma");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jms.getMessage());
	}

}
