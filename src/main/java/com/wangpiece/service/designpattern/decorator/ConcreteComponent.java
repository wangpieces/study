package com.wangpiece.service.designpattern.decorator;

/**
 * @desc
 * @author wang.xu
 * @date 2018-09-24 23:01
 */
public class ConcreteComponent implements Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null) {
            System.out.println("ConcreteComponent");
            component.operation();
        }
    }
}
