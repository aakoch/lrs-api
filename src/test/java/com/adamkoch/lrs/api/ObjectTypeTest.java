package com.adamkoch.lrs.api;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <p>Created by aakoch on 2017-05-10.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public class ObjectTypeTest {

    @Test
    public void testOf_withCamelCaseType() throws Exception {
        assertEquals(ObjectType.AGENT, ObjectType.of("Agent"));
    }

    @Test
    public void testOf_withUpperCaseType() throws Exception {
        assertEquals(ObjectType.AGENT, ObjectType.of("AGENT"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOf_withInvalidName() throws Exception {
        ObjectType.of("Test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOf_withIncorrectCase() throws Exception {
        ObjectType.of("aGeNt");
    }

}