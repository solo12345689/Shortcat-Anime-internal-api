package He;

import Pe.C2027l;
import Pe.EnumC2024i;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ve.o;

/* JADX INFO: renamed from: He.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1655b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f8543c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f8544d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f8545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f8546b;

    /* JADX INFO: renamed from: He.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1656c enumC1656c : EnumC1656c.values()) {
            String strB = enumC1656c.b();
            if (linkedHashMap.get(strB) == null) {
                linkedHashMap.put(strB, enumC1656c);
            }
        }
        f8544d = linkedHashMap;
    }

    public AbstractC1655b(D javaTypeEnhancementState) {
        AbstractC5504s.h(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f8545a = javaTypeEnhancementState;
        this.f8546b = new ConcurrentHashMap();
    }

    private final Set b(Set set) {
        return set.contains(EnumC1656c.f8550e) ? a0.l(a0.k(AbstractC2273n.i1(EnumC1656c.values()), EnumC1656c.f8551f), set) : set;
    }

    private final w e(Object obj) {
        C2027l c2027lI;
        w wVarU = u(obj);
        if (wVarU != null) {
            return wVarU;
        }
        Pair pairW = w(obj);
        if (pairW == null) {
            return null;
        }
        Object first = pairW.getFirst();
        Set set = (Set) pairW.getSecond();
        O oT = t(obj);
        if (oT == null) {
            oT = s(first);
        }
        if (oT.c() || (c2027lI = i(first, C1654a.f8542a)) == null) {
            return null;
        }
        return new w(C2027l.b(c2027lI, null, oT.h(), 1, null), set, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object extractNullability) {
        AbstractC5504s.h(extractNullability, "$this$extractNullability");
        return false;
    }

    private final C2027l i(Object obj, Function1 function1) {
        C2027l c2027lQ;
        C2027l c2027lQ2 = q(obj, ((Boolean) function1.invoke(obj)).booleanValue());
        if (c2027lQ2 != null) {
            return c2027lQ2;
        }
        Object objV = v(obj);
        if (objV == null) {
            return null;
        }
        O oS = s(obj);
        if (oS.c() || (c2027lQ = q(objV, ((Boolean) function1.invoke(objV)).booleanValue())) == null) {
            return null;
        }
        return C2027l.b(c2027lQ, null, oS.h(), 1, null);
    }

    private final Object j(Object obj, Xe.c cVar) {
        for (Object obj2 : m(obj)) {
            if (AbstractC5504s.c(k(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    private final boolean n(Object obj, Xe.c cVar) {
        Iterable iterableM = m(obj);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator it = iterableM.iterator();
        while (it.hasNext()) {
            if (AbstractC5504s.c(k(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = Pe.EnumC2026k.f13899b;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Pe.C2027l q(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            Xe.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            He.D r2 = r5.f8545a
            kotlin.jvm.functions.Function1 r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            He.O r2 = (He.O) r2
            boolean r3 = r2.c()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = He.J.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            Pe.k r6 = Pe.EnumC2026k.f13900c
            goto L8d
        L29:
            java.util.Set r3 = He.J.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            Pe.k r6 = Pe.EnumC2026k.f13899b
            goto L8d
        L36:
            java.util.Set r3 = He.J.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            Pe.k r6 = Pe.EnumC2026k.f13898a
            goto L8d
        L43:
            Xe.c r3 = He.J.c()
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = Ud.AbstractC2279u.n0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            Pe.k r6 = Pe.EnumC2026k.f13898a
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            Pe.k r6 = Pe.EnumC2026k.f13899b
            goto L8d
        L8b:
            Pe.k r6 = Pe.EnumC2026k.f13900c
        L8d:
            Pe.l r0 = new Pe.l
            boolean r1 = r2.h()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: He.AbstractC1655b.q(java.lang.Object, boolean):Pe.l");
    }

    private final O r(Object obj) {
        Xe.c cVarK = k(obj);
        return (cVarK == null || !x.b().containsKey(cVarK)) ? s(obj) : (O) this.f8545a.c().invoke(cVarK);
    }

    private final O s(Object obj) {
        O oT = t(obj);
        return oT != null ? oT : this.f8545a.d().c();
    }

    private final O t(Object obj) {
        Iterable iterableC;
        String str;
        O o10 = (O) this.f8545a.d().e().get(k(obj));
        if (o10 != null) {
            return o10;
        }
        Object objJ = j(obj, J.p());
        if (objJ == null || (iterableC = c(objJ, false)) == null || (str = (String) AbstractC2279u.n0(iterableC)) == null) {
            return null;
        }
        O oD = this.f8545a.d().d();
        if (oD != null) {
            return oD;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return O.f8501d;
                }
            } else if (str.equals("STRICT")) {
                return O.f8502e;
            }
        } else if (str.equals("IGNORE")) {
            return O.f8500c;
        }
        return null;
    }

    private final w u(Object obj) {
        w wVar;
        if (this.f8545a.b() || (wVar = (w) x.a().get(k(obj))) == null) {
            return null;
        }
        O oR = r(obj);
        if (oR == O.f8500c) {
            oR = null;
        }
        if (oR == null) {
            return null;
        }
        return w.b(wVar, C2027l.b(wVar.d(), null, oR.h(), 1, null), null, false, 6, null);
    }

    private final Pair w(Object obj) {
        Object objJ;
        Object next;
        if (this.f8545a.d().f() || (objJ = j(obj, J.g())) == null) {
            return null;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (v(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable iterableC = c(objJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterableC.iterator();
        while (it2.hasNext()) {
            EnumC1656c enumC1656c = (EnumC1656c) f8544d.get((String) it2.next());
            if (enumC1656c != null) {
                linkedHashSet.add(enumC1656c);
            }
        }
        return new Pair(next, b(linkedHashSet));
    }

    protected abstract Iterable c(Object obj, boolean z10);

    public final E d(E e10, Iterable annotations) {
        EnumMap enumMapB;
        AbstractC5504s.h(annotations, "annotations");
        if (!this.f8545a.b()) {
            ArrayList<w> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (it.hasNext()) {
                w wVarE = e(it.next());
                if (wVarE != null) {
                    arrayList.add(wVarE);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(EnumC1656c.class);
                for (w wVar : arrayList) {
                    for (EnumC1656c enumC1656c : wVar.e()) {
                        if (enumMap.containsKey(enumC1656c) && o()) {
                            w wVar2 = (w) enumMap.get(enumC1656c);
                            if (wVar2 != null) {
                                C2027l c2027lD = wVar2.d();
                                C2027l c2027lD2 = wVar.d();
                                if (!AbstractC5504s.c(c2027lD2, c2027lD) && (!c2027lD2.d() || c2027lD.d())) {
                                    wVar2 = (c2027lD2.d() || !c2027lD.d()) ? null : wVar;
                                }
                                enumMap.put(enumC1656c, wVar2);
                            }
                        } else {
                            enumMap.put(enumC1656c, wVar);
                        }
                    }
                }
                EnumMap enumMap2 = (e10 == null || (enumMapB = e10.b()) == null) ? new EnumMap(EnumC1656c.class) : new EnumMap(enumMapB);
                boolean z10 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    EnumC1656c enumC1656c2 = (EnumC1656c) entry.getKey();
                    w wVar3 = (w) entry.getValue();
                    if (wVar3 != null) {
                        enumMap2.put(enumC1656c2, wVar3);
                        z10 = true;
                    }
                }
                if (z10) {
                    return new E(enumMap2);
                }
            }
        }
        return e10;
    }

    public final EnumC2024i g(Iterable annotations) {
        EnumC2024i enumC2024i;
        AbstractC5504s.h(annotations, "annotations");
        Iterator it = annotations.iterator();
        EnumC2024i enumC2024i2 = null;
        while (it.hasNext()) {
            Xe.c cVarK = k(it.next());
            if (AbstractC2279u.e0(J.o(), cVarK)) {
                enumC2024i = EnumC2024i.f13891a;
            } else if (AbstractC2279u.e0(J.l(), cVarK)) {
                enumC2024i = EnumC2024i.f13892b;
            } else {
                continue;
            }
            if (enumC2024i2 != null && enumC2024i2 != enumC2024i) {
                return null;
            }
            enumC2024i2 = enumC2024i;
        }
        return enumC2024i2;
    }

    public final C2027l h(Iterable annotations, Function1 forceWarning) {
        AbstractC5504s.h(annotations, "annotations");
        AbstractC5504s.h(forceWarning, "forceWarning");
        Iterator it = annotations.iterator();
        C2027l c2027l = null;
        while (it.hasNext()) {
            C2027l c2027lI = i(it.next(), forceWarning);
            if (c2027l != null) {
                if (c2027lI != null && !AbstractC5504s.c(c2027lI, c2027l) && (!c2027lI.d() || c2027l.d())) {
                    if (c2027lI.d() || !c2027l.d()) {
                        return null;
                    }
                }
            }
            c2027l = c2027lI;
        }
        return c2027l;
    }

    protected abstract Xe.c k(Object obj);

    protected abstract Object l(Object obj);

    protected abstract Iterable m(Object obj);

    public abstract boolean o();

    public final boolean p(Object annotation) {
        AbstractC5504s.h(annotation, "annotation");
        Object objJ = j(annotation, o.a.f62197H);
        if (objJ == null) {
            return false;
        }
        Iterable iterableC = c(objJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            if (AbstractC5504s.c((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final Object v(Object annotation) {
        Object objV;
        AbstractC5504s.h(annotation, "annotation");
        if (this.f8545a.d().f()) {
            return null;
        }
        if (AbstractC2279u.e0(J.a(), k(annotation)) || n(annotation, J.f())) {
            return annotation;
        }
        if (!n(annotation, J.h())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f8546b;
        Object objL = l(annotation);
        Object obj = concurrentHashMap.get(objL);
        if (obj != null) {
            return obj;
        }
        Iterator it = m(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                objV = null;
                break;
            }
            objV = v(it.next());
            if (objV != null) {
                break;
            }
        }
        if (objV == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objL, objV);
        return objPutIfAbsent == null ? objV : objPutIfAbsent;
    }
}
