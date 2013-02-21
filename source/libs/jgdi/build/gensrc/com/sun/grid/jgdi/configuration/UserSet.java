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
 *  Java representation of the cull object US_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  UserSet class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 *
 */
public interface UserSet extends 
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


    // Attribute type ------------------------------------------------

       
    /**
     *   Set the type attribute.
     *
     *   @param aType  the new value for the  type attribute
     */
    public void setType(int aType);
  
    /**
     *  Get the value of the type attribute.
     *  @return the value of the type attribute
     */
    public int getType();
   

 
    /**
     *  Determine if any type attribute is set
     *  @return <code>true</code> if the type attribute is set
     */
    public boolean isSetType();


    // Attribute fshare ------------------------------------------------

       
    /**
     *   Set the fshare attribute.
     *
     *   @param aFshare  the new value for the  fshare attribute
     */
    public void setFshare(int aFshare);
  
    /**
     *  Get the value of the fshare attribute.
     *  @return the value of the fshare attribute
     */
    public int getFshare();
   

 
    /**
     *  Determine if any fshare attribute is set
     *  @return <code>true</code> if the fshare attribute is set
     */
    public boolean isSetFshare();


    // Attribute oticket ------------------------------------------------

       
    /**
     *   Set the oticket attribute.
     *
     *   @param aOticket  the new value for the  oticket attribute
     */
    public void setOticket(int aOticket);
  
    /**
     *  Get the value of the oticket attribute.
     *  @return the value of the oticket attribute
     */
    public int getOticket();
   

 
    /**
     *  Determine if any oticket attribute is set
     *  @return <code>true</code> if the oticket attribute is set
     */
    public boolean isSetOticket();


    // Attribute jobCnt ------------------------------------------------

       
    /**
     *   Set the jobCnt attribute.
     *
     *   @param aJobCnt  the new value for the  jobCnt attribute
     */
    public void setJobCnt(int aJobCnt);
  
    /**
     *  Get the value of the jobCnt attribute.
     *  @return the value of the jobCnt attribute
     */
    public int getJobCnt();
   

 
    /**
     *  Determine if any jobCnt attribute is set
     *  @return <code>true</code> if the jobCnt attribute is set
     */
    public boolean isSetJobCnt();


    // Attribute entries ------------------------------------------------


    /**
     *   Get a unmodifiable list of all java.lang.String attributes.
     *
     *   @return Unmodifiable list with all java.lang.String attributes
     */
    public List< java.lang.String >  getEntriesList();

    /**
     *  Get the number of java.lang.String attributes.
     *
     *  @return The number of java.lang.String attributes.
     */
    public int getEntriesCount();
 
    /**
     *  Get a java.lang.String attribute at an index.
     *  @param index  the index of the java.lang.String attribute which should be
     *                removed
     *  @return the java.lang.String attribute
     */
    public java.lang.String getEntries(int index);
   

    /**
     *   Add a java.lang.String attribute.
     *   @param aentries  the new java.lang.String attribute
     */
    public void addEntries(java.lang.String aentries);
   
    /**
     *   Set a java.lang.String attribute.
     *   @param index   index of the java.lang.String attribute
     *   @param aentries  the new java.lang.String attribute
     */
    public void setEntries(int index, java.lang.String aentries);

    /**
     *  Remove all java.lang.String attributes.
     */
    public void removeAllEntries();
   
    /**
     *  Remote a java.lang.String attribute at an index.
     *  @param index  the index of the java.lang.String attribute which should be
     *                removed
     *  @return the removed java.lang.String attribute or <code>null</code> if
     *          no attribute at this index is stored
     */
    public java.lang.String removeEntries(int index);

    /**
     *  Remote a specific java.lang.String attribute.
     *  @param aentries  the java.lang.String attribute which should be
     *                         removed
     *  @return <code>true</code> if the java.lang.String attribute has been removed
     */
    public boolean removeEntries(java.lang.String aentries);
   
       
 
    /**
     *  Determine if any entries attribute is set
     *  @return <code>true</code> if the entries attribute is set
     */
    public boolean isSetEntries();



    /*
     * Dump the object
     * @return <code>String</code> the dump string
     */
     public String dump();
     

}
