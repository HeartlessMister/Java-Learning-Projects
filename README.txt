The project ideas were taken from Mustafa Murat Coşkun's Udemy Java course, re-written and pushed to Github for self-educational purposes.


----------------------------------------------------------------------------------------
Projects & related topics:

Atm Machine OOP --> Intro, Constructors

Training Program --> Intro, Constructors

Beyblade Factory --> Inheritance, Polymorphism 

Memory Game --> Arrays Multidimensional Arrays

Singer List --> ArrayList, 

City Trip -->LinkedList, ListIterator

Traveller --> Interfaces

Geometric Shape Area Calculator --> Abstract class

Basic Math and Physics Problems --> Basic Math and Physics problems

Exam Winner --> Generic Class

Palindrome --> Stacks

Character Frequency In a Sentence --> Comparator Interface, Map, TreeHashMap

Ramadan Pita Bread Queue --> Queue(LinkedList)

Emergency Queue --> Priority Queue

Remote Controller --> Iterable & Iterator  interface implementation to create Iterator for a defined new class.

Mp3 Copy --> Exception handling, Input/Output Streams

Letter Grade Announcer --> Try with resources, txt file read&write 

Memory Game with Save Option --> Object Serialization

Producer and Consumer ArrayBlockingQueue--> ArrayBlockingQueue

Producer and Consumer WaitandNotify--> wait(), notifty()

Space Game with GUI --> Swing (Has not finished yet)
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Advantages:

Java is multiplatform language. (Does not depend on platform) Since compiler and interpreter run at the same time.

.java  ---> compiler  bytecode (inside in .class ) ---> JVM (interpreter) --->  Machine Code

Referances are used. Pointers are hidden, Unlike C.

JDK --> Java Development Kit (Libraries)

JRE ---> Runtime Environment, Required to run Java. (If you install JDK, you also install JRE and JVM)
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Object Oriented Programming:

Methodoverloading: Two or more methods may have the same name if they differ in parameters.

Constructor: Special method to initialize objects, constructor is called when object is created.

Copy Constructor:  Copy constructor is used to initialize the members of a newly created object by copying the members of an already existing object.

Inheritance: Acquires the properties from one class to other classes.

Override:  A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided 
by one of its super-classes. 

Encapsulation: Encapsulation is a concept of uses in object programming by hiding the methods of any object from other objects and 
limiting the implementations.

Polymorphism: Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance

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
Iterators

Iterators are used to move in data structures just like navigate through directories in Linux. It can be useful especially while using LinkedLists. 
ListIterator only can be used when List interface is implemented. However, Iterators can be used if one implements Set, Queue or List interface.
Iterator's don't have previous method, while listiterator has.

Note: In ListIterators if you use next() and previous() methods consecutively, you create a situation where you change the location of the reference
and you won't move in the list when the second command called. (For solution, examine city trip project.)
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
Queue Interface 

LinkedList & Priority Queue implements Queue Interface. 
One can use LinkedList as queue by using Queue reference while creating LinkedList. 
Queues work with first in first out principle  memory--> poll() method can be read.

PriorityQueue

Priority is alphabetical order for Strings and for integers from least to greatest. However, if you want to print with using for 
each loop, does not come in the expected order. By implementing Comparable Interface and overriding compareTo() methods, class 
queue priortiy can be adjusted.

https://www.geeksforgeeks.org/priority-queue-class-in-java/

ArrayBlocking Queue 

ArrayBlockingQueue class is a bounded blocking queue backed by an array. By bounded, it means that the size of the Queue is fixed. 
Once created, the capacity cannot be changed. Attempts to put an element into a full queue will result in the operation blocking.
BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

https://www.geeksforgeeks.org/arrayblockingqueue-class-in-java/#:~:text=ArrayBlockingQueue%20class%20is%20a%20bounded,result%20in%20the%20operation%20blocking.

Deque 

A double ended queue. Here you can add and remove elements to and from both ends of the queue.
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

