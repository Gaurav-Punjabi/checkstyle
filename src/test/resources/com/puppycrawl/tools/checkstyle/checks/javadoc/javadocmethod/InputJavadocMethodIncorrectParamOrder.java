package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocmethod;

/**
 * Some explanation.
 * @param <A> A type param
 * @param <B1> Another type param
 * @author Nobody
 * @version 1.0
 */
public class InputJavadocMethodIncorrectParamOrder<A,B1 extends Comparable> {
    /**
     * Some description here.
     * @param b
     * @param a
     * @param c
     */
    public void testIncorrectTypeOrder(int a, int b, int c) {}
}
