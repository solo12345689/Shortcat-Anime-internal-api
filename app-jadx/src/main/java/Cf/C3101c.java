package cf;

import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.B0;
import qf.N0;
import qf.S;
import rf.AbstractC6317g;
import rf.n;
import ve.i;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: cf.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3101c implements InterfaceC3100b {

    /* JADX INFO: renamed from: a */
    private final B0 f33615a;

    /* JADX INFO: renamed from: b */
    private n f33616b;

    public C3101c(B0 projection) {
        AbstractC5504s.h(projection, "projection");
        this.f33615a = projection;
        a().b();
        N0 n02 = N0.f57999e;
    }

    @Override // cf.InterfaceC3100b
    public B0 a() {
        return this.f33615a;
    }

    public Void b() {
        return null;
    }

    public final n c() {
        return this.f33616b;
    }

    @Override // qf.v0
    /* JADX INFO: renamed from: d */
    public C3101c o(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0O = a().o(kotlinTypeRefiner);
        AbstractC5504s.g(b0O, "refine(...)");
        return new C3101c(b0O);
    }

    public final void e(n nVar) {
        this.f33616b = nVar;
    }

    @Override // qf.v0
    public List getParameters() {
        return AbstractC2279u.m();
    }

    @Override // qf.v0
    public Collection k() {
        S type = a().b() == N0.f58001g ? a().getType() : n().J();
        AbstractC5504s.e(type);
        return AbstractC2279u.e(type);
    }

    @Override // qf.v0
    public i n() {
        i iVarN = a().getType().N0().n();
        AbstractC5504s.g(iVarN, "getBuiltIns(...)");
        return iVarN;
    }

    @Override // qf.v0
    public /* bridge */ /* synthetic */ InterfaceC7230h p() {
        return (InterfaceC7230h) b();
    }

    @Override // qf.v0
    public boolean q() {
        return false;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + a() + ')';
    }
}
