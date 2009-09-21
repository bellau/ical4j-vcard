/**
 * Copyright (c) 2009, Ben Fortuna
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  o Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 *  o Neither the name of Ben Fortuna nor the names of any other contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.fortuna.ical4j.vcard.property;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.fortuna.ical4j.vcard.Parameter;
import net.fortuna.ical4j.vcard.Property;
import net.fortuna.ical4j.vcard.PropertyTest;
import net.fortuna.ical4j.vcard.Property.Id;

import org.junit.runners.Parameterized.Parameters;

public class EmailTest extends PropertyTest {

    public EmailTest(Property property, String expectedName, String expectedValue, Parameter[] expectedParams) {
        super(property, expectedName, expectedValue, expectedParams);
    }

    @Parameters
    public static Collection<Object[]> parameters() {
        final List<Object[]> params = new ArrayList<Object[]>();
        final String emailString = "test@example.com";
        params.add(new Object[] { new Email(emailString), Id.EMAIL.toString(), emailString,
                new Parameter[] {}, });
        // params.add(new Object[] {new Email("test@example.com", Type.HOME), Id.EMAIL.toString(), "test@example.com",
        // new Parameter[] {Type.HOME}});
        // params.add(new Object[] {new Email("test@example.com", Type.WORK), Id.EMAIL.toString(), "test@example.com",
        // new Parameter[] {Type.WORK}});
        // params.add(new Object[] {new Email("test@example.com", Type.WORK, Type.PREF), Id.EMAIL.toString(),
        // "test@example.com", new Parameter[] {Type.WORK, Type.PREF}});

        // Type type = new Type(Type.WORK, Type.PREF);
        // params.add(new Object[] {new Email("test@example.com", type), Id.EMAIL.toString(), "test@example.com", new
        // Parameter[] {type}});
        return params;
    }

}
