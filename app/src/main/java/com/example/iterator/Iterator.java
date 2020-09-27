package com.example.iterator;

/**
 * Iterator(迭代器)
 * 该角色责任定义按顺序逐个遍历元素的接口。
 * 程序中，由Iterator接口扮演，定义了hasNext和next两个方法。
 */
public interface Iterator {
    boolean hasNext();
    Object next();

}
/**
 * 学习设计模式的重点
 * 不管实现如何变化都可以使用Iterator
 * 为什么一定要考虑引入Iterator这种复杂的设计模式呢？
 *
 * 如果是数组，直接使用for玄幻语句进行遍历处理不就可以了吗？
 *
 * 为什么要在集合之外引入Iterator角色？
 *
 * 一个重要的理由：引入Iterator后可以将遍历与实现分离开来。
 *
 *   while (it.hasNext()) {
 *             Book book = (Book) it.next();
 *             System.out.println(book.getName());
 *         }
 * 这里使用了Iterator的hasNext方法和next方法，并没有调用BookShelf的方法。也就是说，这里的while循环并不依赖于BookShelf的实现。
 *
 * 例如在BookShelf的开发人员决定放弃用数组来管理书本，而是用Java.util.Vector取而代之，会怎么样呢。不管BookShelf如何变化，只要BookShelf的iterator方法能正确的返回Iterator的实例，即使不对上面的while循环做任何修改，代码都可以正常工作。
 *
 * 对于BookShelf的调用者来说真的太方便了。
 *
 * 设计模式的作用就是帮助我们编写可复用的类。
 *
 * 所谓可复用，就是指将类实现为组件，当一个组件发生改变时，不需要对其他组件进行修改或是只需要很小的修改即可应对。
 *
 * 这也就能理解为什么在示例程序中iterator方法返回值不是BookshelfIterator类而是Iterator类型了。这表明，程序就是要使用iterator的方法进行编程而不是BookshelfIterator的方法。
 *
 * 难以理解抽象类和接口
 * 难以理解抽象类和接口的人常常是用ConcreteAggregate角色和ConcreteIterator角色编程，而不是用Aggregate接口和Iterator接口，他们总想用具体的类解决所有的问题。
 *
 * 但是如果只使用具体的类来解决问题，很容易导致类之间的强耦合，这些类也难以作为组件被再次利用，为了弱化类之间的耦合，进而使得类更加容易作为组件被再次利用，我们需要引入抽象类和接口。
 * 这种思想要贯穿整个设计模式。
 *
 * Aggregate和Iterator的对应
 * 多个Iterator
 * 将遍历功能置于Aggregate角色之外是Iterator模式的一个特征。这个特征可以针对一个ConcreteAggregate角色编写多个ConcreteIterator角色。
 *
 * 预先介绍几种设计模式：
 *
 * Vistor模式
 * iterator模式是从集合中一个一个取出元素进行遍历，但是并没有在Iterator接口中生成并对取出的元素进行任何处理。
 *
 * Vistor模式则在遍历元素集合的过程中，对元素进行相同的处理。
 *
 * 在遍历集合的过程中对元素进行固定的处理是常有的需求。Visitor模式正是为了应对这种需求而出现的。在方文元素集合的过程中对元素进行相同的处理，这种模式就是Vistor模式。
 *
 * Composite模式
 * Composite模式是具有递归结构的模式，在其中使用Iterator模式比较困难。
 *
 * Factory Method 模式
 * 在iterator方法中生成Iterator的实力时可能会使用Factory Method模式。
 *
 * 3人点赞
 * 设计模式
 *
 *
 * 作者：嘟嘟碰碰叮叮当当
 * 链接：https://www.jianshu.com/p/3dd7b4e73561
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
