package com.github.akinaru.bleremote.model;

/**
 * Created by akinaru on 19/04/16.
 */
public enum TransmitState {

    TRANSMIT_NONE(0),
    TRANSMITTING(1),
    TRANSMIT_OK(2),
    TRANSMIT_COMPLETE(3),
    TRANSMIT_ERROR(4),
    TRANSMIT_CANCEL(5),
    TRANSMIT_START(6);

    private int state;

    TransmitState(int state) {
        this.state = state;
    }

    public static TransmitState getTransmitState(byte data) {

        switch (data) {
            case 0:
                return TransmitState.TRANSMIT_NONE;
            case 1:
                return TransmitState.TRANSMITTING;
            case 2:
                return TransmitState.TRANSMIT_OK;
            case 3:
                return TransmitState.TRANSMIT_COMPLETE;
            case 4:
                return TransmitState.TRANSMIT_ERROR;
            case 5:
                return TransmitState.TRANSMIT_CANCEL;
            case 6:
                return TransmitState.TRANSMIT_START;
        }
        return TransmitState.TRANSMIT_NONE;
    }
}