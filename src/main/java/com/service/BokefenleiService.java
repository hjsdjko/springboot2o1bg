package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BokefenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BokefenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BokefenleiView;


/**
 * 博客分类
 *
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public interface BokefenleiService extends IService<BokefenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BokefenleiVO> selectListVO(Wrapper<BokefenleiEntity> wrapper);
   	
   	BokefenleiVO selectVO(@Param("ew") Wrapper<BokefenleiEntity> wrapper);
   	
   	List<BokefenleiView> selectListView(Wrapper<BokefenleiEntity> wrapper);
   	
   	BokefenleiView selectView(@Param("ew") Wrapper<BokefenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BokefenleiEntity> wrapper);
   	
}

