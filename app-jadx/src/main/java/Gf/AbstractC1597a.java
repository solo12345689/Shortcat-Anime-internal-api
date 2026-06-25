package Gf;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Gf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1597a extends I0 implements C0, Zd.e, O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Zd.i f7546c;

    public AbstractC1597a(Zd.i iVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            l0((C0) iVar.l(C0.f7490K));
        }
        this.f7546c = iVar.w(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Gf.I0
    public String J() {
        return T.a(this) + " was cancelled";
    }

    protected void Q0(Object obj) {
        t(obj);
    }

    public final void T0(Q q10, Object obj, Function2 function2) {
        q10.b(function2, obj, this);
    }

    @Override // Gf.I0, Gf.C0
    public boolean b() {
        return super.b();
    }

    @Override // Zd.e
    public final Zd.i getContext() {
        return this.f7546c;
    }

    @Override // Gf.O
    public Zd.i getCoroutineContext() {
        return this.f7546c;
    }

    @Override // Gf.I0
    public final void j0(Throwable th2) {
        M.a(this.f7546c, th2);
    }

    @Override // Zd.e
    public final void resumeWith(Object obj) {
        Object objS0 = s0(E.b(obj));
        if (objS0 == J0.f7514b) {
            return;
        }
        Q0(objS0);
    }

    @Override // Gf.I0
    public String t0() {
        String strG = I.g(this.f7546c);
        if (strG == null) {
            return super.t0();
        }
        return '\"' + strG + "\":" + super.t0();
    }

    @Override // Gf.I0
    protected final void y0(Object obj) {
        if (!(obj instanceof C)) {
            S0(obj);
        } else {
            C c10 = (C) obj;
            R0(c10.f7489a, c10.a());
        }
    }

    protected void S0(Object obj) {
    }

    protected void R0(Throwable th2, boolean z10) {
    }
}
