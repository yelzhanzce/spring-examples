package com.example.testing.spring_potrishitel.impl;

import com.example.testing.spring_potrishitel.interfaces.ProfilingControllerMBean;

public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
