public class java_qconf_cmd_jsp implements com.sun.grid.cull.template.Template {
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
    p.println(" *  Generated from java_jmx_jgdi.jsp");
    p.println(" *  !!! DO NOT EDIT THIS FILE !!!");
    p.println(" */");
    p.println(" ");
    p.println("");
    p.print("");
    
    /*
    * Helper class to initialize option Map.
    */
   class MapInit {
      java.util.Map<String, String> nameToOpt = new java.util.HashMap<String, String>();

      //TODO LP: Is already defined in OptionAnnotation, however annotation not seen in this context
      static final int MAX_ARG_VALUE = Integer.MAX_VALUE / 8;
      
      public MapInit() {
         nameToOpt.put("Calendar","cal");
         nameToOpt.put("Checkpoint","ckpt");
         nameToOpt.put("Configuration","conf");
         nameToOpt.put("ClusterQueue","q");
         //nameToOpt.put("ExecHost","e");
         nameToOpt.put("Hostgroup","hgrp");
         nameToOpt.put("ParallelEnvironment","p");
         nameToOpt.put("Project","prj");
         //nameToOpt.put("ResourceQuotaSet","rqs");
         nameToOpt.put("User","user");
      }
      
      java.util.Map<String, String> getMap() {
         return nameToOpt;
      }
      
      public void genDefaultMethodsForType(String type) {
         if (!nameToOpt.containsKey(type)) {
            throw new IllegalStateException("<QConfCommand> failed: Unknown option type "+type);
         }
         String opt = (String) nameToOpt.get(type);
         genAddMethod(type, "-a"+opt, 0, 1);
         genAddFromFileMethod(type, "-A"+opt, 1, 0);
         genModifyMethod(type, "-m"+opt, 1, 0);
         genModifyFromFileMethod(type, "-M"+opt, 1, 0);
         genShowMethod(type, "-s"+opt, 1, MAX_ARG_VALUE);
         genShowListMethod(type, "-s"+opt+"l", 0, 0);
         genDeleteMethod(type, "-d"+opt, 1, MAX_ARG_VALUE);
      }
      
      void genAddMethod(String objectType, String optionString, int mandatory, int optional) {  
      p.println("");
    p.println("   /**");
    p.print("    *   Implements qconf ");
    p.print(optionString);p.println(" option");
    p.println("    *   @param  oi <b>OptionInfo</b> option enviroment object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   @OptionAnnotation(value = \"");
    p.print(optionString);p.print("\", min = ");
    p.print(mandatory);p.print(", extra = ");
    p.print(optional);p.println(")");
    p.print("   public void add");
    p.print(objectType);p.println("(final OptionInfo oi) throws JGDIException {");
    p.println("      oi.optionDone();");
    p.println("      String arg = oi.getFirstArg();");
    p.println("      List<JGDIAnswer> answer = new LinkedList<JGDIAnswer>();");
    p.println("      // create an object with defaults set");
    p.print("      ");
    p.print(objectType);p.print(" obj = new ");
    p.print(objectType);p.println("Impl(true);");
    p.println("      if (arg != null) {");
    p.println("         obj.setName(arg);");
    p.println("      }");
    p.println("      String userTypedText = runEditor(GEObjectEditor.getConfigurablePropertiesAsText(obj));");
    p.println("");
    p.println("      if (userTypedText != null) {");
    p.println("         GEObjectEditor.updateObjectWithText(jgdi, obj, userTypedText);");
    p.print("         jgdi.add");
    p.print(objectType);p.println("WithAnswer(obj, answer);");
    p.println("         printAnswers(answer);");
    p.println("      }");
    p.println("   }   ");
    p.print("   ");
    
       } //end genAddMethod
       
