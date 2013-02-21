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
 *  Java representation of the cull object CONF_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  Configuration class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 *
 */
public interface Configuration extends 
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


    // Attribute entries ------------------------------------------------


    /**
     *   Get a unmodifiable list of all com.sun.grid.jgdi.configuration.ConfigurationElement attributes.
     *
     *   @return Unmodifiable list with all com.sun.grid.jgdi.configuration.ConfigurationElement attributes
     */
    public List< com.sun.grid.jgdi.configuration.ConfigurationElement >  getEntriesList();

    /**
     *  Get the number of com.sun.grid.jgdi.configuration.ConfigurationElement attributes.
     *
     *  @return The number of com.sun.grid.jgdi.configuration.ConfigurationElement attributes.
     */
    public int getEntriesCount();
 
    /**
     *  Get a com.sun.grid.jgdi.configuration.ConfigurationElement attribute at an index.
     *  @param index  the index of the com.sun.grid.jgdi.configuration.ConfigurationElement attribute which should be
     *                removed
     *  @return the com.sun.grid.jgdi.configuration.ConfigurationElement attribute
     */
    public com.sun.grid.jgdi.configuration.ConfigurationElement getEntries(int index);
   

    /**
     *   Add a com.sun.grid.jgdi.configuration.ConfigurationElement attribute.
     *   @param aentries  the new com.sun.grid.jgdi.configuration.ConfigurationElement attribute
     */
    public void addEntries(com.sun.grid.jgdi.configuration.ConfigurationElement aentries);
   
    /**
     *   Set a com.sun.grid.jgdi.configuration.ConfigurationElement attribute.
     *   @param index   index of the com.sun.grid.jgdi.configuration.ConfigurationElement attribute
     *   @param aentries  the new com.sun.grid.jgdi.configuration.ConfigurationElement attribute
     */
    public void setEntries(int index, com.sun.grid.jgdi.configuration.ConfigurationElement aentries);

    /**
     *  Remove all com.sun.grid.jgdi.configuration.ConfigurationElement attributes.
     */
    public void removeAllEntries();
   
    /**
     *  Remote a com.sun.grid.jgdi.configuration.ConfigurationElement attribute at an index.
     *  @param index  the index of the com.sun.grid.jgdi.configuration.ConfigurationElement attribute which should be
     *                removed
     *  @return the removed com.sun.grid.jgdi.configuration.ConfigurationElement attribute or <code>null</code> if
     *          no attribute at this index is stored
     */
    public com.sun.grid.jgdi.configuration.ConfigurationElement removeEntries(int index);

    /**
     *  Remote a specific com.sun.grid.jgdi.configuration.ConfigurationElement attribute.
     *  @param aentries  the com.sun.grid.jgdi.configuration.ConfigurationElement attribute which should be
     *                         removed
     *  @return <code>true</code> if the com.sun.grid.jgdi.configuration.ConfigurationElement attribute has been removed
     */
    public boolean removeEntries(com.sun.grid.jgdi.configuration.ConfigurationElement aentries);
   
       
 
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
