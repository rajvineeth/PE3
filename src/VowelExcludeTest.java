//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company.Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VowelExcludeTest {
    com.company.Java.VowelExclude vowelExclude;

    public VowelExcludeTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.vowelExclude = new com.company.Java.VowelExclude();
    }

    @After
    public void tearDown() throws Exception {
        this.vowelExclude = null;
    }

    @Test
    public void eleminateVowels() {
        Assert.assertEquals("failed", new String[]{"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"}, this.vowelExclude.eleminateVowels(new String[]{"India", "United States", "Germany", "Egypt", "czechoslovakia"}));
        Assert.assertEquals("failed", new String[]{"bcd"}, this.vowelExclude.eleminateVowels(new String[]{"abcd"}));
    }

    @Test
    public void eleminateVowelsFailure() {
        Assert.assertNotNull("failed", this.vowelExclude.eleminateVowels(new String[]{"aeiou"}));
        Assert.assertEquals("failed", new String[]{""}, this.vowelExclude.eleminateVowels(new String[]{""}));
    }
}
