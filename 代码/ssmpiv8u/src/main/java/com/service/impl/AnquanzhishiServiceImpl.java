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


import com.dao.AnquanzhishiDao;
import com.entity.AnquanzhishiEntity;
import com.service.AnquanzhishiService;
import com.entity.vo.AnquanzhishiVO;
import com.entity.view.AnquanzhishiView;

@Service("anquanzhishiService")
public class AnquanzhishiServiceImpl extends ServiceImpl<AnquanzhishiDao, AnquanzhishiEntity> implements AnquanzhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnquanzhishiEntity> page = this.selectPage(
                new Query<AnquanzhishiEntity>(params).getPage(),
                new EntityWrapper<AnquanzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnquanzhishiEntity> wrapper) {
		  Page<AnquanzhishiView> page =new Query<AnquanzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AnquanzhishiVO> selectListVO(Wrapper<AnquanzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnquanzhishiVO selectVO(Wrapper<AnquanzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnquanzhishiView> selectListView(Wrapper<AnquanzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnquanzhishiView selectView(Wrapper<AnquanzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
