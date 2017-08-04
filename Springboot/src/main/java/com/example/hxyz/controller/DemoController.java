package com.example.hxyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Utiles.ResponseVo;
import com.example.hxyz.Service.DemoService;
import com.example.hxyz.domain.entity.FactoryUserEntity;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("/sub")
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(method = RequestMethod.GET, value = "query")
	//@JsonView(Result.AllView.class)
	@ResponseBody
	public ResponseVo findList(){
		ResponseVo responseVo=new ResponseVo();
		List<FactoryUserEntity> query = null;
		try {
			 query = demoService.query();
			responseVo.setData(query.get(0));
			responseVo.setInfo("查找成功");
			responseVo.setStatus("1");
		} catch (Exception e) {
			e.printStackTrace();
			responseVo.setInfo("查找失败");
			responseVo.setStatus("0");
		}
		return responseVo;
		
		
	}

}
