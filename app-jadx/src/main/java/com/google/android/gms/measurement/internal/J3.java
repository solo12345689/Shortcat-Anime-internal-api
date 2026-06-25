package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class J3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3937x4 f40816a;

    J3(C3937x4 c3937x4) {
        Objects.requireNonNull(c3937x4);
        this.f40816a = c3937x4;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f40816a.f40611a.b().t(runnable);
    }
}
