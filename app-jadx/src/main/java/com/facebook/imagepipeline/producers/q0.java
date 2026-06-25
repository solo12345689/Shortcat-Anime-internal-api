package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f36282c;

    public q0(Executor executor) {
        AbstractC5504s.h(executor, "executor");
        this.f36280a = executor;
        this.f36282c = new ArrayDeque();
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void a(Runnable runnable) {
        AbstractC5504s.h(runnable, "runnable");
        this.f36282c.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public synchronized void b(Runnable runnable) {
        try {
            AbstractC5504s.h(runnable, "runnable");
            if (this.f36281b) {
                this.f36282c.add(runnable);
            } else {
                this.f36280a.execute(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
