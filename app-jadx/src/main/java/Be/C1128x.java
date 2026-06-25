package Be;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.C5378b;
import jf.C5385i;
import jf.InterfaceC5387k;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import ye.InterfaceC7237o;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1128x extends AbstractC1118m implements ye.V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f1886h = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C1128x.class, "fragments", "getFragments()Ljava/util/List;", 0)), kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(C1128x.class, "empty", "getEmpty()Z", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f1887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xe.c f1888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6044i f1889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC6044i f1890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC5387k f1891g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128x(F module, Xe.c fqName, pf.n storageManager) {
        super(InterfaceC7374h.f66223k0.b(), fqName.g());
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(storageManager, "storageManager");
        this.f1887c = module;
        this.f1888d = fqName;
        this.f1889e = storageManager.c(new C1125u(this));
        this.f1890f = storageManager.c(new C1126v(this));
        this.f1891g = new C5385i(storageManager, new C1127w(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L0(C1128x c1128x) {
        return ye.T.b(c1128x.C0().M0(), c1128x.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List M0(C1128x c1128x) {
        return ye.T.c(c1128x.C0().M0(), c1128x.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5387k Q0(C1128x c1128x) {
        if (c1128x.isEmpty()) {
            return InterfaceC5387k.b.f51800b;
        }
        List listK0 = c1128x.k0();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(((ye.N) it.next()).o());
        }
        List listJ0 = AbstractC2279u.J0(arrayList, new P(c1128x.C0(), c1128x.f()));
        return C5378b.f51753d.a("package view scope for " + c1128x.f() + " in " + c1128x.C0().getName(), listJ0);
    }

    @Override // ye.InterfaceC7235m
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public ye.V b() {
        if (f().c()) {
            return null;
        }
        return C0().S(f().d());
    }

    protected final boolean O0() {
        return ((Boolean) AbstractC6048m.a(this.f1890f, this, f1886h[1])).booleanValue();
    }

    @Override // ye.V
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public F C0() {
        return this.f1887c;
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o visitor, Object obj) {
        AbstractC5504s.h(visitor, "visitor");
        return visitor.k(this, obj);
    }

    public boolean equals(Object obj) {
        ye.V v10 = obj instanceof ye.V ? (ye.V) obj : null;
        return v10 != null && AbstractC5504s.c(f(), v10.f()) && AbstractC5504s.c(C0(), v10.C0());
    }

    @Override // ye.V
    public Xe.c f() {
        return this.f1888d;
    }

    public int hashCode() {
        return (C0().hashCode() * 31) + f().hashCode();
    }

    @Override // ye.V
    public boolean isEmpty() {
        return O0();
    }

    @Override // ye.V
    public List k0() {
        return (List) AbstractC6048m.a(this.f1889e, this, f1886h[0]);
    }

    @Override // ye.V
    public InterfaceC5387k o() {
        return this.f1891g;
    }
}
