package com.ucan.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucan.DictionaryException;
import com.ucan.dao.LtSysDictionaryMapper;
import com.ucan.model.Dictionary;
import com.ucan.model.LtSysDictionary;
import com.ucan.model.LtSysDictionaryExample;
//@Service
public class Utils extends DictUtils{
	private List<Dictionary> list;
 
	private static final Logger logger=LoggerFactory.getLogger(Utils.class);
    
    public static Map<String,List<LtSysDictionary>> dictMap = new HashMap<String,List<LtSysDictionary>>();
    
	@Autowired
    private LtSysDictionaryMapper ltSysDictionaryMapper;
 
    //@PostConstruct
    public void initCache() {
    	logger.info("Dictionary data initialization");
    	LtSysDictionaryExample example=new LtSysDictionaryExample();
    	example.createCriteria().andStatusEqualTo("0");
    	List<LtSysDictionary> list1=ltSysDictionaryMapper.selectByExample(example);
    	list=new ArrayList<Dictionary>();
    	for(LtSysDictionary l:list1){
    		Dictionary d=new Dictionary();
    		BeanUtils.copyProperties(l, d);
    		list.add(d);
    	}
    	logger.info("Dictionary data list1 size is :{}",list1.size());
    	super.setDebugFlag(true);
    	try {
			super.setDatas(list, "dictionary");
		} catch (DictionaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}  