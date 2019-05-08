package org.app.common.beans.entity;

import java.io.Serializable;
import java.util.Date;

public class Version implements Serializable{
      private Integer  version_id;         // 主键  	
      private Appinfo  app_id;         		//软件信息     	
      private String  apk_name;         	//开发包名称     	
      private String  support_rom;         //硬件支持	
      private String  software_size;        //软件大小     	
      private String  download_link;        //下载地址     	
      private Appinfo  status_id;         	// 审核状态    	
      private Appinfo  sale_id;         	//app状态     	
      private String  checker;        		 //审核人     	
      private Date  create_date;         // 创建时间    	
      private Date  update_date;         //修改时间     
      
}
