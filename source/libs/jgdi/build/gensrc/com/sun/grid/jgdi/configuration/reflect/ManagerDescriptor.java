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
 *  Java descriptor of the cull object UM_Type
 *  defined in sge_all_listsL.template
 */
public class ManagerDescriptor extends  GEObjectDescriptor {

   public ManagerDescriptor() {
      this(ManagerImpl.class, "UM_Type" );
      setImplClass(ManagerImpl.class);
   }
      
   protected ManagerDescriptor(Class type, String name) {
      super(type, name);
     
      PropertyDescriptor propDescr = null;

      propDescr = addSimple("name", String.class, "SGE_STRING", CullConstants.UM_name, true, false, true); 

   }
   
   public void validate(Object obj) throws InvalidObjectException {
   
      if (!(obj instanceof Manager)) {
         throw new InvalidObjectException(obj, "obj is not an instanceof Manager");
      }

      Manager cullObj = (Manager)obj;
      InvalidObjectException exc = null;
   
       if (!cullObj.isSetName()) {
          if (exc == null) {
             exc = new InvalidObjectException(obj, "Primary key fields are not set");
          }
          exc.addPropertyError("name", "primary key field is required");
       }

       if (exc != null) {
           throw exc;
       }

   }
}
