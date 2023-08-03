package com.reactiveWork.UserProduct.Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.reactiveWork.UserProduct.ProductAvailabilityServiceTest.ProductAvailabilityServiceFAilureTest;
import com.reactiveWork.UserProduct.ProductAvailabilityServiceTest.ProductAvailabilityServiceTest;

@RunWith(Suite.class)
@SuiteClasses({ProductAvailabilityServiceTest.class,
			   ProductAvailabilityServiceFAilureTest.class})
public class suite {

}
