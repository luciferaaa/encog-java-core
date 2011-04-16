/*
 * Encog(tm) Core v3.0 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2011 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.bot.dataunit;

/**
 * A data unit that holds code.
 *
 * @author jheaton
 *
 */
public class CodeDataUnit extends DataUnit {

	/**
	 * The code for this data unit.
	 */
	private String code;

	/**
	 * @return THe code for this data unit.
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * Set the code to the specified string.
	 *
	 * @param str
	 *            The new code.
	 */
	public void setCode(final String str) {
		this.code = str;

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return this.code;
	}
	
	

}