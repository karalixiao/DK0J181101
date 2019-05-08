package org.app.common.beans.entity;

import java.io.Serializable;
import java.util.Date;

public class Develoment implements Serializable{
      private  Integer dev_id;        //主键
      private  String dev_no;        //编号	
      private  String dev_name;        //姓名	
      private  String password;        //登录密码	
      private  String cellphone;        //联系电话
      private  String email;          //电子邮件
      private  String dev_info;        //开发人员简介
      private  Date create_date;        //注册时间
      private  Date update_date;        //修改时间

}
