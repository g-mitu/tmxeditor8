package net.heartsome.cat.database;

/**
 * 数据库操作中所需要的常量
 * @author terry
 * @version
 * @since JDK1.6
 */
public final class Constants {

	/**
	 * 构造函数
	 */
	private Constants() {
	}

	public static final int DB_TYPE_TM = 1;

	public static final int DB_TYPE_TB = 2;

	/** 切割字符的长度 */
	public static final int SPLIT_NUM = 4000;

	public static final String CONFIGURE = "Configure";
	
	/** 数据库配置文件路径 */
	public static final String DBCONFIG_PATH = CONFIGURE + "/" + "db_config.xml";

	/** 系统库名称 */
	public static final String HSSYSDB = "hssysdb8";

	/** 按速度优化 */
	public static final String OPTIMIZE_SPEED = "speed";

	/** TBX 文件类型 */
	public static final String TBX = "tbx";

	/** TMX 文件类型 */
	public static final String TMX = "tmx";

	
	public static final int IMPORT_MODEL_ALWAYSADD = 0;
	
	public static final int IMPORT_MODEL_OVERWRITE = 1;
	
	public static final int IMPORT_MODEL_IGNORE = 2;
	
	public static final int IMPORT_MODEL_MERGE = 3;
	
	public static final String DBTYPE_INTERNALDB = "Internal DB";
	public static final String DBTYPE_MYSQL = "MySQL 5.x";
	public static final String DBTYPE_Oracle = "Oracle";
	public static final String DBTYPE_POSTGRESQL = "PostgreSQL";
	public static final String DBTYPE_MSSQL2005 = "MsSQL2005";
	public static final String DBTYPE_SQLITE = "SQLite";
	
	// 配置文件中加了版本号，以下是用于界面上显示使用。将带有版本号的名称替换为以下内容
	public static final String DBTYPE_MYSQL_FOR_UI = "MySQL";
	public static final String DBTYPE_MSSQL2005_FOR_UI = "SQL Server";
	//
	
	/** 术语入库时 martifHeader 子节点 fileDesc 节点的文本 */
	public static final String TBX_ADD_TERM_FILEDESC = "Generated by Heartsome TBX Exporter";	
	public static final String TBX_XCS_DEFAULT = "tbxdefault.xcs";


	/** 成功标志 */
	public static final int SUCCESS = 1;	
	/** 失败标志 */
	public static final int FAILURE = -1;	

	public static final String X_FLAG = "x-flag";

	public static final String HS_FLAG = "HS-Flag";
}
