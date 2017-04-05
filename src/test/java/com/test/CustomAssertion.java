package com.test;

import org.mule.api.MuleEvent;
import org.mule.munit.assertion.MunitAssertion;

public class CustomAssertion implements MunitAssertion {
	@Override
	public MuleEvent execute(MuleEvent muleEvent) throws AssertionError {
		if (!muleEvent.getMessage().getPayload().toString().contains("Server returned an error")) {
			throw new AssertionError("Your code sucks!!!");
		}

		return muleEvent;

	}
}
