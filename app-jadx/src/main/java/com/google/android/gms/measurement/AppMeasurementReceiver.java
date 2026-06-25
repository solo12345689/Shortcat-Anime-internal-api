package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import i2.AbstractC5032a;
import j9.m;
import j9.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends AbstractC5032a implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f40598c;

    @Override // j9.m
    public void a(Context context, Intent intent) {
        AbstractC5032a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f40598c == null) {
            this.f40598c = new n(this);
        }
        this.f40598c.a(context, intent);
    }
}
