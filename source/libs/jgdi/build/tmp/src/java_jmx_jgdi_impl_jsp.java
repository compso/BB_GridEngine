public class java_jmx_jgdi_impl_jsp implements com.sun.grid.cull.template.Template {
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
    p.println(" *  Generated from java_jmx_jgdi_impl.jsp");
    p.println(" *  !!! DO NOT EDIT THIS FILE !!!");
    p.println(" */");
    p.print("");
    
  final com.sun.grid.cull.JavaHelper jh = (com.sun.grid.cull.JavaHelper)params.get("javaHelper");
  final com.sun.grid.cull.CullDefinition cullDef = (com.sun.grid.cull.CullDefinition)params.get("cullDef");
  
  class JGDIJMXGenerator extends com.sun.grid.cull.AbstractGDIGenerator {

     private String cullname;
     public JGDIJMXGenerator(com.sun.grid.cull.CullObject cullObject) {
        super(cullObject.getIdlName(), jh.getClassName(cullObject), cullObject);
        this.cullname = cullObject.getName();
        addPrimaryKeys(cullObject, jh);
     }

     public void genImport() {
        if(!(cullObject.getType() == cullObject.TYPE_PRIMITIVE ||
             cullObject.getType() == cullObject.TYPE_MAPPED)) {
p.print("// for ");
    p.print(name);p.println("");
    p.print("import com.sun.grid.jgdi.configuration.");
    p.print(classname);p.println(";");
    p.print("");
            
        }
     } // end of genImport
     public void genGetMethod() {
p.println(" ");
    p.println("   /**");
    p.print("    *   Get the <code>");
    p.print(name);p.println("</code> object");
    p.print("    *   @return the <code>");
    p.print(name);p.println("</code> object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public ");
    p.print(classname);p.print(" get");
    p.print(name);p.println("() throws JGDIException {");
    p.print("        return getJGDI().get");
    p.print(name);p.println("();");
    p.println("   }");
    p.println("");
    p.println("   /**");
    p.print("    *   Get the <code>");
    p.print(name);p.println("</code> object.");
    p.println("    *   @param answers  the <code>answer list</code> object");
    p.print("    *   @return the <code>");
    p.print(classname);p.println("</code> object.");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public ");
    p.print(classname);p.print(" get");
    p.print(name);p.println("WithAnswer(List<JGDIAnswer> answers) throws JGDIException {");
    p.print("      return getJGDI().get");
    p.print(name);p.println("WithAnswer(answers);");
    p.println("   }");
    p.print("");
    
     } // end of genGetMethod

     public void genGetListMethod() {
p.println("       ");
    p.println("   /**");
    p.print("    *  Get all <code>");
    p.print(name);p.println("</code> objects.");
    p.print("    *  @return a @{link java.util.List} of <code>");
    p.print(name);p.println("</code> objects");
    p.println("    *  @throws JGDIException on any error");
    p.println("    */");
    p.print("   public List get");
    p.print(name);p.println("List() throws JGDIException {");
    p.print("       return getJGDI().get");
    p.print(name);p.println("List();");
    p.println("   }");
    p.println("   ");
    p.println("   /**");
    p.print("    *   Get the list of all defined <code>");
    p.print(name);p.println("</code> objects.");
    p.println("    *   @param answers  the <code>answer list</code> object    ");
    p.print("    *   @return list of <code>");
    p.print(name);p.println("</code> objects");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public List get");
    p.print(name);p.println("ListWithAnswer(List<JGDIAnswer> answers) throws JGDIException {");
    p.print("       return getJGDI().get");
    p.print(name);p.println("ListWithAnswer(answers);");
    p.println("   }");
    p.println("   ");
    p.println("   ");
    p.print("");
       
   } // end of genGetListMethod
     public void genGetByPrimaryKeyMethod() {
p.println("");
    p.println("   /**");
    p.print("    *   Get the <code>");
    p.print(name);p.println("</code> object;");
    p.print("    *   @return the <code>");
    p.print(name);p.println("</code> object");
    p.println("    *   @throws JGDIException on any error");
    p.println("    */");
    p.print("   public ");
    p.print(classname);p.print(" get");
    p.print(name);p.print("(");
    
      boolean first = true;
      for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
         String pkName = entry.getKey();
         String pkType = entry.getValue();
         if (first) {
            first = false;
         } else {
             p.print(", ");
    
         }
         p.print(" ");
    p.print(pkType);p.print(" ");
    p.print(pkName);p.print(" ");
    
    }
   p.println(") throws JGDIException {");
    p.print("        return getJGDI().get");
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
    p.println("   }");
    p.println("   ");
    p.println("   /**");
    p.print("    *  Get a ");
    p.print(name);p.println(" by its primary key");
    p.println("    *");
    p.print("    *  @return the ");
    p.print(name);p.println("");
    p.print("");
    
    for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
       String pkName = entry.getKey();
       String pkType = entry.getValue();
p.print("    *  @param ");
    p.print(pkName);p.print("   the ");
    p.print(pkName);p.print(" of the <code>");
    p.print(name);p.println("</code> object");
    p.print("");
    
    }
p.println("   *  @param  answers the <code>answer list</code> object");
    p.print("    *  @return the found <code>");
    p.print(name);p.println("</code> object of <code>null</code>    ");
    p.println("    *  @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public ");
    p.print(classname);p.print(" get");
    p.print(name);p.print("WithAnswer(");
    
    first = true;
    for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
       String pkName = entry.getKey();
       String pkType = entry.getValue();
       if (first) {
          first = false;
       } else {
         p.print(", ");
    
       }
       p.print(" ");
    p.print(pkType);p.print(" ");
    p.print(pkName);p.print(" ");
    
    }
       p.println(", List<JGDIAnswer> answers) throws JGDIException {");
    p.print("        return getJGDI().get");
    p.print(name);p.print("WithAnswer(");
    
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
   
   p.println(", answers);");
    p.println("    }");
    p.println("   ");
    p.print("");
    
    } // genGetByPrimaryKeyMethod
  
    public void genAddMethod() {
p.println("");
    p.println("   /**");
    p.print("    *  Add a new <code>");
    p.print(name);p.println("</code> object.");
    p.println("    *");
    p.print("    *  @param obj  the new <code>");
    p.print(name);p.println("</code> object");
    p.println("    *  @throws JGDIException on any error");
    p.println("    */");
    p.print("   public void add");
    p.print(name);p.print("(");
    p.print(classname);p.println(" obj) throws JGDIException {");
    p.print("        getJGDI().add");
    p.print(name);p.println("(obj);");
    p.println("   }");
    p.println("   ");
    p.println("   /**");
    p.print("    *   Add a new <code>");
    p.print(name);p.println("</code> object.");
    p.print("    *   @param  obj the new <code>");
    p.print(name);p.println("</code> object");
    p.println("    *   @param  answers the <code>answer list</code> object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public void add");
    p.print(name);p.print("WithAnswer(");
    p.print(classname);p.println(" obj, List<JGDIAnswer> answers) throws JGDIException {");
    p.print("       getJGDI().add");
    p.print(name);p.println("WithAnswer(obj, answers);");
    p.println("   }");
    p.println("   ");
    p.print("");
     if ((name.equals("Manager")) || 
       (name.equals("Operator")) ||
       (name.equals("AdminHost")) || 
       (name.equals("SubmitHost"))) { p.println("");
    p.println("   /**");
    p.print("    *   Add a new <code>");
    p.print(name);p.println("</code> object.");
    p.println("    *   @param  name the new <code>String</code> object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public void add");
    p.print(name);p.println("(String name) throws JGDIException {");
    p.print("       getJGDI().add");
    p.print(name);p.println("(name);");
    p.println("   }");
    p.println("");
    p.println("   /**");
    p.print("    *   Add a new <code>");
    p.print(name);p.println("</code> object.");
    p.println("    *   @param  name the new <code>String</code> object");
    p.println("    *   @param  answers the <code>answer list</code> object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public void add");
    p.print(name);p.println("WithAnswer(String name, List<JGDIAnswer> answers) throws JGDIException {");
    p.print("       getJGDI().add");
    p.print(name);p.println("WithAnswer(name, answers);");
    p.println("   }");
    p.print("");
    
     } // end if name.equals()
   } // end of genAddMethod
    
   public void genDeleteMethod() {
p.println("");
    p.println("   /**");
    p.print("    *   Delete a <code>");
    p.print(name);p.println("</code> object.");
    p.print("    *   @param obj  <code>");
    p.print(name);p.println("</code> object with the primary key information");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public void delete");
    p.print(name);p.print("(");
    p.print(classname);p.println(" obj) throws JGDIException {");
    p.print("        getJGDI().delete");
    p.print(name);p.println("(obj);");
    p.println("   }");
    p.println("   ");
    p.println("   /**");
    p.print("    *   Delete a <code>");
    p.print(name);p.println("</code> object.");
    p.print("    *   @param obj  <code>");
    p.print(name);p.println("</code> object with the primary key information");
    p.println("    *   @param answers  <code>answer list</code> object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public void delete");
    p.print(name);p.print("WithAnswer(");
    p.print(classname);p.println(" obj, List<JGDIAnswer> answers) throws JGDIException {");
    p.print("       getJGDI().delete");
    p.print(name);p.println("WithAnswer(obj, answers);");
    p.println("   }");
    p.println("   ");
    p.print("");
    
     } // end of genDeleteMethod

     public void genDeleteByPrimaryKeyMethod() {
p.println("");
    p.println("");
    p.println("   /**");
    p.print("    *   Delete the <code>");
    p.print(name);p.println("</code> object by primary key;");
    p.print("");
    
    for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
       String pkName = entry.getKey();
       String pkType = entry.getValue();
p.print("    *   @param ");
    p.print(pkName);p.print("   the ");
    p.print(pkName);p.print(" of the <code>");
    p.print(name);p.println("</code> object");
    p.print("");
    
    }    
