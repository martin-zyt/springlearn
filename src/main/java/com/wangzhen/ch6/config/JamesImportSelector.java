package com.wangzhen.ch6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 14:25 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class JamesImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata){
        //返回全类名的bean
        //return null; 不要返回null
        // return new String[]{};
        return new String[]{"com.wangzhen.ch6.bean.Fish","com.wangzhen.ch6.bean.Tiger"};
    }
}
