package org.app.common.beans.entity;

import java.io.Serializable;
import java.util.Date;

public class Appinfo implements Serializable{
     private Integer app_id;               //主键
     private String app_name; 				//名称
     private Develoment dev_id;				//开发人
     private Category category_id;			//类别
     private String app_info;				//简介	
     private String flatform_id;			//使用平台
     private String status_id;				//审核状态
     private String sale_id;				//app状态
     private String checker;				//审核人
     private Date create_date;			//创建时间	
     private Date update_date;			//修改时间
	
	
	
}
