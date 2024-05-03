package com.dao;

import com.entity.TukuxiangceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TukuxiangceVO;
import com.entity.view.TukuxiangceView;


/**
 * 图库相册
 * 
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public interface TukuxiangceDao extends BaseMapper<TukuxiangceEntity> {
	
	List<TukuxiangceVO> selectListVO(@Param("ew") Wrapper<TukuxiangceEntity> wrapper);
	
	TukuxiangceVO selectVO(@Param("ew") Wrapper<TukuxiangceEntity> wrapper);
	
	List<TukuxiangceView> selectListView(@Param("ew") Wrapper<TukuxiangceEntity> wrapper);

	List<TukuxiangceView> selectListView(Pagination page,@Param("ew") Wrapper<TukuxiangceEntity> wrapper);
	
	TukuxiangceView selectView(@Param("ew") Wrapper<TukuxiangceEntity> wrapper);
	
}
