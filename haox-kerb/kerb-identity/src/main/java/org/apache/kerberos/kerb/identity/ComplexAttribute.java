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
package org.apache.kerberos.kerb.identity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplexAttribute extends Attribute {
    private List<String> values;

    public ComplexAttribute(String name) {
        super(name);
        this.values = new ArrayList<String>(1);
    }

    public List<String> getValues() {
        return Collections.unmodifiableList(values);
    }

    public void setValues(List<String> values) {
        this.values.clear();
        this.values.addAll(values);
    }
}
