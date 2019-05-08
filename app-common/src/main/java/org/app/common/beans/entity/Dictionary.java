package org.app.common.beans.entity;

import java.io.Serializable;
import java.util.Date;

public class Dictionary implements Serializable{
    
	private Integer dictionary_id;   //主键
	private Dictionary parent;       //上级字典	
	private String dictionary_name;	//字典名称
	private Admin create_admin;     //创建人
	private Date create_date;       //创建时间
	private Admin update_admin;   //修改人
	private Date update_date;       //修改时间
	
}