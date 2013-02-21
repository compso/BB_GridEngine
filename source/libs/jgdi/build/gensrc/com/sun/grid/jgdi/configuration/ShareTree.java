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
 *  Java representation of the cull object STN_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  ShareTree class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 *
 */
public interface ShareTree extends 
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


    // Attribute shares ------------------------------------------------

       
    /**
     *   Set the shares attribute.
     *
     *   @param aShares  the new value for the  shares attribute
     */
    public void setShares(int aShares);
  
    /**
     *  Get the value of the shares attribute.
     *  @return the value of the shares attribute
     */
    public int getShares();
   

 
    /**
     *  Determine if any shares attribute is set
     *  @return <code>true</code> if the shares attribute is set
     */
    public boolean isSetShares();


    // Attribute children ------------------------------------------------


    /**
     *   Get a unmodifiable list of all com.sun.grid.jgdi.configuration.ShareTree attributes.
     *
     *   @return Unmodifiable list with all com.sun.grid.jgdi.configuration.ShareTree attributes
     */
    public List< com.sun.grid.jgdi.configuration.ShareTree >  getChildrenList();

    /**
     *  Get the number of com.sun.grid.jgdi.configuration.ShareTree attributes.
     *
     *  @return The number of com.sun.grid.jgdi.configuration.ShareTree attributes.
     */
    public int getChildrenCount();
 
    /**
     *  Get a com.sun.grid.jgdi.configuration.ShareTree attribute at an index.
     *  @param index  the index of the com.sun.grid.jgdi.configuration.ShareTree attribute which should be
     *                removed
     *  @return the com.sun.grid.jgdi.configuration.ShareTree attribute
     */
    public com.sun.grid.jgdi.configuration.ShareTree getChildren(int index);
   

    /**
     *   Add a com.sun.grid.jgdi.configuration.ShareTree attribute.
     *   @param achildren  the new com.sun.grid.jgdi.configuration.ShareTree attribute
     */
    public void addChildren(com.sun.grid.jgdi.configuration.ShareTree achildren);
   
    /**
     *   Set a com.sun.grid.jgdi.configuration.ShareTree attribute.
     *   @param index   index of the com.sun.grid.jgdi.configuration.ShareTree attribute
     *   @param achildren  the new com.sun.grid.jgdi.configuration.ShareTree attribute
     */
    public void setChildren(int index, com.sun.grid.jgdi.configuration.ShareTree achildren);

    /**
     *  Remove all com.sun.grid.jgdi.configuration.ShareTree attributes.
     */
    public void removeAllChildren();
   
    /**
     *  Remote a com.sun.grid.jgdi.configuration.ShareTree attribute at an index.
     *  @param index  the index of the com.sun.grid.jgdi.configuration.ShareTree attribute which should be
     *                removed
     *  @return the removed com.sun.grid.jgdi.configuration.ShareTree attribute or <code>null</code> if
     *          no attribute at this index is stored
     */
    public com.sun.grid.jgdi.configuration.ShareTree removeChildren(int index);

    /**
     *  Remote a specific com.sun.grid.jgdi.configuration.ShareTree attribute.
     *  @param achildren  the com.sun.grid.jgdi.configuration.ShareTree attribute which should be
     *                         removed
     *  @return <code>true</code> if the com.sun.grid.jgdi.configuration.ShareTree attribute has been removed
     */
    public boolean removeChildren(com.sun.grid.jgdi.configuration.ShareTree achildren);
   
       
 
    /**
     *  Determine if any children attribute is set
     *  @return <code>true</code> if the children attribute is set
     */
    public boolean isSetChildren();


    // Attribute actualProportion ------------------------------------------------

  
    /**
     *  Get the value of the actualProportion attribute.
     *  @return the value of the actualProportion attribute
     */
    public double getActualProportion();
   

 
    /**
     *  Determine if any actualProportion attribute is set
     *  @return <code>true</code> if the actualProportion attribute is set
     */
    public boolean isSetActualProportion();


    // Attribute mShare ------------------------------------------------

  
    /**
     *  Get the value of the mShare attribute.
     *  @return the value of the mShare attribute
     */
    public double getMShare();
   

 
    /**
     *  Determine if any mShare attribute is set
     *  @return <code>true</code> if the mShare attribute is set
     */
    public boolean isSetMShare();


    // Attribute temp ------------------------------------------------

  
    /**
     *  Get the value of the temp attribute.
     *  @return the value of the temp attribute
     */
    public int getTemp();
   

 
    /**
     *  Determine if any temp attribute is set
     *  @return <code>true</code> if the temp attribute is set
     */
    public boolean isSetTemp();



    /*
     * Dump the object
     * @return <code>String</code> the dump string
     */
     public String dump();
     

}