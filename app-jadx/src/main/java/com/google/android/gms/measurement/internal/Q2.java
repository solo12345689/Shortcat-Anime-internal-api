package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import java.lang.Thread;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Q2 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ T2 f40921b;

    public Q2(T2 t22, String str) {
        Objects.requireNonNull(t22);
        this.f40921b = t22;
        AbstractC2115p.l(str);
        this.f40920a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f40921b.f40611a.a().o().b(this.f40920a, th2);
    }
}
