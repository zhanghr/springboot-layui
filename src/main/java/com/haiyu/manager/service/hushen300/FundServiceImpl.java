package com.haiyu.manager.service.hushen300;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.haiyu.manager.service.FundService;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

@Service
@ConditionalOnProperty(prefix = "global", name = "version", havingValue = "hushen300")
public class FundServiceImpl implements FundService {
	
	@Value("${url.home}")
	String url;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<String> getAllResources(){
		
		String result = restTemplate.getForObject(url, String.class);
		if(StringUtils.isNotBlank(result)) {
			result = result.substring(result.indexOf("(")+1, result.length()-1);
		}
		JSONObject jsonObject = JSONUtil.parseObj(result);
		
		return null;
	};

}
