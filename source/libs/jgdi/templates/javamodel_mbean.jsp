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
<%
final com.sun.grid.cull.CullDefinition cullDef = (com.sun.grid.cull.CullDefinition)params.get("cullDef");
final com.sun.grid.cull.JavaHelper jh = (com.sun.grid.cull.JavaHelper)params.get("javaHelper");
final com.sun.grid.cull.CullObject cullObj = (com.sun.grid.cull.CullObject)params.get("cullObj");
com.sun.grid.cull.CullAttr attr = null;
final String classname = jh.getClassName(cullObj);
%>
package <%=jh.getPackageName()%>;

/**
 *  Java representation of the cull object <%=cullObj.getName()%>
 *  defined in <%=jh.getSource(cullObj).getName()%>
 *
 *  <p><strong>Warning:</strong>  The  <%=classname%> class will 
 *  not be compatible with future Sun&trade; Grid Engine releases.</p>
 *
 */
public interface <%=classname%>BeanMBean extends <%=classname%> {
    // empty here
}

