package org.commerce;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.logging.Logger;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {

	@Bean
	@Scope("prototype")
	Logger logger(InjectionPoint injectionPoint) {

		String logName = null;
		Member member = injectionPoint.getMember();
		Field field = injectionPoint.getField();
		if (null != member) {
			logName = member.getDeclaringClass().getName();
		} else if (null != field) {
			logName = field.getDeclaringClass().getName();
		}
		return Logger.getLogger(logName);
	}

}
