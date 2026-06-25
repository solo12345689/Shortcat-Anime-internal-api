package com.google.common.util.concurrent;

import P9.AbstractC2007p;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends AbstractC2007p implements Future {
    protected g() {
    }

    protected abstract Future b();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return b().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return b().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return b().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return b().get(j10, timeUnit);
    }
}
