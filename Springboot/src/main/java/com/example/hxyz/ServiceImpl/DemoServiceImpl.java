package com.example.hxyz.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.hxyz.Service.DemoService;
import com.example.hxyz.domain.entity.FactoryUserEntity;
import com.example.hxyz.domain.entity.FactoryUserEntityExample;
import com.example.hxyz.domain.mapper.FactoryUserEntityMapper;
@Service
public class DemoServiceImpl implements DemoService{
	@Resource
	@Qualifier("factoryUserEntityMapper")
	private FactoryUserEntityMapper factoryUserEntityMapper;

	@Override
	public List<FactoryUserEntity> query() {
		FactoryUserEntityExample example=new FactoryUserEntityExample();
		FactoryUserEntityExample.Criteria criterial=example.createCriteria();
		example.setOrderByClause("f_id DESC");
		criterial.andF_idGreaterThanOrEqualTo(200);
		List<FactoryUserEntity> selectByExample = factoryUserEntityMapper.selectByExample(example);
		return selectByExample;
		
	}

}
