## Design Patterns
* Singleton Pattern
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
		
* Factory Method Pattern
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