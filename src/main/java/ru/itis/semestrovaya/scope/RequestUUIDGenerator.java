package ru.itis.semestrovaya.scope;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

@Data
@Component
@RequestScope
public class RequestUUIDGenerator {

    private String id;

    public RequestUUIDGenerator() {
        id = UUID.randomUUID().toString();
    }

    public String getRequestRandomId() {
        return id;
    }
}
