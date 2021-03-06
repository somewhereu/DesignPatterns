package com.zhong.iterator;

/**
 * 迭代器模式
 * 提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
 (1)迭代器角色（Iterator）:定义遍历元素所需要的方法，一般来说会有这么三个方法：取得下一个元素的方法next()，判断是否遍历结束的方法hasNext()），移出当前对象的方法remove(),
 (2)具体迭代器角色（Concrete Iterator）：实现迭代器接口中定义的方法，完成集合的迭代。
 (3)容器角色(Aggregate):  一般是一个接口，提供一个iterator()方法，例如java中的Collection接口，List接口，Set接口等
 (4)具体容器角色（ConcreteAggregate）：就是抽象容器的具体实现类，比如List接口的有序列表实现ArrayList，List接口的链表实现LinkList，Set接口的哈希列表的实现HashSet等。
 * 参考博客：https://www.cnblogs.com/ysw-go/p/5384516.html    https://qwhai.blog.csdn.net/article/details/50799562
 */
public class Test {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()){
            System.out.println(it.hasNext());
        }
    }

}
