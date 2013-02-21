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
 *  Java representation of the cull object PN_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  PathName class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 *
 */
public interface PathName extends 
    GEObject  { 

    // Attribute path ------------------------------------------------

       
    /**
     *   Set the path attribute.
     *
     *   @param aPath  the new value for the  path attribute
     */
    public void setPath(java.lang.String aPath);
  
    /**
     *  Get the value of the path attribute.
     *  @return the value of the path attribute
     */
    public java.lang.String getPath();
   

 
    /**
     *  Determine if any path attribute is set
     *  @return <code>true</code> if the path attribute is set
     */
    public boolean isSetPath();


    // Attribute host ------------------------------------------------

       
    /**
     *   Set the host attribute.
     *
     *   @param aHost  the new value for the  host attribute
     */
    public void setHost(java.lang.String aHost);
  
    /**
     *  Get the value of the host attribute.
     *  @return the value of the host attribute
     */
    public java.lang.String getHost();
   

 
    /**
     *  Determine if any host attribute is set
     *  @return <code>true</code> if the host attribute is set
     */
    public boolean isSetHost();


    // Attribute fileHost ------------------------------------------------

       
    /**
     *   Set the fileHost attribute.
     *
     *   @param aFileHost  the new value for the  fileHost attribute
     */
    public void setFileHost(java.lang.String aFileHost);
  
    /**
     *  Get the value of the fileHost attribute.
     *  @return the value of the fileHost attribute
     */
    public java.lang.String getFileHost();
   

 
    /**
     *  Determine if any fileHost attribute is set
     *  @return <code>true</code> if the fileHost attribute is set
     */
    public boolean isSetFileHost();


    // Attribute fileStaging ------------------------------------------------

       
    /**
     *   Set the fileStaging attribute.
     *
     *   @param aFileStaging  the new value for the  fileStaging attribute
     */
    public void setFileStaging(boolean aFileStaging);
  
    /**
     *  Get the value of the fileStaging attribute.
     *  @return the value of the fileStaging attribute
     */
    public boolean isFileStaging();
   

 
    /**
     *  Determine if any fileStaging attribute is set
     *  @return <code>true</code> if the fileStaging attribute is set
     */
    public boolean isSetFileStaging();



    /*
     * Dump the object
     * @return <code>String</code> the dump string
     */
     public String dump();
     

}
