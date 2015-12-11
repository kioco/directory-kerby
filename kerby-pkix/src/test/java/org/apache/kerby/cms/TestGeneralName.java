/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.apache.kerby.cms;

import org.apache.kerby.asn1.Asn1;
import org.apache.kerby.asn1.util.HexUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestGeneralName {
    private static final byte[] IPV4 = HexUtil.hex2bytes("87040a090800");

    @Test
    public void testIpAddress() throws IOException {
        try {
            Asn1.dump(IPV4, true);
            //GeneralName generalName = new GeneralName();
            //TO BE FIXED
            //10.9.8.0
            //generalName.decode(ipv4);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
