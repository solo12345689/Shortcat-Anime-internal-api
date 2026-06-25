package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class R2 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f40930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f40931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ T2 f40933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R2(T2 t22, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        Objects.requireNonNull(t22);
        this.f40933d = t22;
        AbstractC2115p.l(str);
        long andIncrement = T2.f40968k.getAndIncrement();
        this.f40930a = andIncrement;
        this.f40932c = str;
        this.f40931b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            t22.f40611a.a().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        R2 r22 = (R2) obj;
        boolean z10 = r22.f40931b;
        boolean z11 = this.f40931b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.f40930a;
        long j11 = r22.f40930a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f40933d.f40611a.a().p().b("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        this.f40933d.f40611a.a().o().b(this.f40932c, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R2(T2 t22, Callable callable, boolean z10, String str) {
        super(callable);
        Objects.requireNonNull(t22);
        this.f40933d = t22;
        AbstractC2115p.l("Task exception on worker thread");
        long andIncrement = T2.f40968k.getAndIncrement();
        this.f40930a = andIncrement;
        this.f40932c = "Task exception on worker thread";
        this.f40931b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            t22.f40611a.a().o().a("Tasks index overflow");
        }
    }
}
