package Be;

import Be.I;
import Td.AbstractC2163n;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.InterfaceC6042g;
import ye.H;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class F extends AbstractC1118m implements ye.H {

    /* JADX INFO: renamed from: c */
    private final pf.n f1667c;

    /* JADX INFO: renamed from: d */
    private final ve.i f1668d;

    /* JADX INFO: renamed from: e */
    private final Xe.f f1669e;

    /* JADX INFO: renamed from: f */
    private final Map f1670f;

    /* JADX INFO: renamed from: g */
    private final I f1671g;

    /* JADX INFO: renamed from: h */
    private B f1672h;

    /* JADX INFO: renamed from: i */
    private ye.O f1673i;

    /* JADX INFO: renamed from: j */
    private boolean f1674j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC6042g f1675k;

    /* JADX INFO: renamed from: l */
    private final Lazy f1676l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(Xe.f moduleName, pf.n storageManager, ve.i builtIns, Ye.a aVar) {
        this(moduleName, storageManager, builtIns, aVar, null, null, 48, null);
        AbstractC5504s.h(moduleName, "moduleName");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(builtIns, "builtIns");
    }

    private final String L0() {
        String string = getName().toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    private final C1117l N0() {
        return (C1117l) this.f1676l.getValue();
    }

    private final boolean P0() {
        return this.f1673i != null;
    }

    public static final C1117l R0(F f10) {
        B b10 = f10.f1672h;
        if (b10 == null) {
            throw new AssertionError("Dependencies of module " + f10.L0() + " were not set before querying module content");
        }
        List listA = b10.a();
        f10.K0();
        listA.contains(f10);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((F) it.next()).P0();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            ye.O o10 = ((F) it2.next()).f1673i;
            AbstractC5504s.e(o10);
            arrayList.add(o10);
        }
        return new C1117l(arrayList, "CompositeProvider@ModuleDescriptor for " + f10.getName());
    }

    public static final ye.V S0(F f10, Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return f10.f1671g.a(f10, fqName, f10.f1667c);
    }

    @Override // ye.H
    public List A0() {
        B b10 = this.f1672h;
        if (b10 != null) {
            return b10.b();
        }
        throw new AssertionError("Dependencies of module " + L0() + " were not set");
    }

    public void K0() {
        if (Q0()) {
            return;
        }
        ye.C.a(this);
    }

    public final ye.O M0() {
        K0();
        return N0();
    }

    public final void O0(ye.O providerForModuleContent) {
        AbstractC5504s.h(providerForModuleContent, "providerForModuleContent");
        P0();
        this.f1673i = providerForModuleContent;
    }

    public boolean Q0() {
        return this.f1674j;
    }

    @Override // ye.H
    public ye.V S(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        K0();
        return (ye.V) this.f1675k.invoke(fqName);
    }

    public final void T0(B dependencies) {
        AbstractC5504s.h(dependencies, "dependencies");
        this.f1672h = dependencies;
    }

    public final void U0(List descriptors) {
        AbstractC5504s.h(descriptors, "descriptors");
        V0(descriptors, a0.d());
    }

    public final void V0(List descriptors, Set friends) {
        AbstractC5504s.h(descriptors, "descriptors");
        AbstractC5504s.h(friends, "friends");
        T0(new C(descriptors, friends, AbstractC2279u.m(), a0.d()));
    }

    public final void W0(F... descriptors) {
        AbstractC5504s.h(descriptors, "descriptors");
        U0(AbstractC2273n.V0(descriptors));
    }

    @Override // ye.H
    public Object a0(ye.G capability) {
        AbstractC5504s.h(capability, "capability");
        Object obj = this.f1670f.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // ye.InterfaceC7235m
    public InterfaceC7235m b() {
        return H.a.b(this);
    }

    @Override // ye.InterfaceC7235m
    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return H.a.a(this, interfaceC7237o, obj);
    }

    @Override // ye.H
    public ve.i n() {
        return this.f1668d;
    }

    @Override // ye.H
    public Collection t(Xe.c fqName, Function1 nameFilter) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(nameFilter, "nameFilter");
        K0();
        return M0().t(fqName, nameFilter);
    }

    @Override // Be.AbstractC1118m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!Q0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        ye.O o10 = this.f1673i;
        sb2.append(o10 != null ? o10.getClass().getSimpleName() : null);
        return sb2.toString();
    }

    @Override // ye.H
    public boolean x0(ye.H targetModule) {
        AbstractC5504s.h(targetModule, "targetModule");
        if (AbstractC5504s.c(this, targetModule)) {
            return true;
        }
        B b10 = this.f1672h;
        AbstractC5504s.e(b10);
        return AbstractC2279u.e0(b10.c(), targetModule) || A0().contains(targetModule) || targetModule.A0().contains(this);
    }

    public /* synthetic */ F(Xe.f fVar, pf.n nVar, ve.i iVar, Ye.a aVar, Map map, Xe.f fVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, nVar, iVar, (i10 & 8) != 0 ? null : aVar, (i10 & 16) != 0 ? Ud.S.i() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Xe.f moduleName, pf.n storageManager, ve.i builtIns, Ye.a aVar, Map capabilities, Xe.f fVar) {
        super(InterfaceC7374h.f66223k0.b(), moduleName);
        AbstractC5504s.h(moduleName, "moduleName");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(builtIns, "builtIns");
        AbstractC5504s.h(capabilities, "capabilities");
        this.f1667c = storageManager;
        this.f1668d = builtIns;
        this.f1669e = fVar;
        if (moduleName.n()) {
            this.f1670f = capabilities;
            I i10 = (I) a0(I.f1687a.a());
            this.f1671g = i10 == null ? I.b.f1690b : i10;
            this.f1674j = true;
            this.f1675k = storageManager.h(new D(this));
            this.f1676l = AbstractC2163n.b(new E(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
