package com.dao;

import com.entity.AnquanzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnquanzhishiVO;
import com.entity.view.AnquanzhishiView;


/**
 * 安全知识
 * 
 * @author 
 * @email 
 * @date 2022-02-24 16:47:02
 */
public interface AnquanzhishiDao extends BaseMapper<AnquanzhishiEntity> {
	
	List<AnquanzhishiVO> selectListVO(@Param("ew") Wrapper<AnquanzhishiEntity> wrapper);
	
	AnquanzhishiVO selectVO(@Param("ew") Wrapper<AnquanzhishiEntity> wrapper);
	
	List<AnquanzhishiView> selectListView(@Param("ew") Wrapper<AnquanzhishiEntity> wrapper);

	List<AnquanzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<AnquanzhishiEntity> wrapper);
	
	AnquanzhishiView selectView(@Param("ew") Wrapper<AnquanzhishiEntity> wrapper);
	

}
