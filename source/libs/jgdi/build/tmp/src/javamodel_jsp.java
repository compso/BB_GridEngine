public class javamodel_jsp implements com.sun.grid.cull.template.Template {
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
    p.println(" *  Generated from javamodel.jsp");
    p.println(" *  !!! DO NOT EDIT THIS FILE !!!");
    p.println(" */");
    p.print("");
    
  final com.sun.grid.cull.CullDefinition cullDef = (com.sun.grid.cull.CullDefinition)params.get("cullDef");
  final com.sun.grid.cull.JavaHelper jh = (com.sun.grid.cull.JavaHelper)params.get("javaHelper");
  final com.sun.grid.cull.CullObject cullObj = (com.sun.grid.cull.CullObject)params.get("cullObj");
  com.sun.grid.cull.CullAttr   attr = null;
  final String classname = jh.getClassName(cullObj);
p.println("");
    p.print("package ");
    p.print(jh.getPackageName());p.println(";");
    p.println("");
    p.println("import com.sun.grid.jgdi.configuration.GEObject;");
    p.println("import java.util.List;");
    p.println("import java.util.Set;");
    p.println("");
    p.println("/**");
    p.print(" *  Java representation of the cull object ");
    p.print(cullObj.getName());p.println("");
    p.print(" *  defined in ");
    p.print(jh.getSource(cullObj).getName());p.println("");
    p.println(" *");
    p.print(" *  <p><strong>Warning:</strong>  The  ");
    p.print(classname);p.println(" class will ");
    p.println(" *  not be compatible with future Sun&trade; Grid Engine releases.</p>");
    p.println(" *");
    p.println(" */");
    p.print("public interface ");
    p.print(classname);p.print(" extends ");
    

  if(cullObj.getParentObject() != null) {
p.print("  ");
    p.print(jh.getClassName(cullObj.getParentObject()));p.print(" ");
    
  } else {p.println("");
    p.print("    GEObject ");
     
    } 
p.println(" { ");
    p.print("");
    
    // Iterate over all attributes and create the corresponding member variable 
    // and getter and setter methods
    for (int i = 0; i < cullObj.getAttrCount(); i++) {
        attr = cullObj.getAttr(i);
        String attrType = jh.getFullClassName(attr.getType());
        String attrName = jh.getAttrName(attr);
        String gsname =  Character.toUpperCase(attrName.charAt(0)) + attrName.substring(1);
p.println("");
    p.print("    // Attribute ");
    p.print(attrName);p.println(" ------------------------------------------------");
    p.print("");
    
    if (attr instanceof com.sun.grid.cull.CullMapListAttr) {
    /* ------------------------------------------------------------------------
     * ---------------------- MapList Attribute -----------------------------------
     * ------------------------------------------------------------------------
     */ 
        if (attrName.endsWith("List")) {
            attrName = attrName.substring(0, attrName.length() - 4);
            gsname = Character.toUpperCase(attrName.charAt(0)) + attrName.substring(1);
        }
        com.sun.grid.cull.CullMapAttr mapAttr = (com.sun.grid.cull.CullMapAttr)attr;
        com.sun.grid.cull.CullObject subobj = cullDef.getCullObject(mapAttr.getType());
        com.sun.grid.cull.CullAttr keyAttr = mapAttr.getKeyAttr();
        com.sun.grid.cull.CullAttr valueAttr = mapAttr.getValueAttr();
        String keyClassName = jh.getClassName(keyAttr.getType());
        String valueClassName = jh.getClassName(valueAttr.getType());
        String fullValueClassName = jh.getClassName(valueAttr.getType());
        String defaultKey = mapAttr.getDefaultKey();
        if (defaultKey == null) {
            defaultKey = "default";
        }
p.println("      ");
    p.println("");
    p.println("    /**");
    p.print("     *  Get the value of <code>");
    p.print(mapAttr.getKeyName());p.println("</code> at <code>index</code>.");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print(" the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.println("     *  @param index the index");
    p.println("     */");
    p.print("    public ");
    p.print(valueClassName);p.print(" get");
    p.print(gsname);p.print("(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.println(", int index);");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Get the number of values for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print(" the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.println("     */");
    p.print("    public int get");
    p.print(gsname);p.print("Count(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.println(");");
    p.println("   ");
    p.println("    /**");
    p.print("     *   Get a unmodifiable set of stored ");
    p.print(attrName);p.println(" attribute keys.");
    p.print("     *   @return unmodifiable set of stored ");
    p.print(attrName);p.println(" attribute keys");
    p.println("     */");
    p.print("    public Set<String> get");
    p.print(gsname);p.println("Keys();");
    p.println("   ");
    p.println("    /**");
    p.print("     *  <p>Get the default value of the attribute ");
    p.print(attrName);p.println(".");
    p.print("     *  (");
    p.print(mapAttr.getDefaultKey());p.println(")</p>");
    p.print("     *  @return the default value of the attribute ");
    p.print(attrName);p.println("");
    p.println("     *  @throws  java.lang.IllegalStateException if the default value is not set");
    p.println("     */");
    p.print("    public ");
    p.print(valueClassName);p.print(" getDefault");
    p.print(gsname);p.println("(int index);");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Get the number of values for  the default <code>");
    p.print(mapAttr.getKeyName());p.println("</code>");
    p.print("     *  (");
    p.print(mapAttr.getDefaultKey());p.println(").");
    p.println("     */");
    p.print("    public int getDefault");
    p.print(gsname);p.println("Count();");
    p.println("   ");
    p.println("   ");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Get an unmodifiable list of ");
    p.print(attrName);p.println(" attributes for ");
    p.print("     *  <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print(" the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @return unmodifiable list of ");
    p.print(attrName);p.println(" attributes");
    p.println("     */");
    p.print("    public List<String> get");
    p.print(gsname);p.print("List(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.println(");");
    p.println("   ");
    p.print("");
                                                                                
    if (!attr.isReadOnly()) {
p.println("");
    p.println("    /**");
    p.print("     *  Add <code>");
    p.print(mapAttr.getValueName());p.print("</code> attribute to <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print("  the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @param ");
    p.print(mapAttr.getValueName());p.print(" the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.println("     */");
    p.print("    public void add");
    p.print(gsname);p.print("(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.print(", ");
    p.print(valueClassName);p.print(" ");
    p.print(mapAttr.getValueName());p.println(");");
    p.println("");
    p.println("    /**");
    p.print("     *  Initialize <code>");
    p.print(mapAttr.getValueName());p.print("</code> attribute for a <code>");
    p.print(mapAttr.getKeyName());p.println("</code> ");
    p.println("     *  with an empty list.");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print("  the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.println("     */");
    p.print("    public void addEmpty");
    p.print(gsname);p.print("(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.println(");");
    p.println("   ");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Set <code>");
    p.print(mapAttr.getValueName());p.print("</code> attribute for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print("  the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @param index  index of the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.print("     *  @param ");
    p.print(mapAttr.getValueName());p.print("  the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.println("     */");
    p.print("    public void set");
    p.print(gsname);p.print("(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.print(", int index, ");
    p.print(valueClassName);p.print(" ");
    p.print(mapAttr.getValueName());p.println(");");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Remove <code>");
    p.print(mapAttr.getValueName());p.print("</code> attribute for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print("  the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @param index the index of the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.print("     *  @return the remove ");
    p.print(mapAttr.getValueName());p.println(" attribute of <code>null</code>");
    p.println("     *          if the attribute has not been found");
    p.println("     */");
    p.print("    public Object remove");
    p.print(gsname);p.print("At(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.println(", int index);");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Remove <code>");
    p.print(mapAttr.getValueName());p.print("</code> attribute for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print("  the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @param ");
    p.print(mapAttr.getValueName());p.print(" the ");
    p.print(mapAttr.getValueName());p.println(") attribute");
    p.println("     *  @return <code>true</code> if the attribute has been removed");
    p.println("     */");
    p.print("    public boolean remove");
    p.print(gsname);p.print("(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.print(", ");
    p.print(valueClassName);p.print(" ");
    p.print(mapAttr.getValueName());p.println(");");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Remove all <code>");
    p.print(mapAttr.getValueName());p.print("</code> attributes for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print(" the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.println("     */   ");
    p.print("    public void removeAll");
    p.print(gsname);p.print("(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.println(");");
    p.println("   ");
    p.println("    // default methods");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Add <code>");
    p.print(mapAttr.getValueName());p.println("</code> attribute to ");
    p.print("     *  the default <code>");
    p.print(mapAttr.getKeyName());p.print("</code>  (");
    p.print(mapAttr.getDefaultKey());p.println(").");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getValueName());p.print(" the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.println("     */");
    p.print("    public void addDefault");
    p.print(gsname);p.print("(");
    p.print(valueClassName);p.print(" ");
    p.print(mapAttr.getValueName());p.println(");");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Set <code>");
    p.print(mapAttr.getValueName());p.println("</code> attribute for the default");
    p.print("     *  <code>");
    p.print(mapAttr.getKeyName());p.print("</code> (");
    p.print(mapAttr.getDefaultKey());p.println(").");
    p.println("     *");
    p.print("     *  @param index  index of the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.print("     *  @param ");
    p.print(mapAttr.getValueName());p.print("  the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.println("     */");
    p.print("    public void setDefault");
    p.print(gsname);p.print("(int index, ");
    p.print(valueClassName);p.print(" ");
    p.print(mapAttr.getValueName());p.println(");");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Remove <code>");
    p.print(mapAttr.getValueName());p.println("</code> attribute for the");
    p.print("     *  default <code>");
    p.print(mapAttr.getKeyName());p.print("</code> (");
    p.print(mapAttr.getDefaultKey());p.println(").");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print("  the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @param index the index of the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.print("     *  @return the remove ");
    p.print(mapAttr.getValueName());p.println(" attribute of <code>null</code>");
    p.println("     *          if the attribute has not been found");
    p.println("     */");
    p.print("    public Object removeDefault");
    p.print(gsname);p.print("At(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.println(", int index);");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Remove <code>");
    p.print(mapAttr.getValueName());p.println("</code> attribute from the");
    p.print("     *  default <code>");
    p.print(mapAttr.getKeyName());p.print("</code> (");
    p.print(mapAttr.getDefaultKey());p.println(").");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getValueName());p.print(" the ");
    p.print(mapAttr.getValueName());p.println(") attribute");
    p.println("     *  @return <code>true</code> if the attribute has been removed");
    p.println("     */");
    p.print("    public boolean removeDefault");
    p.print(gsname);p.print("(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.print(", ");
    p.print(valueClassName);p.print(" ");
    p.print(mapAttr.getValueName());p.println(");");
    p.println("");
    p.println("    /**");
    p.print("     *  Remove all ");
    p.print(mapAttr.getValueName());p.println(") attributes from ");
    p.print("     *  the default <code>");
    p.print(mapAttr.getKeyName());p.print("</code> (");
    p.print(mapAttr.getDefaultKey());p.println(").");
    p.println("     */");
    p.print("    public void removeAllDefault");
    p.print(gsname);p.println("();");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Remove all ");
    p.print(mapAttr.getValueName());p.println(") attributes.");
    p.println("     */");
    p.print("    public void removeAll");
    p.print(gsname);p.println("();");
    p.println("   ");
    p.println("   ");
    p.print("");
    
    }
p.println("");
    p.println("    ");
    p.print("");
    
    } else if (attr instanceof com.sun.grid.cull.CullMapAttr) {
    /* ------------------------------------------------------------------------
     * ---------------------- Map Attribute -----------------------------------
     * ------------------------------------------------------------------------
     */ 
        if (attrName.endsWith("List")) {
            attrName = attrName.substring(0, attrName.length() - 4);
            gsname = Character.toUpperCase(attrName.charAt(0)) + attrName.substring(1);
        }
        com.sun.grid.cull.CullMapAttr mapAttr = (com.sun.grid.cull.CullMapAttr)attr;
        com.sun.grid.cull.CullObject subobj = cullDef.getCullObject(mapAttr.getType());
        com.sun.grid.cull.CullAttr keyAttr = mapAttr.getKeyAttr();
        com.sun.grid.cull.CullAttr valueAttr = mapAttr.getValueAttr();
        String keyClassName = jh.getClassName(keyAttr.getType());
p.println("");
    p.print("        // keyClassName for ");
    p.print(keyAttr.getType());p.print(" = ");
    p.print(keyClassName);p.println("");
    p.print("");
    
        String valueClassName = jh.getClassName(valueAttr.getType());
        String fullValueClassName = jh.getFullClassNameOrWrapper(valueAttr.getType());
        String defaultKey = mapAttr.getDefaultKey();
        if (defaultKey == null) {
            defaultKey = "default";
        }
p.println("     ");
    p.println("   ");
    p.println("    /**");
    p.print("     *  <p>Get the default value of the attribute ");
    p.print(attrName);p.println(".</p>");
    p.print("     *  @return the default value of the attribute ");
    p.print(attrName);p.println("");
    p.println("     *  @throws  java.lang.IllegalStateException if the default value is not set");
    p.println("     */");
    p.print("    public ");
    p.print(valueClassName);p.print(" getDefault");
    p.print(gsname);p.println("();");
    p.println("");
    p.println("    /**");
    p.print("     *  <p>Get the ");
    p.print(attrName);p.print(" attribute for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.</p>");
    p.print("     *  @param   ");
    p.print(mapAttr.getKeyName());p.print("   the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @return  the ");
    p.print(attrName);p.print(" attribute for <code>");
    p.print(mapAttr.getKeyName());p.println("</code> or the");
    p.print("     *           default value of  ");
    p.print(attrName);p.println("");
    p.println("     */");
    p.print("    public ");
    p.print(valueClassName);p.print(" get");
    p.print(gsname);p.print("(String ");
    p.print(mapAttr.getKeyName());p.println(");");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Get the set of <code>");
    p.print(mapAttr.getKeyName());p.print("</code>s which have the attribute ");
    p.print(attrName);p.println(" set.");
    p.print("     *  @return set of <code>");
    p.print(mapAttr.getKeyName());p.println("</code>s");
    p.println("     */");
    p.print("    public Set<String> get");
    p.print(gsname);p.println("Keys();");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Get the number of ");
    p.print(mapAttr.getKeyName());p.print("s which have the attribute ");
    p.print(attrName);p.println(" set.");
    p.print("     *  @return the number of ");
    p.print(mapAttr.getKeyName());p.print("s which have the attribute ");
    p.print(attrName);p.println(" set.");
    p.println("     */");
    p.print("    public int get");
    p.print(gsname);p.println("Count();");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Determine if any ");
    p.print(attrName);p.print(" attribute is for <code>");
    p.print(mapAttr.getKeyName());p.println("</code> is set");
    p.print("     *  @param  ");
    p.print(mapAttr.getKeyName());p.print(" the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @return <code>true</code> if the ");
    p.print(attrName);p.println(" attribute is set");
    p.println("     */");
    p.print("    public boolean isSet");
    p.print(gsname);p.print("(String ");
    p.print(mapAttr.getKeyName());p.println(");");
    p.println("   ");
    p.println("   ");
    p.print("");
    
    if (!attr.isReadOnly()) {
p.println("          ");
    p.println("    /**");
    p.print("     *  <p>Put the attribute ");
    p.print(attrName);p.print(" for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.</p>");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print("   the ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @param ");
    p.print(mapAttr.getValueName());p.print(" the ");
    p.print(mapAttr.getValueName());p.println("");
    p.println("     */");
    p.print("    public void put");
    p.print(gsname);p.print("(");
    p.print(keyClassName);p.print(" ");
    p.print(mapAttr.getKeyName());p.print(", ");
    p.print(valueClassName);p.print(" ");
    p.print(mapAttr.getValueName());p.println(");");
    p.println("   ");
    p.print("");
       
   if (mapAttr.getDefaultKey() != null) {
p.println("   ");
    p.println("    /**");
    p.print("     *  Set <code>");
    p.print(mapAttr.getValueName());p.println("</code> attribute for the default");
    p.print("     *  <code>");
    p.print(mapAttr.getKeyName());p.print("</code> (");
    p.print(mapAttr.getDefaultKey());p.println(").");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getValueName());p.print("  the ");
    p.print(mapAttr.getValueName());p.println(" attribute");
    p.println("     */");
    p.print("    public void setDefault");
    p.print(gsname);p.print("(");
    p.print(valueClassName);p.print(" ");
    p.print(mapAttr.getValueName());p.println(");");
    p.println("");
    p.print("");
    
    }
p.println("");
    p.println("");
    p.println("    /**");
    p.print("     *  <p>remove the attribute ");
    p.print(attrName);p.print(" for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.</p>");
    p.println("     *");
    p.print("     *  @param ");
    p.print(mapAttr.getKeyName());p.print("  The ");
    p.print(mapAttr.getKeyName());p.println("");
    p.print("     *  @return the value of the attribute for <code>");
    p.print(mapAttr.getKeyName());p.println("</code> or <code>null</code>");
    p.print("     *          if the attribute was not defined for <code>");
    p.print(mapAttr.getKeyName());p.println("</code>.");
    p.println("     */");
    p.print("    public ");
    p.print(fullValueClassName);p.print(" remove");
    p.print(gsname);p.print("(String ");
    p.print(mapAttr.getKeyName());p.println(");");
    p.println("   ");
    p.println("    /**");
    p.print("     *  <p>Remove the attribute ");
    p.print(attrName);p.print(" for all ");
    p.print(mapAttr.getKeyName());p.println("s.</p>");
    p.println("     */");
    p.print("    public void removeAll");
    p.print(gsname);p.println("();");
    p.print("");
    
    }
p.println("");
    p.println("");
    p.print("");
    
    // end of Map Attribute
    } else if (attr instanceof com.sun.grid.cull.CullListAttr) {
    /* ------------------------------------------------------------------------
     * ---------------------- List Attribute ----------------------------------
     * ------------------------------------------------------------------------
     */
        if (attrName.endsWith("List")) {
            attrName  = attrName.substring(0, attrName.length() - 4);
            gsname = Character.toUpperCase(attrName.charAt(0)) + attrName.substring(1);
        }
p.println("");
    p.println("");
    p.println("    /**");
    p.print("     *   Get a unmodifiable list of all ");
    p.print(attrType);p.println(" attributes.");
    p.println("     *");
    p.print("     *   @return Unmodifiable list with all ");
    p.print(attrType);p.println(" attributes");
    p.println("     */");
    p.print("    public List< ");
    p.print(attrType);p.print(" >  get");
    p.print(gsname);p.println("List();");
    p.println("");
    p.println("    /**");
    p.print("     *  Get the number of ");
    p.print(attrType);p.println(" attributes.");
    p.println("     *");
    p.print("     *  @return The number of ");
    p.print(attrType);p.println(" attributes.");
    p.println("     */");
    p.print("    public int get");
    p.print(gsname);p.println("Count();");
    p.println(" ");
    p.println("    /**");
    p.print("     *  Get a ");
    p.print(attrType);p.println(" attribute at an index.");
    p.print("     *  @param index  the index of the ");
    p.print(attrType);p.println(" attribute which should be");
    p.println("     *                removed");
    p.print("     *  @return the ");
    p.print(attrType);p.println(" attribute");
    p.println("     */");
    p.print("    public ");
    p.print(attrType);p.print(" get");
    p.print(gsname);p.println("(int index);");
    p.println("   ");
    p.print("");
    
    if (!attr.isReadOnly()) {
p.println("");
    p.println("    /**");
    p.print("     *   Add a ");
    p.print(attrType);p.println(" attribute.");
    p.print("     *   @param a");
    p.print(attrName);p.print("  the new ");
    p.print(attrType);p.println(" attribute");
    p.println("     */");
    p.print("    public void add");
    p.print(gsname);p.print("(");
    p.print(attrType);p.print(" a");
    p.print(attrName);p.println(");");
    p.println("   ");
    p.println("    /**");
    p.print("     *   Set a ");
    p.print(attrType);p.println(" attribute.");
    p.print("     *   @param index   index of the ");
    p.print(attrType);p.println(" attribute");
    p.print("     *   @param a");
    p.print(attrName);p.print("  the new ");
    p.print(attrType);p.println(" attribute");
    p.println("     */");
    p.print("    public void set");
    p.print(gsname);p.print("(int index, ");
    p.print(attrType);p.print(" a");
    p.print(attrName);p.println(");");
    p.println("");
    p.println("    /**");
    p.print("     *  Remove all ");
    p.print(attrType);p.println(" attributes.");
    p.println("     */");
    p.print("    public void removeAll");
    p.print(gsname);p.println("();");
    p.println("   ");
    p.println("    /**");
    p.print("     *  Remote a ");
    p.print(attrType);p.println(" attribute at an index.");
    p.print("     *  @param index  the index of the ");
    p.print(attrType);p.println(" attribute which should be");
    p.println("     *                removed");
    p.print("     *  @return the removed ");
    p.print(attrType);p.println(" attribute or <code>null</code> if");
    p.println("     *          no attribute at this index is stored");
    p.println("     */");
    p.print("    public ");
    p.print(attrType);p.print(" remove");
    p.print(gsname);p.println("(int index);");
    p.println("");
    p.println("    /**");
    p.print("     *  Remote a specific ");
    p.print(attrType);p.println(" attribute.");
    p.print("     *  @param a");
    p.print(attrName);p.print("  the ");
    p.print(attrType);p.println(" attribute which should be");
    p.println("     *                         removed");
    p.print("     *  @return <code>true</code> if the ");
    p.print(attrType);p.println(" attribute has been removed");
    p.println("     */");
    p.print("    public boolean remove");
    p.print(gsname);p.print("(");
    p.print(attrType);p.print(" a");
    p.print(attrName);p.println(");");
    p.println("   ");
    p.print("");
    
    }
p.println("       ");
    p.print("");
      // end of List Attribute
    } else {
    /* ------------------------------------------------------------------------
     * ---------------------- Simple Attribute ----------------------------------
     * ------------------------------------------------------------------------
     */
p.println("");
    p.print("");
     
        if (!attr.isReadOnly()) {
p.println("       ");
    p.println("    /**");
    p.print("     *   Set the ");
    p.print(attrName);p.println(" attribute.");
    p.println("     *");
    p.print("     *   @param a");
    p.print(gsname);p.print("  the new value for the  ");
    p.print(attrName);p.println(" attribute");
    p.println("     */");
    p.print("    public void set");
    p.print(gsname);p.print("(");
    p.print(attrType);p.print(" a");
    p.print(gsname);p.println(");");
    p.print("");
    
        }
p.println("  ");
    p.println("    /**");
    p.print("     *  Get the value of the ");
    p.print(attrName);p.println(" attribute.");
    p.print("     *  @return the value of the ");
    p.print(attrName);p.println(" attribute");
    p.println("     */");
    p.print("    public ");
    p.print(attrType);p.print(" ");
    p.print(attrType.endsWith("oolean")?"is":"get");p.print("");
    p.print(gsname);p.println("();");
    p.println("   ");
    p.println("");
    p.print("");
    
    } // end of else normal attributes
   
    // Methods which are common to all attribute types
p.println(" ");
    p.println("    /**");
    p.print("     *  Determine if any ");
    p.print(attrName);p.println(" attribute is set");
    p.print("     *  @return <code>true</code> if the ");
    p.print(attrName);p.println(" attribute is set");
    p.println("     */");
    p.print("    public boolean isSet");
    p.print(gsname);p.println("();");
    p.println("");
    p.print("");
    
} // end of for of attribute
//SPECIAL CODE for COMPLEX ENTRY
    if (classname.equals("ComplexEntry")) {
p.println("");
    p.println("    public String typeToString(int type);");
    p.println("    public int typeToInt(String type);");
    p.println("    public String opToString(int op);");
    p.println("    public int opToInt(String type);");
    p.println("    public String reqToString(int op);");
    p.println("    public int reqToInt(String type);");
    p.print("");
    
    } else if (classname.equals("AdvanceReservation")) {
p.println("");
    p.println("    public String getStateAsString();");
    p.print("");
    
    }
p.println("");
    p.println("");
    p.println("    /*");
    p.println("     * Dump the object");
    p.println("     * @return <code>String</code> the dump string");
    p.println("     */");
    p.println("     public String dump();");
    p.println("     ");
    p.println("");
    p.println("}");
  } // end of print
} // end of class javamodel_jsp
