package com.adjust.sdk;

import com.adjust.sdk.scheduler.TimerOnce;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustTimeoutCallback {
    private OnAdidReadListener onAdidReadListener;
    private OnAttributionReadListener onAttributionReadListener;
    private TimerOnce timeoutTimer;

    public AdjustTimeoutCallback(OnAdidReadListener onAdidReadListener) {
        this.onAdidReadListener = onAdidReadListener;
    }

    public OnAdidReadListener getOnAdidReadListener() {
        return this.onAdidReadListener;
    }

    public OnAttributionReadListener getOnAttributionReadListener() {
        return this.onAttributionReadListener;
    }

    public TimerOnce getTimeoutTimer() {
        return this.timeoutTimer;
    }

    public void setOnAdidReadListener(OnAdidReadListener onAdidReadListener) {
        this.onAdidReadListener = onAdidReadListener;
    }

    public void setOnAttributionReadListener(OnAttributionReadListener onAttributionReadListener) {
        this.onAttributionReadListener = onAttributionReadListener;
    }

    public void setTimer(TimerOnce timerOnce) {
        this.timeoutTimer = timerOnce;
    }

    public AdjustTimeoutCallback(OnAttributionReadListener onAttributionReadListener) {
        this.onAttributionReadListener = onAttributionReadListener;
    }
}
