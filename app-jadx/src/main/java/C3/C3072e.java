package c3;

import U2.A;
import U2.J;
import U2.K;
import U2.O;
import U2.r;

/* JADX INFO: renamed from: c3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3072e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f33453b;

    /* JADX INFO: renamed from: c3.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f33454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J j10, J j11) {
            super(j10);
            this.f33454b = j11;
        }

        @Override // U2.A, U2.J
        public J.a g(long j10) {
            J.a aVarG = this.f33454b.g(j10);
            K k10 = aVarG.f18918a;
            K k11 = new K(k10.f18923a, k10.f18924b + C3072e.this.f33452a);
            K k12 = aVarG.f18919b;
            return new J.a(k11, new K(k12.f18923a, k12.f18924b + C3072e.this.f33452a));
        }
    }

    public C3072e(long j10, r rVar) {
        this.f33452a = j10;
        this.f33453b = rVar;
    }

    @Override // U2.r
    public O e(int i10, int i11) {
        return this.f33453b.e(i10, i11);
    }

    @Override // U2.r
    public void p() {
        this.f33453b.p();
    }

    @Override // U2.r
    public void t(J j10) {
        this.f33453b.t(new a(j10, j10));
    }
}
