package com.line.coronaline.domain;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class AdminPlaceMap {

    private Long id;

    private Admin admin;
    private Place place;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    protected AdminPlaceMap() {}

    protected AdminPlaceMap(Admin admin, Place place) {
        this.admin = admin;
        this.place = place;
    }

    public static AdminPlaceMap of(Admin admin, Place place) {
        return new AdminPlaceMap(admin, place);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return id != null && id.equals(((AdminPlaceMap) obj).getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, admin, createdAt, modifiedAt);
    }

}
