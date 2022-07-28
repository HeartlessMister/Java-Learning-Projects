The project ideas were taken from Mustafa Murat Coşkun's Udemy Java course, re-written and pushed to Github for self-educational purposes.


----------------------------------------------------------------------------------------
Projects & related topics:

Atm Machine OOP --> Intro, Constructors

Training Program --> Intro, Constructors

Beyblade Factory --> Inheritance, Polymorphism 

Memory Game --> Arrays Multidimensional Arrays

Singer List --> ArrayList, 

City Trip LinkedList -->

Traveller --> Interfaces

Geometric Shape Area Calculator --> Abstract class

Basic Math and Physics Problems --> Basic Math and Physics problems

Exam Winner --> Generic Class

Palindrome --> Stacks

Character Frequency In a Sentence --> Comparator Interface, Map, TreeHashMap

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Object Oriented Programming:

Methodoverloading:

Construction:

Inheritance:

Override:

Encapsulation: Private-protected-default-public

Polymorphism:

Static: If we use static keyword, methods will no longer belong to objects but will belong to classes.

Generic class --> public class X<E> {
}

Generic method --> public <E> E function(E x, E y){
	return x;}

Final: Final variable --> Stop value change, final method --> prevent overriding, final class --> prevent inheritance

Synchronised:

ex: public final static double PI_NUMBER = 3.1314159;

//Switch cases are faster than if else if statements if you have over 1,2 or 6+ variables.
----------------------------------------------------------------------------------------
	
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Inner Classes:

Non-static inner classes --> Mathematic.Fatorial factorial = new Mathematic().new Factorial(); 

Static inner classes --> Mathematic.Factorial factorial = new Mathematic.Factorial();

Local inner classes  --> Defining a class inside of a method, you cannot reach that class outside of that method.

Anonymous inner classes --> With using referance of an interface or abstract class and overriding required methods,
one can create an object.
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Arrays: You must pre-define the size. 


Multidimensional Arrays: You must pre-define the size. You cannot compare two dimensional array using .equals(). 

ArrayList: ArrayLists stores the elements in memory directly. If you only want to add new variable at the end,
or if you only want to store elements, or element list is very short, it is okay to use. However, if you want to 
consistently add or remove new elements in different locations, or if you want to sort elements consistently, it has 
very poor speed performance.

**Basic way of sorting an ArrayList(or List) for your own class is implementing collection framework to and overriding compare to--> 
Collection.compareTo() method. After that one can use  Collections.sort(list); but if you want to make it better, you can also implement
Comperator Interface and override compare method and return -object.compareTo(object2); (+, - for the sorting direction). video-135-136.

LinkedList: Linked Lists store elements with their references. This can increase momory allocation but
if you want to change a certain element in a list, it reduces process speed drastically. Especially if
list is long.

For both LinkedList and ArrayList, you don't need to pre-define the size. 
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Interfaces: Unlike c++, Java does not support multi inheritance. Interfaces cannot create objects (unless you use anonymous inner 
classes by overriding methods), but their methods can be used in objects if objects is implemented to that interface. 
Note: By using public keyword, variables or methos can be defined in interfaces.

//Real Life application of Interfaces: Interfaces can be references to classes but if you use interfaces as referance you cannot 
access child class methods. If you have more than one servis provides for example, if you implement them into one interface, when
one fails you don't have to change your code entirely. (Abstraction of the object)

Abstract Classes --> Abstract classes cannot create objects, abstrac classes are not final form and 
abstarct methods must be overrided in the extended class. Just like interfaces, if you use abstract classes as referance you cannot
access child class methods.

Enum --> Interfaces are used to store common behaviours,Enums cannot create objects and they used to store values, enum can implement 
interfaces.

Record -->  A restricted form of a class, contain data not meant to be altered.
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Packages: Prevents class name conflicts,

Naming convention;

Camel case rules,
for each i, j, k
methods names should contain verb,
Inerface names should explain methods involved.
Package names should start with small case, should be unique, instead of -, _ should be used and ex: whilexyz.com --> com.xyz._while
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Set(Interface) 

Operations with sets in mathematics can be done with this library.

HashSet

HashSet elemnets are queued by hashing mechanism , every element storing according to a key. HashSet, HashTable time complexity O(1)
HashSet elements are stored only once (Due to Set interface).
Hashset elements are not stored according to their adding order.

LinkedHashSet

LinkedHashSet elements are stored only once (Due to Set interface). O(1)
Hashset elements are stored according to their adding order due to reference system.

TreeSet

TreeSet Class uses widely known Tree type data structure. O(logn)
Set order is alphebatical,lements are stored only once(Due to Set interface)

HashSet, HashTable time complexity O(1)

Note: If you don't define your objects hashCode and .equals() methods, your written objects copy can exist in Set.
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Map

Map is a type of dictionary (key, value). Keys are unique.

HashMap

Hash and unlike HashSet it does not implement Set interface or implements Collection interface. 
So it is methods are a bit different, and their working principle is different. (Instead of add, put is used etc.)

Hashset elements are not stored according to their adding order. (Due to hashing mechanism)

For printing HashMap, you need to use entrySet() method in for each cycle.

HasMap --> HashMap<Integer, String> hashMap = new HashMap<Integer, String>

LinkedHashMap

Hashset elements are stored according to their adding order due to reference system.

TreeHashMap

TreeHashMap Class uses widely known Tree type data structure. 
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Vector 


Most vector methods are written with synchronised key word. 
Bad at performance but good at security when using thread applications.

Enumeration is just like list iterator in LinkedLists.
Vectors implements List Interface so it generally 


Stack --> Common data structure, (last in first out principle, memory management widely used in chips),
Stack extends Vector class 

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Helpful Links:

Time Complexity of Java Collections: https://www.baeldung.com/java-collections-complexity#:~:text=Usually%2C%20when%20we%20talk%20about,theory%20and%20practical%20Java%20examples.
Acess Levels of modifiers(public-protected-default-private): https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html

ArrayList methods --> https://www.programiz.com/java-programming/library/arraylist
LinkedList methods --> https://www.javatpoint.com/java-linkedlist
HasMap methods --> https://www.javatpoint.com/java-hashmap
Vector methods --> https://www.geeksforgeeks.org/java-util-vector-class-java/
Stack methods --> https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html




