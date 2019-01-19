package com.ibm.mq.samples.jms.test;

import static org.junit.jupiter.api.Assertions.*;
import com.ibm.mq.samples.jms.JmsPutGetodocker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJmsPutGetodocker {

	JmsPutGetodocker jms = null;
	
	@BeforeEach
	void setUp() throws Exception {
		jms = new JmsPutGetodocker();
	}

	@Test
	void test() {
		jms.putMessage("jelou");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jms.getMessage());
	}

}
