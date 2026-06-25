package gf;

import Ke.j;
import Le.D;
import Oe.g;
import Ud.AbstractC2279u;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: gf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4880c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f47450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ie.j f47451b;

    public C4880c(j packageFragmentProvider, Ie.j javaResolverCache) {
        AbstractC5504s.h(packageFragmentProvider, "packageFragmentProvider");
        AbstractC5504s.h(javaResolverCache, "javaResolverCache");
        this.f47450a = packageFragmentProvider;
        this.f47451b = javaResolverCache;
    }

    public final j a() {
        return this.f47450a;
    }

    public final InterfaceC7227e b(g javaClass) {
        D d10;
        AbstractC5504s.h(javaClass, "javaClass");
        Xe.c cVarF = javaClass.f();
        if (cVarF != null && javaClass.K() == Oe.D.f13154a) {
            return this.f47451b.b(cVarF);
        }
        g gVarL = javaClass.l();
        if (gVarL == null) {
            if (cVarF == null || (d10 = (D) AbstractC2279u.o0(this.f47450a.c(cVarF.d()))) == null) {
                return null;
            }
            return d10.N0(javaClass);
        }
        InterfaceC7227e interfaceC7227eB = b(gVarL);
        InterfaceC5387k interfaceC5387kU = interfaceC7227eB != null ? interfaceC7227eB.U() : null;
        InterfaceC7230h interfaceC7230hE = interfaceC5387kU != null ? interfaceC5387kU.e(javaClass.getName(), Ge.d.f7473s) : null;
        if (interfaceC7230hE instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC7230hE;
        }
        return null;
    }
}
