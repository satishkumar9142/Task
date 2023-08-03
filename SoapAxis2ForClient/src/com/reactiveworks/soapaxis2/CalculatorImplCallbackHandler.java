
/**
 * CalculatorImplCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.reactiveworks.soapaxis2;

    /**
     *  CalculatorImplCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalculatorImplCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalculatorImplCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CalculatorImplCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getSubtract method
            * override this method for handling normal response from getSubtract operation
            */
           public void receiveResultgetSubtract(
                    com.reactiveworks.soapaxis2.CalculatorImplStub.GetSubtractResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSubtract operation
           */
            public void receiveErrorgetSubtract(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDivide method
            * override this method for handling normal response from getDivide operation
            */
           public void receiveResultgetDivide(
                    com.reactiveworks.soapaxis2.CalculatorImplStub.GetDivideResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDivide operation
           */
            public void receiveErrorgetDivide(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAdd method
            * override this method for handling normal response from getAdd operation
            */
           public void receiveResultgetAdd(
                    com.reactiveworks.soapaxis2.CalculatorImplStub.GetAddResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAdd operation
           */
            public void receiveErrorgetAdd(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMultiply method
            * override this method for handling normal response from getMultiply operation
            */
           public void receiveResultgetMultiply(
                    com.reactiveworks.soapaxis2.CalculatorImplStub.GetMultiplyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMultiply operation
           */
            public void receiveErrorgetMultiply(java.lang.Exception e) {
            }
                


    }
    