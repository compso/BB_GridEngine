public class java_rmi_jgdi_impl_jsp implements com.sun.grid.cull.template.Template {
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
    p.println(" *  Generated from java_rmi_jgdi_impl.jsp");
    p.println(" *  !!! DO NOT EDIT THIS FILE !!!");
    p.println(" */");
    p.print("");
    
  final com.sun.grid.cull.JavaHelper jh = (com.sun.grid.cull.JavaHelper)params.get("javaHelper");
  final com.sun.grid.cull.CullDefinition cullDef = (com.sun.grid.cull.CullDefinition)params.get("cullDef");
  
  
  class JGDIRemoteGenerator extends com.sun.grid.cull.AbstractGDIGenerator {
      
    public JGDIRemoteGenerator(com.sun.grid.cull.CullObject cullObject) {
        super(cullObject.getIdlName(),  jh.getClassName(cullObject), cullObject);
        addPrimaryKeys(cullObject, jh);
    }
    
    public void genImport() {
        if(!(cullObject.getType() == cullObject.TYPE_PRIMITIVE ||
             cullObject.getType() == cullObject.TYPE_MAPPED)) {
p.print("import com.sun.grid.jgdi.configuration.");
    p.print(classname);p.println(";");
    p.print("");
            
        }
    }
    
    public void genGetMethod() {
       
p.println(" ");
    p.println("   /**");
    p.print("    *   Get the <code>");
    p.print(name);p.println("</code> object;");
    p.print("    *   @return the <code>");
    p.print(name);p.println("</code> object");
    p.println("    *   @throws RemoteException on any error");
    p.println("    */");
    p.print("   public ");
    p.print(classname);p.print(" get");
    p.print(name);p.println("() throws RemoteException {");
    p.print("      logger.entering(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("()\");");
    p.println("      try {");
    p.print("        logger.exiting(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("()\");");
    p.print("        return jgdi.get");
    p.print(name);p.println("();");
    p.println("      } catch( Exception e ) {");
    p.print("         logger.throwing(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("()\",e);");
    p.println("         throw new RemoteException(e.getMessage(), e);");
    p.println("      }");
    p.println("   }  ");
    p.print("");
    
   } // end of genGetMethod
    
   public void genGetByPrimaryKeyMethod() {
p.println("       ");
    p.println("   /**");
    p.print("    *   Get the <code>");
    p.print(name);p.println("</code> object;");
    p.print("    *   @return the <code>");
    p.print(name);p.println("</code> object");
    p.println("    *   @throws RemoteException on any error");
    p.println("    */");
    p.print("   public ");
    p.print(classname);p.print(" get");
    p.print(name);p.print("(");
    
      boolean first = true;
      for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
         String pkName = entry.getKey();
         String pkType = entry.getValue();
         if(first) {
            first = false;
         } else {
             p.print(", ");
     
         }
         p.print(" ");
    p.print(pkType);p.print(" ");
    p.print(pkName);p.print("");
    
      }
   p.println(") throws RemoteException {");
    p.print("      logger.entering(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("()\");");
    p.println("      try {");
    p.print("        logger.exiting(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("()\");");
    p.print("        return jgdi.get");
    p.print(name);p.print("(");
    
      first = true;
      for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
         String pkName = entry.getKey();
         if(first) {
            first = false;
         } else {
             p.print(", ");
     
         }
         p.print("");
    p.print(pkName);p.print("");
    
      }
   p.println(");");
    p.println("      } catch( Exception e ) {");
    p.print("         logger.throwing(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("()\",e);");
    p.println("         throw new RemoteException(e.getMessage(), e);");
    p.println("      }");
    p.println("   }  ");
    p.print("");
           
   } // genGetByPrimaryKeyMethod
  
    
   public void genGetListMethod() {
p.println("       ");
    p.println("   /**");
    p.print("    *  Get all <code>");
    p.print(name);p.println("</code> objects.");
    p.print("    *  @return a @{link java.util.List} of <code>");
    p.print(name);p.println("</code> objects");
    p.println("    *  @throws RemoteException on any error");
    p.println("    */");
    p.print("   public List get");
    p.print(name);p.println("List() throws RemoteException {");
    p.print("      logger.entering(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("List()\");");
    p.println("      try {");
    p.print("        logger.exiting(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("List()\");");
    p.print("        return jgdi.get");
    p.print(name);p.println("List();");
    p.println("      } catch( Exception e ) {");
    p.print("         logger.throwing(\"JGDIRemoteImpl\",\"get");
    p.print(name);p.println("List()\",e);");
    p.println("         throw new RemoteException(e.getMessage(), e);");
    p.println("      }");
    p.println("   }");
    p.print("");
       
   } // end of genGetListMethod
   
   public void genUpdateMethod() {
p.println("");
    p.println("   /**");
    p.print("    *  Update ");
    p.print(primaryKeys.size() == 0 ? "a" : "the");p.print(" <code>");
    p.print(name);p.println("</code> object.");
    p.println("    *");
    p.print("    *  @param  obj  the <code>");
    p.print(name);p.println("</code> object with the new values");
    p.println("    *  @throws RemoteException on any error");
    p.println("    */");
    p.print("   public void update");
    p.print(name);p.print("(");
    p.print(classname);p.println(" obj) throws RemoteException {");
    p.print("      logger.entering(\"JGDIRemoteImpl\",\"update");
    p.print(name);p.println("List()\");");
    p.println("      try {");
    p.print("        jgdi.update");
    p.print(name);p.println("(obj);");
    p.print("        logger.exiting(\"JGDIRemoteImpl\",\"update");
    p.print(name);p.println("List()\");");
    p.println("      } catch( Exception e ) {");
    p.print("         logger.throwing(\"JGDIRemoteImpl\",\"update");
    p.print(name);p.println("List()\",e);");
    p.println("         throw new RemoteException(e.getMessage(), e);");
    p.println("      }");
    p.println("   }      ");
    p.print("");
    
   } // end of genUpdateMethod
   
    public void genAddMethod() {
p.println("");
    p.println("   /**");
    p.print("    *  Add a new <code>");
    p.print(name);p.println("</code> object.");
    p.println("    *");
    p.print("    *  @param obj  the new <code>");
    p.print(name);p.println("</code> object");
    p.println("    *  @throws RemoteException on any error");
    p.println("    */");
    p.print("   public void add");
    p.print(name);p.print("(");
    p.print(classname);p.println(" obj) throws RemoteException {");
    p.print("      logger.entering(\"JGDIRemoteImpl\",\"add");
    p.print(name);p.println("List()\");");
    p.println("      try {");
    p.print("        jgdi.add");
    p.print(name);p.println("(obj);");
    p.print("        logger.exiting(\"JGDIRemoteImpl\",\"add");
    p.print(name);p.println("List()\");");
    p.println("      } catch( Exception e ) {");
    p.print("         logger.throwing(\"JGDIRemoteImpl\",\"add");
    p.print(name);p.println("List()\",e);");
    p.println("         throw new RemoteException(e.getMessage(), e);");
    p.println("      }");
    p.println("   }");
    p.print("");
       
   } // end of getAddMethod
   
   public void genDeleteMethod() {
p.println("");
    p.println("   /**");
    p.print("    *   Delete a ");
    p.print(name);p.println(" object.");
    p.println("    *");
    p.print("    *   @param obj  the ");
    p.print(name);p.println(" with the primary information");
    p.println("    *   @throws RemoteException on any error");
    p.println("    */");
    p.print("   public void delete");
    p.print(name);p.print("(");
    p.print(classname);p.println(" obj) throws RemoteException {");
    p.print("      logger.entering(\"JGDIRemoteImpl\",\"delete");
    p.print(name);p.println("List()\");");
    p.println("      try {");
    p.print("        jgdi.delete");
    p.print(name);p.println("(obj);");
    p.print("        logger.exiting(\"JGDIRemoteImpl\",\"delete");
    p.print(name);p.println("List()\");");
    p.println("      } catch( Exception e ) {");
    p.print("         logger.throwing(\"JGDIRemoteImpl\",\"delete");
    p.print(name);p.println("List()\",e);");
    p.println("         throw new RemoteException(e.getMessage(), e);");
    p.println("      }");
    p.println("   }");
    p.print("");
       
   } // end of genDeleteMethod
   
   public void genDeleteByPrimaryKeyMethod() {
p.println("       ");
    p.println("   /**");
    p.print("    *   Delete the <code>");
    p.print(name);p.println("</code> object by primary key");
    p.println("    *   @throws RemoteException on any error");
    p.println("    */");
    p.print("   public void delete");
    p.print(name);p.print("(");
    
      boolean first = true;
      for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
         String pkName = entry.getKey();
         String pkType = entry.getValue();
         if(first) {
            first = false;
         } else {
             p.print(", ");
     
         }
         p.print(" ");
    p.print(pkType);p.print(" ");
    p.print(pkName);p.print("");
    
      }
   p.println(") throws RemoteException {");
    p.print("      logger.entering(\"JGDIRemoteImpl\", \"delete");
    p.print(name);p.println("()\");");
    p.println("      try {");
    p.print("        logger.exiting(\"JGDIRemoteImpl\", \"delete");
    p.print(name);p.println("()\");");
    p.print("        jgdi.delete");
    p.print(name);p.print("(");
    
      first = true;
      for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
         String pkName = entry.getKey();
         if(first) {
            first = false;
         } else {
             p.print(", ");
     
         }
         p.print("");
    p.print(pkName);p.print("");
    
      }
   p.println(");");
    p.println("      } catch( Exception e ) {");
    p.print("         logger.throwing(\"JGDIRemoteImpl\", \"delete");
    p.print(name);p.println("()\", e);");
    p.println("         throw new RemoteException(e.getMessage(), e);");
    p.println("      }");
    p.println("   }  ");
    p.print("");
           
   } // genDeleteByPrimaryKeyMethod
  
  } // end of class JGDIRemoteGenerator
  
  // ---------------------------------------------------------------------------
  // Build the JGDIRemoteGenerator instances
  // ---------------------------------------------------------------------------
  
  java.util.List<JGDIRemoteGenerator> generators = new java.util.ArrayList<JGDIRemoteGenerator>();
  com.sun.grid.cull.CullObject cullObj = null;
  for (String name : cullDef.getObjectNames()) {  
      cullObj = cullDef.getCullObject(name); 
      generators.add(new JGDIRemoteGenerator(cullObj));
   } // end of for
