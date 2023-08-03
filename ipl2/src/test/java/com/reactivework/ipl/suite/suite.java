package com.reactivework.ipl.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.reactivework.ipl.services.IplServicesTest;
import com.reactivework.ipl.services.IplServicesTestFailure;

@RunWith(Suite.class)
@SuiteClasses({IplServicesTest.class,IplServicesTestFailure.class})
public class suite {
}
 