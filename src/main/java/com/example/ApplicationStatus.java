package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Builder;

/**
 * Created by ravipalakodeti on 8/21/16.
 */
@Builder
public class ApplicationStatus {

    @Getter @Setter int id;
    @Getter @Setter String name;
}
