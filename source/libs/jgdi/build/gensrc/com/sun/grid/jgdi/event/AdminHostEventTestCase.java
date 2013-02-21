/*___INFO__MARK_BEGIN__*/
/*************************************************************************
 *
 *  The Contents of this file are made available subject to the terms of
 *  the Sun Industry Standards Source License Version 1.2
 *
 *  Sun Microsystems Inc., March, 2001
 *
 *
 *  Sun Industry Standards Source License Version 1.2
 *  =================================================
 *  The contents of this file are subject to the Sun Industry Standards
 *  Source License Version 1.2 (the "License"); You may not use this file
 *  except in compliance with the License. You may obtain a copy of the
 *  License at http://gridengine.sunsource.net/Gridengine_SISSL_license.html
 *
 *  Software provided under this License is provided on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING,
 *  WITHOUT LIMITATION, WARRANTIES THAT THE SOFTWARE IS FREE OF DEFECTS,
 *  MERCHANTABLE, FIT FOR A PARTICULAR PURPOSE, OR NON-INFRINGING.
 *  See the License for the specific provisions governing your rights and
 *  obligations concerning the Software.
 *
 *   The Initial Developer of the Original Code is: Sun Microsystems, Inc.
 *
 *   Copyright: 2001 by Sun Microsystems, Inc.
 *
 *   All Rights Reserved.
 *
 ************************************************************************/
/*___INFO__MARK_END__*/
/**
 *  Generated from java_event_test.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.event;


import com.sun.grid.jgdi.JGDIException;
import com.sun.grid.jgdi.JGDI;
import com.sun.grid.jgdi.configuration.*;
import com.sun.grid.jgdi.configuration.reflect.*;
import junit.framework.*;
import com.sun.grid.jgdi.BaseTestCase;
import java.util.HashMap;
import com.sun.grid.jgdi.EventClient;
import com.sun.grid.jgdi.JGDIFactory;
import java.util.Collection;
import java.util.Map;
import com.sun.grid.jgdi.TestValueFactory;

public class AdminHostEventTestCase extends BaseTestCase {

   private JGDI jgdi;
   private EventClient evc;
   
   public AdminHostEventTestCase(String name) {
      super(name);
   }
   
   public static Test suite() {
      TestSuite suite = new TestSuite(AdminHostEventTestCase.class);
      return suite;
   }
   
   protected void setUp() throws Exception {

      jgdi = createJGDI();
      evc = createEventClient(0);
      super.setUp();
      logger.fine("SetUp done");
   }
   
   protected void tearDown() throws Exception {
      try {
        evc.close();
      } finally {
         jgdi.close();
      }
   }
   


   public void testAdminHostEvents() throws Exception {
         
      Object [] testValues = TestValueFactory.getTestValues(AdminHost.class); 

      assertTrue("No test values for AdminHost", testValues.length > 0 );
      
      AdminHost testObj = (AdminHost)testValues[0];


      WaitForEventThread waitThread = new WaitForEventThread(testObj);

      int flushInterval = 1; // in seconds
      long timeout = flushInterval * 1000 * 3;
      Map<EventTypeEnum,Integer> map = new HashMap<EventTypeEnum,Integer>();
      try {

          evc.addEventListener(waitThread);

          map.put(EventTypeEnum.AdminHostAdd, flushInterval);
          map.put(EventTypeEnum.AdminHostDel, flushInterval);
         
         
         evc.subscribe(map.keySet());            
         evc.setFlush(map);

         evc.commit();
         
         waitThread.start();

         Thread.yield();

         jgdi.addAdminHost(testObj);
         logger.fine(testObj + " added");
         assertTrue("AdminHost: Did not get the add event", waitThread.waitForAddEvent(timeout));

         

         jgdi.deleteAdminHost(testObj);
         logger.fine(testObj + " deleted");
         testObj = null;

         assertTrue("AdminHost: Did not get the del event", waitThread.waitForDelEvent(timeout));

      } finally {
         waitThread.interrupt();
         evc.unsubscribe(map.keySet());
         evc.commit();
         
         if (testObj != null) {
            logger.fine(testObj + " deleted again");
            try {
               jgdi.deleteAdminHost(testObj);
            } catch(Exception e) {
               // ignore
            }
         }
      }
   }


}
