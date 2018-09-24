package com.wangpiece.service.designpattern.decorator;

/**
 * @author wang.xu
 * @desc
 * @date 2018-09-24 23:02
 */
public class Decorator implements Component{

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null) {
            System.out.println("Decorator");
            component.operation();
        }
    }
}
