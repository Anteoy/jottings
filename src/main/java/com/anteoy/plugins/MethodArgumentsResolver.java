package com.anteoy.plugins;

import com.anteoy.annotation.FormModel;
import org.springframework.beans.BeanUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.reflect.Field;
import java.util.Iterator;


/**
 * Created by zhoudazhuang
 * Date: 16-11-7
 * Time: 下午3:53
 * Description : 请求方法参数解析 注入RequestMappingHandlerAdapter
 */
public class MethodArgumentsResolver implements HandlerMethodArgumentResolver {

    /**
     * 判断是否支持要转换的参数类型
     * @param parameter
     * @return
     */
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(FormModel.class);
    }

    /**
     * 当支持后进行相应的转换
     * @param parameter
     * @param mavContainer
     * @param webRequest
     * @param binderFactory
     * @return
     * @throws Exception
     */
    @Override
    public Object resolveArgument(MethodParameter parameter,
                                  ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
                                  WebDataBinderFactory binderFactory) throws Exception {
        String objName = parameter.getParameterName() + ".";
        Object o = BeanUtils.instantiate(parameter.getParameterType());
        StringBuffer tmp;
        String[] val;
        Field[] frr = parameter.getParameterType().getDeclaredFields();
        for (Iterator<String> itr = webRequest.getParameterNames(); itr
                .hasNext();) {
            tmp = new StringBuffer(itr.next());
            if (tmp.indexOf(objName) < 0)continue;
            for (int i = 0; i < frr.length; i++) {
                frr[i].setAccessible(true);
                if (tmp.toString().equals(objName + frr[i].getName())) {
                    val = webRequest.getParameterValues(tmp.toString());
                    frr[i].set(o, val[0]);
                }
            }
        }
        return o;
    }
}
