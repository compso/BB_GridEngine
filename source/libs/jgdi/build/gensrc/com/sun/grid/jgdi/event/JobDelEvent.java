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
 *  Generated from java_delevent.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.event;

import com.sun.grid.jgdi.event.DelEvent;

import com.sun.grid.jgdi.configuration.Job;


/**
 */
public class JobDelEvent extends DelEvent implements java.io.Serializable {

  public JobDelEvent(long timestamp, int eventID) {
     super(timestamp, eventID, Job.class );
  } // end of default constructor

  public void set(Job obj) {
     super.setChangedObject(obj);
  }
  
  public Job get() {
     return (Job) getChangedObject();
  }

  

/*
 *  Generated from java_event_pkinfo.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */
   private int m_jobNumber;


  /**
   *   Set the primary key info of the Job.
   *
   *   This method is not indented for public usage. It is called from the
   *   native code to set the primary key info of cull event.
   * 
   *   @param numKey1   first numerical key
   *   @param numKey2   second numerical key
   *   @param strKey1   fist string key
   *   @param strKey2   second string key
   */
  public void setPKInfo(int numKey1, int numKey2, String strKey1, String strKey2) {

        m_jobNumber = numKey1;

   }
   
     
   /**
    *   Get the jobNumber of the Job
    *
    *   @return the jobNumber of the Job
    */
    public int getJobNumber() {
       return m_jobNumber;   
    }
   
    
  
   
   /**
    *  Determine if this event has deleted <code>obj</code>
    *  @param   obj  the object
    *  @return  <code>true</code> if this event has deleted <code>obj</code>
    */
   public boolean hasDeletedObject(Object obj) {

      if (obj instanceof  Job) {
          Job obj1 = (Job)obj;
         // Attention: intkey must be set for cull event elem   
         if (m_jobNumber != obj1.getJobNumber()) {
             return false;
         }
   
         return true;
      }
      return false;
   }
   
   public String toString() {
      StringBuilder ret = new StringBuilder();
      ret.append(super.toString());
      ret.append(",");
      ret.append("Job");
      ret.append("(");
          ret.append(m_jobNumber);
   
      ret.append(")");
      return ret.toString();
   }
  
}
