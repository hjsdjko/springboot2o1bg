package com.entity.model;

import com.entity.TukuxiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 图库相册
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public class TukuxiangceModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标签
	 */
	
	private String biaoqian;
		
	/**
	 * 相册封面
	 */
	
	private String xiangcefengmian;
		
	/**
	 * 相册内容
	 */
	
	private String xiangceneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
				
	
	/**
	 * 设置：标签
	 */
	 
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	
	/**
	 * 获取：标签
	 */
	public String getBiaoqian() {
		return biaoqian;
	}
				
	
	/**
	 * 设置：相册封面
	 */
	 
	public void setXiangcefengmian(String xiangcefengmian) {
		this.xiangcefengmian = xiangcefengmian;
	}
	
	/**
	 * 获取：相册封面
	 */
	public String getXiangcefengmian() {
		return xiangcefengmian;
	}
				
	
	/**
	 * 设置：相册内容
	 */
	 
	public void setXiangceneirong(String xiangceneirong) {
		this.xiangceneirong = xiangceneirong;
	}
	
	/**
	 * 获取：相册内容
	 */
	public String getXiangceneirong() {
		return xiangceneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
			
}
