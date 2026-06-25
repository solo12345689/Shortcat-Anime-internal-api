package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3364k extends ContentObserver {
    C3364k(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AbstractC3367l.f39261e.set(true);
    }
}
