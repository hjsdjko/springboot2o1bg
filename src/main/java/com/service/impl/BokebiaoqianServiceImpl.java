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


import com.dao.BokebiaoqianDao;
import com.entity.BokebiaoqianEntity;
import com.service.BokebiaoqianService;
import com.entity.vo.BokebiaoqianVO;
import com.entity.view.BokebiaoqianView;

@Service("bokebiaoqianService")
public class BokebiaoqianServiceImpl extends ServiceImpl<BokebiaoqianDao, BokebiaoqianEntity> implements BokebiaoqianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BokebiaoqianEntity> page = this.selectPage(
                new Query<BokebiaoqianEntity>(params).getPage(),
                new EntityWrapper<BokebiaoqianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BokebiaoqianEntity> wrapper) {
		  Page<BokebiaoqianView> page =new Query<BokebiaoqianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BokebiaoqianVO> selectListVO(Wrapper<BokebiaoqianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BokebiaoqianVO selectVO(Wrapper<BokebiaoqianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BokebiaoqianView> selectListView(Wrapper<BokebiaoqianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BokebiaoqianView selectView(Wrapper<BokebiaoqianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
