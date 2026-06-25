package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3679i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C3679i0 f40473d = new C3679i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f40474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f40475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C3679i0 f40476c;

    C3679i0() {
        this.f40474a = null;
        this.f40475b = null;
    }

    C3679i0(Runnable runnable, Executor executor) {
        this.f40474a = runnable;
        this.f40475b = executor;
    }
}
