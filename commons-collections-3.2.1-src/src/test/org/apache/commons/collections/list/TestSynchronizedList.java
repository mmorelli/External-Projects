/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.commons.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Extension of {@link TestList} for exercising the {@link SynchronizedList}
 * implementation.
 *
 * @since Commons Collections 3.1
 * @version $Revision: 646780 $ $Date: 2008-04-10 13:48:07 +0100 (Thu, 10 Apr 2008) $
 * 
 * @author Stephen Colebourne
 */
public class TestSynchronizedList extends AbstractTestList {
    
    public TestSynchronizedList(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestSynchronizedList.class);
    }

    public static void main(String args[]) {
        String[] testCaseName = { TestSynchronizedList.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    public Collection makeConfirmedCollection() {
        return new ArrayList();
    }

    public List makeEmptyList() {
        return SynchronizedList.decorate(new ArrayList());
    }

    public String getCompatibilityVersion() {
        return "3.1";
    }

//    public void testCreate() throws Exception {
//        resetEmpty();
//        writeExternalFormToDisk((java.io.Serializable) collection, "D:/dev/collections/data/test/SynchronizedList.emptyCollection.version3.1.obj");
//        resetFull();
//        writeExternalFormToDisk((java.io.Serializable) collection, "D:/dev/collections/data/test/SynchronizedList.fullCollection.version3.1.obj");
//    }

}
