package etc.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LangCheckInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	LocaleResolver resolver;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		String lang =request.getParameter("lang");
		
		if(lang==null){
			lang="ko";
			
		}
		Locale locale = new Locale(lang);
		
		resolver.setLocale(request, response, locale);
		
		resolver.resolveLocale(request);
		System.out.println(lang);
				
		return true; 
	}

}
