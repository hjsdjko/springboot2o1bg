package com.entity.view;

import com.entity.BokefenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 博客分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
@TableName("bokefenlei")
public class BokefenleiView  extends BokefenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BokefenleiView(){
	}
 
 	public BokefenleiView(BokefenleiEntity bokefenleiEntity){
 	try {
			BeanUtils.copyProperties(this, bokefenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
