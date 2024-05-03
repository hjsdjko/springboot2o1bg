package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstukuxiangceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstukuxiangceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstukuxiangceView;


/**
 * 图库相册评论表
 *
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public interface DiscusstukuxiangceService extends IService<DiscusstukuxiangceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstukuxiangceVO> selectListVO(Wrapper<DiscusstukuxiangceEntity> wrapper);
   	
   	DiscusstukuxiangceVO selectVO(@Param("ew") Wrapper<DiscusstukuxiangceEntity> wrapper);
   	
   	List<DiscusstukuxiangceView> selectListView(Wrapper<DiscusstukuxiangceEntity> wrapper);
   	
   	DiscusstukuxiangceView selectView(@Param("ew") Wrapper<DiscusstukuxiangceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstukuxiangceEntity> wrapper);
   	
}

