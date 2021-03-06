package com.ifood.ifoodmanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Restaurant {

    @Id
    private String id;

    @Indexed(unique = true)
    private String code;

    private String name;

    private String foodTypes;

    private Integer stars;

    private boolean loggedIn;

    private boolean sendKeepAlive;

    private boolean available;

    @Transient
    private boolean online;

    @Transient
    private ConnectionState connectionStatus;

    @LastModifiedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime lastModified;
}
