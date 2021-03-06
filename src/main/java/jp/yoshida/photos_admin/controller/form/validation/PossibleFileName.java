package jp.yoshida.photos_admin.controller.form.validation;

import jp.yoshida.photos_admin.common.constant.MessagesConstants;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * ファイル名に使用できない文字が含まれていないことを検証するアノテーション
 */
@Constraint(validatedBy = PossibleFileNameValidator.class)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PossibleFileName {

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String message() default MessagesConstants.ERROR_FILE_NAME_CONTAINS_FORBIDDEN_CHARACTERS;

    @Documented
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {

        PossibleFileName[] value();
    }
}
