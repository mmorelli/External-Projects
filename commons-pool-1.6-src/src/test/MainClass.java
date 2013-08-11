
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		new org.apache.commons.pool.MethodCall("test");
		new org.apache.commons.pool.MethodCallPoolableObjectFactory();
		new org.apache.commons.pool.PrivateException("test");
		new org.apache.commons.pool.TestBaseKeyedObjectPool("test").run();
		new org.apache.commons.pool.TestBaseKeyedPoolableObjectFactory("test").run();
		new org.apache.commons.pool.TestBaseObjectPool("test").run();
		new org.apache.commons.pool.TestBasePoolableObjectFactory("test").run();
//		new org.apache.commons.pool.TestKeyedObjectPool("test").run();
//		new org.apache.commons.pool.TestKeyedObjectPoolFactory("test").run();
//		new org.apache.commons.pool.TestObjectPool("test").run();
//		new org.apache.commons.pool.TestObjectPoolFactory("test").run();
		new org.apache.commons.pool.TestPoolUtils().run();
		new org.apache.commons.pool.VisitTracker();
		new org.apache.commons.pool.VisitTrackerFactory();
//		new org.apache.commons.pool.Waiter();
//		new org.apache.commons.pool.WaiterFactory(1f,1f,1f,1f,1f);
		
		new org.apache.commons.pool.impl.TestGenericKeyedObjectPool("test").run();
		new org.apache.commons.pool.impl.TestGenericKeyedObjectPoolFactory("test").run();
		new org.apache.commons.pool.impl.TestGenericObjectPool("test").run();
		new org.apache.commons.pool.impl.TestGenericObjectPoolFactory("test").run();
		new org.apache.commons.pool.impl.TestSoftReferenceObjectPool("test").run();
		new org.apache.commons.pool.impl.TestSoftRefOutOfMemory("test").run();
		new org.apache.commons.pool.impl.TestStackKeyedObjectPool("test").run();
		new org.apache.commons.pool.impl.TestStackKeyedObjectPoolFactory("test").run();
		new org.apache.commons.pool.impl.TestStackObjectPool("test").run();
		new org.apache.commons.pool.impl.TestStackObjectPoolFactory("test").run();
		
		new org.apache.commons.pool.performance.PerformanceTest();
		new org.apache.commons.pool.performance.SleepingObjectFactory();
		
		

	}

}
