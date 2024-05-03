package com.dao;

import com.entity.DiscusstukuxiangceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstukuxiangceVO;
import com.entity.view.DiscusstukuxiangceView;


/**
 * 图库相册评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public interface DiscusstukuxiangceDao extends BaseMapper<DiscusstukuxiangceEntity> {
	
	List<DiscusstukuxiangceVO> selectListVO(@Param("ew") Wrapper<DiscusstukuxiangceEntity> wrapper);
	
	DiscusstukuxiangceVO selectVO(@Param("ew") Wrapper<DiscusstukuxiangceEntity> wrapper);
	
	List<DiscusstukuxiangceView> selectListView(@Param("ew") Wrapper<DiscusstukuxiangceEntity> wrapper);

	List<DiscusstukuxiangceView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstukuxiangceEntity> wrapper);
	
	DiscusstukuxiangceView selectView(@Param("ew") Wrapper<DiscusstukuxiangceEntity> wrapper);
	
}
