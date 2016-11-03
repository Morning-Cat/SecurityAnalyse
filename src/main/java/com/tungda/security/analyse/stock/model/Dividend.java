package com.tungda.security.analyse.stock.model;

import java.util.Calendar;

import com.tungda.security.analyse.company.model.Company;
//公司分红
public class Dividend {
	private Company company;
	//公司分红时间
	private Calendar divi_time;
	
	//公司分红，以每股计算
	//普通股分红
	private double common_divi;
	//优先股分红
	private double preferred_divi;
	
}
