package com.nowcoder.async;

import java.util.List;

/**
 * Created by nowcoder on 2018/7/16.
 */
public interface EventHandler {
    void doHandle(EventModel model);
    List<EventType> getSupportEventTypes();
}
