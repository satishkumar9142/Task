/**
 * package for Suite.
 */
package com.reactiveworks.cityexercise.suitepackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.reactiveworks.cityexercise.testing.CityServicesFailureTest;
import com.reactiveworks.cityexercise.testing.CityServicesSuccessTest;

/**
 * 
 * This is suite class.
 *
 */
@RunWith(Suite.class)
@SuiteClasses({CityServicesSuccessTest.class,
				CityServicesFailureTest.class})
public class suite {
}
