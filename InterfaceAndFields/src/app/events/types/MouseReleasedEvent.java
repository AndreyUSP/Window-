package app.events.types;

import app.events.Event;

public class MouseReleasedEvent extends MouseButtonEvent {

    public MouseReleasedEvent(int keyCode, int x, int y) {
        super(Event.Type.MOUSE_RELEASED, keyCode, x, y);
    }



}