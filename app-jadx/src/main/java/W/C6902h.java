package w;

import Y.b2;
import ie.InterfaceC5082a;

/* JADX INFO: renamed from: w.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6902h {

    /* JADX INFO: renamed from: a */
    private final s0 f62520a;

    /* JADX INFO: renamed from: b */
    private final Object f62521b;

    /* JADX INFO: renamed from: c */
    private final long f62522c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5082a f62523d;

    /* JADX INFO: renamed from: e */
    private final Y.C0 f62524e;

    /* JADX INFO: renamed from: f */
    private AbstractC6913q f62525f;

    /* JADX INFO: renamed from: g */
    private long f62526g;

    /* JADX INFO: renamed from: h */
    private long f62527h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    private final Y.C0 f62528i;

    public C6902h(Object obj, s0 s0Var, AbstractC6913q abstractC6913q, long j10, Object obj2, long j11, boolean z10, InterfaceC5082a interfaceC5082a) {
        this.f62520a = s0Var;
        this.f62521b = obj2;
        this.f62522c = j11;
        this.f62523d = interfaceC5082a;
        this.f62524e = b2.e(obj, null, 2, null);
        this.f62525f = r.e(abstractC6913q);
        this.f62526g = j10;
        this.f62528i = b2.e(Boolean.valueOf(z10), null, 2, null);
    }

    public final void a() {
        k(false);
        this.f62523d.invoke();
    }

    public final long b() {
        return this.f62527h;
    }

    public final long c() {
        return this.f62526g;
    }

    public final long d() {
        return this.f62522c;
    }

    public final Object e() {
        return this.f62524e.getValue();
    }

    public final Object f() {
        return this.f62520a.b().invoke(this.f62525f);
    }

    public final AbstractC6913q g() {
        return this.f62525f;
    }

    public final boolean h() {
        return ((Boolean) this.f62528i.getValue()).booleanValue();
    }

    public final void i(long j10) {
        this.f62527h = j10;
    }

    public final void j(long j10) {
        this.f62526g = j10;
    }

    public final void k(boolean z10) {
        this.f62528i.setValue(Boolean.valueOf(z10));
    }

    public final void l(Object obj) {
        this.f62524e.setValue(obj);
    }

    public final void m(AbstractC6913q abstractC6913q) {
        this.f62525f = abstractC6913q;
    }
}
