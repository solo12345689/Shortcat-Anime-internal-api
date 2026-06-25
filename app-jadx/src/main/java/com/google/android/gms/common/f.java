package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class f extends d9.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f38957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3333a f38958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C3333a c3333a, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f38958c = c3333a;
        this.f38957b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        C3333a c3333a = this.f38958c;
        int iG = c3333a.g(this.f38957b);
        if (c3333a.j(iG)) {
            this.f38958c.q(this.f38957b, iG);
        }
    }
}
