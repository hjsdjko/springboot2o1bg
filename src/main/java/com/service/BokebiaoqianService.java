package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BokebiaoqianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BokebiaoqianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BokebiaoqianView;


/**
 * 博客标签
 *
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public interface BokebiaoqianService extends IService<BokebiaoqianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BokebiaoqianVO> selectListVO(Wrapper<BokebiaoqianEntity> wrapper);
   	
   	BokebiaoqianVO selectVO(@Param("ew") Wrapper<BokebiaoqianEntity> wrapper);
   	
   	List<BokebiaoqianView> selectListView(Wrapper<BokebiaoqianEntity> wrapper);
   	
   	BokebiaoqianView selectView(@Param("ew") Wrapper<BokebiaoqianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BokebiaoqianEntity> wrapper);
   	
}

