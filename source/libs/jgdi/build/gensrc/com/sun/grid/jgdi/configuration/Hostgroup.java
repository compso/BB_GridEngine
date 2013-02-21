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
 *  Java representation of the cull object HGRP_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  Hostgroup class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 *
 */
public interface Hostgroup extends 
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


    // Attribute hostList ------------------------------------------------


    /**
     *   Get a unmodifiable list of all java.lang.String attributes.
     *
     *   @return Unmodifiable list with all java.lang.String attributes
     */
    public List< java.lang.String >  getHostList();

    /**
     *  Get the number of java.lang.String attributes.
     *
     *  @return The number of java.lang.String attributes.
     */
    public int getHostCount();
 
    /**
     *  Get a java.lang.String attribute at an index.
     *  @param index  the index of the java.lang.String attribute which should be
     *                removed
     *  @return the java.lang.String attribute
     */
    public java.lang.String getHost(int index);
   

    /**
     *   Add a java.lang.String attribute.
     *   @param ahost  the new java.lang.String attribute
     */
    public void addHost(java.lang.String ahost);
   
    /**
     *   Set a java.lang.String attribute.
     *   @param index   index of the java.lang.String attribute
     *   @param ahost  the new java.lang.String attribute
     */
    public void setHost(int index, java.lang.String ahost);

    /**
     *  Remove all java.lang.String attributes.
     */
    public void removeAllHost();
   
    /**
     *  Remote a java.lang.String attribute at an index.
     *  @param index  the index of the java.lang.String attribute which should be
     *                removed
     *  @return the removed java.lang.String attribute or <code>null</code> if
     *          no attribute at this index is stored
     */
    public java.lang.String removeHost(int index);

    /**
     *  Remote a specific java.lang.String attribute.
     *  @param ahost  the java.lang.String attribute which should be
     *                         removed
     *  @return <code>true</code> if the java.lang.String attribute has been removed
     */
    public boolean removeHost(java.lang.String ahost);
   
       
 
    /**
     *  Determine if any host attribute is set
     *  @return <code>true</code> if the host attribute is set
     */
    public boolean isSetHost();



    /*
     * Dump the object
     * @return <code>String</code> the dump string
     */
     public String dump();
     

}