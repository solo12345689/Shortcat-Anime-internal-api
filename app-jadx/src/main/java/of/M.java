package of;

import Ud.AbstractC2279u;
import Ud.a0;
import Ue.i;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.C5380d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import mf.C5683n;
import mf.C5685p;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class M extends w {

    /* JADX INFO: renamed from: g */
    private final ye.N f55431g;

    /* JADX INFO: renamed from: h */
    private final String f55432h;

    /* JADX INFO: renamed from: i */
    private final Xe.c f55433i;

    public M(ye.N packageDescriptor, Se.m proto, Ue.d nameResolver, Ue.a metadataVersion, InterfaceC5895s interfaceC5895s, C5683n components, String debugName, InterfaceC5082a classNames) {
        AbstractC5504s.h(packageDescriptor, "packageDescriptor");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        AbstractC5504s.h(components, "components");
        AbstractC5504s.h(debugName, "debugName");
        AbstractC5504s.h(classNames, "classNames");
        Se.u uVarW = proto.W();
        AbstractC5504s.g(uVarW, "getTypeTable(...)");
        Ue.h hVar = new Ue.h(uVarW);
        i.a aVar = Ue.i.f19583b;
        Se.x xVarX = proto.X();
        AbstractC5504s.g(xVarX, "getVersionRequirementTable(...)");
        C5685p c5685pA = components.a(packageDescriptor, nameResolver, hVar, aVar.a(xVarX), metadataVersion, interfaceC5895s);
        List listP = proto.P();
        AbstractC5504s.g(listP, "getFunctionList(...)");
        List listS = proto.S();
        AbstractC5504s.g(listS, "getPropertyList(...)");
        List listV = proto.V();
        AbstractC5504s.g(listV, "getTypeAliasList(...)");
        super(c5685pA, listP, listS, listV, classNames);
        this.f55431g = packageDescriptor;
        this.f55432h = debugName;
        this.f55433i = packageDescriptor.f();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    /* JADX INFO: renamed from: B */
    public List g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        Collection collectionM = m(kindFilter, nameFilter, Ge.d.f7467m);
        Iterable iterableL = s().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList, ((Ae.b) it.next()).c(this.f55433i));
        }
        return AbstractC2279u.I0(collectionM, arrayList);
    }

    public void C(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        Fe.a.b(s().c().p(), location, this.f55431g, name);
    }

    @Override // of.w, jf.AbstractC5388l, jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        C(name, location);
        return super.e(name, location);
    }

    @Override // of.w
    protected void j(Collection result, Function1 nameFilter) {
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(nameFilter, "nameFilter");
    }

    @Override // of.w
    protected Xe.b p(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return new Xe.b(this.f55433i, name);
    }

    public String toString() {
        return this.f55432h;
    }

    @Override // of.w
    protected Set v() {
        return a0.d();
    }

    @Override // of.w
    protected Set w() {
        return a0.d();
    }

    @Override // of.w
    protected Set x() {
        return a0.d();
    }

    @Override // of.w
    protected boolean z(Xe.f name) {
        AbstractC5504s.h(name, "name");
        if (super.z(name)) {
            return true;
        }
        Iterable iterableL = s().c().l();
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return false;
        }
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            if (((Ae.b) it.next()).b(this.f55433i, name)) {
                return true;
            }
        }
        return false;
    }
}
