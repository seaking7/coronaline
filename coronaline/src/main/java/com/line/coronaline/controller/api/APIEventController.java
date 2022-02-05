package com.line.coronaline.controller.api;

import com.line.coronaline.constant.ErrorCode;
import com.line.coronaline.dto.ApiErrorResponse;
import com.line.coronaline.exception.GeneralException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIEventController {


    @GetMapping("/events")
    public List<String> getEvents() {
        return List.of("event1", "event2");
    }

    @PostMapping("/events")
    public Boolean createEvent() {
        return true;
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable Integer eventId) {
        return "event " + eventId;
    }

    @PutMapping("/events/{eventId}")
    public Boolean modifyEvent(@PathVariable Integer eventId) {
        return true;
    }

    @DeleteMapping("/events/{eventId}")
    public Boolean removeEvent(@PathVariable Integer eventId) {
        return true;
    }

    @ExceptionHandler
    public ResponseEntity<ApiErrorResponse> general(GeneralException e){
        ErrorCode errorCode = e.getErrorCode();
        HttpStatus status = HttpStatus.BAD_REQUEST;
        return ResponseEntity
                .status(status)
                .body(
                        ApiErrorResponse.of(false, errorCode, errorCode.getMessage(e))
                );
    }

}
