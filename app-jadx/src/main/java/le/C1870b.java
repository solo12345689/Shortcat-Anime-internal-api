package Le;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: Le.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1870b implements InterfaceC1871c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Oe.g f11472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f11473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f11474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f11475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f11476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f11477f;

    public C1870b(Oe.g jClass, Function1 memberFilter) {
        AbstractC5504s.h(jClass, "jClass");
        AbstractC5504s.h(memberFilter, "memberFilter");
        this.f11472a = jClass;
        this.f11473b = memberFilter;
        C1869a c1869a = new C1869a(this);
        this.f11474c = c1869a;
        Cf.i iVarZ = Cf.l.z(AbstractC2279u.c0(jClass.B()), c1869a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : iVarZ) {
            Xe.f name = ((Oe.r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f11475d = linkedHashMap;
        Cf.i iVarZ2 = Cf.l.z(AbstractC2279u.c0(this.f11472a.x()), this.f11473b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : iVarZ2) {
            linkedHashMap2.put(((Oe.n) obj2).getName(), obj2);
        }
        this.f11476e = linkedHashMap2;
        Collection collectionM = this.f11472a.m();
        Function1 function1 = this.f11473b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionM) {
            if (((Boolean) function1.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((Oe.w) obj4).getName(), obj4);
        }
        this.f11477f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(C1870b c1870b, Oe.r m10) {
        AbstractC5504s.h(m10, "m");
        return ((Boolean) c1870b.f11473b.invoke(m10)).booleanValue() && !Oe.p.c(m10);
    }

    @Override // Le.InterfaceC1871c
    public Set a() {
        Cf.i iVarZ = Cf.l.z(AbstractC2279u.c0(this.f11472a.B()), this.f11474c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iVarZ.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Oe.r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Le.InterfaceC1871c
    public Oe.w b(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return (Oe.w) this.f11477f.get(name);
    }

    @Override // Le.InterfaceC1871c
    public Collection c(Xe.f name) {
        AbstractC5504s.h(name, "name");
        List list = (List) this.f11475d.get(name);
        return list != null ? list : AbstractC2279u.m();
    }

    @Override // Le.InterfaceC1871c
    public Set d() {
        return this.f11477f.keySet();
    }

    @Override // Le.InterfaceC1871c
    public Set e() {
        Cf.i iVarZ = Cf.l.z(AbstractC2279u.c0(this.f11472a.x()), this.f11473b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iVarZ.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Oe.n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // Le.InterfaceC1871c
    public Oe.n f(Xe.f name) {
        AbstractC5504s.h(name, "name");
        return (Oe.n) this.f11476e.get(name);
    }
}
