package com.sana.android.plugin.hardware;

import android.content.ContentResolver;

import com.sana.android.plugin.data.DataWithEvent;

/**
 * Created by hanlin on 9/14/14.
 */
public class BuiltinDevice implements GeneralDevice {
    private ContentResolver resolver;

    @Override
    public DataWithEvent prepare() {
        return null;
    }

    @Override
    public void begin() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void setCaptureSetting(CaptureSetting setting) {

    }
}
