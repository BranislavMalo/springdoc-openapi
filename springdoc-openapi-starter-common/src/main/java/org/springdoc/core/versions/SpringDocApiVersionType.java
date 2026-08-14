/*
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  * Copyright 2019-2026 the original author or authors.
 *  *  *  *  *  *
 *  *  *  *  *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *  *  *  * you may not use this file except in compliance with the License.
 *  *  *  *  *  * You may obtain a copy of the License at
 *  *  *  *  *  *
 *  *  *  *  *  *      https://www.apache.org/licenses/LICENSE-2.0
 *  *  *  *  *  *
 *  *  *  *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  *  *  *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *  *  *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *  *  *  * See the License for the specific language governing permissions and
 *  *  *  *  *  * limitations under the License.
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
 */
package org.springdoc.core.versions;

<<<<<<<< HEAD:springdoc-openapi-tests/springdoc-openapi-hateoas-tests/src/test/java/test/org/springdoc/api/v31/app12/SpringDocApp12Test.java
package test.org.springdoc.api.v31.app12;

import test.org.springdoc.api.v31.AbstractSpringDocTest;

import org.springframework.boot.autoconfigure.SpringBootApplication;

public class SpringDocApp12Test extends AbstractSpringDocTest {

	@SpringBootApplication
	static class SpringDocTestApp {
	}

========
/**
 * @author bnasslahsen
 */
public enum SpringDocApiVersionType {
	PATH, HEADER, QUERY_PARAM, MEDIA_TYPE
>>>>>>>> upstream/main:springdoc-openapi-starter-common/src/main/java/org/springdoc/core/versions/SpringDocApiVersionType.java
}