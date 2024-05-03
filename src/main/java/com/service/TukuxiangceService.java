package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TukuxiangceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TukuxiangceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TukuxiangceView;


/**
 * 图库相册
 *
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public interface TukuxiangceService extends IService<TukuxiangceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TukuxiangceVO> selectListVO(Wrapper<TukuxiangceEntity> wrapper);
   	
   	TukuxiangceVO selectVO(@Param("ew") Wrapper<TukuxiangceEntity> wrapper);
   	
   	List<TukuxiangceView> selectListView(Wrapper<TukuxiangceEntity> wrapper);
   	
   	TukuxiangceView selectView(@Param("ew") Wrapper<TukuxiangceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TukuxiangceEntity> wrapper);
   	
}

