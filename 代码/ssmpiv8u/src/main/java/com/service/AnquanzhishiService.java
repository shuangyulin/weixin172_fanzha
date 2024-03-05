package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnquanzhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnquanzhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnquanzhishiView;


/**
 * 安全知识
 *
 * @author 
 * @email 
 * @date 2022-02-24 16:47:02
 */
public interface AnquanzhishiService extends IService<AnquanzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnquanzhishiVO> selectListVO(Wrapper<AnquanzhishiEntity> wrapper);
   	
   	AnquanzhishiVO selectVO(@Param("ew") Wrapper<AnquanzhishiEntity> wrapper);
   	
   	List<AnquanzhishiView> selectListView(Wrapper<AnquanzhishiEntity> wrapper);
   	
   	AnquanzhishiView selectView(@Param("ew") Wrapper<AnquanzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnquanzhishiEntity> wrapper);
   	

}

