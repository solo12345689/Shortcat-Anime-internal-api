package He;

import Ud.AbstractC2279u;
import Ud.a0;
import be.AbstractC3048a;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import gf.EnumC4882e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class U {

    /* JADX INFO: renamed from: a */
    public static final a f8509a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final List f8510b;

    /* JADX INFO: renamed from: c */
    private static final List f8511c;

    /* JADX INFO: renamed from: d */
    private static final List f8512d;

    /* JADX INFO: renamed from: e */
    private static final Map f8513e;

    /* JADX INFO: renamed from: f */
    private static final Map f8514f;

    /* JADX INFO: renamed from: g */
    private static final Set f8515g;

    /* JADX INFO: renamed from: h */
    private static final Set f8516h;

    /* JADX INFO: renamed from: i */
    private static final a.C0111a f8517i;

    /* JADX INFO: renamed from: j */
    private static final Map f8518j;

    /* JADX INFO: renamed from: k */
    private static final Map f8519k;

    /* JADX INFO: renamed from: l */
    private static final Set f8520l;

    /* JADX INFO: renamed from: m */
    private static final Set f8521m;

    /* JADX INFO: renamed from: n */
    private static final Map f8522n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: He.U$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0111a {

            /* JADX INFO: renamed from: a */
            private final String f8523a;

            /* JADX INFO: renamed from: b */
            private final Xe.f f8524b;

            /* JADX INFO: renamed from: c */
            private final String f8525c;

            /* JADX INFO: renamed from: d */
            private final String f8526d;

            /* JADX INFO: renamed from: e */
            private final String f8527e;

            public C0111a(String classInternalName, Xe.f name, String parameters, String returnType) {
                AbstractC5504s.h(classInternalName, "classInternalName");
                AbstractC5504s.h(name, "name");
                AbstractC5504s.h(parameters, "parameters");
                AbstractC5504s.h(returnType, "returnType");
                this.f8523a = classInternalName;
                this.f8524b = name;
                this.f8525c = parameters;
                this.f8526d = returnType;
                this.f8527e = Qe.F.f14805a.m(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ C0111a b(C0111a c0111a, String str, Xe.f fVar, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0111a.f8523a;
                }
                if ((i10 & 2) != 0) {
                    fVar = c0111a.f8524b;
                }
                if ((i10 & 4) != 0) {
                    str2 = c0111a.f8525c;
                }
                if ((i10 & 8) != 0) {
                    str3 = c0111a.f8526d;
                }
                return c0111a.a(str, fVar, str2, str3);
            }

            public final C0111a a(String classInternalName, Xe.f name, String parameters, String returnType) {
                AbstractC5504s.h(classInternalName, "classInternalName");
                AbstractC5504s.h(name, "name");
                AbstractC5504s.h(parameters, "parameters");
                AbstractC5504s.h(returnType, "returnType");
                return new C0111a(classInternalName, name, parameters, returnType);
            }

            public final Xe.f c() {
                return this.f8524b;
            }

            public final String d() {
                return this.f8527e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0111a)) {
                    return false;
                }
                C0111a c0111a = (C0111a) obj;
                return AbstractC5504s.c(this.f8523a, c0111a.f8523a) && AbstractC5504s.c(this.f8524b, c0111a.f8524b) && AbstractC5504s.c(this.f8525c, c0111a.f8525c) && AbstractC5504s.c(this.f8526d, c0111a.f8526d);
            }

            public int hashCode() {
                return (((((this.f8523a.hashCode() * 31) + this.f8524b.hashCode()) * 31) + this.f8525c.hashCode()) * 31) + this.f8526d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f8523a + ", name=" + this.f8524b + ", parameters=" + this.f8525c + ", returnType=" + this.f8526d + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0111a m(String str, String str2, String str3, String str4) {
            Xe.f fVarM = Xe.f.m(str2);
            AbstractC5504s.g(fVarM, "identifier(...)");
            return new C0111a(str, fVarM, str3, str4);
        }

        public final Xe.f b(Xe.f name) {
            AbstractC5504s.h(name, "name");
            return (Xe.f) f().get(name);
        }

        public final List c() {
            return U.f8511c;
        }

        public final Set d() {
            return U.f8515g;
        }

        public final Set e() {
            return U.f8516h;
        }

        public final Map f() {
            return U.f8522n;
        }

        public final Set g() {
            return U.f8521m;
        }

        public final C0111a h() {
            return U.f8517i;
        }

        public final Map i() {
            return U.f8514f;
        }

        public final Map j() {
            return U.f8519k;
        }

        public final boolean k(Xe.f fVar) {
            AbstractC5504s.h(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String builtinSignature) {
            AbstractC5504s.h(builtinSignature, "builtinSignature");
            return c().contains(builtinSignature) ? b.f8528c : ((c) Ud.S.j(i(), builtinSignature)) == c.f8535b ? b.f8530e : b.f8529d;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Enum {

        /* JADX INFO: renamed from: c */
        public static final b f8528c = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);

        /* JADX INFO: renamed from: d */
        public static final b f8529d = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);

        /* JADX INFO: renamed from: e */
        public static final b f8530e = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ b[] f8531f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ EnumEntries f8532g;

        /* JADX INFO: renamed from: a */
        private final String f8533a;

        /* JADX INFO: renamed from: b */
        private final boolean f8534b;

        static {
            b[] bVarArrA = a();
            f8531f = bVarArrA;
            f8532g = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10, String str2, boolean z10) {
            super(str, i10);
            this.f8533a = str2;
            this.f8534b = z10;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f8528c, f8529d, f8530e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f8531f.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends Enum {

        /* JADX INFO: renamed from: b */
        public static final c f8535b = new c("NULL", 0, null);

        /* JADX INFO: renamed from: c */
        public static final c f8536c = new c("INDEX", 1, -1);

        /* JADX INFO: renamed from: d */
        public static final c f8537d = new c("FALSE", 2, Boolean.FALSE);

        /* JADX INFO: renamed from: e */
        public static final c f8538e = new a("MAP_GET_OR_DEFAULT", 3);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ c[] f8539f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ EnumEntries f8540g;

        /* JADX INFO: renamed from: a */
        private final Object f8541a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends c {
            a(String str, int i10) {
                super(str, i10, null, null);
            }
        }

        static {
            c[] cVarArrA = a();
            f8539f = cVarArrA;
            f8540g = AbstractC3048a.a(cVarArrA);
        }

        public /* synthetic */ c(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f8535b, f8536c, f8537d, f8538e};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f8539f.clone();
        }

        private c(String str, int i10, Object obj) {
            super(str, i10);
            this.f8541a = obj;
        }
    }

    static {
        Set<String> setH = a0.h("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(setH, 10));
        for (String str : setH) {
            a aVar = f8509a;
            String strH = EnumC4882e.BOOLEAN.h();
            AbstractC5504s.g(strH, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", strH));
        }
        f8510b = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0111a) it.next()).d());
        }
        f8511c = arrayList2;
        List list = f8510b;
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C0111a) it2.next()).c().b());
        }
        f8512d = arrayList3;
        Qe.F f10 = Qe.F.f14805a;
        a aVar2 = f8509a;
        String strI = f10.i("Collection");
        EnumC4882e enumC4882e = EnumC4882e.BOOLEAN;
        String strH2 = enumC4882e.h();
        AbstractC5504s.g(strH2, "getDesc(...)");
        a.C0111a c0111aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", strH2);
        c cVar = c.f8537d;
        Pair pairA = Td.z.a(c0111aM, cVar);
        String strI2 = f10.i("Collection");
        String strH3 = enumC4882e.h();
        AbstractC5504s.g(strH3, "getDesc(...)");
        Pair pairA2 = Td.z.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", strH3), cVar);
        String strI3 = f10.i("Map");
        String strH4 = enumC4882e.h();
        AbstractC5504s.g(strH4, "getDesc(...)");
        Pair pairA3 = Td.z.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", strH4), cVar);
        String strI4 = f10.i("Map");
        String strH5 = enumC4882e.h();
        AbstractC5504s.g(strH5, "getDesc(...)");
        Pair pairA4 = Td.z.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", strH5), cVar);
        String strI5 = f10.i("Map");
        String strH6 = enumC4882e.h();
        AbstractC5504s.g(strH6, "getDesc(...)");
        Pair pairA5 = Td.z.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strH6), cVar);
        Pair pairA6 = Td.z.a(aVar2.m(f10.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f8538e);
        a.C0111a c0111aM2 = aVar2.m(f10.i("Map"), com.amazon.a.a.o.b.au, "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f8535b;
        Pair pairA7 = Td.z.a(c0111aM2, cVar2);
        Pair pairA8 = Td.z.a(aVar2.m(f10.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strI6 = f10.i("List");
        EnumC4882e enumC4882e2 = EnumC4882e.INT;
        String strH7 = enumC4882e2.h();
        AbstractC5504s.g(strH7, "getDesc(...)");
        a.C0111a c0111aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", strH7);
        c cVar3 = c.f8536c;
        Pair pairA9 = Td.z.a(c0111aM3, cVar3);
        String strI7 = f10.i("List");
        String strH8 = enumC4882e2.h();
        AbstractC5504s.g(strH8, "getDesc(...)");
        Map mapL = Ud.S.l(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, Td.z.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", strH8), cVar3));
        f8513e = mapL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ud.S.e(mapL.size()));
        for (Map.Entry entry : mapL.entrySet()) {
            linkedHashMap.put(((a.C0111a) entry.getKey()).d(), entry.getValue());
        }
        f8514f = linkedHashMap;
        Set setL = a0.l(f8513e.keySet(), f8510b);
        ArrayList arrayList4 = new ArrayList(AbstractC2279u.x(setL, 10));
        Iterator it3 = setL.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.C0111a) it3.next()).c());
        }
        f8515g = AbstractC2279u.f1(arrayList4);
        ArrayList arrayList5 = new ArrayList(AbstractC2279u.x(setL, 10));
        Iterator it4 = setL.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C0111a) it4.next()).d());
        }
        f8516h = AbstractC2279u.f1(arrayList5);
        a aVar3 = f8509a;
        EnumC4882e enumC4882e3 = EnumC4882e.INT;
        String strH9 = enumC4882e3.h();
        AbstractC5504s.g(strH9, "getDesc(...)");
        a.C0111a c0111aM4 = aVar3.m("java/util/List", "removeAt", strH9, "Ljava/lang/Object;");
        f8517i = c0111aM4;
        Qe.F f11 = Qe.F.f14805a;
        String strH10 = f11.h("Number");
        String strH11 = EnumC4882e.BYTE.h();
        AbstractC5504s.g(strH11, "getDesc(...)");
        Pair pairA10 = Td.z.a(aVar3.m(strH10, "toByte", "", strH11), Xe.f.m("byteValue"));
        String strH12 = f11.h("Number");
        String strH13 = EnumC4882e.SHORT.h();
        AbstractC5504s.g(strH13, "getDesc(...)");
        Pair pairA11 = Td.z.a(aVar3.m(strH12, "toShort", "", strH13), Xe.f.m("shortValue"));
        String strH14 = f11.h("Number");
        String strH15 = enumC4882e3.h();
        AbstractC5504s.g(strH15, "getDesc(...)");
        Pair pairA12 = Td.z.a(aVar3.m(strH14, "toInt", "", strH15), Xe.f.m("intValue"));
        String strH16 = f11.h("Number");
        String strH17 = EnumC4882e.LONG.h();
        AbstractC5504s.g(strH17, "getDesc(...)");
        Pair pairA13 = Td.z.a(aVar3.m(strH16, "toLong", "", strH17), Xe.f.m("longValue"));
        String strH18 = f11.h("Number");
        String strH19 = EnumC4882e.FLOAT.h();
        AbstractC5504s.g(strH19, "getDesc(...)");
        Pair pairA14 = Td.z.a(aVar3.m(strH18, "toFloat", "", strH19), Xe.f.m("floatValue"));
        String strH20 = f11.h("Number");
        String strH21 = EnumC4882e.DOUBLE.h();
        AbstractC5504s.g(strH21, "getDesc(...)");
        Pair pairA15 = Td.z.a(aVar3.m(strH20, "toDouble", "", strH21), Xe.f.m("doubleValue"));
        Pair pairA16 = Td.z.a(c0111aM4, Xe.f.m("remove"));
        String strH22 = f11.h("CharSequence");
        String strH23 = enumC4882e3.h();
        AbstractC5504s.g(strH23, "getDesc(...)");
        String strH24 = EnumC4882e.CHAR.h();
        AbstractC5504s.g(strH24, "getDesc(...)");
        Map mapL2 = Ud.S.l(pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, Td.z.a(aVar3.m(strH22, com.amazon.a.a.o.b.au, strH23, strH24), Xe.f.m("charAt")), Td.z.a(aVar3.m(f11.j("AtomicInteger"), "load", "", "I"), Xe.f.m(com.amazon.a.a.o.b.au)), Td.z.a(aVar3.m(f11.j("AtomicInteger"), ProductResponseJsonKeys.STORE, "I", "V"), Xe.f.m("set")), Td.z.a(aVar3.m(f11.j("AtomicInteger"), "exchange", "I", "I"), Xe.f.m("getAndSet")), Td.z.a(aVar3.m(f11.j("AtomicInteger"), "fetchAndAdd", "I", "I"), Xe.f.m("getAndAdd")), Td.z.a(aVar3.m(f11.j("AtomicInteger"), "addAndFetch", "I", "I"), Xe.f.m("addAndGet")), Td.z.a(aVar3.m(f11.j("AtomicLong"), "load", "", "J"), Xe.f.m(com.amazon.a.a.o.b.au)), Td.z.a(aVar3.m(f11.j("AtomicLong"), ProductResponseJsonKeys.STORE, "J", "V"), Xe.f.m("set")), Td.z.a(aVar3.m(f11.j("AtomicLong"), "exchange", "J", "J"), Xe.f.m("getAndSet")), Td.z.a(aVar3.m(f11.j("AtomicLong"), "fetchAndAdd", "J", "J"), Xe.f.m("getAndAdd")), Td.z.a(aVar3.m(f11.j("AtomicLong"), "addAndFetch", "J", "J"), Xe.f.m("addAndGet")), Td.z.a(aVar3.m(f11.j("AtomicBoolean"), "load", "", "Z"), Xe.f.m(com.amazon.a.a.o.b.au)), Td.z.a(aVar3.m(f11.j("AtomicBoolean"), ProductResponseJsonKeys.STORE, "Z", "V"), Xe.f.m("set")), Td.z.a(aVar3.m(f11.j("AtomicBoolean"), "exchange", "Z", "Z"), Xe.f.m("getAndSet")), Td.z.a(aVar3.m(f11.j("AtomicReference"), "load", "", "Ljava/lang/Object;"), Xe.f.m(com.amazon.a.a.o.b.au)), Td.z.a(aVar3.m(f11.j("AtomicReference"), ProductResponseJsonKeys.STORE, "Ljava/lang/Object;", "V"), Xe.f.m("set")), Td.z.a(aVar3.m(f11.j("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), Xe.f.m("getAndSet")), Td.z.a(aVar3.m(f11.j("AtomicIntegerArray"), "loadAt", "I", "I"), Xe.f.m(com.amazon.a.a.o.b.au)), Td.z.a(aVar3.m(f11.j("AtomicIntegerArray"), "storeAt", "II", "V"), Xe.f.m("set")), Td.z.a(aVar3.m(f11.j("AtomicIntegerArray"), "exchangeAt", "II", "I"), Xe.f.m("getAndSet")), Td.z.a(aVar3.m(f11.j("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), Xe.f.m("compareAndSet")), Td.z.a(aVar3.m(f11.j("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), Xe.f.m("getAndAdd")), Td.z.a(aVar3.m(f11.j("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), Xe.f.m("addAndGet")), Td.z.a(aVar3.m(f11.j("AtomicLongArray"), "loadAt", "I", "J"), Xe.f.m(com.amazon.a.a.o.b.au)), Td.z.a(aVar3.m(f11.j("AtomicLongArray"), "storeAt", "IJ", "V"), Xe.f.m("set")), Td.z.a(aVar3.m(f11.j("AtomicLongArray"), "exchangeAt", "IJ", "J"), Xe.f.m("getAndSet")), Td.z.a(aVar3.m(f11.j("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), Xe.f.m("compareAndSet")), Td.z.a(aVar3.m(f11.j("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), Xe.f.m("getAndAdd")), Td.z.a(aVar3.m(f11.j("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), Xe.f.m("addAndGet")), Td.z.a(aVar3.m(f11.j("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), Xe.f.m(com.amazon.a.a.o.b.au)), Td.z.a(aVar3.m(f11.j("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), Xe.f.m("set")), Td.z.a(aVar3.m(f11.j("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), Xe.f.m("getAndSet")), Td.z.a(aVar3.m(f11.j("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), Xe.f.m("compareAndSet")));
        f8518j = mapL2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Ud.S.e(mapL2.size()));
        for (Map.Entry entry2 : mapL2.entrySet()) {
            linkedHashMap2.put(((a.C0111a) entry2.getKey()).d(), entry2.getValue());
        }
        f8519k = linkedHashMap2;
        Map map = f8518j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0111a.b((a.C0111a) entry3.getKey(), null, (Xe.f) entry3.getValue(), null, null, 13, null).d());
        }
        f8520l = linkedHashSet;
        Set setKeySet = f8518j.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a.C0111a) it5.next()).c());
        }
        f8521m = hashSet;
        Set<Map.Entry> setEntrySet = f8518j.entrySet();
        ArrayList<Pair> arrayList6 = new ArrayList(AbstractC2279u.x(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList6.add(new Pair(((a.C0111a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(arrayList6, 10)), 16));
        for (Pair pair : arrayList6) {
            linkedHashMap3.put((Xe.f) pair.d(), (Xe.f) pair.c());
        }
        f8522n = linkedHashMap3;
    }
}
