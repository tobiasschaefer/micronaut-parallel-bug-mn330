/*
 * Copyright 2022 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package micronaut.parallel.bug2;

import io.micronaut.context.annotation.Parallel;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Implementation is copied from https://github.com/micronaut-projects/micronaut-core/blob/3.3.x/inject-java/src/test/groovy/io/micronaut/inject/parallel/ParallelBean.java

@Singleton
@Parallel
//@Requires(property = "parallel.bean.enabled")
public class ParallelBean2 {

    private static final Logger log = LoggerFactory.getLogger(ParallelBean2.class);

    public ParallelBean2() {
        try {
            log.warn("B2 start");
            Thread.sleep(5000);
            log.warn("B2 end");
        } catch (InterruptedException e) {
            // ignore
        }
    }
}