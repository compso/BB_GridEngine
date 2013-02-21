public class java_config_factory_jsp implements com.sun.grid.cull.template.Template {
  public void print(final com.sun.grid.cull.Printer p, final java.util.Map params) {
    p.println("/*___INFO__MARK_BEGIN__*/");
    p.println("/*************************************************************************");
    p.println(" *");
    p.println(" *  The Contents of this file are made available subject to the terms of");
    p.println(" *  the Sun Industry Standards Source License Version 1.2");
    p.println(" *");
    p.println(" *  Sun Microsystems Inc., March, 2001");
    p.println(" *");
    p.println(" *");
    p.println(" *  Sun Industry Standards Source License Version 1.2");
    p.println(" *  =================================================");
    p.println(" *  The contents of this file are subject to the Sun Industry Standards");
    p.println(" *  Source License Version 1.2 (the \"License\"); You may not use this file");
    p.println(" *  except in compliance with the License. You may obtain a copy of the");
    p.println(" *  License at http://gridengine.sunsource.net/Gridengine_SISSL_license.html");
    p.println(" *");
    p.println(" *  Software provided under this License is provided on an \"AS IS\" basis,");
    p.println(" *  WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING,");
    p.println(" *  WITHOUT LIMITATION, WARRANTIES THAT THE SOFTWARE IS FREE OF DEFECTS,");
    p.println(" *  MERCHANTABLE, FIT FOR A PARTICULAR PURPOSE, OR NON-INFRINGING.");
    p.println(" *  See the License for the specific provisions governing your rights and");
    p.println(" *  obligations concerning the Software.");
    p.println(" *");
    p.println(" *   The Initial Developer of the Original Code is: Sun Microsystems, Inc.");
    p.println(" *");
    p.println(" *   Copyright: 2001 by Sun Microsystems, Inc.");
    p.println(" *");
    p.println(" *   All Rights Reserved.");
    p.println(" *");
    p.println(" ************************************************************************/");
    p.println("/*___INFO__MARK_END__*/");
    p.println("/**");
    p.println(" *  Generated from java_config_factory.jsp");
    p.println(" *  !!! DO NOT EDIT THIS FILE !!!");
    p.println(" */");
    p.print("");
    
  com.sun.grid.cull.JavaHelper jh = (com.sun.grid.cull.JavaHelper)params.get("javaHelper");
  com.sun.grid.cull.CullDefinition cullDef = (com.sun.grid.cull.CullDefinition)params.get("cullDef");
p.println("");
    p.println("package com.sun.grid.jgdi.configuration;");
    p.println("");
    p.println("");
    p.println("import java.util.*;");
    p.println("");
    p.println("/**");
    p.println(" *  Factory class for all List/Del/Add/Mod Configuration objects");
    p.println(" */");
    p.println("public class ConfigurationFactory {");
    p.println("");
    p.print("");
    
    for (String name : cullDef.getObjectNames()) {
      com.sun.grid.cull.CullObject cullObj = cullDef.getCullObject(name); 
      String classname = jh.getClassName(cullObj);
p.println("");
    p.print("      public static ");
    p.print(classname);p.print(" create");
    p.print(classname);p.println("() {");
    p.print("         return new ");
    p.print(classname);p.println("Impl();");
    p.println("      }");
    p.println("");
    p.print("      public static ");
    p.print(classname);p.print(" create");
    p.print(classname);p.println("WithDefaults() {");
    p.print("         return new ");
    p.print(classname);p.println("Impl(true);");
    p.println("      }");
    p.print("");
    
    } // end of for
p.println("  ");
    p.println("");
    p.println("}");
  } // end of print
} // end of class java_config_factory_jsp