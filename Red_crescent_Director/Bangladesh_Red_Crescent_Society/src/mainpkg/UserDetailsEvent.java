/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import javafx.event.Event;
import javafx.event.EventType;

/**
 *
 * @author tonoy
 */
public class UserDetailsEvent extends Event {
    public static final EventType<UserDetailsEvent> USER_DETAILS_EVENT_TYPE = new EventType<>(Event.ANY, "USER_DETAILS_EVENT");

    private final RegisterAccount user;

    public UserDetailsEvent(RegisterAccount user) {
        super(USER_DETAILS_EVENT_TYPE);
        this.user = user;
    }

    public RegisterAccount getUser() {
        return user;
    }
    
}
