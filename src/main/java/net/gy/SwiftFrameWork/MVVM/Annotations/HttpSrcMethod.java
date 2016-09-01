package net.gy.SwiftFrameWork.MVVM.Annotations;

import net.gy.SwiftFrameWork.MVVM.Entity.HttpConnectMode;
import net.gy.SwiftFrameWork.MVVM.Entity.HttpRunMode;
import net.gy.SwiftFrameWork.MVVM.Interface.IFilter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by pc on 16/8/29.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@SrcMethodBase
public @interface HttpSrcMethod {
    String url() default "";
    HttpConnectMode connMode() default HttpConnectMode.Post;
    HttpRunMode runMode() default HttpRunMode.Async;
    Class<? extends IFilter>[] filters() default IFilter.class;
    String session() default "";
}
