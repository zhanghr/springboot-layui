package com.haiyu.manager.pachong.vo;

import java.util.List;

import com.xuxueli.crawler.annotation.PageFieldSelect;
import com.xuxueli.crawler.annotation.PageSelect;

@PageSelect(cssQuery = "table")
public class TableVo {
	
	@PageFieldSelect(cssQuery = "th")
    private List<String> title;
	
	
	@PageFieldSelect(cssQuery = "td")
    private List<String> data;


	public List<String> getTitle() {
		return title;
	}

	public void setTitle(List<String> title) {
		this.title = title;
	}


	public List<String> getData() {
		return data;
	}


	public void setData(List<String> data) {
		this.data = data;
	}
	
	

}
