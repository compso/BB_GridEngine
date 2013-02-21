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
 *  Java representation of the cull object CONF_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  ConfigurationImpl class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 */
public class ConfigurationImpl extends    GEObjectImpl implements Configuration {


   /**
    *  Create a new instance of ConfigurationImpl. The new instance
    *  will not be initialized with the default values.
    */
   public ConfigurationImpl() {
      this(false);
   }
   
   /**
    *   Create a new instanceof
    *   @param  initWithDefaultValues if <code>true</code> the new instance will
    *                                 be initialized with the default values as defined
    *                                 in the cull definition.
    */
   public ConfigurationImpl(boolean initWithDefaultValues) { 

      if (initWithDefaultValues) { 
       setName("global");    
    }

  } // end of default constructor
  
  // --- newInstance method with primary key field
  

   /**
    *  Create a new instance of ConfigurationImpl
    */
   public ConfigurationImpl(java.lang.String name ) {

   
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


    // Attribute entries ------------------------------------------------

    private List< com.sun.grid.jgdi.configuration.ConfigurationElement > m_entriesList;
   
    private void initEntries() {
        if (m_entriesList == null) {
            m_entriesList = new LinkedList< com.sun.grid.jgdi.configuration.ConfigurationElement >();
        }
    }

    /**
     *   Add a com.sun.grid.jgdi.configuration.ConfigurationElement attribute.

     *   @param aentries  the new com.sun.grid.jgdi.configuration.ConfigurationElement attribute
     */
    public void addEntries(com.sun.grid.jgdi.configuration.ConfigurationElement aentries) {   
        initEntries();
        
        m_entriesList.add(aentries);
        
    }
   
   
    /**
     *   Set a com.sun.grid.jgdi.configuration.ConfigurationElement attribute.
     *   @param index   index of the com.sun.grid.jgdi.configuration.ConfigurationElement attribute
     *   @param aentries  the new com.sun.grid.jgdi.configuration.ConfigurationElement attribute
     */
    public void setEntries(int index, com.sun.grid.jgdi.configuration.ConfigurationElement aentries) {
        initEntries();
        m_entriesList.set(index, aentries);
    }

    /**
     *  Remove all com.sun.grid.jgdi.configuration.ConfigurationElement attributes.
     */
    public void removeAllEntries() {
        if (m_entriesList != null) {
            m_entriesList.clear();
        }
    }

    /**
     *  Remote a com.sun.grid.jgdi.configuration.ConfigurationElement attribute at an index.
     *  @param index  the index of the com.sun.grid.jgdi.configuration.ConfigurationElement attribute which should be
     *                removed
     *  @return the removed com.sun.grid.jgdi.configuration.ConfigurationElement attribute or <code>null</code> if
     *          no attribute at this index is stored
     */
    public com.sun.grid.jgdi.configuration.ConfigurationElement removeEntries(int index) {
        initEntries();
        return (com.sun.grid.jgdi.configuration.ConfigurationElement)m_entriesList.remove(index);
    }

    /**
     *  Remote a specific com.sun.grid.jgdi.configuration.ConfigurationElement attribute.
     *  @param aentries  the com.sun.grid.jgdi.configuration.ConfigurationElement attribute which should be
     *                         removed
     *  @return <code>true</code> if the com.sun.grid.jgdi.configuration.ConfigurationElement attribute has been removed
     */
    public boolean removeEntries(com.sun.grid.jgdi.configuration.ConfigurationElement aentries) {
        initEntries();
        return m_entriesList.remove(aentries);
    }
   
    /**
     *   Get a unmodifiable list of all com.sun.grid.jgdi.configuration.ConfigurationElement attributes.
     *
     *   @return Unmodifiable list with all com.sun.grid.jgdi.configuration.ConfigurationElement attributes
     */
    public List< com.sun.grid.jgdi.configuration.ConfigurationElement > getEntriesList() {
        initEntries();
        return Collections.unmodifiableList(m_entriesList);
    }

    /**
     *  Get the number of com.sun.grid.jgdi.configuration.ConfigurationElement attributes.
     *
     *  @return The number of com.sun.grid.jgdi.configuration.ConfigurationElement attributes.
     */
    public int getEntriesCount() {
        if (m_entriesList != null) {
            return m_entriesList.size();
        } else {
            return 0;
        }
    }
 
    /**
     *  Get a com.sun.grid.jgdi.configuration.ConfigurationElement attribute at an index.
     *  @param index  the index of the com.sun.grid.jgdi.configuration.ConfigurationElement attribute which should be
     *                removed
     *  @return the com.sun.grid.jgdi.configuration.ConfigurationElement attribute
     */
    public com.sun.grid.jgdi.configuration.ConfigurationElement getEntries(int index) {
        initEntries();
        return (com.sun.grid.jgdi.configuration.ConfigurationElement)m_entriesList.get(index);
    }
   
    /**
     *  Determine if the entries attribute is set
     *  @return <code>true</code> if the entries attribute is set
     */
    public boolean isSetEntries () {
        return (m_entriesList != null) && (!m_entriesList.isEmpty());
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

        return (obj instanceof ConfigurationImpl && getName().equals(((com.sun.grid.jgdi.configuration.Configuration)obj).getName()));

    }

    
    
    public boolean equalsCompletely(Object obj) {
        Logger logger = Logger.getLogger(getClass().getName());
        if (obj instanceof  ConfigurationImpl) {
            com.sun.grid.jgdi.configuration.Configuration obj1 = (com.sun.grid.jgdi.configuration.Configuration)obj;

            {
                java.lang.String value1 = getName();
                java.lang.String value2 = obj1.getName();        

            if (value1 == null) {
                if (value2 != null) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attribute CONF_name of obj1 " + value2 + " is not null as obj " + value1);
                    }
                    return false;
                }
            } else {

                if (!value1.equals(value2)) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attributes CONF_name are not equal: " + value1 + " != " + value2);
                    }
                    return false;
                }

            }

            }

            {
                int entriesCount = getEntriesCount();
                if (entriesCount != obj1.getEntriesCount()) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("lists entries has different sizes");
                    }
                    return false;
                }
                for (int i = 0; i < entriesCount; i++) {
                    com.sun.grid.jgdi.configuration.ConfigurationElement value1 = getEntries(i);
                    com.sun.grid.jgdi.configuration.ConfigurationElement value2 = obj1.getEntries(i);

            if (value1 == null) {
                if (value2 != null) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attribute CONF_entries of obj1 " + value2 + " is not null as obj " + value1);
                    }
                    return false;
                }
            } else {

                if (!value1.equalsCompletely(value2)) {
                    return false;
                }           

            }

                } // end of for
            }

            return true;
        } else {
            return true;
        }
    }
  
    public java.lang.String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("ConfigurationImpl(");

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

            int entriesCount = getEntriesCount();
            for (int i = 0; i < entriesCount; i++) {
                com.sun.grid.jgdi.configuration.ConfigurationElement value = getEntries(i);
                
                sb.append("Entries[" + i + "] = " + value.dump() + "\n");
                
            } // end of for

        return sb.toString();
    }    

 
}
