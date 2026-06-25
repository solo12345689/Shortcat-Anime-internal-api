package rf;

import Ud.AbstractC2279u;
import be.AbstractC3048a;
import df.C4608q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.AbstractC6191h0;
import qf.C6214y;
import qf.L;
import qf.M0;
import qf.Q;
import qf.S;
import qf.r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f58805a = new z();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58806a = new c("START", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f58807b = new C0889a("ACCEPT_NULL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f58808c = new d("UNKNOWN", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f58809d = new b("NOT_NULL", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f58810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f58811f;

        /* JADX INFO: renamed from: rf.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0889a extends a {
            C0889a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // rf.z.a
            public a b(M0 nextType) {
                AbstractC5504s.h(nextType, "nextType");
                return c(nextType);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // rf.z.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public b b(M0 nextType) {
                AbstractC5504s.h(nextType, "nextType");
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // rf.z.a
            public a b(M0 nextType) {
                AbstractC5504s.h(nextType, "nextType");
                return c(nextType);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // rf.z.a
            public a b(M0 nextType) {
                AbstractC5504s.h(nextType, "nextType");
                a aVarC = c(nextType);
                return aVarC == a.f58807b ? this : aVarC;
            }
        }

        static {
            a[] aVarArrA = a();
            f58810e = aVarArrA;
            f58811f = AbstractC3048a.a(aVarArrA);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f58806a, f58807b, f58808c, f58809d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f58810e.clone();
        }

        public abstract a b(M0 m02);

        protected final a c(M0 m02) {
            AbstractC5504s.h(m02, "<this>");
            if (m02.O0()) {
                return f58807b;
            }
            if (m02 instanceof C6214y) {
                ((C6214y) m02).Z0();
            }
            return r.f58799a.a(m02) ? f58809d : f58808c;
        }

        private a(String str, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function2 {
        b(Object obj) {
            super(2, obj, z.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(S p02, S p12) {
            AbstractC5504s.h(p02, "p0");
            AbstractC5504s.h(p12, "p1");
            return Boolean.valueOf(((z) this.receiver).g(p02, p12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class c extends AbstractC5502p implements Function2 {
        c(Object obj) {
            super(2, obj, q.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(S p02, S p12) {
            AbstractC5504s.h(p02, "p0");
            AbstractC5504s.h(p12, "p1");
            return Boolean.valueOf(((q) this.receiver).c(p02, p12));
        }
    }

    private z() {
    }

    private final Collection c(Collection collection, Function2 function2) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC6183d0 abstractC6183d02 = (AbstractC6183d0) it2.next();
                    if (abstractC6183d02 != abstractC6183d0) {
                        AbstractC5504s.e(abstractC6183d02);
                        AbstractC5504s.e(abstractC6183d0);
                        if (((Boolean) function2.invoke(abstractC6183d02, abstractC6183d0)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final AbstractC6183d0 e(Set set) {
        if (set.size() == 1) {
            return (AbstractC6183d0) AbstractC2279u.L0(set);
        }
        new y(set);
        Set set2 = set;
        Collection collectionC = c(set2, new b(this));
        collectionC.isEmpty();
        AbstractC6183d0 abstractC6183d0B = C4608q.f45163f.b(collectionC);
        if (abstractC6183d0B != null) {
            return abstractC6183d0B;
        }
        Collection collectionC2 = c(collectionC, new c(p.f58793b.a()));
        collectionC2.isEmpty();
        return collectionC2.size() < 2 ? (AbstractC6183d0) AbstractC2279u.L0(collectionC2) : new Q(set2).f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + AbstractC2279u.w0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(S s10, S s11) {
        q qVarA = p.f58793b.a();
        return qVarA.a(s10, s11) && !qVarA.a(s11, s10);
    }

    public final AbstractC6183d0 d(List types) {
        AbstractC5504s.h(types, "types");
        types.size();
        ArrayList<AbstractC6183d0> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) it.next();
            if (abstractC6183d0.N0() instanceof Q) {
                Collection collectionK = abstractC6183d0.N0().k();
                AbstractC5504s.g(collectionK, "getSupertypes(...)");
                Collection<S> collection = collectionK;
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(collection, 10));
                for (S s10 : collection) {
                    AbstractC5504s.e(s10);
                    AbstractC6183d0 abstractC6183d0D = L.d(s10);
                    if (abstractC6183d0.O0()) {
                        abstractC6183d0D = abstractC6183d0D.R0(true);
                    }
                    arrayList2.add(abstractC6183d0D);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC6183d0);
            }
        }
        a aVarB = a.f58806a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarB = aVarB.b((M0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC6183d0 abstractC6183d0I : arrayList) {
            if (aVarB == a.f58809d) {
                if (abstractC6183d0I instanceof C6319i) {
                    abstractC6183d0I = AbstractC6191h0.k((C6319i) abstractC6183d0I);
                }
                abstractC6183d0I = AbstractC6191h0.i(abstractC6183d0I, false, 1, null);
            }
            linkedHashSet.add(abstractC6183d0I);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(types, 10));
        Iterator it3 = types.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AbstractC6183d0) it3.next()).M0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((r0) next).r((r0) it4.next());
        }
        return e(linkedHashSet).T0((r0) next);
    }
}
