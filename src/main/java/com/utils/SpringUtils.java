package com.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class SpringUtils implements BeanFactoryPostProcessor {

	private static ConfigurableListableBeanFactory beanFactory;//spring应用上下文环境
	
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		SpringUtils.beanFactory = beanFactory;
	}
	
	/**
	 * 获取对象
	* @Title: getBean 
	* @author:Lily_Xue
	* @Description: TODO(一个以所给名字注册的bean的实例) 
	* @param name
	* @return
	* @throws BeansException
	 */
	public static<T> T getBean(String name) throws BeansException{
		return (T) beanFactory.getBean(name);
	}
	
	/**
	 * 获取类型为requireType的对象
	* @Title: getBean 
	* @author:Lily_Xue
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param clz
	* @return
	* @throws BeansException
	 */
	public static<T> T getBean(Class<T> clz) throws BeansException{
		T result = beanFactory.getBean(clz);
		return result;
	}
	
	/**
	 * 如果BeanFactory包含一个与所给名称匹配的bean定义，则返回true
	* @Title: containsBean 
	* @author:Lily_Xue
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param name
	* @return
	 */
	public static boolean containsBean(String name){
		return beanFactory.containsBean(name);
	}

	/**
	 * 判断以给定名字注册的bean定义是一个singleton还是一个prototype,如果与给定名字相应的bean定义没有被找到，将会抛出一个异常
	* @Title: isSingleton 
	* @author:Lily_Xue
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param name
	* @return
	* @throws NoSuchBeanDefinitionException
	 */
	public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException{
		return beanFactory.isSingleton(name);
	}
	
	/**
	 * 注册对象的类型
	* @Title: getType 
	* @author:Lily_Xue
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param name
	* @return
	* @throws NoSuchBeanDefinitionException
	 */
	public static Class<?> getType(String name) throws NoSuchBeanDefinitionException{
		return beanFactory.getType(name);
	}
	
	/**
	 * 如果给定的bean名字在bean定义中有别名，则返回这些别名
	* @Title: getAliases 
	* @author:Lily_Xue
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param name
	* @return
	* @throws NoSuchBeanDefinitionException
	 */
	public static String[] getAliases(String name) throws NoSuchBeanDefinitionException{
		return beanFactory.getAliases(name);
	}
}
