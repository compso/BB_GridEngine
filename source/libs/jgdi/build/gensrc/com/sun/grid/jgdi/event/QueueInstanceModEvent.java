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
 *  Generated from java_modevent.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.event;

import com.sun.grid.jgdi.event.ModEvent;

import com.sun.grid.jgdi.configuration.QueueInstance;


/**
 */
public class QueueInstanceModEvent extends ModEvent implements java.io.Serializable {

  public QueueInstanceModEvent(long timestamp, int eventID) {
     super(timestamp, eventID, QueueInstance.class );
  } // end of default constructor

  public void set(QueueInstance obj) {
     super.setChangedObject(obj);
  }
  
  public QueueInstance get() {
     return (QueueInstance) getChangedObject();
  }
  
  
  
/*
 *  Generated from java_event_pkinfo.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */
   private java.lang.String m_fullName;


  /**
   *   Set the primary key info of the QueueInstance.
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

        m_fullName = strKey1;

   }
   
     
   /**
    *   Get the fullName of the QueueInstance
    *
    *   @return the fullName of the QueueInstance
    */
    public java.lang.String getFullName() {
       return m_fullName;   
    }
   

}
