## Design Patterns
* Singleton Pattern
    - 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
      这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
    - Only one instance created
    - Guarantees control of a resource
    - Lazily loaded
    * Example:
	    - Runtime
	    - Logger
	    - Spring Beans
	    - Graphic Managers
        - No Parameter in constructor
    * Pitfalls
        - Often overused
        - Difficult to unit test
        - if not careful, not thread-safe
        - Sometimes confused for Factory
        - java.util.Calendar is NOT s Singleton, it's Prototype pattern

* Builder Pattern
    - 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
      一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
	- Handles complex constructors
	- Large number of parameters
	- Immutability 不变性
	* Example
		- StringBuilder
		- DocumentBuilder
		- Locale.Builder
	* Pitfalls
		- Immutable 一成不变的
		- Inner static class
		- Designed first
		- Complexity

* Prototype Pattern
    - 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
      这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。
	- Avoids costly creation
	- Avoids subcalssing
	- Typically doesn't use "new"
	- Often utilizes an Interface
	- Usually implemented with a Registry
	* Example:
		- java.lang.Object#clone()
	* Pitfalls	
		- Sometimes not clear when to use
		- Used with other patterns
		- Registry
		- Shallow VS Deep Copy
		
* Factory Pattern
    - 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
      在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
	- Doesn't expose instantiation(实例化) logic
	- Defer to subclasses
	- Common interface
	- Specified by arthitecture, implemented by User
	* Example
		- Calendar
		- ResourceBundle
		- NumberFormat
	* Pitfalls
		- Complexity
		- Creation in subclasses
		- Refactoring

* Abstract Factory Pattern
    - 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
      在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
	- Factory of Factories
	- Factory of related objects
	- Common Interface
	- Defer to Subclasses
	* Example
		- DocumentBuilder
	* Pitfalls
		- Complexity
		- Runtime switch
		- Pattern within a pattern
		- Problem specific
		
* Adapter Pattern
    - 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
      这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。您将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。
    - Plug adaptor
    - Convert interface into another interface
    - Translates requests
    - Client, Adapter, Adaptee
    * Example
        - Arrays -> Lists
        - Streams
    * Pitfalls
        - Not a lot!
        - Don't complicate
        - Multiple Adapters
        - Don't add functionality
        
* Bridge Pattern
    - 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
      这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。
    - Decouple(解耦) Abstraction and implementation
    - Encapsulation(封装), Composition, Inheritance
    - Changes in Abstraction won't affect client
    * Example
        - Driver
        - JDBC
    * Pitfalls
        - Increase complexity
        - Conceptually difficult to plan
        - More than just OO
        - What goes where
        
* Composite Pattern
    - 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
      这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
    - Components represent part or whole structure
    - Compose objects into tree structures
    - Individual object treated as a Composite
    - Same operations applied on individual and composites
    * Example
        - java.awt.Component
        - JSF widgets
        - RESTful service GETs
    * Pitfalls
        - Can overly simplify system
        - Difficult to restrict
        - Implementation can possibly be costly

* Decorator Pattern
    - 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
    - Also called a wrapper
    - Add behavior without affecting others
    - More than just inheritance
    - Single Responsibility Principle
    - Compose behavior dynamically
    * Example
        - java.io.InputStream
        - java.util.Collections#checkedList
        - UI components
    * Pitfalls
        - New class for every feature added
        - Multiple little objects
        - Often confused with simple inheritance

* Facade Patter
    - 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
    这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
    - Make an API easier to use
    - Reduce dependencies on outside code
    - Simplify the interface or client usage
    - Usually a refactoring pattern
    * Example
        - java.net.URL
        - javax.faces.context.FacesContext
    * Pitfalls
        - Typically used to clean up code
        - Should think about API design
        - Flat problem/structure
        - The "Singleton" of Structural Pattern
        
* Flyweight Pattern
    - 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
      享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
    - More efficient use of memory
    - Large number of similar objects
    - Immutable
    - Most of the object states can be extrinsic
    * Example
        - java.lang.String
        - java.lang.Integer#valueOf(int)
        - Boolean, Byte, Character, Short, Long
    * Pitfalls
        - Complex pattern
        - Premature optimization
        - Must understand Factory
        - Not a graphical pattern
        
* Proxy Pattern
    - 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
      在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
    - Interface by wrapping
    - Can add functionality
    - Security, Simplicity, Remote, Cost
    - Proxy called to access real object
    * Examples
        - java.lang.reflect.Proxy
        - java.rmi.*
    * Pitfalls
        - Only one proxy
        - Another Abstraction
        - Similar to other patterns
        