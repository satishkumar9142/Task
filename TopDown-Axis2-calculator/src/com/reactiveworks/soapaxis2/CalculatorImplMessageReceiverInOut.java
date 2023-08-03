
/**
 * CalculatorImplMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.reactiveworks.soapaxis2;

        /**
        *  CalculatorImplMessageReceiverInOut message receiver
        */

        public class CalculatorImplMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CalculatorImplSkeleton skel = (CalculatorImplSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getSubtract".equals(methodName)){
                
                com.reactiveworks.soapaxis2.GetSubtractResponse getSubtractResponse17 = null;
	                        com.reactiveworks.soapaxis2.GetSubtract wrappedParam =
                                                             (com.reactiveworks.soapaxis2.GetSubtract)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.reactiveworks.soapaxis2.GetSubtract.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSubtractResponse17 =
                                                   
                                                   
                                                         skel.getSubtract(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSubtractResponse17, false, new javax.xml.namespace.QName("http://soapaxis2.reactiveworks.com",
                                                    "getSubtract"));
                                    } else 

            if("getDivide".equals(methodName)){
                
                com.reactiveworks.soapaxis2.GetDivideResponse getDivideResponse19 = null;
	                        com.reactiveworks.soapaxis2.GetDivide wrappedParam =
                                                             (com.reactiveworks.soapaxis2.GetDivide)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.reactiveworks.soapaxis2.GetDivide.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDivideResponse19 =
                                                   
                                                   
                                                         skel.getDivide(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDivideResponse19, false, new javax.xml.namespace.QName("http://soapaxis2.reactiveworks.com",
                                                    "getDivide"));
                                    } else 

            if("getAdd".equals(methodName)){
                
                com.reactiveworks.soapaxis2.GetAddResponse getAddResponse21 = null;
	                        com.reactiveworks.soapaxis2.GetAdd wrappedParam =
                                                             (com.reactiveworks.soapaxis2.GetAdd)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.reactiveworks.soapaxis2.GetAdd.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAddResponse21 =
                                                   
                                                   
                                                         skel.getAdd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAddResponse21, false, new javax.xml.namespace.QName("http://soapaxis2.reactiveworks.com",
                                                    "getAdd"));
                                    } else 

            if("getMultiply".equals(methodName)){
                
                com.reactiveworks.soapaxis2.GetMultiplyResponse getMultiplyResponse23 = null;
	                        com.reactiveworks.soapaxis2.GetMultiply wrappedParam =
                                                             (com.reactiveworks.soapaxis2.GetMultiply)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.reactiveworks.soapaxis2.GetMultiply.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMultiplyResponse23 =
                                                   
                                                   
                                                         skel.getMultiply(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMultiplyResponse23, false, new javax.xml.namespace.QName("http://soapaxis2.reactiveworks.com",
                                                    "getMultiply"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.reactiveworks.soapaxis2.GetSubtract param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.reactiveworks.soapaxis2.GetSubtract.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.reactiveworks.soapaxis2.GetSubtractResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.reactiveworks.soapaxis2.GetSubtractResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.reactiveworks.soapaxis2.GetDivide param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.reactiveworks.soapaxis2.GetDivide.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.reactiveworks.soapaxis2.GetDivideResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.reactiveworks.soapaxis2.GetDivideResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.reactiveworks.soapaxis2.GetAdd param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.reactiveworks.soapaxis2.GetAdd.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.reactiveworks.soapaxis2.GetAddResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.reactiveworks.soapaxis2.GetAddResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.reactiveworks.soapaxis2.GetMultiply param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.reactiveworks.soapaxis2.GetMultiply.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.reactiveworks.soapaxis2.GetMultiplyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.reactiveworks.soapaxis2.GetMultiplyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.reactiveworks.soapaxis2.GetSubtractResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.reactiveworks.soapaxis2.GetSubtractResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.reactiveworks.soapaxis2.GetSubtractResponse wrapgetSubtract(){
                                com.reactiveworks.soapaxis2.GetSubtractResponse wrappedElement = new com.reactiveworks.soapaxis2.GetSubtractResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.reactiveworks.soapaxis2.GetDivideResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.reactiveworks.soapaxis2.GetDivideResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.reactiveworks.soapaxis2.GetDivideResponse wrapgetDivide(){
                                com.reactiveworks.soapaxis2.GetDivideResponse wrappedElement = new com.reactiveworks.soapaxis2.GetDivideResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.reactiveworks.soapaxis2.GetAddResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.reactiveworks.soapaxis2.GetAddResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.reactiveworks.soapaxis2.GetAddResponse wrapgetAdd(){
                                com.reactiveworks.soapaxis2.GetAddResponse wrappedElement = new com.reactiveworks.soapaxis2.GetAddResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.reactiveworks.soapaxis2.GetMultiplyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.reactiveworks.soapaxis2.GetMultiplyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.reactiveworks.soapaxis2.GetMultiplyResponse wrapgetMultiply(){
                                com.reactiveworks.soapaxis2.GetMultiplyResponse wrappedElement = new com.reactiveworks.soapaxis2.GetMultiplyResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.reactiveworks.soapaxis2.GetSubtract.class.equals(type)){
                
                           return com.reactiveworks.soapaxis2.GetSubtract.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.reactiveworks.soapaxis2.GetSubtractResponse.class.equals(type)){
                
                           return com.reactiveworks.soapaxis2.GetSubtractResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.reactiveworks.soapaxis2.GetDivide.class.equals(type)){
                
                           return com.reactiveworks.soapaxis2.GetDivide.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.reactiveworks.soapaxis2.GetDivideResponse.class.equals(type)){
                
                           return com.reactiveworks.soapaxis2.GetDivideResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.reactiveworks.soapaxis2.GetAdd.class.equals(type)){
                
                           return com.reactiveworks.soapaxis2.GetAdd.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.reactiveworks.soapaxis2.GetAddResponse.class.equals(type)){
                
                           return com.reactiveworks.soapaxis2.GetAddResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.reactiveworks.soapaxis2.GetMultiply.class.equals(type)){
                
                           return com.reactiveworks.soapaxis2.GetMultiply.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.reactiveworks.soapaxis2.GetMultiplyResponse.class.equals(type)){
                
                           return com.reactiveworks.soapaxis2.GetMultiplyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    