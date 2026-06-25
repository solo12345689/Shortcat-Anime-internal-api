package dg;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jg.g f45517a;

    public k(jg.g delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f45517a = delegate;
    }

    public final jg.g a() {
        return this.f45517a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new jg.g(ig.e.f48893i, i10, j10, timeUnit));
        AbstractC5504s.h(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
