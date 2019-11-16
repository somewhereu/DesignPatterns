package com.zhong.template;

/**
 * 老板一天的流程（或算法）
 */
public class Boss extends Life {
    @Override
    public void work() {
        System.out.println("给员工分配工作");
    }

    @Override
    public void goToWork() {
        System.out.println("开车去");
    }

    @Override
    public void goToHome() {
        System.out.println("开车回");
    }
}
