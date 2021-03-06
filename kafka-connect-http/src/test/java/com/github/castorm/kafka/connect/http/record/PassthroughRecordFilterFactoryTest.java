package com.github.castorm.kafka.connect.http.record;

/*-
 * #%L
 * Kafka Connect HTTP Plugin
 * %%
 * Copyright (C) 2020 CastorM
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.github.castorm.kafka.connect.http.record.PassthroughRecordFilterFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PassthroughRecordFilterFactoryTest {

    PassthroughRecordFilterFactory factory = new PassthroughRecordFilterFactory();

    @Test
    void givenFactoryWithNull_whenTestNull_thenTrue() {
        assertThat(factory.create(null).test(null)).isTrue();
    }
}