Design Patterns --> https://www.tutorialspoint.com/design_pattern/index.htm 

Monads --> https://stackoverflow.com/questions/13454347/monads-with-java-8
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Exception & Exception Handling

Exceptions --> Event that disrupts the normal flow of the program's instructions.(runtime of the program)
Exception Handling -->  A mechanism to handle runtime errors 

General Reasons --> Input/Output errors, Database connection errors, aritmetical errors(ex: Using for each loop in a list to adding element to that list.)

Checked Exception:  Something that has gone wrong in your code and is potentially recoverable I/O Exceptions, SQL Exceptions
UnChecked Exception: The one which occurs at the time of execution. These are also called as Runtime Exceptions. ArithmeticException, NullPointerException
Error: Irreversible mistakes

Throw --> The throw keyword is used to create a custom exception/error. (Throwable Interface) 
Throws -->  Indicates what exception type may be thrown by a method.

You should either identfy the checked exception by adding throws to the method or you handle it by try and catch method. 

Exception Propagation --> The methods that call each other are checked until the exception is caught. Stacks are used at this stage.
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Java I/O

Stream --> Java'da verilerin input/output yoluyla verilerin byte(by using ones and zeros) olarak aktığı yapılardır.
System.out --> Standard Output Stream
System.err --> Standard Error Stream
System.in --> Standard Input Stream

FileOutputStream
OutputS tream --> Writing applications to a file, a socket, a connected device as a stream of data (with 1 and 0)
Output Stream --> Uses a subclass that derives from the OutputStream abstract class
Output Stream --> write(), flush(), close()
FilneInputStream
InputStream -->Applications to read data , data as a stream from a file, from a socket or a connected device (with 1 and 0s)
InputStream --> read(), avaliable(), close()
InputStream -->  Uses a subclass that derives from the InputStrean abstract class

if you don't want to delete the file while writing to the file use true. Ex --> new  OutputStream("not.txt", true) 


FileWriter --> It is used if the file has a txt extension. performance is bad. goes to harddisk/ssd for each character
FileReader --> It is used if the file has a txt extension. performance is bad. goes to harddisk/ssd for each character
Try with resource = Automatically closes the file when the job is done, so we don't have to use finally to close files. (Clean code)

try(Scanner scanner = new Scanner(new FileReader("goal.txt")); 
FileWriter writer = new FileWriter("goal.txt")){

BufferedWriter -->  Good in performance in big projects (Instead going to disk for everycharacter, it creates a list for a chunk of character until \n)
BufferedReader --> Good in performance in big projects (Instead going to disk for everycharacter, it creates a list for a chunk of character until \n)
try(FileWriter writer = new BufferedReader(new FileWriter("goal.txt"))
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Serialization

Java makes it possible to convert the objects of classes that implement the serialization class into a bit array and save the directory to this array.
The process we do to read these objects from the file is called deserialization.

Advantages:
It can be used to save the instant states of the object thanks to serilization (ex: Save game)
If we want to provide data flow on 2 different platforms with objects, serialization can be used.
If an object takes too long to create, after creating the object, instead of re-creating everytime, created object can be serilizated and it can be used 
by creating it again from the file.

Example object creating -->
try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("example.bin"))){ out.writeObject(exampleObject)}
try(ObjectInputStream out = new ObjectInputStream(new FileInputStream("example.bin"))){ExampleObject exampleobject = (ExampleObject) in.readObject()}

private static final long serialVersionUID = 0001; (this is a version control system, in order to track serialized objects version and not cause confusion)

Instead of objects, array of objects (both ArrayList and normal array [] is acceptable) can also be serializable & deserializable in the exact same way.


Transient --> Transient keyword is used if you don't want to serialize an objets feature. (For preventing big files) A fixed value will automatically assign.
One does not need to use transient keyword with static since static variables/methods are not object dependent, they won't serialize anyway.
----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
MultiThreading & Concurrency (Simultaneity)

