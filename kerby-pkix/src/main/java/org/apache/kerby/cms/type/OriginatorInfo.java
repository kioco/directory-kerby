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
package org.apache.kerby.cms.type;

import org.apache.kerby.asn1.Asn1FieldInfo;
import org.apache.kerby.asn1.EnumType;
import org.apache.kerby.asn1.ImplicitField;
import org.apache.kerby.asn1.type.Asn1SequenceType;

/**
 * OriginatorInfo ::= SEQUENCE {
 *   certs [0] IMPLICIT CertificateSet OPTIONAL,
 *   crls [1] IMPLICIT RevocationInfoChoices OPTIONAL
 * }
 */
public class OriginatorInfo extends Asn1SequenceType {
    protected enum OriginatorInfoField implements EnumType {
        CERTS,
        CRLS;

        @Override
        public int getValue() {
            return ordinal();
        }

        @Override
        public String getName() {
            return name();
        }
    }

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[]{
            new ImplicitField(OriginatorInfoField.CERTS, CertificateSet.class),
            new ImplicitField(OriginatorInfoField.CRLS, RevocationInfoChoices.class)
    };

    public OriginatorInfo() {
        super(fieldInfos);
    }

    public CertificateSet getCerts() {
        return getFieldAs(OriginatorInfoField.CERTS, CertificateSet.class);
    }

    public void setCerts(CertificateSet certs) {
        setFieldAs(OriginatorInfoField.CERTS, certs);
    }

    public RevocationInfoChoices getCrls() {
        return getFieldAs(OriginatorInfoField.CRLS, RevocationInfoChoices.class);
    }

    public void setCrls(RevocationInfoChoices crls) {
        setFieldAs(OriginatorInfoField.CRLS, crls);
    }
}
