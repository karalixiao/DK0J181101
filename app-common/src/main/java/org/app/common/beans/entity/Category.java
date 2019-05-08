package org.app.common.beans.entity;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable{
      private Integer category_id;    //主键
      private String category_code;    //编号
      private String category_name;    //类别名称
      private Admin cteate_admin;    //创建人
      private Date create_date;    //创建时间	
      private Admin update_admin;    //修改人
      private Date update_date;    //修改时间

      
}