Process --> A process is the instance of a computer program that is being executed by one or many threads.

Every process creates their own memory space (heap).  

Each thread also has a stack, used for storing runtime data. In one prcess, if there are multiple threads, they cannot reach each others threads but they can
reach common memory space of the process. 

MultiTasking -->Running many applications at the same time
MultiThreading -->Creating multiple subunits(thread) in a process and doing multiple calculations at the same time



Different ways of creating threads:

1- Extending Thread Class

public class ExampleThread extends Thread{

	@Override
	public void run(){
	System.out.println("This is where the thread runs")}

public class Main {
	public static void main(String[] args) {
	ExampleThread thread1 = new ExampleThread();

	thread1.start();

2- Implementining Runnable Interface 

public class ExampleThread implements Runnable{

	@Override
	public void run(){
	System.out.println("This is where the thread runs")}

public class Main {
	public static void main(String[] args) {
	Thread thread1 = new Thread(ExampleThread());

	thread1.start();


3- Anonymous Inner Class

public class Main {

	Thread thread1 = new Thread(new Runnable()){
	@Override
	public void run(){
	System.out.println("This is where the thread runs"});

	thread1.start();

4- Alternative 

public class Main {

	new Thread(new Runnable()){
	@Override
	public void run(){
	System.out.println("This is where the thread runs")}.start()


Synchorization Problem -->  Multiple threads try to access the shared resources at a time to produce inconsistent results.

join() --> The join() method of thread class waits for a thread to die
	
Synchronized --> If you use this keyword while creating method, the created method will create one lock in the same class.
This lock prevents other threads reaching the same method or other scynhronized methods before current thread done with the method.

Example synchronized method --> public synchronized void exampleMethod(){}

***Important --> If you use more than one synchronized method in a class, it still creates only one lock. Thus, threads waits each 
other while working and this slows the program down significantly. 

***Important --> If you use common resource as a lock (for example: this), use of that resource waits until thread/threads using that lock ends.

In order to solve this, we can create our own locks, from any class.

Example Lock Creation:

private Object lock1 = new Object();
private Object lock2 = new Object();

public void exampleMethod(){

synchroinzed(lock1){
System.out.println("Inside of the lock1")
}

public void exampleMethod(){

synchroinzed(lock2){
System.out.println("Inside of the lock2")
}


Thread Pools and & ExecutorService:

Instead of using start and join methods to arrange the order of our threads, we can use thread pools& executer service.


public class ExampleThread implements Runnable{
	public void int value;	
	@Override
	public void run(){
	System.out.println("This is where the thread runs")}
	public ExampleThread(int value){
	this.value = value}	

public class Main {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(int nThreads);

		for (int i=1; i <= 5; i++){
		executor.submit(new ExampleThread(i));
		

		executor.shutdown();
		executor.awaitTerminaton(1, TimeUnit.DAYS);



Wait & Notify methods -- >wait() causes current thread to wait until another thread invokes the notify() method or the notifyAll() 
method for this object //lock should be the same. 

Not: After notifying the waiting thread, notifying thread must end (pass the lock) so that other thread continue working.



ReentrantLock& Condition Class, await()& signal() Methods:


public class ExampleReentrantLock{
	private Lock lock = new ReentrantLock();

	private Condition condition = lock newCondition(); //we create condition to create
	// await() and signal() methods. It is the same as just like wait() and notify

	public void thread1function(){

	try{
		lock.lock();

	System.out.println("Thread 1 is working")
	System.out.println("This is the same logic as sync")}
		condition.await();
	
	finally{  //this is for safe code, if any interruption occurs.
		lock.unlock();} 
	

	public void thread2function(){

	try{
		Thread.sleep(1000);
		lock.lock();
	
	System.out.println("This is the same logic as sync")}
	
	finally{  //this is for safe code, if any interruption occurs.	
		lock.unlock();} 
	
	Scanner scanner = new Scanner(System.in);

	lock.lock();
	System.out.println("Thread 2 is working")
	System.out.println("Press a button to continue")
	scanner.nextLine();
	System.out.println("Thread 1 is awaken, Thread 2 is leaving...")
	condition.signal();

public class Main {
	public static void main(String[] args) {
	ExampleReentrantLock re = new ExampleReentrantLock();
	Thread thread1 = new Thread(new Runnable(){
	@Override
	public void run(){
		re.thread1function });
                              
	
	Thread thread2 = new Thread(new Runnable(){
	@Override
	public void run(){
		re.thread2function});
	
	thread1.start();
	thread2.start();

	try {
		thread1.join();
		thread2.join();
	}catch(
		){}
	
	re.threadOver();
	

DeadLock & How to prevent it

Deadlock in Java is a condition where two or more threads are blocked forever, waiting for each other. This usually happens when multiple
threads need the same locks but obtain them in different orders. Multithreaded Programming in Java suffers from the deadlock situation 
because of the synchronized keyword.


for example, if you confuse the locks order while using ReentrantLock, deadlock may occur.
To solve this, we can write a method, by using lock.tryLock()

Semaphore

Controls access to a shared resource through a counter.
If you want to do the same methods with multiple threads,

private Semaphore sem = new Semaphore(3);

public void threadFunction(ind id){
	sem.acquire();
	//3 threads can run here
	sem.release(); //increases counter 1

//Sephamore is similar to executor service where you adjust number of services.

Callable & Future Interfaces 

The Callable object returns a Future object which provides methods to monitor the progress of a task being executed by a thread. 
The future object can be used to check the status of a Callable and then retrieve the result from the Callable once the thread is done.
//Callable, instead of Runnable's void run method, callable can return values. 

Future<Integer> future = executor.submit(new Callable<Integer>(){
	@Override
	public Integer call() throws Exception{
	System.out.println("Thread is working...");
	return 25; }} 

	future.get(); --> // Waits until task finishes and give the data. Future.get() retruns the return value.( 25in the example.)
	
			

**special usage --> Future<?> future = executor.submit(new Callable<Integer>(){
	
If ? is used, Callable<CLASS_NAME> //any class name can be used. 

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

Swing --> GUI widget for java -->  https://www.javatpoint.com/java-swing
Spring Framework --> Open-source application framework that provides infrastructure support for developing Java applications
https://spring.io/guides

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
DataBases:

Relational Databases --> (tables) Mysql, Sqlite
Document Based Databases --> (json) MangoDb, Azure Document Db

Java Database Connectivity (JDBC) is an application programming interface (API) for the programming language Java, which defines 
how a client may access a database. JDBC support MySql, SqlServer, PostreSql

XAMPP

String url = "jdbc:mysql://" + host + ":" + port + "/" + databaseName;
getConnetction(id, password, url)
Insert into-->

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------
Helpful Links:

Java Collection Framework: https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Java.util.Collection_hierarchy.svg/1200px-Java.util.Collection_hierarchy.svg.png
Time Complexity of Java Collections: https://www.baeldung.com/java-collections-complexity#:~:text=Usually%2C%20when%20we%20talk%20about,theory%20and%20practical%20Java%20examples.
Acess Levels of modifiers(public-protected-default-private): https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
ArrayList methods --> https://www.programiz.com/java-programming/library/arraylist
LinkedList methods --> https://www.javatpoint.com/java-linkedlist
HasMap methods --> https://www.javatpoint.com/java-hashmap
Vector methods --> https://www.geeksforgeeks.org/java-util-vector-class-java/
Stack methods --> https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
Queue methods --> https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
Exception hierarchy --> https://www.benchresources.net/wp-content/uploads/2017/02/exception-hierarchy-in-java.png
Input/Output hierarchy --> https://www.roseindia.net/java/example/java/io/bytestreams.shtml
Java Swing tutorial --> https://www.javatpoint.com/java-swing
Java Spring tutorial --> https://spring.io/guides/

