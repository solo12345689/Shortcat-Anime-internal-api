package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.p */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3379p extends ContentObserver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3382q f39280a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3379p(C3382q c3382q, Handler handler) {
        super(null);
        this.f39280a = c3382q;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f39280a.e();
    }
}
