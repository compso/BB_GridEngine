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
 *  Generated from javamodel.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.configuration;

import com.sun.grid.jgdi.configuration.GEObject;
import java.util.List;
import java.util.Set;

/**
 *  Java representation of the cull object EVS_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  EventSubcribtion class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 *
 */
public interface EventSubcribtion extends 
    GEObject  { 

    // Attribute id ------------------------------------------------

       
    /**
     *   Set the id attribute.
     *
     *   @param aId  the new value for the  id attribute
     */
    public void setId(int aId);
  
    /**
     *  Get the value of the id attribute.
     *  @return the value of the id attribute
     */
    public int getId();
   

 
    /**
     *  Determine if any id attribute is set
     *  @return <code>true</code> if the id attribute is set
     */
    public boolean isSetId();


    // Attribute flush ------------------------------------------------

       
    /**
     *   Set the flush attribute.
     *
     *   @param aFlush  the new value for the  flush attribute
     */
    public void setFlush(boolean aFlush);
  
    /**
     *  Get the value of the flush attribute.
     *  @return the value of the flush attribute
     */
    public boolean isFlush();
   

 
    /**
     *  Determine if any flush attribute is set
     *  @return <code>true</code> if the flush attribute is set
     */
    public boolean isSetFlush();


    // Attribute interval ------------------------------------------------

       
    /**
     *   Set the interval attribute.
     *
     *   @param aInterval  the new value for the  interval attribute
     */
    public void setInterval(int aInterval);
  
    /**
     *  Get the value of the interval attribute.
     *  @return the value of the interval attribute
     */
    public int getInterval();
   

 
    /**
     *  Determine if any interval attribute is set
     *  @return <code>true</code> if the interval attribute is set
     */
    public boolean isSetInterval();



    /*
     * Dump the object
     * @return <code>String</code> the dump string
     */
     public String dump();
     

}