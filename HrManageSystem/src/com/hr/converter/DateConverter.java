package com.hr.converter;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * 自定义类型转换器，继承Converter<from, to>接口	：from类型 --> to类型
 * 在 springmvc.cml 定义  conversion-service="conversionService" 
 * @author admin
 *
 */
public class DateConverter implements Converter<String, Date> {

	public Date convert(String time) {
		if("".equals(time.trim())){
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println("正在作类型转换.....");
			return sdf.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
