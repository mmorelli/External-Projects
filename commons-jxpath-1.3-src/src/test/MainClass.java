public class MainClass {

	/**
	 * MM
	 */
	public static void main(String[] args) 
	{
		new org.apache.commons.jxpath.BasicNodeSetTest().run();
		new org.apache.commons.jxpath.NestedTestBean();
		new org.apache.commons.jxpath.TestBean();
		new org.apache.commons.jxpath.TestNull();
		
		new org.apache.commons.jxpath.ri.JXPathCompiledExpressionTest().run();
		new org.apache.commons.jxpath.ri.StressTest().run();
		
		new org.apache.commons.jxpath.ri.axes.RecursiveAxesTest().run();
		new org.apache.commons.jxpath.ri.axes.RecursiveBean("test");
		new org.apache.commons.jxpath.ri.axes.SimplePathInterpreterTest().run();
		new org.apache.commons.jxpath.ri.axes.TestBeanWithNode();
		
		new org.apache.commons.jxpath.ri.compiler.ContextDependencyTest().run();
		new org.apache.commons.jxpath.ri.compiler.CoreFunctionTest().run();
		new org.apache.commons.jxpath.ri.compiler.CoreOperationTest().run();
		new org.apache.commons.jxpath.ri.compiler.ExtensionFunctionTest().run();
		new org.apache.commons.jxpath.ri.compiler.TestFunctions();
		new org.apache.commons.jxpath.ri.compiler.TestFunctions2();
		new org.apache.commons.jxpath.ri.compiler.VariableFactory();
		new org.apache.commons.jxpath.ri.compiler.VariableTest().run();
		
//		new org.apache.commons.jxpath.ri.model.BeanModelTestCase().run();
		new org.apache.commons.jxpath.ri.model.EmbeddedColonMapKeysTest().run(); // thesis example
		new org.apache.commons.jxpath.ri.model.EmptyCollectionTest().run();
		new org.apache.commons.jxpath.ri.model.ExceptionPropertyTestBean();
		new org.apache.commons.jxpath.ri.model.ExternalXMLNamespaceTest().run();
		new org.apache.commons.jxpath.ri.model.MixedModelTest().run();
		new org.apache.commons.jxpath.ri.model.TestMixedModelFactory();
//		new org.apache.commons.jxpath.ri.model.XMLModelTestCase().run();
		new org.apache.commons.jxpath.ri.model.XMLPreserveSpaceTest().run();
		new org.apache.commons.jxpath.ri.model.XMLSpaceTest().run();
		
		new org.apache.commons.jxpath.ri.model.beans.BadlyImplementedFactoryTest().run();
		new org.apache.commons.jxpath.ri.model.beans.BeanModelTest().run();
		new org.apache.commons.jxpath.ri.model.beans.TestBeanFactory();
		new org.apache.commons.jxpath.ri.model.beans.TestIndexedPropertyBean();
		
		new org.apache.commons.jxpath.ri.model.container.ContainerModelTest().run();
		
		new org.apache.commons.jxpath.ri.model.dom.DOMModelTest().run();
		new org.apache.commons.jxpath.ri.model.dom.TestDOMFactory();
		
		new org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanModelTest().run();
		new org.apache.commons.jxpath.ri.model.dynabeans.TestDynaBeanFactory();
		
		new org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertiesModelTest().run();
		new org.apache.commons.jxpath.ri.model.dynamic.TestDynamicPropertyFactory();
		
		new org.apache.commons.jxpath.ri.model.jdom.JDOMModelTest().run();
		new org.apache.commons.jxpath.ri.model.jdom.TestJDOMFactory();
		
//		new org.apache.commons.jxpath.servlet.JXPathServletContextTest().run();
		
		new org.apache.commons.jxpath.util.BasicTypeConverterTest().run();
	}

}
