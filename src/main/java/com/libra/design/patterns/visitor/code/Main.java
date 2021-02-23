package com.libra.design.patterns.visitor.code;

import com.libra.design.patterns.visitor.code.goods.impl.Computer;
import com.libra.design.patterns.visitor.code.goods.impl.Phone;
import com.libra.design.patterns.visitor.code.visitor.impl.Dog;
import com.libra.design.patterns.visitor.code.visitor.impl.Man;
import com.libra.design.patterns.visitor.code.visitor.impl.Woman;

/**
 * Description: 主方法
 *
 * @author sx
 * @date 2021-02-03
 */
public class Main {
    public static void main(String[] args) {
        Mall mall = new Mall();
        Computer computer = new Computer();
        Phone phone = new Phone();
        mall.addGoods(computer);
        mall.addGoods(phone);

        mall.visitor(new Man());
        mall.removeGoods(computer);
        mall.visitor(new Woman());
        mall.removeGoods(phone);
        mall.visitor(new Dog());
    }
}
