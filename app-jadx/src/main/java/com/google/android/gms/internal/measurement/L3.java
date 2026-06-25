package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class L3 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ N3 f39412a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L3(N3 n32, Handler handler) {
        super(null);
        Objects.requireNonNull(n32);
        this.f39412a = n32;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f39412a.b().set(true);
    }
}
