package jf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.S;
import ye.InterfaceC7223a;
import ye.InterfaceC7235m;
import ye.Z;
import ye.g0;
import zf.AbstractC7385a;

/* JADX INFO: renamed from: jf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5400x extends AbstractC5377a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f51818d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5387k f51820c;

    /* JADX INFO: renamed from: jf.x$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC5387k a(String message, Collection types) {
            AbstractC5504s.h(message, "message");
            AbstractC5504s.h(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((S) it.next()).o());
            }
            Af.j jVarB = AbstractC7385a.b(arrayList);
            InterfaceC5387k interfaceC5387kB = C5378b.f51753d.b(message, jVarB);
            return jVarB.size() <= 1 ? interfaceC5387kB : new C5400x(message, interfaceC5387kB, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C5400x(String str, InterfaceC5387k interfaceC5387k, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC5387k);
    }

    public static final InterfaceC5387k m(String str, Collection collection) {
        return f51818d.a(str, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7223a n(InterfaceC7223a selectMostSpecificInEachOverridableGroup) {
        AbstractC5504s.h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7223a o(g0 selectMostSpecificInEachOverridableGroup) {
        AbstractC5504s.h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7223a p(Z selectMostSpecificInEachOverridableGroup) {
        AbstractC5504s.h(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    @Override // jf.AbstractC5377a, jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return bf.r.b(super.a(name, location), C5398v.f51816a);
    }

    @Override // jf.AbstractC5377a, jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        return bf.r.b(super.c(name, location), C5397u.f51815a);
    }

    @Override // jf.AbstractC5377a, jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        Collection collectionG = super.g(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionG) {
            if (((InterfaceC7235m) obj) instanceof InterfaceC7223a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        AbstractC5504s.f(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return AbstractC2279u.I0(bf.r.b(list, C5399w.f51817a), list2);
    }

    @Override // jf.AbstractC5377a
    protected InterfaceC5387k i() {
        return this.f51820c;
    }

    private C5400x(String str, InterfaceC5387k interfaceC5387k) {
        this.f51819b = str;
        this.f51820c = interfaceC5387k;
    }
}
