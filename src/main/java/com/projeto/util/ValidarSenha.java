package com.projeto.util;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD, ANNOTATION_TYPE })
@Constraint(validatedBy = {})
public @interface ValidarSenha {

	@OverridesAttribute(constraint = Pattern.class, name= "message")
	String message() default "Senha não confere";
	
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload> [] payload() default{};
	
	String senha();
	


	String confirmeSenha();
	
}
