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
 *  Java representation of the cull object SO_Type
 *  defined in sge_all_listsL.template
 *
 *  <p><strong>Warning:</strong>  The  SubordinateImpl class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 */
public class SubordinateImpl extends    GEObjectImpl implements Subordinate {


   /**
    *  Create a new instance of SubordinateImpl. The new instance
    *  will not be initialized with the default values.
    */
   public SubordinateImpl() {
      this(false);
   }
   
   /**
    *   Create a new instanceof
    *   @param  initWithDefaultValues if <code>true</code> the new instance will
    *                                 be initialized with the default values as defined
    *                                 in the cull definition.
    */
   public SubordinateImpl(boolean initWithDefaultValues) { 

      if (initWithDefaultValues) {     
    }

  } // end of default constructor
  
  // --- newInstance method with primary key field
  

   /**
    *  Create a new instance of SubordinateImpl
    */
   public SubordinateImpl(java.lang.String name ) {

   
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


    // Attribute threshold ------------------------------------------------

    private boolean isThresholdSet;
   
    /**
     *  Determine if the threshold attribute is set
     *  @return <code>true</code> if the threshold attribute is set
     */
    public boolean isSetThreshold() {

        return isThresholdSet;

    }
   
    private int m_threshold;

    /**
     *   Set the threshold attribute.
     *
     *   @param aThreshold  the new value for the  threshold attribute
     */
    public void setThreshold(int aThreshold) {   
        m_threshold = aThreshold;

        isThresholdSet = true;

    }

    /**
     *  Get the value of the threshold attribute.
     *  @return the value of the threshold attribute
     */
    public int getThreshold() {
        return m_threshold;
    }


    // Attribute slotsSum ------------------------------------------------

    private boolean isSlotsSumSet;
   
    /**
     *  Determine if the slotsSum attribute is set
     *  @return <code>true</code> if the slotsSum attribute is set
     */
    public boolean isSetSlotsSum() {

        return isSlotsSumSet;

    }
   
    private int m_slotsSum;

    /**
     *   Set the slotsSum attribute.
     *
     *   @param aSlotsSum  the new value for the  slotsSum attribute
     */
    public void setSlotsSum(int aSlotsSum) {   
        m_slotsSum = aSlotsSum;

        isSlotsSumSet = true;

    }

    /**
     *  Get the value of the slotsSum attribute.
     *  @return the value of the slotsSum attribute
     */
    public int getSlotsSum() {
        return m_slotsSum;
    }


    // Attribute seqNo ------------------------------------------------

    private boolean isSeqNoSet;
   
    /**
     *  Determine if the seqNo attribute is set
     *  @return <code>true</code> if the seqNo attribute is set
     */
    public boolean isSetSeqNo() {

        return isSeqNoSet;

    }
   
    private int m_seqNo;

    /**
     *   Set the seqNo attribute.
     *
     *   @param aSeqNo  the new value for the  seqNo attribute
     */
    public void setSeqNo(int aSeqNo) {   
        m_seqNo = aSeqNo;

        isSeqNoSet = true;

    }

    /**
     *  Get the value of the seqNo attribute.
     *  @return the value of the seqNo attribute
     */
    public int getSeqNo() {
        return m_seqNo;
    }


    // Attribute action ------------------------------------------------

    private boolean isActionSet;
   
    /**
     *  Determine if the action attribute is set
     *  @return <code>true</code> if the action attribute is set
     */
    public boolean isSetAction() {

        return isActionSet;

    }
   
    private int m_action;

    /**
     *   Set the action attribute.
     *
     *   @param aAction  the new value for the  action attribute
     */
    public void setAction(int aAction) {   
        m_action = aAction;

        isActionSet = true;

    }

    /**
     *  Get the value of the action attribute.
     *  @return the value of the action attribute
     */
    public int getAction() {
        return m_action;
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

        return (obj instanceof SubordinateImpl && getName().equals(((com.sun.grid.jgdi.configuration.Subordinate)obj).getName()));

    }

    
    
    public boolean equalsCompletely(Object obj) {
        Logger logger = Logger.getLogger(getClass().getName());
        if (obj instanceof  SubordinateImpl) {
            com.sun.grid.jgdi.configuration.Subordinate obj1 = (com.sun.grid.jgdi.configuration.Subordinate)obj;

            {
                java.lang.String value1 = getName();
                java.lang.String value2 = obj1.getName();        

            if (value1 == null) {
                if (value2 != null) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attribute SO_name of obj1 " + value2 + " is not null as obj " + value1);
                    }
                    return false;
                }
            } else {

                if (!value1.equals(value2)) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("attributes SO_name are not equal: " + value1 + " != " + value2);
                    }
                    return false;
                }

            }

            }

            {
                int value1 = getThreshold();
                int value2 = obj1.getThreshold();        

            if (value1 != value2) {
                if (logger.isLoggable(Level.FINE)) { 
                    logger.fine("primitive attributes SO_threshold are not equal");
                }
                return false;
            }

            }

            {
                int value1 = getSlotsSum();
                int value2 = obj1.getSlotsSum();        

            if (value1 != value2) {
                if (logger.isLoggable(Level.FINE)) { 
                    logger.fine("primitive attributes SO_slots_sum are not equal");
                }
                return false;
            }

            }

            {
                int value1 = getSeqNo();
                int value2 = obj1.getSeqNo();        

            if (value1 != value2) {
                if (logger.isLoggable(Level.FINE)) { 
                    logger.fine("primitive attributes SO_seq_no are not equal");
                }
                return false;
            }

            }

            {
                int value1 = getAction();
                int value2 = obj1.getAction();        

            if (value1 != value2) {
                if (logger.isLoggable(Level.FINE)) { 
                    logger.fine("primitive attributes SO_action are not equal");
                }
                return false;
            }

            }

            return true;
        } else {
            return true;
        }
    }
  
    public java.lang.String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("SubordinateImpl(");

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
                int value = getThreshold();
                sb.append("Threshold = " + value + "\n");
            }

            {
                int value = getSlotsSum();
                sb.append("SlotsSum = " + value + "\n");
            }

            {
                int value = getSeqNo();
                sb.append("SeqNo = " + value + "\n");
            }

            {
                int value = getAction();
                sb.append("Action = " + value + "\n");
            }

        return sb.toString();
    }    

 
}