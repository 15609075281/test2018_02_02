package com.example.demo.FastJson;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2018/2/2.
 * fastJson  操作Json的序列化与反序列化的组件
 */
@Configuration
public class FastJsonConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //调用父类配置器
        super.configureMessageConverters(converters);
        //创建fastjson消息转换器
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        //创建配置类
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //修改配置返回内容过滤
        fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteMapNullValue
                , SerializerFeature.WriteNullStringAsEmpty
        );
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        //添加到视图消息转换器内
        converters.add(fastJsonHttpMessageConverter);
    }

}