p.println("    *   @throws JGDIException on any error on the GDI layer");
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
       p.print("");
    p.print(pkType);p.print(" ");
    p.print(pkName);p.print("");
    
    }
   p.println(") throws JGDIException {");
    p.print("        getJGDI().delete");
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
    p.println("   }");
    p.println("   ");
    p.println("   /**");
    p.print("    *   Delete a <code>");
    p.print(name);p.println("</code> object by its primary key");
    p.print("");
    
    for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
       String pkName = entry.getKey();
       String pkType = entry.getValue();
p.print("    *   @param ");
    p.print(pkName);p.print("   the ");
    p.print(pkName);p.print(" of the <code>");
    p.print(name);p.println("</code> object");
    p.println("");
    p.print("");
    
    }    
p.println("       *   @param answers  <code>answer list</code> object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public void delete");
    p.print(name);p.print("WithAnswer(");
    
    first = true;  
    for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
       String pkName = entry.getKey();
       String pkType = entry.getValue();
       if(first) {
         first = false;
       } else {
            p.print(" , ");
               
       }
       p.print("");
    p.print(pkType);p.print(" ");
    p.print(pkName);p.print("");
    
    } // end of for  
    p.println(", List<JGDIAnswer> answers) throws JGDIException {");
    p.print("        getJGDI().delete");
    p.print(name);p.print("WithAnswer(");
    
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
   p.println(", answers);");
    p.println("    }");
    p.println("");
    p.println("   /**");
    p.print("    *   Delete several <code>");
    p.print(name);p.println("</code> objects by their primary key");
    p.print("");
    
    for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
       String pkName = entry.getKey();
       // String pkType = entry.getValue();
