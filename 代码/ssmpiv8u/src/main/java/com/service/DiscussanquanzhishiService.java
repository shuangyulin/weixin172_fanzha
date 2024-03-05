package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussanquanzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussanquanzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussanquanzhishiView;


/**
 * 安全知识评论表
 *
 * @author 
 * @email 
 * @date 2022-02-24 16:47:03
 */
public interface DiscussanquanzhishiService extends IService<DiscussanquanzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussanquanzhishiVO> selectListVO(Wrapper<DiscussanquanzhishiEntity> wrapper);
   	
   	DiscussanquanzhishiVO selectVO(@Param("ew") Wrapper<DiscussanquanzhishiEntity> wrapper);
   	
   	List<DiscussanquanzhishiView> selectListView(Wrapper<DiscussanquanzhishiEntity> wrapper);
   	
   	DiscussanquanzhishiView selectView(@Param("ew") Wrapper<DiscussanquanzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussanquanzhishiEntity> wrapper);
   	

}

