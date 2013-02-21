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
public class JobTestCase extends BaseTestCase {
   
   public  JobTestCase(java.lang.String testName) {
      super(testName);
   }
   
   public static Test suite() {
      TestSuite suite = new TestSuite(JobTestCase.class);
      return suite;
   }
   
  
   
   public void testJobAddGetDelete() throws Exception {
   
      Object[] testValues = TestValueFactory.getTestValues(Job.class);
      assertTrue("We have no test values for Job", (testValues.length > 0));

      JGDI jgdi = createJGDI();
      try {
         List<Util.Difference> differences = new LinkedList<Util.Difference>();
         for (int i = 0; i < testValues.length; i++) {
            Job testObj = (Job)testValues[i];
            logger.info("adding testObj " + testObj);
            jgdi.addJob(testObj);
            try {
              logger.info("fetching and diffing testObj " + testObj);
              Job retObj = jgdi.getJob(testObj.getJobNumber());
              
              Util.getDifferences(testObj, retObj, differences);
              if (!differences.isEmpty()) {
                 logger.warning("org Job is not equal to stored Job ------------------------"); 
                 for (Util.Difference diff: differences) {
                    logger.warning(diff.toString());
                 }
              }
              //assertTrue("retobj is not equals to the testobj", differences.isEmpty());
              differences.clear();
              
            } finally {
              jgdi.deleteJob(testObj);
              
              Job retObj = jgdi.getJob(testObj.getJobNumber());
              
              logger.info("deleting testObj " + testObj);
              assertNull(testObj + " has not been deleted", retObj);
            }
         }
      } finally {
        jgdi.close();
      }
   }

   public void testJobListXML() throws Exception {
      JGDI jgdi = createJGDI();
      try {
         for (Job obj : jgdi.getJobList()) {
            File file = File.createTempFile("Job", ".xml");
            try {
               XMLUtil.write(obj, file);
               Job obj1 = (Job)XMLUtil.read(file);
               
// begin debug: check differences
//               List<Util.Difference> differences = new LinkedList<Util.Difference>();
//               Util.getDifferences(obj, obj1, differences);
//               if (!differences.isEmpty()) {
//                  logger.warning("org Job is not equal to filed/reread obj1 Job ------------------------"); 
//                  for (Util.Difference diff : differences) {
//                     logger.warning(diff.toString());
//                  }
//               }
//               differences.clear();
// end debug: check differences
               
               assertTrue("serialized xml object of class Job is invalid", 
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
