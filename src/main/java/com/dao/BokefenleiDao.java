package com.dao;

import com.entity.BokefenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BokefenleiVO;
import com.entity.view.BokefenleiView;


/**
 * 博客分类
 * 
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public interface BokefenleiDao extends BaseMapper<BokefenleiEntity> {
	
	List<BokefenleiVO> selectListVO(@Param("ew") Wrapper<BokefenleiEntity> wrapper);
	
	BokefenleiVO selectVO(@Param("ew") Wrapper<BokefenleiEntity> wrapper);
	
	List<BokefenleiView> selectListView(@Param("ew") Wrapper<BokefenleiEntity> wrapper);

	List<BokefenleiView> selectListView(Pagination page,@Param("ew") Wrapper<BokefenleiEntity> wrapper);
	
	BokefenleiView selectView(@Param("ew") Wrapper<BokefenleiEntity> wrapper);
	
}
