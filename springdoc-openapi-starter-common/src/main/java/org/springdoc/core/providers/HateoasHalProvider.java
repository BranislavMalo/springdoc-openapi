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

package org.springdoc.core.providers;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import org.springframework.util.ReflectionUtils;

/**
 * The type Hateoas hal provider.
 *
 * @author bnasslahsen
 */
public class HateoasHalProvider {


	/**
	 * The Hateoas properties optional.
	 */
	private final Optional<?> hateoasPropertiesOptional;

	/**
	 * Instantiates a new Hateoas hal provider.
	 *
	 * @param hateoasPropertiesOptional the hateoas properties optional
	 */
	public HateoasHalProvider(Optional<?> hateoasPropertiesOptional) {
		this.hateoasPropertiesOptional = hateoasPropertiesOptional;
	}

	private static boolean isHalEnabled(Object hateoasProperties) {
		// In spring-boot 3.5, the method name was changed from getUseHalAsDefaultJsonMediaType to isUseHalAsDefaultJsonMediaType
		List<String> possibleMethodNames = List.of("isUseHalAsDefaultJsonMediaType", "getUseHalAsDefaultJsonMediaType");

		for (String methodName : possibleMethodNames) {
			Method method = ReflectionUtils.findMethod(hateoasProperties.getClass(), methodName);
			if (method != null) {
				Object result = ReflectionUtils.invokeMethod(method, hateoasProperties);
				if (result instanceof Boolean halEnabled) {
					return halEnabled;
				}

				throw new IllegalStateException("Method " + methodName + " did not return a boolean value");
			}
		}

		throw new IllegalStateException("No suitable method found to determine if HAL is enabled");
	}


	/**
	 * Is hal enabled boolean.
	 *
	 * @return the boolean
	 */
	public boolean isHalEnabled() {
		return hateoasPropertiesOptional
				.map(HateoasHalProvider::isHalEnabled)
				.orElse(true);
	}

}
