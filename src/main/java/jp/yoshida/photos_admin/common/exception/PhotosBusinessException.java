package jp.yoshida.photos_admin.common.exception;

import lombok.Getter;

/**
 * 写真業務例外
 */
public class PhotosBusinessException extends PhotosException {

    private static final long serialVersionUID = 1L;

    @Getter
    private String infoLevel;

    public PhotosBusinessException(String message) {
        super(message);
    }

    public PhotosBusinessException(String message, String infoLevel) {
        super(message);
        this.infoLevel = infoLevel;
    }
}
