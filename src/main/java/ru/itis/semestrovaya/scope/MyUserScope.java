package ru.itis.semestrovaya.scope;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.Scope;
import ru.itis.semestrovaya.container.SessionUserContainer;
import ru.itis.semestrovaya.model.User;

import java.util.HashMap;
import java.util.Map;

public class MyUserScope implements Scope {

    Map<String, Map<User, Object>> objectMap = new HashMap<>();

    @Autowired
    SessionUserContainer userContainer;

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        if(!objectMap.containsKey(s)) {
            objectMap.put(s, new HashMap<>());
        }
        if(!objectMap.get(s).containsKey(userContainer.getUser())) {
            objectMap.get(s).put(userContainer.getUser(), objectFactory.getObject());
        }
        return objectMap.get(s).get(userContainer.getUser());
    }

    @Override
    public Object remove(String s) {
        return objectMap.remove(s);
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return "user";
    }
}
