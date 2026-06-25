package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f62331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC6891b0 f62332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f62333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f62334d;

    public /* synthetic */ C0(y0 y0Var, EnumC6891b0 enumC6891b0, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, enumC6891b0, j10);
    }

    private final long h(long j10) {
        long j11 = this.f62334d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f62333c;
        long j14 = j12 / j13;
        return (this.f62332b == EnumC6891b0.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    private final AbstractC6913q i(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        long j11 = this.f62334d;
        long j12 = j10 + j11;
        long j13 = this.f62333c;
        return j12 > j13 ? this.f62331a.e(j13 - j11, abstractC6913q, abstractC6913q3, abstractC6913q2) : abstractC6913q2;
    }

    @Override // w.v0
    public boolean a() {
        return true;
    }

    @Override // w.v0
    public long b(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return Long.MAX_VALUE;
    }

    @Override // w.v0
    public AbstractC6913q d(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62331a.d(h(j10), abstractC6913q, abstractC6913q2, i(j10, abstractC6913q, abstractC6913q3, abstractC6913q2));
    }

    @Override // w.v0
    public AbstractC6913q e(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return this.f62331a.e(h(j10), abstractC6913q, abstractC6913q2, i(j10, abstractC6913q, abstractC6913q3, abstractC6913q2));
    }

    private C0(y0 y0Var, EnumC6891b0 enumC6891b0, long j10) {
        this.f62331a = y0Var;
        this.f62332b = enumC6891b0;
        this.f62333c = ((long) (y0Var.f() + y0Var.c())) * 1000000;
        this.f62334d = j10 * 1000000;
    }
}
