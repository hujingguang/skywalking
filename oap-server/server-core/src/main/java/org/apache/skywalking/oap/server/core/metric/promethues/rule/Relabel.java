/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.core.metric.promethues.rule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Relabel {
    private List<String> service;
    private List<String> instance;
    private List<String> endpoint;

    public List<String> labelKeys() {
        List<String> result = new ArrayList<>();
        result.addAll(Optional.ofNullable(service).orElse(Collections.emptyList()));
        result.addAll(Optional.ofNullable(instance).orElse(Collections.emptyList()));
        result.addAll(Optional.ofNullable(endpoint).orElse(Collections.emptyList()));
        return result;
    }
}
