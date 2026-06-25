package se;

import Df.InterfaceC1279l;
import Ee.AbstractC1527f;
import Ud.AbstractC2279u;
import be.AbstractC3048a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC5494h;
import pe.InterfaceC6023m;
import se.a1;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;
import ye.InterfaceC7234l;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: se.d0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6484d0 implements InterfaceC5494h {

    /* JADX INFO: renamed from: a */
    public static final a f59475a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final Class f59476b = DefaultConstructorMarker.class;

    /* JADX INFO: renamed from: c */
    private static final Df.p f59477c = new Df.p("<v#(\\d+)>");

    /* JADX INFO: renamed from: se.d0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Df.p a() {
            return AbstractC6484d0.f59477c;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: se.d0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public abstract class b {

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ InterfaceC6023m[] f59478c = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(b.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: a */
        private final a1.a f59479a;

        public b() {
            this.f59479a = a1.b(new C6486e0(AbstractC6484d0.this));
        }

        public static final De.k c(AbstractC6484d0 abstractC6484d0) {
            return Z0.a(abstractC6484d0.j());
        }

        public final De.k b() {
            Object objB = this.f59479a.b(this, f59478c[0]);
            AbstractC5504s.g(objB, "getValue(...)");
            return (De.k) objB;
        }
    }

    /* JADX INFO: renamed from: se.d0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a */
        private final List f59481a;

        /* JADX INFO: renamed from: b */
        private final Class f59482b;

        public c(List parameters, Class cls) {
            AbstractC5504s.h(parameters, "parameters");
            this.f59481a = parameters;
            this.f59482b = cls;
        }

        public final List a() {
            return this.f59481a;
        }

        public final Class b() {
            return this.f59482b;
        }
    }

    /* JADX INFO: renamed from: se.d0$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class d extends Enum {

        /* JADX INFO: renamed from: a */
        public static final d f59483a = new d("DECLARED", 0);

        /* JADX INFO: renamed from: b */
        public static final d f59484b = new d("INHERITED", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ d[] f59485c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f59486d;

        static {
            d[] dVarArrA = a();
            f59485c = dVarArrA;
            f59486d = AbstractC3048a.a(dVarArrA);
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f59483a, f59484b};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f59485c.clone();
        }

        public final boolean b(InterfaceC7224b member) {
            AbstractC5504s.h(member, "member");
            return member.h().a() == (this == f59483a);
        }
    }

    /* JADX INFO: renamed from: se.d0$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends C6495j {
        e(AbstractC6484d0 abstractC6484d0) {
            super(abstractC6484d0);
        }

        @Override // Be.AbstractC1120o, ye.InterfaceC7237o
        /* JADX INFO: renamed from: r */
        public AbstractC6453A m(InterfaceC7234l descriptor, Td.L data) {
            AbstractC5504s.h(descriptor, "descriptor");
            AbstractC5504s.h(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    public static final CharSequence C(InterfaceC7247z descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return af.n.f23996k.M(descriptor) + " | " + f1.f59496a.g(descriptor).a();
    }

    public static final int F(AbstractC7242u abstractC7242u, AbstractC7242u abstractC7242u2) {
        Integer numD = AbstractC7241t.d(abstractC7242u, abstractC7242u2);
        if (numD != null) {
            return numD.intValue();
        }
        return 0;
    }

    public static final int G(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final CharSequence H(ye.Z descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        return af.n.f23996k.M(descriptor) + " | " + f1.f59496a.f(descriptor).a();
    }

    private final Method O(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        String str2;
        Class[] clsArr2;
        Class cls3;
        boolean z11;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodS = S(cls, str, clsArr, cls2);
        if (methodS != null) {
            return methodS;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodO = O(superclass, str, clsArr, cls2, z10);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
            if (methodO != null) {
                return methodO;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
        }
        Iterator itA = AbstractC5489c.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls4 = (Class) itA.next();
            AbstractC5504s.e(cls4);
            Method methodO2 = O(cls4, str2, clsArr2, cls3, z11);
            if (methodO2 != null) {
                return methodO2;
            }
            if (z11) {
                Class clsA = De.e.a(AbstractC1527f.j(cls4), cls4.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr2[0] = cls4;
                    Method methodS2 = S(clsA, str2, clsArr2, cls3);
                    if (methodS2 != null) {
                        return methodS2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c P(String str, boolean z10) {
        String str2;
        int iI0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            if (str.charAt(i10) == ')') {
                String str3 = str;
                return new c(arrayList, z10 ? Q(str3, i10 + 1, str3.length()) : null);
            }
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (Df.r.V("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i12 = i11 + 1;
                str2 = str;
                iI0 = i12;
            } else {
                if (cCharAt != 'L') {
                    throw new Y0("Unknown type prefix in the method signature: " + str);
                }
                str2 = str;
                iI0 = Df.r.i0(str2, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(Q(str2, i10, iI0));
            i10 = iI0;
            str = str2;
        }
    }

    private final Class Q(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderJ = AbstractC1527f.j(j());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            AbstractC5504s.g(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderJ.loadClass(Df.r.J(strSubstring, '/', com.amazon.a.a.o.c.a.b.f34706a, false, 4, null));
            AbstractC5504s.g(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            AbstractC5504s.g(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return j1.f(Q(str, i10 + 1, i11));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new Y0("Unknown type prefix in the method signature: " + str);
        }
    }

    private final Constructor R(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method S(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC5504s.c(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC5504s.g(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (AbstractC5504s.c(method.getName(), str) && AbstractC5504s.c(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    private final void x(List list, List list2, boolean z10) {
        if (AbstractC5504s.c(AbstractC2279u.A0(list2), f59476b)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class TYPE = Integer.TYPE;
            AbstractC5504s.g(TYPE, "TYPE");
            list.add(TYPE);
        }
        Class cls = z10 ? f59476b : Object.class;
        AbstractC5504s.e(cls);
        list.add(cls);
    }

    public final Method A(String name, String desc, boolean z10) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(desc, "desc");
        if (AbstractC5504s.c(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(j());
        }
        c cVarP = P(desc, true);
        x(arrayList, cVarP.a(), false);
        Class clsM = M();
        String str = name + "$default";
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsB = cVarP.b();
        AbstractC5504s.e(clsB);
        return O(clsM, str, clsArr, clsB, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ye.InterfaceC7247z B(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: se.AbstractC6484d0.B(java.lang.String, java.lang.String):ye.z");
    }

    public final Method D(String name, String desc) {
        Method methodO;
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(desc, "desc");
        if (AbstractC5504s.c(name, "<init>")) {
            return null;
        }
        c cVarP = P(desc, true);
        Class[] clsArr = (Class[]) cVarP.a().toArray(new Class[0]);
        Class clsB = cVarP.b();
        AbstractC5504s.e(clsB);
        Method methodO2 = O(M(), name, clsArr, clsB, false);
        if (methodO2 != null) {
            return methodO2;
        }
        if (!M().isInterface() || (methodO = O(Object.class, name, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodO;
    }

    public final ye.Z E(String name, String signature) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signature, "signature");
        InterfaceC1279l interfaceC1279lG = f59477c.g(signature);
        if (interfaceC1279lG != null) {
            String str = (String) interfaceC1279lG.a().a().b().get(1);
            ye.Z zK = K(Integer.parseInt(str));
            if (zK != null) {
                return zK;
            }
            throw new Y0("Local property #" + str + " not found in " + j());
        }
        Xe.f fVarM = Xe.f.m(name);
        AbstractC5504s.g(fVarM, "identifier(...)");
        Collection collectionN = N(fVarM);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionN) {
            if (AbstractC5504s.c(f1.f59496a.f((ye.Z) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Y0("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (ye.Z) AbstractC2279u.M0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC7242u visibility = ((ye.Z) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = Ud.S.h(linkedHashMap, new C6478a0(Z.f59464a)).values();
        AbstractC5504s.g(collectionValues, "<get-values>(...)");
        List list = (List) AbstractC2279u.x0(collectionValues);
        if (list.size() == 1) {
            AbstractC5504s.e(list);
            return (ye.Z) AbstractC2279u.m0(list);
        }
        Xe.f fVarM2 = Xe.f.m(name);
        AbstractC5504s.g(fVarM2, "identifier(...)");
        String strW0 = AbstractC2279u.w0(N(fVarM2), "\n", null, null, 0, null, C6480b0.f59470a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strW0.length() == 0 ? " no members found" : '\n' + strW0);
        throw new Y0(sb2.toString());
    }

    public abstract Collection I();

    public abstract Collection J(Xe.f fVar);

    public abstract ye.Z K(int i10);

    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.Collection L(jf.InterfaceC5387k r8, se.AbstractC6484d0.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.AbstractC5504s.h(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.AbstractC5504s.h(r9, r0)
            se.d0$e r0 = new se.d0$e
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = jf.InterfaceC5390n.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            ye.m r3 = (ye.InterfaceC7235m) r3
            boolean r4 = r3 instanceof ye.InterfaceC7224b
            if (r4 == 0) goto L4e
            r4 = r3
            ye.b r4 = (ye.InterfaceC7224b) r4
            ye.u r5 = r4.getVisibility()
            ye.u r6 = ye.AbstractC7241t.f65127h
            boolean r5 = kotlin.jvm.internal.AbstractC5504s.c(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.b(r4)
            if (r4 == 0) goto L4e
            Td.L r4 = Td.L.f17438a
            java.lang.Object r3 = r3.b0(r0, r4)
            se.A r3 = (se.AbstractC6453A) r3
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r3 == 0) goto L20
            r1.add(r3)
            goto L20
        L55:
            java.util.List r8 = Ud.AbstractC2279u.b1(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: se.AbstractC6484d0.L(jf.k, se.d0$d):java.util.Collection");
    }

    protected Class M() {
        Class clsK = AbstractC1527f.k(j());
        return clsK == null ? j() : clsK;
    }

    public abstract Collection N(Xe.f fVar);

    public final Constructor y(String desc) {
        AbstractC5504s.h(desc, "desc");
        return R(j(), P(desc, false).a());
    }

    public final Constructor z(String desc) {
        AbstractC5504s.h(desc, "desc");
        Class clsJ = j();
        ArrayList arrayList = new ArrayList();
        x(arrayList, P(desc, false).a(), true);
        Td.L l10 = Td.L.f17438a;
        return R(clsJ, arrayList);
    }
}
