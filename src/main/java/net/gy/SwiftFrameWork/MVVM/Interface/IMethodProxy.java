package net.gy.SwiftFrameWork.MVVM.Interface;

import java.lang.reflect.Method;

/**
 * 接口代理的接口
 * Created by pc on 16/8/29.
 */
public interface IMethodProxy {
    public void donoret(Method invoker, Object[] pars);
    public Object dohasret(Method invokerName,Object[] pars);
}
