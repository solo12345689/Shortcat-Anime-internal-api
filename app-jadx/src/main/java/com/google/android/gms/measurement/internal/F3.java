package com.google.android.gms.measurement.internal;

import android.util.Log;
import j9.InterfaceC5355l;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class F3 implements InterfaceC5355l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ X2 f40755a;

    F3(G3 g32, X2 x22) {
        this.f40755a = x22;
        Objects.requireNonNull(g32);
    }

    @Override // j9.InterfaceC5355l
    public final boolean zza() {
        return Log.isLoggable(this.f40755a.a().z(), 3);
    }
}
