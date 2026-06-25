package jf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.InterfaceC5390n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import qf.S;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7247z;
import ye.Z;
import ye.g0;

/* JADX INFO: renamed from: jf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5382f extends AbstractC5388l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f51788d = {O.k(new F(AbstractC5382f.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7227e f51789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6044i f51790c;

    /* JADX INFO: renamed from: jf.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends bf.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f51791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5382f f51792b;

        a(ArrayList arrayList, AbstractC5382f abstractC5382f) {
            this.f51791a = arrayList;
            this.f51792b = abstractC5382f;
        }

        @Override // bf.n
        public void a(InterfaceC7224b fakeOverride) {
            AbstractC5504s.h(fakeOverride, "fakeOverride");
            bf.o.K(fakeOverride, null);
            this.f51791a.add(fakeOverride);
        }

        @Override // bf.m
        protected void e(InterfaceC7224b fromSuper, InterfaceC7224b fromCurrent) {
            AbstractC5504s.h(fromSuper, "fromSuper");
            AbstractC5504s.h(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f51792b.m() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public AbstractC5382f(pf.n storageManager, InterfaceC7227e containingClass) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(containingClass, "containingClass");
        this.f51789b = containingClass;
        this.f51790c = storageManager.c(new C5381e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(AbstractC5382f abstractC5382f) {
        List listJ = abstractC5382f.j();
        return AbstractC2279u.I0(listJ, abstractC5382f.k(listJ));
    }

    private final List k(List list) {
        Collection collectionM;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionK = this.f51789b.l().k();
        AbstractC5504s.g(collectionK, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionK.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList2, InterfaceC5390n.a.a(((S) it.next()).o(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC7224b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            Xe.f name = ((InterfaceC7224b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            AbstractC5504s.g(key, "component1(...)");
            Xe.f fVar = (Xe.f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC7224b) obj3) instanceof InterfaceC7247z);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                bf.o oVar = bf.o.f33312f;
                if (zBooleanValue) {
                    collectionM = new ArrayList();
                    for (Object obj4 : list) {
                        if (AbstractC5504s.c(((InterfaceC7247z) obj4).getName(), fVar)) {
                            collectionM.add(obj4);
                        }
                    }
                } else {
                    collectionM = AbstractC2279u.m();
                }
                oVar.v(fVar, list3, collectionM, this.f51789b, new a(arrayList, this));
            }
        }
        return Af.a.c(arrayList);
    }

    private final List l() {
        return (List) AbstractC6048m.a(this.f51790c, this, f51788d[0]);
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        List listL = l();
        if (listL.isEmpty()) {
            return AbstractC2279u.m();
        }
        Af.j jVar = new Af.j();
        for (Object obj : listL) {
            if ((obj instanceof Z) && AbstractC5504s.c(((Z) obj).getName(), name)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        List listL = l();
        if (listL.isEmpty()) {
            return AbstractC2279u.m();
        }
        Af.j jVar = new Af.j();
        for (Object obj : listL) {
            if ((obj instanceof g0) && AbstractC5504s.c(((g0) obj).getName(), name)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return !kindFilter.a(C5380d.f51772p.m()) ? AbstractC2279u.m() : l();
    }

    protected abstract List j();

    protected final InterfaceC7227e m() {
        return this.f51789b;
    }
}
