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


import com.dao.TukuxiangceDao;
import com.entity.TukuxiangceEntity;
import com.service.TukuxiangceService;
import com.entity.vo.TukuxiangceVO;
import com.entity.view.TukuxiangceView;

@Service("tukuxiangceService")
public class TukuxiangceServiceImpl extends ServiceImpl<TukuxiangceDao, TukuxiangceEntity> implements TukuxiangceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TukuxiangceEntity> page = this.selectPage(
                new Query<TukuxiangceEntity>(params).getPage(),
                new EntityWrapper<TukuxiangceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TukuxiangceEntity> wrapper) {
		  Page<TukuxiangceView> page =new Query<TukuxiangceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TukuxiangceVO> selectListVO(Wrapper<TukuxiangceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TukuxiangceVO selectVO(Wrapper<TukuxiangceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TukuxiangceView> selectListView(Wrapper<TukuxiangceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TukuxiangceView selectView(Wrapper<TukuxiangceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
