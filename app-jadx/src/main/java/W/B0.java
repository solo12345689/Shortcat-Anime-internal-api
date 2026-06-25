package w;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class B0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6880I f62326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC6913q f62327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC6913q f62328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC6913q f62329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f62330e;

    public B0(InterfaceC6880I interfaceC6880I) {
        this.f62326a = interfaceC6880I;
        this.f62330e = interfaceC6880I.a();
    }

    @Override // w.x0
    public float a() {
        return this.f62330e;
    }

    @Override // w.x0
    public AbstractC6913q b(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2) {
        if (this.f62329d == null) {
            this.f62329d = r.g(abstractC6913q);
        }
        AbstractC6913q abstractC6913q3 = this.f62329d;
        if (abstractC6913q3 == null) {
            AbstractC5504s.u("targetVector");
            abstractC6913q3 = null;
        }
        int iB = abstractC6913q3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC6913q abstractC6913q4 = this.f62329d;
            if (abstractC6913q4 == null) {
                AbstractC5504s.u("targetVector");
                abstractC6913q4 = null;
            }
            abstractC6913q4.e(i10, this.f62326a.d(abstractC6913q.a(i10), abstractC6913q2.a(i10)));
        }
        AbstractC6913q abstractC6913q5 = this.f62329d;
        if (abstractC6913q5 != null) {
            return abstractC6913q5;
        }
        AbstractC5504s.u("targetVector");
        return null;
    }

    @Override // w.x0
    public long c(AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2) {
        if (this.f62328c == null) {
            this.f62328c = r.g(abstractC6913q);
        }
        AbstractC6913q abstractC6913q3 = this.f62328c;
        if (abstractC6913q3 == null) {
            AbstractC5504s.u("velocityVector");
            abstractC6913q3 = null;
        }
        int iB = abstractC6913q3.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f62326a.c(abstractC6913q.a(i10), abstractC6913q2.a(i10)));
        }
        return jMax;
    }

    @Override // w.x0
    public AbstractC6913q d(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2) {
        if (this.f62327b == null) {
            this.f62327b = r.g(abstractC6913q);
        }
        AbstractC6913q abstractC6913q3 = this.f62327b;
        if (abstractC6913q3 == null) {
            AbstractC5504s.u("valueVector");
            abstractC6913q3 = null;
        }
        int iB = abstractC6913q3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC6913q abstractC6913q4 = this.f62327b;
            if (abstractC6913q4 == null) {
                AbstractC5504s.u("valueVector");
                abstractC6913q4 = null;
            }
            abstractC6913q4.e(i10, this.f62326a.e(j10, abstractC6913q.a(i10), abstractC6913q2.a(i10)));
        }
        AbstractC6913q abstractC6913q5 = this.f62327b;
        if (abstractC6913q5 != null) {
            return abstractC6913q5;
        }
        AbstractC5504s.u("valueVector");
        return null;
    }

    @Override // w.x0
    public AbstractC6913q e(long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2) {
        if (this.f62328c == null) {
            this.f62328c = r.g(abstractC6913q);
        }
        AbstractC6913q abstractC6913q3 = this.f62328c;
        if (abstractC6913q3 == null) {
            AbstractC5504s.u("velocityVector");
            abstractC6913q3 = null;
        }
        int iB = abstractC6913q3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC6913q abstractC6913q4 = this.f62328c;
            if (abstractC6913q4 == null) {
                AbstractC5504s.u("velocityVector");
                abstractC6913q4 = null;
            }
            abstractC6913q4.e(i10, this.f62326a.b(j10, abstractC6913q.a(i10), abstractC6913q2.a(i10)));
        }
        AbstractC6913q abstractC6913q5 = this.f62328c;
        if (abstractC6913q5 != null) {
            return abstractC6913q5;
        }
        AbstractC5504s.u("velocityVector");
        return null;
    }
}
