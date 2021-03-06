/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.stokito.gag.annotation.enforceable;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class NoopTest extends TestCase {

    public void testNoopMethodLevel() {
        NoopTestClass1 testClass = new NoopTestClass1();

        List<String> list = new ArrayList<String>();
        testClass.addSomethingToList(list);
        Assert.assertTrue(list.isEmpty());

        Assert.assertEquals((short) 0, testClass.returnShortOne());
        Assert.assertEquals(0, testClass.returnIntOne());
        Assert.assertEquals(0L, testClass.returnLong());
        Assert.assertEquals(0d, testClass.returnDoubleOne());
        Assert.assertEquals(0f, testClass.returnFloatOne());
        Assert.assertFalse(testClass.returnTrue());
        Assert.assertEquals((char) 0, testClass.returnCharA());
        Assert.assertNull(testClass.returnNonNullString());
        Assert.assertNull(testClass.returnNonNullArray());
    }

    public void testNoopClassLevel() {
        NoopTestClass2 testClass = new NoopTestClass2();

        List<String> list = new ArrayList<String>();
        testClass.addSomethingToList(list);
        Assert.assertTrue(list.isEmpty());

        assertEquals((short) 0, testClass.returnShortOne());
        assertEquals(0, testClass.returnIntOne());
        assertEquals(0L, testClass.returnLong());
        assertEquals(0d, testClass.returnDoubleOne());
        assertEquals(0f, testClass.returnFloatOne());
        Assert.assertFalse(testClass.returnTrue());
        assertEquals((char) 0, testClass.returnCharA());
        Assert.assertNull(testClass.returnNonNullString());
        Assert.assertNull(testClass.returnNonNullArray());
    }
}
