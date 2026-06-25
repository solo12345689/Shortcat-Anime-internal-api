package io.sentry.exception;

import io.sentry.protocol.l;
import io.sentry.util.w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f50659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f50660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f50661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f50662d;

    public a(l lVar, Throwable th2, Thread thread, boolean z10) {
        this.f50659a = (l) w.c(lVar, "Mechanism is required.");
        this.f50660b = (Throwable) w.c(th2, "Throwable is required.");
        this.f50661c = (Thread) w.c(thread, "Thread is required.");
        this.f50662d = z10;
    }

    public l a() {
        return this.f50659a;
    }

    public Thread b() {
        return this.f50661c;
    }

    public Throwable c() {
        return this.f50660b;
    }

    public boolean d() {
        return this.f50662d;
    }

    public a(l lVar, Throwable th2, Thread thread) {
        this(lVar, th2, thread, false);
    }
}
