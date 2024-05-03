package com.dao;

import com.entity.BokebiaoqianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BokebiaoqianVO;
import com.entity.view.BokebiaoqianView;


/**
 * 博客标签
 * 
 * @author 
 * @email 
 * @date 2020-11-09 16:15:06
 */
public interface BokebiaoqianDao extends BaseMapper<BokebiaoqianEntity> {
	
	List<BokebiaoqianVO> selectListVO(@Param("ew") Wrapper<BokebiaoqianEntity> wrapper);
	
	BokebiaoqianVO selectVO(@Param("ew") Wrapper<BokebiaoqianEntity> wrapper);
	
	List<BokebiaoqianView> selectListView(@Param("ew") Wrapper<BokebiaoqianEntity> wrapper);

	List<BokebiaoqianView> selectListView(Pagination page,@Param("ew") Wrapper<BokebiaoqianEntity> wrapper);
	
	BokebiaoqianView selectView(@Param("ew") Wrapper<BokebiaoqianEntity> wrapper);
	
}