p.print("    *  @param ");
    p.print(pkName);p.print("s   array of ");
    p.print(pkName);p.print(" of the <code>");
    p.print(name);p.println("</code> objects");
    p.print("");
    
    } // end of for
p.println("    *  @param answers   the <code>answer list</code> object");
    p.println("    *  @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public void delete");
    p.print(name);p.print("sWithAnswer(");
    
    first = true;
    for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
       String pkName = entry.getKey();
       // String pkType = entry.getValue();
       if (first) {
         first = false;
       } else {
            p.print(", ");
               
       } 
       p.print("String[] ");
    p.print(pkName);p.print("s ");
    
    } // end of for
    p.println("");
    p.print("");
     if (name.equals("Job") || name.equals("AdvanceReservation")) {p.println("");
    p.println("    , boolean forced, UserFilter userFilter");
    p.print("");
     }p.println("    , List<JGDIAnswer> answers) throws JGDIException {");
    p.print("        getJGDI().delete");
    p.print(name);p.print("sWithAnswer(");
    
      first = true;
    for (java.util.Map.Entry<String, String> entry: primaryKeys.entrySet()) {
       String pkName = entry.getKey();
         if (first) {
            first = false;
         } else {
             p.print(", ");
     
         }
         p.print("");
    p.print(pkName);p.print("s");
    
      }
   p.println(",");
    p.print("");
     if (name.equals("Job") || name.equals("AdvanceReservation")) {p.println("");
    p.println("    forced, userFilter,");
    p.print("");
    }p.println("");
    p.println("   answers);");
    p.println("   }");
    p.print("");
           
   } // genDeleteByPrimaryKeyMethod
  
   public void genUpdateMethod() {
p.println("");
    p.println("   /**");
    p.print("    *  Update ");
    p.print(primaryKeys.size() == 0 ? "a" : "the");p.print(" <code>");
    p.print(name);p.println("</code> object.");
    p.println("    *");
    p.print("    *  @param  obj  the <code>");
    p.print(name);p.println("</code> object with the new values");
    p.println("    *  @throws JGDIException on any error");
    p.println("    */");
    p.print("   public void update");
    p.print(name);p.print("(");
    p.print(classname);p.println(" obj) throws JGDIException {");
    p.print("        getJGDI().update");
    p.print(name);p.println("(obj);");
    p.println("   }");
    p.println("   ");
    p.println("   /**");
    p.print("    *   Update a <code>");
    p.print(name);p.println("</code> object.");
    p.print("    *   @param obj      the <code>");
    p.print(name);p.println("</code> object with the new values");
    p.println("    *   @param answers  the <code>answer list</code> object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   public void update");
    p.print(name);p.print("WithAnswer(");
    p.print(classname);p.println(" obj, List<JGDIAnswer> answers) throws JGDIException {");
    p.print("        getJGDI().update");
    p.print(name);p.println("WithAnswer(obj, answers);");
    p.println("   }");
    p.println("   ");
    p.print("");
    
   } // end of genUpdateMethod
} // end of class JGDIJMXGenerator
  
  // ---------------------------------------------------------------------------
  // Build the JGDIJMXGenerator instances
  // ---------------------------------------------------------------------------
  java.util.List<JGDIJMXGenerator> generators = new java.util.ArrayList<JGDIJMXGenerator>();
  for (String name : cullDef.getObjectNames()) {
      com.sun.grid.cull.CullObject cullObj = cullDef.getCullObject(name);
      generators.add(new JGDIJMXGenerator(cullObj));
  } // end of for
