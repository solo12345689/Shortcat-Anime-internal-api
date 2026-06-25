package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H1 extends Z0 {

    /* JADX INFO: renamed from: a */
    private final J1 f40212a;

    /* JADX INFO: renamed from: b */
    protected J1 f40213b;

    protected H1(J1 j12) {
        this.f40212a = j12;
        if (j12.B()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f40213b = j12.r();
    }

    private static void e(Object obj, Object obj2) {
        C3701m2.a().b(obj.getClass()).f(obj, obj2);
    }

    /* JADX INFO: renamed from: g */
    public final H1 clone() {
        H1 h12 = (H1) this.f40212a.i(5, null, null);
        h12.f40213b = o();
        return h12;
    }

    public final H1 h(J1 j12) {
        if (!this.f40212a.equals(j12)) {
            if (!this.f40213b.B()) {
                m();
            }
            e(this.f40213b, j12);
        }
        return this;
    }

    public final J1 i() {
        J1 j1O = o();
        if (j1O.m()) {
            return j1O;
        }
        throw new C3740u2(j1O);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3661e2
    /* JADX INFO: renamed from: j */
    public J1 o() {
        if (!this.f40213b.B()) {
            return this.f40213b;
        }
        this.f40213b.x();
        return this.f40213b;
    }

    protected final void k() {
        if (this.f40213b.B()) {
            return;
        }
        m();
    }

    protected void m() {
        J1 j1R = this.f40212a.r();
        e(j1R, this.f40213b);
        this.f40213b = j1R;
    }
}
