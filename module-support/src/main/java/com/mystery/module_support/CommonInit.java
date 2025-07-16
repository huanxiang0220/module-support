package com.mystery.module_support;


public class CommonInit implements IModuleInit {

    @Override
    public boolean onInit(IApplication application) {
        // 初始化日志

//        ARouter.init(application);
//        MMKV.initialize(application);
//        Logger.i("基础层初始化完毕 -- onInitAhead");

        return false;
    }

    @Override
    public boolean onInitLazy(IApplication application) {
        return false;
    }
}
