package com.entity.view;

import com.entity.TukuxiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图库相册
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
@TableName("tukuxiangce")
public class TukuxiangceView  extends TukuxiangceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TukuxiangceView(){
	}
 
 	public TukuxiangceView(TukuxiangceEntity tukuxiangceEntity){
 	try {
			BeanUtils.copyProperties(this, tukuxiangceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
