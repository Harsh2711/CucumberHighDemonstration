package org.openqa.selenium.support;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

import org.openqa.selenium.By;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@PageFactoryFinder(FindBy.FindByBuilder.class)
public @interface FindBy {
  How how() default How.UNSET;

  String using() default "";

  String id() default "";

  String name() default "";

  String className() default "";

  String css() default "";

  String tagName() default "";

  String linkText() default "";

  String partialLinkText() default "";

  String xpath() default "";

  String locator() default "";
  public static class FindByBuilder extends AbstractFindByBuilder {
    public By buildIt(Object annotation, Field field) {
      FindBy findBy = (FindBy) annotation;
      assertValidFindBy(findBy);

      By ans = buildByFromShortFindBy(findBy);
      if (ans == null) {
        ans = buildByFromLongFindBy(findBy);
      }

      return ans;

    }

  }

}