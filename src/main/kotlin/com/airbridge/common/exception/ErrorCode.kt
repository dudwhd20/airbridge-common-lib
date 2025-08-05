package com.airbridge.common.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(val message: String, val status: HttpStatus) {
    INVALID_TOKEN("유효하지 않은 토큰입니다.", HttpStatus.UNAUTHORIZED),
    EXPIRED_TOKEN("토큰이 만료되었습니다.", HttpStatus.UNAUTHORIZED),
    ACCESS_DENIED("접근이 거부되었습니다.", HttpStatus.FORBIDDEN),
    INTERNAL_ERROR("서버 내부 오류", HttpStatus.INTERNAL_SERVER_ERROR)
}
