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

<<<<<<<< HEAD:springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/v31/app192/SpringDocApp192Test.java
package test.org.springdoc.api.v31.app192;
========
package test.org.springdoc.webmvc.scalar.app19;
>>>>>>>> upstream/main:springdoc-openapi-starter-webmvc-scalar/src/test/java/test/org/springdoc/webmvc/scalar/app19/HelloController.java

import test.org.springdoc.api.v31.AbstractSpringDocTest;

<<<<<<<< HEAD:springdoc-openapi-starter-webflux-api/src/test/java/test/org/springdoc/api/v31/app192/SpringDocApp192Test.java
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

public class SpringDocApp192Test extends AbstractSpringDocTest {

	@SpringBootApplication
	@ComponentScan(basePackages = { "org.springdoc", "test.org.springdoc.api.v31.app192" })
	static class SpringDocTestApp {}
========
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/persons")
	public void persons(@Valid @RequestParam @Size(min = 4, max = 6) String name) {

	}

>>>>>>>> upstream/main:springdoc-openapi-starter-webmvc-scalar/src/test/java/test/org/springdoc/webmvc/scalar/app19/HelloController.java
}