       void genAddFromFileMethod(String objectType, String optionString, int mandatory, int optional) {
       p.println("");
    p.println("   /**");
    p.print("    *   Implements qconf ");
    p.print(optionString);p.println(" option");
    p.println("    *   @param  oi <b>OptionInfo</b> option enviroment object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   @OptionAnnotation(value = \"");
    p.print(optionString);p.print("\", min = ");
    p.print(mandatory);p.print(", extra = ");
    p.print(optional);p.println(")");
    p.print("   public void addFromFile");
    p.print(objectType);p.println("(final OptionInfo oi) throws JGDIException {");
    p.println("      //Just look at the filename");
    p.println("      final String fileName = oi.getArgs().get(0);");
    p.println("      oi.optionDone();");
    p.println("      List<JGDIAnswer> answer = new LinkedList<JGDIAnswer>();");
    p.print("      ");
    p.print(objectType);p.print(" obj = new ");
    p.print(objectType);p.println("Impl(true);");
    p.println("      String inputText = readFile(oi);");
    p.print("      ");
    if (objectType.equals("Configuration")) {p.println("");
    p.println("      final String keyAttrValue = new File(fileName).getName();");
    p.print("      ");
    } else {p.println("");
    p.print("      final String keyAttrValue = getKeyAttributeValueFromString(err, \"");
    p.print(objectType);p.println("\", fileName, inputText);");
    p.print("      ");
     } p.println("");
    p.println("      if (keyAttrValue == null) {");
    p.println("         return;");
    p.println("      }");
    p.println("      obj.setName(keyAttrValue);");
    p.println("      GEObjectEditor.updateObjectWithText(jgdi, obj, inputText);");
    p.print("      jgdi.add");
    p.print(objectType);p.println("WithAnswer(obj, answer);");
    p.println("      printAnswers(answer);");
    p.println("   }  ");
    p.print("   ");
    
       } //end genAddFromFileMethod  
       
       void genModifyMethod(String objectType, String optionString, int mandatory, int optional) {
       p.println("");
    p.println("   /**");
    p.print("    *   Implements qconf ");
    p.print(optionString);p.println(" option");
    p.println("    *   @param  oi <b>OptionInfo</b> option enviroment object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   @OptionAnnotation(value = \"");
    p.print(optionString);p.print("\", min = ");
    p.print(mandatory);p.print(", extra = ");
    p.print(optional);p.println(")");
    p.print("   public void modify");
    p.print(objectType);p.println("(final OptionInfo oi) throws JGDIException {");
    p.println("      final String arg = oi.getFirstArg();");
    p.println("      List<JGDIAnswer> answer = new LinkedList<JGDIAnswer>();");
    p.print("      ");
     if ( mandatory == 0 && optional == 0 ) { p.println("");
    p.print("      ");
    p.print(objectType);p.print(" obj = jgdi.get");
    p.print(objectType);p.println("WithAnswer(answer);");
    p.print("      ");
     } else { p.println("");
    p.print("      ");
    p.print(objectType);p.print(" obj = jgdi.get");
    p.print(objectType);p.println("WithAnswer(arg, answer);");
    p.print("      ");
     }p.println("");
    p.println("      if (obj != null) {");
    p.println("         //clear the answers from the get request");
    p.println("         answer.clear();");
    p.println("         String userTypedText = runEditor(GEObjectEditor.getConfigurablePropertiesAsText(obj));");
    p.println("         if (userTypedText != null) {");
    p.println("            GEObjectEditor.updateObjectWithText(jgdi, obj, userTypedText);");
    p.print("            jgdi.update");
    p.print(objectType);p.println("WithAnswer(obj, answer);");
    p.println("         }");
    p.println("         printAnswers(answer);");
    p.println("      } else {");
    p.println("         err.println(getErrorMessage(\"InvalidObjectArgument\", oi.getOd().getOption(), arg));");
    p.println("         setExitCode(getCustomExitCode(\"InvalidObjectArgument\", oi.getOd().getOption()));");
    p.println("      }");
    p.println("      oi.optionDone();");
    p.println("   }  ");
    p.print("   ");
    
       } //end genModifyMethod  
       
