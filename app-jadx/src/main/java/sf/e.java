package sf;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import Ud.a0;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import ye.G;
import ye.H;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.V;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f59605a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Xe.f f59606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f59607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f59608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f59609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f59610f;

    static {
        Xe.f fVarQ = Xe.f.q(b.f59596e.b());
        AbstractC5504s.g(fVarQ, "special(...)");
        f59606b = fVarQ;
        f59607c = AbstractC2279u.m();
        f59608d = AbstractC2279u.m();
        f59609e = a0.d();
        f59610f = AbstractC2163n.b(d.f59604a);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ve.g j0() {
        return ve.g.f62098h.a();
    }

    @Override // ye.H
    public List A0() {
        return f59608d;
    }

    public Xe.f F0() {
        return f59606b;
    }

    @Override // ye.H
    public V S(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // ye.H
    public Object a0(G capability) {
        AbstractC5504s.h(capability, "capability");
        return null;
    }

    @Override // ye.InterfaceC7235m
    public InterfaceC7235m b() {
        return null;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o visitor, Object obj) {
        AbstractC5504s.h(visitor, "visitor");
        return null;
    }

    @Override // ze.InterfaceC7367a
    public InterfaceC7374h getAnnotations() {
        return InterfaceC7374h.f66223k0.b();
    }

    @Override // ye.J
    public Xe.f getName() {
        return F0();
    }

    @Override // ye.H
    public ve.i n() {
        return (ve.i) f59610f.getValue();
    }

    @Override // ye.H
    public Collection t(Xe.c fqName, Function1 nameFilter) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return AbstractC2279u.m();
    }

    @Override // ye.H
    public boolean x0(H targetModule) {
        AbstractC5504s.h(targetModule, "targetModule");
        return false;
    }

    @Override // ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public InterfaceC7235m a() {
        return this;
    }
}
