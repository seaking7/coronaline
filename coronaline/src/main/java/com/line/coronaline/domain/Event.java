package com.line.coronaline.domain;

import com.line.coronaline.constant.EventStatus;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class Event {

    private Long id;


    private Place place;

    private String eventName;

    private EventStatus eventStatus;

    private LocalDateTime eventStartDatetime;

    private LocalDateTime eventEndDatetime;

    private Integer currentNumberOfPeople;

    private Integer capacity;

    private String memo;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return id != null && id.equals(((Event) obj).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventStartDatetime, eventEndDatetime, createdAt, modifiedAt);
    }

}