       void genModifyFromFileMethod(String objectType, String optionString, int mandatory, int optional) {
       p.println("");
    p.println("   /**");
    p.print("    *   Implements qconf ");
    p.print(optionString);p.println(" option");
    p.println("    *   @param  oi <b>OptionInfo</b> option enviroment object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   @OptionAnnotation(value = \"");
    p.print(optionString);p.print("\", min = ");
    p.print(mandatory);p.print(", extra = ");
    p.print(optional);p.println(")");
    p.print("   public void modifyFromFile");
    p.print(objectType);p.println("(final OptionInfo oi) throws JGDIException {");
    p.println("      //Just look at the filename");
    p.println("      final String fileName = oi.getArgs().get(0);");
    p.println("      oi.optionDone();");
    p.println("      List<JGDIAnswer> answer = new LinkedList<JGDIAnswer>();");
    p.println("      String inputText = readFile(oi);");
    p.print("      ");
    p.print(objectType);p.println(" obj;");
    p.print("      ");
    if (objectType.equals("SchedConf")) {p.println("");
    p.println("      obj = jgdi.getSchedConfWithAnswer(answer);");
    p.print("      ");
    } else {p.println("");
    p.print("      final String keyAttrValue = getKeyAttributeValueFromString(err, \"");
    p.print(objectType);p.println("\", fileName, inputText);");
    p.println("      if (keyAttrValue == null) {");
    p.println("         return;");
    p.println("      }");
    p.print("      obj = jgdi.get");
    p.print(objectType);p.println("WithAnswer(keyAttrValue, answer);");
    p.print("      ");
    } p.println("");
    p.println("      printAnswers(answer);");
    p.println("      answer.clear();");
    p.println("      if (obj != null) {");
    p.println("          GEObjectEditor.updateObjectWithText(jgdi, obj, inputText);");
    p.print("          jgdi.update");
    p.print(objectType);p.println("WithAnswer(obj, answer);");
    p.println("          printAnswers(answer);");
    p.println("      } else {");
    p.println("          //TODO LP: Check this is ever displayed");
    p.print("          ");
    if (objectType.equals("SchedConf")) {p.println("");
    p.println("          err.println(getErrorMessage(\"InvalidObjectArgument\", oi.getOd().getOption()));");
    p.print("          ");
    } else {p.println("");
    p.println("          err.println(getErrorMessage(\"InvalidObjectArgument\", oi.getOd().getOption(), keyAttrValue));");
    p.print("          ");
    } p.println("");
    p.println("          setExitCode(getCustomExitCode(\"InvalidObjectArgument\", oi.getOd().getOption()));");
    p.println("      }");
    p.println("   }  ");
    p.print("   ");
    
       } //end genModifyFromFileMethod  
       
       void genShowMethod(String objectType, String optionString, int mandatory, int optional) {
       p.println("");
    p.println("   /**");
    p.print("    *   Implements qconf ");
    p.print(optionString);p.println(" option");
    p.println("    *   @param  oi <b>OptionInfo</b> option enviroment object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   @OptionAnnotation(value = \"");
    p.print(optionString);p.print("\", min = ");
    p.print(mandatory);p.print(", extra = ");
    p.print(optional);p.println(")");
    p.print("   public void show");
    p.print(objectType);p.println("(final OptionInfo oi) throws JGDIException {");
    p.println("      final String arg = oi.getFirstArg();");
    p.println("      List<JGDIAnswer> answer = new LinkedList<JGDIAnswer>();");
    p.print("      ");
     if ( mandatory == 0 && optional == 0 ) { p.println("");
    p.print("      ");
    p.print(objectType);p.print(" obj = jgdi.get");
    p.print(objectType);p.println("WithAnswer(answer);");
    p.print("      ");
     } else { p.println("");
    p.print("      ");
    p.print(objectType);p.print(" obj = jgdi.get");
    p.print(objectType);p.println("WithAnswer(arg, answer);");
    p.print("      ");
     }p.println("");
    p.println("      printAnswers(answer);");
    p.println("      //Display error message in no such object exists");
    p.println("      if (obj == null) {");
    p.println("          err.println(getErrorMessage(\"InvalidObjectArgument\", oi.getOd().getOption(), arg));");
    p.println("          setExitCode(getCustomExitCode(\"InvalidObjectArgument\", oi.getOd().getOption()));");
    p.println("          return;");
    p.println("      }");
    p.println("      //Show the object");
    p.println("      String text = GEObjectEditor.getAllPropertiesAsText(obj);");
    p.println("      out.print(text);");
    p.println("   } ");
    p.print("   ");
    
       } //end genShowMethod  
       
