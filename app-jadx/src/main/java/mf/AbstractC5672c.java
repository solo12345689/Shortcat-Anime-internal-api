package mf;

import Ud.AbstractC2279u;
import Ud.a0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pf.InterfaceC6043h;

/* JADX INFO: renamed from: mf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5672c implements ye.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pf.n f53408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5668A f53409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye.H f53410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C5683n f53411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6043h f53412e;

    public AbstractC5672c(pf.n storageManager, InterfaceC5668A finder, ye.H moduleDescriptor) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(finder, "finder");
        AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
        this.f53408a = storageManager;
        this.f53409b = finder;
        this.f53410c = moduleDescriptor;
        this.f53412e = storageManager.d(new C5671b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ye.N f(AbstractC5672c abstractC5672c, Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        r rVarE = abstractC5672c.e(fqName);
        if (rVarE == null) {
            return null;
        }
        rVarE.L0(abstractC5672c.g());
        return rVarE;
    }

    @Override // ye.U
    public void a(Xe.c fqName, Collection packageFragments) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(packageFragments, "packageFragments");
        Af.a.a(packageFragments, this.f53412e.invoke(fqName));
    }

    @Override // ye.U
    public boolean b(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return (this.f53412e.q(fqName) ? (ye.N) this.f53412e.invoke(fqName) : e(fqName)) == null;
    }

    @Override // ye.O
    public List c(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return AbstractC2279u.q(this.f53412e.invoke(fqName));
    }

    protected abstract r e(Xe.c cVar);

    protected final C5683n g() {
        C5683n c5683n = this.f53411d;
        if (c5683n != null) {
            return c5683n;
        }
        AbstractC5504s.u("components");
        return null;
    }

    protected final InterfaceC5668A h() {
        return this.f53409b;
    }

    protected final ye.H i() {
        return this.f53410c;
    }

    protected final pf.n j() {
        return this.f53408a;
    }

    protected final void k(C5683n c5683n) {
        AbstractC5504s.h(c5683n, "<set-?>");
        this.f53411d = c5683n;
    }

    @Override // ye.O
    public Collection t(Xe.c fqName, Function1 nameFilter) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return a0.d();
    }
}
