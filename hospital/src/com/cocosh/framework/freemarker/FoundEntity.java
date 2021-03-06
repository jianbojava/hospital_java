package com.cocosh.framework.freemarker;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建MyBatis相关文件(包含controller,Service,Mapper,Model)
 * @author Eric.lan
 *
 */
public class FoundEntity {
 	
 	public static void main(String[] args) throws Exception{

 		FreemarkerUtils.PROJECT_DIR = "E:\\mygit\\hospital_java\\hospital\\";//项目路径
 	 	FreemarkerUtils.BASE_PACKAGE = "com.cocosh";//BASE包名

 	 	FreemarkerUtils.TARGET_PACKAGE = "com.cocosh.hos";//目标包名（为model上一次）
 	 	FreemarkerUtils.MODULE= "药物调整";//日志说明（需要日志）

// 	 	FreemarkerUtils.MODULE= null;//无需日志
 	 	FreemarkerUtils.create("ItemDrug", "hos_item_drug");//PO对象名称和表名

	}
 }
 