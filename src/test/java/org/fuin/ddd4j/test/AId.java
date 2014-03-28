/**
 * Copyright (C) 2013 Future Invent Informationsmanagement GmbH. All rights
 * reserved. <http://www.fuin.org/>
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library. If not, see <http://www.gnu.org/licenses/>.
 */
package org.fuin.ddd4j.test;

import org.fuin.ddd4j.ddd.AggregateRootId;
import org.fuin.ddd4j.ddd.EntityType;

//CHECKSTYLE:OFF
public class AId implements AggregateRootId {

	private final long id;

	public AId(final long id) {
		this.id = id;
	}

	@Override
	public EntityType getType() {
		return new EntityType() {
			@Override
			public String asString() {
				return "A";
			}
		};
	}

	@Override
	public String asString() {
		return "" + id;
	}

	@Override
	public String toString() {
		return asString();
	}

	@Override
	public String asTypedString() {
		return "A " + toString();
	}

}
//CHECKSTYLE:ON
