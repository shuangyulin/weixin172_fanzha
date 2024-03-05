package com.dao;

import com.entity.DiscussanquanzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussanquanzhishiVO;
import com.entity.view.DiscussanquanzhishiView;


/**
 * 安全知识评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-24 16:47:03
 */
public interface DiscussanquanzhishiDao extends BaseMapper<DiscussanquanzhishiEntity> {
	
	List<DiscussanquanzhishiVO> selectListVO(@Param("ew") Wrapper<DiscussanquanzhishiEntity> wrapper);
	
	DiscussanquanzhishiVO selectVO(@Param("ew") Wrapper<DiscussanquanzhishiEntity> wrapper);
	
	List<DiscussanquanzhishiView> selectListView(@Param("ew") Wrapper<DiscussanquanzhishiEntity> wrapper);

	List<DiscussanquanzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussanquanzhishiEntity> wrapper);
	
	DiscussanquanzhishiView selectView(@Param("ew") Wrapper<DiscussanquanzhishiEntity> wrapper);
	

}
