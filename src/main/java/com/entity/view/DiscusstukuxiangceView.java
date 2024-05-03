package com.entity.view;

import com.entity.DiscusstukuxiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图库相册评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
@TableName("discusstukuxiangce")
public class DiscusstukuxiangceView  extends DiscusstukuxiangceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstukuxiangceView(){
	}
 
 	public DiscusstukuxiangceView(DiscusstukuxiangceEntity discusstukuxiangceEntity){
 	try {
			BeanUtils.copyProperties(this, discusstukuxiangceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
