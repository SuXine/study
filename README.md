# 设计模式笔记以及实例
[top]

## 目录分类
### 创建型模式 
1. [工厂模式](./src/main/java/com/libra/design/patterns/factory)
    - 包含简单工厂模式 和 抽象工厂模式
2. [单例模式](./src/main/java/com/libra/design/patterns/singleton)    
3. [建造者模式](./src/main/java/com/libra/design/patterns/builder)
4. [原型模式](./src/main/java/com/libra/design/patterns/prototype)
### 结构模式
1. [适配器模式](./src/main/java/com/libra/design/patterns/adapter)
2. [装饰者模式](./src/main/java/com/libra/design/patterns/decorator)
3. [代理模式](./src/main/java/com/libra/design/patterns/proxy)
4. [桥接模式](./src/main/java/com/libra/design/patterns/bridge)
5. [组合模式](./src/main/java/com/libra/design/patterns/composite)
6. [享元模式](./src/main/java/com/libra/design/patterns/flyweight)
7. [外观模式](./src/main/java/com/libra/design/patterns/facade)
### 行为模式
1. [观察者模式](./src/main/java/com/libra/design/patterns/observer)
2. [迭代器模式](./src/main/java/com/libra/design/patterns/iterator)
3. [责任链模式](./src/main/java/com/libra/design/patterns/responsibility)
4. [命令模式](./src/main/java/com/libra/design/patterns/command)
5. [策略模式](./src/main/java/com/libra/design/patterns/strategy)
6. [模板方法模式](./src/main/java/com/libra/design/patterns/template)
7. [备忘录模式](./src/main/java/com/libra/design/patterns/memento)
8. [状态模式](./src/main/java/com/libra/design/patterns/state)
9. [访问者模式](./src/main/java/com/libra/design/patterns/visitor)
10. [中介模式](./src/main/java/com/libra/design/patterns/mediator)
11. [解释器模式-代补充](./src/main/java/com/libra/design/patterns/intepreter)
### 其他模式
1. [并发模式-代补充](./src/main/java/com/libra/design/patterns/待补充)
2. [线城市模式-代补充](./src/main/java/com/libra/design/patterns/待补充)


### 六种原则

1. 单一原则：一个类别设计太大、别太累、负责单一的职责
   - 高内聚低耦合
2. 开闭原则： 对扩展开发，对修改关闭
   - 尽量不修改原来代码的情况下进行扩展 
   - 抽象化，多态是开闭原则的关键
3. 里氏替换原则：所有使用父类的地方，必须能够透明的使用子类对象
4. 依赖倒置原则：依赖抽象
   - 不是依赖具体，面向抽象编程
5. 接口隔离原则：每个接口应该承担独立的角色，不干不该自己干的事
   - 避免子类实现不需要实现的方法
   - 需要对客户提供接口的时候，只需要暴露最小的接口
6. 迪米特法则：尽量不要和陌生人说话
   - 非陌生人：
      - 当前对象本身
      - 以参数形式传入到当前对象方法中的对象
      - 当前对象的成员对象
      - 如果当前对象的成员对象是一个集合，那么集合中的元素都是朋友
      - 当前对象所创建的对象
   - 和其他类的耦合度变低


