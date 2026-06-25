package w;

import Y.b2;
import Y.h2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6907k implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f62536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y.C0 f62537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC6913q f62538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f62539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f62540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f62541f;

    public C6907k(s0 s0Var, Object obj, AbstractC6913q abstractC6913q, long j10, long j11, boolean z10) {
        AbstractC6913q abstractC6913qE;
        this.f62536a = s0Var;
        this.f62537b = b2.e(obj, null, 2, null);
        this.f62538c = (abstractC6913q == null || (abstractC6913qE = r.e(abstractC6913q)) == null) ? AbstractC6908l.i(s0Var, obj) : abstractC6913qE;
        this.f62539d = j10;
        this.f62540e = j11;
        this.f62541f = z10;
    }

    @Override // Y.h2
    public Object getValue() {
        return this.f62537b.getValue();
    }

    public final long i() {
        return this.f62540e;
    }

    public final long l() {
        return this.f62539d;
    }

    public final s0 n() {
        return this.f62536a;
    }

    public final Object p() {
        return this.f62536a.b().invoke(this.f62538c);
    }

    public final AbstractC6913q q() {
        return this.f62538c;
    }

    public final boolean r() {
        return this.f62541f;
    }

    public final void s(long j10) {
        this.f62540e = j10;
    }

    public final void t(long j10) {
        this.f62539d = j10;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + p() + ", isRunning=" + this.f62541f + ", lastFrameTimeNanos=" + this.f62539d + ", finishedTimeNanos=" + this.f62540e + ')';
    }

    public final void u(boolean z10) {
        this.f62541f = z10;
    }

    public void v(Object obj) {
        this.f62537b.setValue(obj);
    }

    public final void w(AbstractC6913q abstractC6913q) {
        this.f62538c = abstractC6913q;
    }

    public /* synthetic */ C6907k(s0 s0Var, Object obj, AbstractC6913q abstractC6913q, long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s0Var, obj, (i10 & 4) != 0 ? null : abstractC6913q, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
