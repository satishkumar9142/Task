package com.reactiveWork.ProductCategory.Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.reactiveWork.ProductCategory.ProductService.ProductServiceTest;
import com.reactiveWork.ProductCategory.ProductService.ProductServiceTest2;

@RunWith(Suite.class)
@SuiteClasses({ProductServiceTest.class,ProductServiceTest2.class})
public class suite {
}
 