package jf;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import ye.EnumC7228f;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.Z;
import ye.g0;

/* JADX INFO: renamed from: jf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5393q extends AbstractC5388l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f51803f = {O.k(new F(C5393q.class, "functions", "getFunctions()Ljava/util/List;", 0)), O.k(new F(C5393q.class, DiagnosticsEntry.PROPERTIES_KEY, "getProperties()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7227e f51804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f51805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6044i f51806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6044i f51807e;

    public C5393q(pf.n storageManager, InterfaceC7227e containingClass, boolean z10) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(containingClass, "containingClass");
        this.f51804b = containingClass;
        this.f51805c = z10;
        containingClass.h();
        EnumC7228f enumC7228f = EnumC7228f.f65097b;
        this.f51806d = storageManager.c(new C5391o(this));
        this.f51807e = storageManager.c(new C5392p(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(C5393q c5393q) {
        return AbstractC2279u.p(bf.h.g(c5393q.f51804b), bf.h.h(c5393q.f51804b));
    }

    private final List n() {
        return (List) AbstractC6048m.a(this.f51806d, this, f51803f[0]);
    }

    private final List o() {
        return (List) AbstractC6048m.a(this.f51807e, this, f51803f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(C5393q c5393q) {
        return c5393q.f51805c ? AbstractC2279u.q(bf.h.f(c5393q.f51804b)) : AbstractC2279u.m();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        List listO = o();
        Af.j jVar = new Af.j();
        for (Object obj : listO) {
            if (AbstractC5504s.c(((Z) obj).getName(), name)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    public /* bridge */ /* synthetic */ InterfaceC7230h e(Xe.f fVar, Ge.b bVar) {
        return (InterfaceC7230h) k(fVar, bVar);
    }

    public Void k(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return null;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return AbstractC2279u.I0(n(), o());
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Af.j c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        List listN = n();
        Af.j jVar = new Af.j();
        for (Object obj : listN) {
            if (AbstractC5504s.c(((g0) obj).getName(), name)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }
}
