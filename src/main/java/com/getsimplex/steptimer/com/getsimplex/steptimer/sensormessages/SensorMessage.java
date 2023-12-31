//© 2023 Miguel López

package com.getsimplex.steptimer.com.getsimplex.steptimer.sensormessages;

/**
 * Created by miguel on 9/7/2016.
 */
public interface SensorMessage {

    public String getMessageType();
    public String getMessage();
    public void setMessage(String message);

    public String getDeviceId();
}
