/*
 * Copyright 2022 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.kafka.schemaregistry.rules;

import java.util.Map;
import org.apache.kafka.common.Configurable;

/**
 * A rule executor.
 */
public interface RuleExecutor extends Configurable {

  default void configure(Map<String, ?> configs) {
  }

  String type();

  Object transform(RuleContext ctx, Object message) throws RuleException;
}
