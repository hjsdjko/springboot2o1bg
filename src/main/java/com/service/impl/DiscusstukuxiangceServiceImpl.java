package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusstukuxiangceDao;
import com.entity.DiscusstukuxiangceEntity;
import com.service.DiscusstukuxiangceService;
import com.entity.vo.DiscusstukuxiangceVO;
import com.entity.view.DiscusstukuxiangceView;

@Service("discusstukuxiangceService")
public class DiscusstukuxiangceServiceImpl extends ServiceImpl<DiscusstukuxiangceDao, DiscusstukuxiangceEntity> implements DiscusstukuxiangceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstukuxiangceEntity> page = this.selectPage(
                new Query<DiscusstukuxiangceEntity>(params).getPage(),
                new EntityWrapper<DiscusstukuxiangceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstukuxiangceEntity> wrapper) {
		  Page<DiscusstukuxiangceView> page =new Query<DiscusstukuxiangceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstukuxiangceVO> selectListVO(Wrapper<DiscusstukuxiangceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstukuxiangceVO selectVO(Wrapper<DiscusstukuxiangceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstukuxiangceView> selectListView(Wrapper<DiscusstukuxiangceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstukuxiangceView selectView(Wrapper<DiscusstukuxiangceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
