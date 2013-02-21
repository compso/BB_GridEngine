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
 *  Generated from javamodel_impl.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.configuration;

import javax.management.*;
import com.sun.grid.jgdi.configuration.GEObject;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *  Java representation of the cull object ARA_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  ARAImpl class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 */
public class ARAImpl extends    GEObjectImpl implements ARA {


   /**
    *  Create a new instance of ARAImpl. The new instance
    *  will not be initialized with the default values.
    */
   public ARAImpl() {
      this(false);
   }
   
   /**
    *   Create a new instanceof
    *   @param  initWithDefaultValues if <code>true</code> the new instance will
    *                                 be initialized with the default values as defined
    *                                 in the cull definition.
    */
   public ARAImpl(boolean initWithDefaultValues) { 

      if (initWithDefaultValues) {     
    }

  } // end of default constructor
  
  // --- newInstance method with primary key field
  

   /**
    *  Create a new instance of ARAImpl
    */
   public ARAImpl(java.lang.String name ) {

   
         setName(name);

    }



    // Attribute name ------------------------------------------------
   
    /**
     *  Determine if the name attribute is set
     *  @return <code>true</code> if the name attribute is set
     */
    public boolean isSetName() {
   
        return  (m_name != null);

    }
   
    private java.lang.String m_name;

    /**
     *   Set the name attribute.
     *
     *   @param aName  the new value for the  name attribute
     */
    public void setName(java.lang.String aName) {   
        m_name = aName;

    }

    /**
     *  Get the value of the name attribute.
     *  @return the value of the name attribute
     */
    public java.lang.String getName() {
        return m_name;
    }


    // Attribute group ------------------------------------------------
   
    /**
     *  Determine if the group attribute is set
     *  @return <code>true</code> if the group attribute is set
     */
    public boolean isSetGroup() {
   
        return  (m_group != null);

    }
   
    private java.lang.String m_group;

    /**
     *   Set the group attribute.
     *
     *   @param aGroup  the new value for the  group attribute
     */
    public void setGroup(java.lang.String aGroup) {   
        m_group = aGroup;

    }

    /**
     *  Get the value of the group attribute.
     *  @return the value of the group attribute
     */
    public java.lang.String getGroup() {
        return m_group;
    }




    /**
     *  Is the primary key information equal to the primary key information
     *  of <code>obj</code>.
     *
     *  @param obj   the compared object
     *  @return <code>true</code> if the primary key information is equal to the
     *          primary key informations of <code>obj</code>.
     */
    public boolean equals(Object obj) {

        return (obj instanceof ARAImpl && getName().equals(((com.sun.grid.jgdi.configuration.ARA)obj).getName()));

    }

    
    
    public boolean equalsCompletely(Object obj) {
        Logger logger = Logger.getLogger(getClass().getName());
        if (obj instanceof  ARAImpl) {
            com.sun.grid.jgdi.configuration.ARA obj1 = (com.sun.grid.jgdi.configuration.ARA)obj;

            {
                java.lang.String value1 = getName();
                java.lang.String value2 = obj1.getName();        

            if (value1 == null) {
                if (value2 != null) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attribute ARA_name of obj1 " + value2 + " is not null as obj " + value1);
                    }
                    return false;
                }
            } else {

                if (!value1.equals(value2)) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attributes ARA_name are not equal: " + value1 + " != " + value2);
                    }
                    return false;
                }

            }

            }

            {
                java.lang.String value1 = getGroup();
                java.lang.String value2 = obj1.getGroup();        

            if (value1 == null) {
                if (value2 != null) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attribute ARA_group of obj1 " + value2 + " is not null as obj " + value1);
                    }
                    return false;
                }
            } else {

                if (!value1.equals(value2)) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attributes ARA_group are not equal: " + value1 + " != " + value2);
                    }
                    return false;
                }

            }

            }

            return true;
        } else {
            return true;
        }
    }
  
    public java.lang.String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("ARAImpl(");

        ret.append(getName());

        ret.append(")");
        return ret.toString();
    }



    public java.lang.String dump() {
        StringBuilder sb = new StringBuilder();

            {
                java.lang.String value = getName();
                sb.append("Name = " + value + "\n");
            }

            {
                java.lang.String value = getGroup();
                sb.append("Group = " + value + "\n");
            }

        return sb.toString();
    }    

 
}
