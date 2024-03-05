package com.entity.view;

import com.entity.AnquanzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 安全知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 16:47:02
 */
@TableName("anquanzhishi")
public class AnquanzhishiView  extends AnquanzhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AnquanzhishiView(){
	}
 
 	public AnquanzhishiView(AnquanzhishiEntity anquanzhishiEntity){
 	try {
			BeanUtils.copyProperties(this, anquanzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
