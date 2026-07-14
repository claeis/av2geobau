package org.interlis2.av2geobau.impl;

import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class DxfUtilTest {

    @Test
    public void date()
    {
        String txt=DxfUtil.toString(40,java.util.Date.from(ZonedDateTime.parse("1999-12-31T21:58:35Z[GMT]").toInstant()));
        Assert.assertEquals("2451544.41568287",txt.split("\r\n")[1].trim());
    }
}
