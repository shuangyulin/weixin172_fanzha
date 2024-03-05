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


import com.dao.DiscussanquanzhishiDao;
import com.entity.DiscussanquanzhishiEntity;
import com.service.DiscussanquanzhishiService;
import com.entity.vo.DiscussanquanzhishiVO;
import com.entity.view.DiscussanquanzhishiView;

@Service("discussanquanzhishiService")
public class DiscussanquanzhishiServiceImpl extends ServiceImpl<DiscussanquanzhishiDao, DiscussanquanzhishiEntity> implements DiscussanquanzhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussanquanzhishiEntity> page = this.selectPage(
                new Query<DiscussanquanzhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussanquanzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussanquanzhishiEntity> wrapper) {
		  Page<DiscussanquanzhishiView> page =new Query<DiscussanquanzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussanquanzhishiVO> selectListVO(Wrapper<DiscussanquanzhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussanquanzhishiVO selectVO(Wrapper<DiscussanquanzhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussanquanzhishiView> selectListView(Wrapper<DiscussanquanzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussanquanzhishiView selectView(Wrapper<DiscussanquanzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
