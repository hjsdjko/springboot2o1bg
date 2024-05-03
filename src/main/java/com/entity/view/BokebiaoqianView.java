package com.entity.view;

import com.entity.BokebiaoqianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 博客标签
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
@TableName("bokebiaoqian")
public class BokebiaoqianView  extends BokebiaoqianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BokebiaoqianView(){
	}
 
 	public BokebiaoqianView(BokebiaoqianEntity bokebiaoqianEntity){
 	try {
			BeanUtils.copyProperties(this, bokebiaoqianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
