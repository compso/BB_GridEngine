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
 *  Generated from javadescriptor.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.configuration.reflect;

import com.sun.grid.jgdi.configuration.*;
import com.sun.grid.jgdi.CullConstants;

/**
 *  Java descriptor of the cull object AN_Type
 *  defined in sge_all_listsL.template
 */
public class JGDIAnswerDescriptor extends  GEObjectDescriptor {

   public JGDIAnswerDescriptor() {
      this(JGDIAnswerImpl.class, "AN_Type" );
      setImplClass(JGDIAnswerImpl.class);
   }
      
   protected JGDIAnswerDescriptor(Class type, String name) {
      super(type, name);
     
      PropertyDescriptor propDescr = null;

      propDescr = addSimple("status", Integer.TYPE, "SGE_ULONG", CullConstants.AN_status, false, false, false); 

      propDescr = addSimple("text", String.class, "SGE_STRING", CullConstants.AN_text, false, false, false); 

      propDescr = addSimple("quality", Integer.TYPE, "SGE_ULONG", CullConstants.AN_quality, false, false, false); 

   }
   
   public void validate(Object obj) throws InvalidObjectException {
   
      if (!(obj instanceof JGDIAnswer)) {
         throw new InvalidObjectException(obj, "obj is not an instanceof JGDIAnswer");
      }

      JGDIAnswer cullObj = (JGDIAnswer)obj;
      InvalidObjectException exc = null;

       if (exc != null) {
           throw exc;
       }

   }
}
