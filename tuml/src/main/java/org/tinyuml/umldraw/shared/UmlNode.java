/**
 * Copyright 2007 Wei-ju Wu
 *
 * This file is part of TinyUML.
 *
 * TinyUML is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * TinyUML is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TinyUML; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.tinyuml.umldraw.shared;

import org.tinyuml.draw.Node;
import org.tinyuml.model.RelationEndType;
import org.tinyuml.model.RelationType;

/**
 * A specialized interface that is used for Node elements that have an
 * associated UML model element.
 * @author Wei-ju Wu
 * @version 1.0
 */
public interface UmlNode extends Node, UmlDiagramElement {

  /**
   * Determines whether this Node accepts a connection of the specified type
   * with the specified node and the specified end type. The <i>with</i>
   * parameter can be omitted.
   * @param associationType the AssociationType for the connection
   * @param as the association end type, can be UNSPECIFIED, SOURCE OR TARGET
   * @param with the other end node if available
   * @return true if connection is accepted, false otherwise
   */
  boolean acceptsConnection(RelationType associationType,
                            RelationEndType as, UmlNode with);
}