p.println("");
    p.println("package com.sun.grid.jgdi.rmi;");
    p.println("");
    p.println("");
    p.println("import com.sun.grid.jgdi.JGDIException;");
    p.println("import java.rmi.RemoteException;");
    p.println("import java.util.List;");
    p.println("import java.util.ArrayList;");
    p.println("import com.sun.grid.jgdi.JGDI;");
    p.println("import com.sun.grid.jgdi.JGDIFactory;");
    p.println("import java.rmi.server.UnicastRemoteObject;");
    p.println("import java.util.logging.*;");
    p.println("");
    p.print("");
      // Import all cull object names;
    for (JGDIRemoteGenerator gen : generators) {
        gen.genImport();
    } // end of while 
p.println("");
    p.println("/**");
    p.println(" *   <code>JGDIRemoteImpl</code> implements an RMI service for");
    p.println(" *   the {@link com.sun.grid.jgdi.JGDI} interface.");
    p.println(" * ");
    p.println(" */");
    p.println("public class JGDIRemoteImpl extends JGDIRemoteBaseImpl implements JGDIRemote {");
    p.println("   ");
    p.println("   /**");
    p.println("    *   Create a new instance of <code>JGDIRemoteImpl</code>.");
    p.println("    *");
    p.println("    *   @param url JGDI connection url");
    p.println("    */");
    p.println("   public JGDIRemoteImpl(String url) ");
    p.println("         throws RemoteException, JGDIException {");
    p.println("      super(url);");
    p.println("   }");
    p.println("   ");
    p.print("");
    
    for (JGDIRemoteGenerator gen : generators) {
       gen.genMethods();
    } // end of for
p.println("");
    p.println("}");
  } // end of print
} // end of class java_rmi_jgdi_impl_jsp
