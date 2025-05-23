package com.woomzip.common.exception.apivendor;

import com.woomzip.common.exception.BaseErrorCode;
import com.woomzip.common.response.ApplicationResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum VendorErrorCode implements BaseErrorCode {
    VENDOR_NOT_FOUND("지정된 공급업체를 찾을 수 없습니다.", 2001, HttpStatus.NOT_FOUND),
    VENDOR_CREATION_FAILED("공급업체 생성에 실패했습니다. 다시 시도해주세요.", 2002, HttpStatus.BAD_REQUEST),
    ;

    private final String message;
    private final int errorCode;
    private final HttpStatus httpStatus;

    @Override
    public ApplicationResponse<String> toResponseEntity() {
        return ApplicationResponse.server(message);
    }
}
