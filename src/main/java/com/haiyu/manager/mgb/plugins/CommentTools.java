package com.haiyu.manager.mgb.plugins;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;

/**
 * 
 *
 * @类描述：
 *
 * @author：wb-zhr796129 
 *
 * @创建时间：2020-12-9 18:05:18
 *
 *
 */
public class CommentTools {

    /**
     * 生成通用属性注解
     *
     * @param field
     * @param introspectedTable
     */
    public static void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**"); //$NON-NLS-1$
       // field.addJavaDocLine(" * 这是Mybatis Generator拓展插件生成的属性(请勿删除)."); //$NON-NLS-1$
        sb.append(" * This field corresponds to the database table "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTable());
        field.addJavaDocLine(sb.toString());

        field.addJavaDocLine(" *");
        field.addJavaDocLine(" * "+MergeConstants.NEW_ELEMENT_TAG);
        field.addJavaDocLine(" * @author wb-zhr796129");

        field.addJavaDocLine(" */"); //$NON-NLS-1$
    }

    /**
     * 生成通用内部类注解
     *
     * @param innerClass 类
     * @param introspectedTable 表
     */
    public static void addInnerClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**"); //$NON-NLS-1$
     //   innerClass.addJavaDocLine(" * 这是Mybatis Generator拓展插件生成的类(请勿删除)."); //$NON-NLS-1$
        sb.append(" * This class corresponds to the database table "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTable());
        innerClass.addJavaDocLine(sb.toString());
        innerClass.addJavaDocLine(" *");
        innerClass.addJavaDocLine(" * "+MergeConstants.NEW_ELEMENT_TAG);
        innerClass.addJavaDocLine(" * @author wb-zhr796129");
        innerClass.addJavaDocLine(" */"); //$NON-NLS-1$
    }

    /**
     * 生成通用内部Enum注释
     *
     * @param innerEnum 类
     * @param introspectedTable 表
     */
    public static void addInnerEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
        StringBuilder sb = new StringBuilder();
        innerEnum.addJavaDocLine("/**"); //$NON-NLS-1$
     //   innerEnum.addJavaDocLine(" * 这是Mybatis Generator拓展插件生成的枚举(请勿删除)."); //$NON-NLS-1$
        sb.append(" * This class corresponds to the database table "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTable());
        innerEnum.addJavaDocLine(sb.toString());
        innerEnum.addJavaDocLine(" *");
        innerEnum.addJavaDocLine(" * "+MergeConstants.NEW_ELEMENT_TAG);
        innerEnum.addJavaDocLine(" * @author wb-zhr796129");
        innerEnum.addJavaDocLine(" */"); //$NON-NLS-1$
    }

    /**
     * 生成通用方法注解
     *
     * @param method 方法
     * @param introspectedTable 表
     */
    public static void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        StringBuilder sb = new StringBuilder();
        method.addJavaDocLine("/**"); //$NON-NLS-1$
    //    method.addJavaDocLine(" * 这是Mybatis Generator拓展插件生成的方法(请勿删除).");
        sb.append(" * This method corresponds to the database table ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" *");
        method.addJavaDocLine(" * "+MergeConstants.NEW_ELEMENT_TAG);
        method.addJavaDocLine(" * @author wb-zhr796129");
        method.addJavaDocLine(" */"); //$NON-NLS-1$
    }

    /**
     * 生成xml element 注释
     *
     * @param xmlElement the xml element
     */
    public static void addComment(XmlElement xmlElement) {

        xmlElement.addElement(new TextElement("<!--")); //$NON-NLS-1$

        StringBuilder sb = new StringBuilder();
        sb.append("  WARNING - "); //$NON-NLS-1$
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        xmlElement.addElement(new TextElement(sb.toString()));
     //   xmlElement.addElement(new TextElement("  这个节点为代码生成工具生成，请不要修改!")); //$NON-NLS-1$
        xmlElement.addElement(new TextElement("  @author wb-zhr796129"));

        xmlElement.addElement(new TextElement("-->")); //$NON-NLS-1$
    }

    /**
     * 生成通用接口注解
     *
     * @param interf 接口
     * @param introspectedTable 表
     */
    public static void addInterfaceComment(Interface interf, IntrospectedTable introspectedTable) {
        StringBuilder sb = new StringBuilder();
        interf.addJavaDocLine("/**"); //$NON-NLS-1$
    //    interf.addJavaDocLine(" * 这是Mybatis Generator拓展插件生成的接口(请勿删除)."); //$NON-NLS-1$
        sb.append(" * This class corresponds to the database table "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTable());
        interf.addJavaDocLine(sb.toString());
        interf.addJavaDocLine(" *");
        interf.addJavaDocLine(" * "+MergeConstants.NEW_ELEMENT_TAG);
        interf.addJavaDocLine(" * @author wb-zhr796129");
        interf.addJavaDocLine(" */"); //$NON-NLS-1$
    }
}
