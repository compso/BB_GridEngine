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
 *  Java representation of the cull object SH_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  SubmitHost class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 *
 */
public interface SubmitHost extends 
    GEObject  { 

    // Attribute name ------------------------------------------------

       
    /**
     *   Set the name attribute.
     *
     *   @param aName  the new value for the  name attribute
     */
    public void setName(java.lang.String aName);
  
    /**
     *  Get the value of the name attribute.
     *  @return the value of the name attribute
     */
    public java.lang.String getName();
   

 
    /**
     *  Determine if any name attribute is set
     *  @return <code>true</code> if the name attribute is set
     */
    public boolean isSetName();



    /*
     * Dump the object
     * @return <code>String</code> the dump string
     */
     public String dump();
     

}
