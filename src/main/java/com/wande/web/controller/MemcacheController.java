package com.wande.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wande.web.service.MemcacheService;

@Controller
public class MemcacheController {

	@Autowired
	private MemcacheService memcacheService;
	
	@RequestMapping("/memcache")
	@ResponseBody
	public Object testMemcache(){
		memcacheService.testMemcache();
		return "success";
	}
}