p.println("");
    p.println("package com.sun.grid.jgdi.management.mbeans;");
    p.println("");
    p.println("");
    p.println("import com.sun.grid.jgdi.JGDIException;");
    p.println("import java.util.List;");
    p.println("import java.util.LinkedList;");
    p.println("import com.sun.grid.jgdi.JGDI;");
    p.println("import com.sun.grid.jgdi.JGDIFactory;");
    p.println("import com.sun.grid.jgdi.configuration.JGDIAnswer;");
    p.println("import com.sun.grid.jgdi.monitoring.filter.UserFilter;");
    p.println("import java.util.logging.*;");
    p.println("import com.sun.grid.jgdi.management.JGDISession;");
    p.println("");
    p.print("");
     // Import all cull object names;
   for (JGDIJMXGenerator gen : generators) {
      gen.genImport();
   }
p.println("");
    p.println("/**");
    p.println(" *   <code>JGDIJMX</code> implements a JMX service for");
    p.println(" *   the {@link com.sun.grid.jgdi.JGDI} interface.");
    p.println(" * ");
    p.println(" */");
    p.println("public class JGDIJMX extends JGDIJMXBase implements JGDIJMXMBean, JGDIJMXBaseMBean {");
    p.println("");
    p.println("   /**");
    p.println("    *   Create a new instance of <code>JGDIJMXImpl</code>.");
    p.println("    */");
    p.println("   public JGDIJMX(JGDISession owner) throws JGDIException {");
    p.println("      super(owner);");
    p.println("   }");
    p.println("   ");
    p.println("   ");
    p.print("");
    
    for (JGDIJMXGenerator gen : generators) {
       gen.genMethods();
    } // end of for
p.println("");
    p.println("}");
  } // end of print
} // end of class java_jmx_jgdi_impl_jsp