       void genShowListMethod(String objectType, String optionString, int mandatory, int optional) {
       p.println("");
    p.println("   /**");
    p.print("    *   Implements qconf ");
    p.print(optionString);p.println(" option");
    p.println("    *   @param  oi <b>OptionInfo</b> option enviroment object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   @OptionAnnotation(value = \"");
    p.print(optionString);p.print("\", min = ");
    p.print(mandatory);p.print(", extra = ");
    p.print(optional);p.println(")");
    p.print("   public void showList");
    p.print(objectType);p.println("(final OptionInfo oi) throws JGDIException {");
    p.println("      List<JGDIAnswer> answer = new LinkedList<JGDIAnswer>();");
    p.print("      List< ");
    p.print(objectType);p.print(" > list = (List< ");
    p.print(objectType);p.print(" >)jgdi.get");
    p.print(objectType);p.println("ListWithAnswer(answer);");
    p.println("      printAnswers(answer);");
    p.println("      List<String> values = new LinkedList<String>();");
    p.print("      for (");
    p.print(objectType);p.println(" obj : list) {");
    p.println("         values.add(obj.getName());");
    p.println("      }");
    p.print("      ");
     if (objectType.equals("Configuration") || objectType.equals("UserSet")) { p.println("");
    p.println("      values.remove(\"global\");");
    p.print("      ");
    } else if (objectType.equals("ExecHost")) { p.println("");
    p.println("      values.remove(\"global\");");
    p.println("      values.remove(\"template\");");
    p.print("      ");
     } p.println("");
    p.println("      //Show correct error message if list is empty");
    p.println("      if (values.size() == 0) {");
    p.println("          err.println(getErrorMessage(\"NoObjectFound\", oi.getOd().getOption()));");
    p.println("          setExitCode(getCustomExitCode(\"NoObjectFound\", oi.getOd().getOption()));");
    p.println("          return;");
    p.println("      }");
    p.println("      //Otherwise print sorted list");
    p.println("      Collections.sort(values);");
    p.println("      for (String val : values) {");
    p.println("        out.println(val);");
    p.println("      }");
    p.println("      oi.optionDone();");
    p.println("   }   ");
    p.print("   ");
    
       } //end genShowListMethod
       
       void genDeleteMethod(String objectType, String optionString, int mandatory, int optional) {
       p.println("");
    p.println("   /**");
    p.print("    *   Implements qconf ");
    p.print(optionString);p.println(" option");
    p.println("    *   @param  oi <b>OptionInfo</b> option enviroment object");
    p.println("    *   @throws JGDIException on any error on the GDI layer");
    p.println("    */");
    p.print("   @OptionAnnotation(value = \"");
    p.print(optionString);p.print("\", min = ");
    p.print(mandatory);p.print(", extra = ");
    p.print(optional);p.println(")");
    p.print("   public void delete");
    p.print(objectType);p.println("(final OptionInfo oi) throws JGDIException {");
    p.println("      List<JGDIAnswer> answers = new LinkedList<JGDIAnswer>();");
    p.println("      int size = oi.getArgs().size();");
    p.println("      final String[] vals = oi.getArgs().toArray(new String[size]);");
    p.println("      oi.optionDone();");
    p.print("      jgdi.delete");
    p.print(objectType);p.println("sWithAnswer(vals, answers);");
    p.println("      printAnswers(answers);");
    p.println("   }");
    p.print("   ");
    
       } //end genDeleteMethod  
       
  } //end Class MapInit
  
  
  // ---------------------------------------------------------------------------
  // Build Generator instances
  // ---------------------------------------------------------------------------
  MapInit init = new MapInit();
p.println("");
    p.println("package com.sun.grid.jgdi.util.shell;");
    p.println("");
    p.println("import com.sun.grid.jgdi.JGDI;");
    p.println("import com.sun.grid.jgdi.JGDIException;");
    p.println("import com.sun.grid.jgdi.configuration.*;");
    p.println("import com.sun.grid.jgdi.util.shell.AnnotatedCommand;");
    p.println("import com.sun.grid.jgdi.util.shell.editor.EditorUtil;");
    p.println("import com.sun.grid.jgdi.util.shell.editor.GEObjectEditor;");
    p.println("import com.sun.grid.jgdi.util.shell.editor.TextEditor;");
    p.println("import java.io.File;");
    p.println("import java.io.FileReader;");
    p.println("import java.io.FileWriter;");
    p.println("import java.io.IOException;");
    p.println("import java.io.LineNumberReader;");
    p.println("import java.io.PrintWriter;");
    p.println("import java.io.StringReader;");
    p.println("import java.util.LinkedList;");
    p.println("import java.util.Collections;");
    p.println("import java.util.List;");
    p.println("");
    p.println("/**");
    p.println(" * Generated abstract class for handling generic JGDI objects.");
    p.println(" * Implements generic qconf command options.");
    p.println(" * NOTE: QConfCommand should extend this class.");
    p.println(" * @see com.sun.grid.jgdi.util.shell.QConfCommand");
    p.println(" */");
    p.println("public abstract class QConfCommandGenerated extends AnnotatedCommand {");
    p.println("");
    p.println("   ");
    p.print("");
     for (String objType : init.getMap().keySet()) {
     init.genDefaultMethodsForType(objType);
  }
  //ExecHost
  init.genAddFromFileMethod("ExecHost", "-Ae", 1, 0);
  init.genModifyMethod("ExecHost", "-me", 1, 0);
  init.genModifyFromFileMethod("ExecHost", "-Me", 1, 0);
  init.genShowMethod("ExecHost", "-se", 1, init.MAX_ARG_VALUE);
  init.genShowListMethod("ExecHost", "-sel", 0, 0);
  init.genDeleteMethod("ExecHost", "-de", 1, init.MAX_ARG_VALUE);
  //SchedConf
  init.genModifyMethod("SchedConf","-msconf", 0, 0);
  init.genModifyFromFileMethod("SchedConf", "-Msconf", 1, 0);
  init.genShowMethod("SchedConf", "-ssconf",0, 0);
  //UserSet
  init.genAddFromFileMethod("UserSet","-Au", 1, 0);
  init.genModifyMethod("UserSet", "-mu", 1, 0);
  init.genModifyFromFileMethod("UserSet","-Mu",  1, 0);
  init.genShowMethod("UserSet", "-su", 1, init.MAX_ARG_VALUE);
  init.genShowListMethod("UserSet", "-sul", 0, 0);
  //Operator
  init.genShowListMethod("Operator", "-so", 0, 0);
  //Manager
  init.genShowListMethod("Manager", "-sm", 0, 0);
  //SubmitHost
  init.genShowListMethod("SubmitHost", "-ss", 0, 0);
  //AdminHost
  init.genShowListMethod("AdminHost", "-sh", 0, 0);
  //ResourceQuotaSet
  init.genAddMethod("ResourceQuotaSet", "-arqs", 0, init.MAX_ARG_VALUE);
  init.genAddFromFileMethod("ResourceQuotaSet", "-Arqs", 1, 0);
  init.genModifyFromFileMethod("ResourceQuotaSet", "-Mrqs", 1, 0);
  init.genShowListMethod("ResourceQuotaSet", "-srqsl", 0, 0);
  init.genDeleteMethod("ResourceQuotaSet", "-drqs", 1, init.MAX_ARG_VALUE);
p.println("");
    p.print("  ");

