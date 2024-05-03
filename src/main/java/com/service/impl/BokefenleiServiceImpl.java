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


import com.dao.BokefenleiDao;
import com.entity.BokefenleiEntity;
import com.service.BokefenleiService;
import com.entity.vo.BokefenleiVO;
import com.entity.view.BokefenleiView;

@Service("bokefenleiService")
public class BokefenleiServiceImpl extends ServiceImpl<BokefenleiDao, BokefenleiEntity> implements BokefenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BokefenleiEntity> page = this.selectPage(
                new Query<BokefenleiEntity>(params).getPage(),
                new EntityWrapper<BokefenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BokefenleiEntity> wrapper) {
		  Page<BokefenleiView> page =new Query<BokefenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BokefenleiVO> selectListVO(Wrapper<BokefenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BokefenleiVO selectVO(Wrapper<BokefenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BokefenleiView> selectListView(Wrapper<BokefenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BokefenleiView selectView(Wrapper<BokefenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
