package com.mystery.module_support;


/**
 * 用于描述动态配置组件Application,有组件需要初始化的该接口，
 */
public interface IModuleInit {

    /**
     * 需要优先初始化的
     */
    boolean onInit(IApplication application);

    /**
     * 可以后初始化的
     */
    boolean onInitLazy(IApplication application);

}