    // BEGIN /net/pinot/disk1/playpen/dev/OpenGridScheduler/GE2011.11p1/source/libs/jgdi/templates/java_qconf_cmd.static --------------------------
    p.print("");
    
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
p.println("");
    p.println("   String getKeyAttributeValueFromString(final PrintWriter err, final String type, final String fileName, final String inputText) {");
    p.println("      String keyAttrValue = null;");
    p.println("      //Get the key attribute value from the file");
    p.println("      String keyAttr = EditorUtil.unifyAttrWithClientNames(type, \"name\");");
    p.println("      StringReader sr = new StringReader(inputText);");
    p.println("      LineNumberReader lnr = new LineNumberReader(sr);");
    p.println("      String keyAttrLine = null;");
    p.println("      try {");
    p.println("         while (lnr.ready()) {");
    p.println("            keyAttrLine = lnr.readLine().trim();");
    p.println("            if (keyAttrLine.startsWith(keyAttr)) {");
    p.println("               keyAttrValue = keyAttrLine.substring(keyAttr.length()).trim();");
    p.println("               break;");
    p.println("            }");
    p.println("         }");
    p.println("         //Exit if the key attribute is missing");
    p.println("         if (keyAttrValue == null) {");
    p.println("            err.println(\"error: required attribute \\\"\" + keyAttr + \"\\\" is missing\");");
    p.println("            err.println(type + \" file \\\"\" + fileName + \"\\\" is not correct\");");
    p.println("            err.flush();");
    p.println("            //TODO LP: Set correct exit code");
    p.println("         }");
    p.println("      } catch (IOException ex) {");
    p.println("         err.println(ex.getMessage());");
    p.println("         err.flush();");
    p.println("         setExitCode(1);");
    p.println("      }");
    p.println("      return keyAttrValue;");
    p.println("   }");
    p.println("");
    p.println("    String readFile(final OptionInfo oi) throws JGDIException {");
    p.println("        String msg = \"Error messages file not found!\";");
    p.println("        int exitCode = 0;");
    p.println("        String option = oi.getOd().getOption();");
    p.println("        if (oi.getArgs().size() == 0) {");
    p.println("            msg = getErrorMessage(\"NoArgument\", option);");
    p.println("            //err.println(msg);");
    p.println("            setExitCode(getCustomExitCode(\"NoArgument\", option));");
    p.println("            throw new JGDIException(msg, exitCode);");
    p.println("        }");
    p.println("        File f = new File(oi.getFirstArg());");
    p.println("        long fileSize = f.length();");
    p.println("        FileReader fr;");
    p.println("        StringBuilder sb = new StringBuilder();");
    p.println("        try {");
    p.println("            fr = new FileReader(f);");
    p.println("            char[] buff = new char[2048];");
    p.println("            int r;");
    p.println("            while (fr.ready()) {");
    p.println("                r = fr.read(buff);");
    p.println("                if (r > 0) {");
    p.println("                    sb.append(buff, 0, r);");
    p.println("                }");
    p.println("            }");
    p.println("        } catch (IOException ex) {");
    p.println("            msg = getErrorMessage(\"InvalidFile\", option);");
    p.println("            exitCode = getCustomExitCode(\"InvalidFile\", option);");
    p.println("            throw new JGDIException(msg, exitCode);");
    p.println("        }");
    p.println("        //Check we have whole content");
    p.println("        if (sb.length() != fileSize) {");
    p.println("            throw new JGDIException(\"Unable to read whole file content. Filesize is \" + fileSize + \" got only \" + sb.length());");
    p.println("        }");
    p.println("        return sb.toString();");
    p.println("    }");
    p.println("");
    p.println("   private String runJavaEditor(final String text) {");
    p.println("      TextEditor ted = new TextEditor(text);");
    p.println("      while (!ted.isDone()) {");
    p.println("         try {");
    p.println("            Thread.currentThread().sleep(1000);");
    p.println("         } catch (InterruptedException ex) {");
    p.println("            ex.printStackTrace();");
    p.println("         }");
    p.println("      }");
    p.println("      return ted.getText();");
    p.println("   }");
    p.println("");
    p.println("   String runEditor(final String text) {");
    p.println("      String editor;");
    p.println("      String version = System.getProperty(\"java.specification.version\");");
    p.println("      //TODO LP <1.5 doesn't list properties like EDITOR...");
    p.println("      if (Double.parseDouble(version) < 1.5) {");
    p.println("         editor = System.getProperty(\"EDITOR\");");
    p.println("      } else {");
    p.println("         editor = System.getenv(\"EDITOR\");");
    p.println("      }");
    p.println("      if (editor == null) {");
    p.println("         return runJavaEditor(text);");
    p.println("      }");
    p.println("      StringBuilder sb = new StringBuilder();");
    p.println("      try {");
    p.println("         File f = File.createTempFile(\"edit\", null, new File(\"/tmp\"));");
    p.println("         FileWriter fw = new FileWriter(f);");
    p.println("         fw.write(text);");
    p.println("         fw.flush();");
    p.println("         fw.close();");
    p.println("");
    p.println("         int exitCode = EditorUtil.sgeEdit(f);");
    p.println("         if (exitCode != 0) {");
    p.println("            return null;");
    p.println("         }");
    p.println("         char[] buff = new char[1024];");
    p.println("         FileReader fr = new FileReader(f);");
    p.println("         int readChars = 0;");
    p.println("         while (fr.ready() && readChars != -1) {");
    p.println("            readChars = fr.read(buff);");
    p.println("            if (readChars > 0) {");
    p.println("               sb.append(buff, 0, readChars);");
    p.println("            }");
    p.println("         }");
    p.println("      } catch (IOException ioe) {");
    p.println("         ioe.printStackTrace();");
    p.println("/*");
    p.println("      } catch (InterruptedException ie) {");
    p.println("         ie.printStackTrace();");
    p.println("*/");
    p.println("      }");
    p.println("      return sb.toString();");
    p.println("   }");

    // END /net/pinot/disk1/playpen/dev/OpenGridScheduler/GE2011.11p1/source/libs/jgdi/templates/java_qconf_cmd.static --------------------------
    p.println("");
    p.println("}");
    p.println("");
  } // end of print
} // end of class java_qconf_cmd_jsp