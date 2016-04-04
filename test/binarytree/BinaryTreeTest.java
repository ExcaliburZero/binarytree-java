/*
 * Copyright (c) 2016 Christopher Wells <cwellsny@nycap.rr.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package binarytree;

import junitparams.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 * The <code>BinaryTreeTest</code> classcontains tests of the BinaryTree class.
 *
 * @see binarytree.BinaryTree
 * @author Christopher Wells {@literal <cwellsny@nycap.rr.com>}
 */
@RunWith(JUnitParamsRunner.class)
public class BinaryTreeTest {

    /**
     * Tests of the constructor, getValue, and setValue methods of the
     * BinaryTree class.
     */
    @Test
    @Parameters(method = "testGetSetBranchesParameters")
    public void testGetSetBranches(Object inputObject) {
        BinaryTree binaryTree = new BinaryTree<>();

        assertEquals(null, binaryTree.getValue());

        binaryTree.setValue(inputObject);
        assertEquals(inputObject, binaryTree.getValue());
    }

    private Object[] testGetSetBranchesParameters() {
        return new Object[] {
            new Object[]{"Hello World"},
            new Object[]{null},
            new Object[]{new Object()},
            new Object[]{new Exception()},
        };
    }
}
