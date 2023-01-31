# Open/Closed Principle

**Software entitites should be open for extension, but closed for modification**

In this example, any time we want to add a new style of greeting, we have to change the Greeter class to accept a new type of personality. We don't want to have to modify our existing, working code to add something new. 

How would you correct this situation?
* We need to make this class open for extensibility but closed for modification;
* OCP using abstractions - either through abstract base classes or interfaces;
* I've opted for an ABC Greeter class with extensions: Default, Casual, Formal and Intimate;
