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
 *  Generated from java_simpletest.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.configuration;

import junit.framework.*;
import com.sun.grid.jgdi.configuration.*;
import java.io.File;
import java.util.List;
import java.util.LinkedList;
import com.sun.grid.jgdi.configuration.Util;
import com.sun.grid.jgdi.configuration.xml.XMLUtil;
import com.sun.grid.jgdi.BaseTestCase;
import com.sun.grid.jgdi.JGDI;
import com.sun.grid.jgdi.TestValueFactory;

/**
 *
 */
public class ManagerTestCase extends BaseTestCase {
   
   public  ManagerTestCase(java.lang.String testName) {
      super(testName);
   }
   
   public static Test suite() {
      TestSuite suite = new TestSuite(ManagerTestCase.class);
      return suite;
   }
   
  
   
   public void testManagerAddGetDelete() throws Exception {
   
      Object[] testValues = TestValueFactory.getTestValues(Manager.class);
      assertTrue("We have no test values for Manager", (testValues.length > 0));

      JGDI jgdi = createJGDI();
      try {
         List<Util.Difference> differences = new LinkedList<Util.Difference>();
         for (int i = 0; i < testValues.length; i++) {
            Manager testObj = (Manager)testValues[i];
            logger.info("adding testObj " + testObj);
            jgdi.addManager(testObj);
            try {
              logger.info("fetching and diffing testObj " + testObj);
              Manager retObj = jgdi.getManager(testObj.getName());
              
              Util.getDifferences(testObj, retObj, differences);
              if (!differences.isEmpty()) {
                 logger.warning("org Manager is not equal to stored Manager ------------------------"); 
                 for (Util.Difference diff: differences) {
                    logger.warning(diff.toString());
                 }
              }
              //assertTrue("retobj is not equals to the testobj", differences.isEmpty());
              differences.clear();
              
            } finally {
              jgdi.deleteManager(testObj);
              
              Manager retObj = jgdi.getManager(testObj.getName());
              
              logger.info("deleting testObj " + testObj);
              assertNull(testObj + " has not been deleted", retObj);
            }
         }
      } finally {
        jgdi.close();
      }
   }

   public void testManagerListXML() throws Exception {
      JGDI jgdi = createJGDI();
      try {
         for (Manager obj : jgdi.getManagerList()) {
            File file = File.createTempFile("Manager", ".xml");
            try {
               XMLUtil.write(obj, file);
               Manager obj1 = (Manager)XMLUtil.read(file);
               
// begin debug: check differences
//               List<Util.Difference> differences = new LinkedList<Util.Difference>();
//               Util.getDifferences(obj, obj1, differences);
//               if (!differences.isEmpty()) {
//                  logger.warning("org Manager is not equal to filed/reread obj1 Manager ------------------------"); 
//                  for (Util.Difference diff : differences) {
//                     logger.warning(diff.toString());
//                  }
//               }
//               differences.clear();
// end debug: check differences
               
               assertTrue("serialized xml object of class Manager is invalid", 
                          obj.equalsCompletely(obj1) );
            } finally {
              file.delete();
            }
         }
      } finally {
         jgdi.close();
      }
   }

}
