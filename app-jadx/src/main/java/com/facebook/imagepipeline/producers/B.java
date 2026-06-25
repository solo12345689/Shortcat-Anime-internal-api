package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class B implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36016a;

    public B(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f36016a = executor;
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void a(Runnable runnable) {
        AbstractC5504s.h(runnable, "runnable");
    }

    @Override // com.facebook.imagepipeline.producers.p0
    public void b(Runnable runnable) {
        AbstractC5504s.h(runnable, "runnable");
        this.f36016a.execute(runnable);
    }
}
