/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package java.util;

/**
 * A map known to be in ascending order.
 * 
 * @link http://java.sun.com/j2se/1.5.0/docs/api/java/util/SortedSet.html
 * 
 * @param <E> element type.
 */
public interface SortedSet<E> extends Set<E> {

  public Comparator<? super E> comparator();
  
  public E first();
  
  public SortedSet<E> headSet(E toElement);
  
  public E last();
  
  public SortedSet<E> subSet(E fromElement, E toElement);
  
  public SortedSet<E> tailSet(E fromElement);
}
