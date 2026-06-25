package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends k {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class a extends f implements a.i {
        a() {
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.p
        public final void k(Runnable runnable, Executor executor) {
            super.k(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final Object get(long j10, TimeUnit timeUnit) {
            return super.get(j10, timeUnit);
        }
    }

    f() {
    }
}
