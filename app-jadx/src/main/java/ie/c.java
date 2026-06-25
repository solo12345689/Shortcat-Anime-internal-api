package Ie;

import Oe.InterfaceC1980a;
import Oe.InterfaceC1981b;
import Ud.AbstractC2279u;
import Ud.S;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import qf.AbstractC6183d0;
import ye.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class c implements Je.g {

    /* JADX INFO: renamed from: f */
    static final /* synthetic */ InterfaceC6023m[] f9081f = {O.k(new F(c.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a */
    private final Xe.c f9082a;

    /* JADX INFO: renamed from: b */
    private final h0 f9083b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6044i f9084c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1981b f9085d;

    /* JADX INFO: renamed from: e */
    private final boolean f9086e;

    public c(Ke.k c10, InterfaceC1980a interfaceC1980a, Xe.c fqName) {
        h0 NO_SOURCE;
        Collection collectionE;
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(fqName, "fqName");
        this.f9082a = fqName;
        if (interfaceC1980a == null || (NO_SOURCE = c10.a().t().a(interfaceC1980a)) == null) {
            NO_SOURCE = h0.f65112a;
            AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
        }
        this.f9083b = NO_SOURCE;
        this.f9084c = c10.e().c(new b(c10, this));
        this.f9085d = (interfaceC1980a == null || (collectionE = interfaceC1980a.e()) == null) ? null : (InterfaceC1981b) AbstractC2279u.n0(collectionE);
        boolean z10 = false;
        if (interfaceC1980a != null && interfaceC1980a.d()) {
            z10 = true;
        }
        this.f9086e = z10;
    }

    public static final AbstractC6183d0 g(Ke.k kVar, c cVar) {
        AbstractC6183d0 abstractC6183d0P = kVar.d().n().p(cVar.f()).p();
        AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
        return abstractC6183d0P;
    }

    @Override // ze.InterfaceC7369c
    public Map a() {
        return S.i();
    }

    protected final InterfaceC1981b c() {
        return this.f9085d;
    }

    @Override // Je.g
    public boolean d() {
        return this.f9086e;
    }

    @Override // ze.InterfaceC7369c
    /* JADX INFO: renamed from: e */
    public AbstractC6183d0 getType() {
        return (AbstractC6183d0) AbstractC6048m.a(this.f9084c, this, f9081f[0]);
    }

    @Override // ze.InterfaceC7369c
    public Xe.c f() {
        return this.f9082a;
    }

    @Override // ze.InterfaceC7369c
    public h0 k() {
        return this.f9083b;
    }
}
