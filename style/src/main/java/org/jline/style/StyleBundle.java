/*
 * Copyright (c) 2002-2017, the original author or authors.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package org.jline.style;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker for proxy-based style bundles.
 *
 * @since TBD
 */
public interface StyleBundle
{
  /**
   * Provides the style group-name.
   */
  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.TYPE)
  @Documented
  @interface StyleGroup
  {
    String value();
  }

  /**
   * Allows overriding the style-name.
   *
   * Default style-name is determined from method-name.
   */
  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.METHOD)
  @Documented
  @interface StyleName
  {
    String value();
  }

  /**
   * Provide default style-specification.
   */
  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.METHOD)
  @Documented
  @interface DefaultStyle
  {
    String value();
  }
}
