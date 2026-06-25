package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class z extends A {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Callable f39022f;

    /* synthetic */ z(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f39022f = callable;
    }

    @Override // com.google.android.gms.common.A
    final String a() {
        try {
            return (String) this.f39022f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
