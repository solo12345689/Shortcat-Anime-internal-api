package se;

import De.l;
import Ee.AbstractC1527f;
import Ee.C1528g;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import df.AbstractC4598g;
import df.AbstractC4603l;
import df.C4592a;
import df.C4593b;
import df.C4602k;
import df.C4610s;
import df.C4612u;
import df.C4617z;
import he.AbstractC4945a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5501o;
import kotlin.jvm.internal.AbstractC5504s;
import mf.C5683n;
import mf.C5685p;
import pe.EnumC6031u;
import pe.InterfaceC6013c;
import pe.InterfaceC6027q;
import xe.C7139c;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.InterfaceC7223a;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ze.InterfaceC7367a;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a */
    private static final Xe.c f59518a = new Xe.c("kotlin.jvm.JvmStatic");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59519a;

        static {
            int[] iArr = new int[ve.l.values().length];
            try {
                iArr[ve.l.f62119g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve.l.f62120h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve.l.f62121i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ve.l.f62122j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ve.l.f62123k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ve.l.f62124l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ve.l.f62125m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ve.l.f62126n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f59519a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object a(C4593b c4593b, ClassLoader classLoader) {
        qf.S sE;
        Class clsO;
        C4617z c4617z = c4593b instanceof C4617z ? (C4617z) c4593b : null;
        if (c4617z == null || (sE = c4617z.e()) == null) {
            return null;
        }
        Iterable iterable = (Iterable) c4593b.b();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(s((AbstractC4598g) it.next(), classLoader));
        }
        ve.l lVarO = ve.i.O(sE);
        int i10 = 0;
        switch (lVarO == null ? -1 : a.f59519a[lVarO.ordinal()]) {
            case -1:
                if (!ve.i.d0(sE)) {
                    throw new IllegalStateException(("Not an array type: " + sE).toString());
                }
                qf.S type = ((qf.B0) AbstractC2279u.M0(sE.L0())).getType();
                AbstractC5504s.g(type, "getType(...)");
                InterfaceC7230h interfaceC7230hP = type.N0().p();
                InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
                if (interfaceC7227e == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (ve.i.w0(type)) {
                    int size = ((List) c4593b.b()).size();
                    String[] strArr = new String[size];
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i10] = obj;
                        i10++;
                    }
                    return strArr;
                }
                if (ve.i.m0(interfaceC7227e)) {
                    int size2 = ((List) c4593b.b()).size();
                    Class[] clsArr = new Class[size2];
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        AbstractC5504s.f(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i10] = obj2;
                        i10++;
                    }
                    return clsArr;
                }
                Xe.b bVarN = ff.e.n(interfaceC7227e);
                if (bVarN == null || (clsO = o(classLoader, bVarN, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsO, ((List) c4593b.b()).size());
                AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i10 < size3) {
                    objArr[i10] = arrayList.get(i10);
                    i10++;
                }
                return objArr;
            case 0:
            default:
                throw new Td.r();
            case 1:
                int size4 = ((List) c4593b.b()).size();
                boolean[] zArr = new boolean[size4];
                while (i10 < size4) {
                    Object obj3 = arrayList.get(i10);
                    AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i10] = ((Boolean) obj3).booleanValue();
                    i10++;
                }
                return zArr;
            case 2:
                int size5 = ((List) c4593b.b()).size();
                char[] cArr = new char[size5];
                while (i10 < size5) {
                    Object obj4 = arrayList.get(i10);
                    AbstractC5504s.f(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i10] = ((Character) obj4).charValue();
                    i10++;
                }
                return cArr;
            case 3:
                int size6 = ((List) c4593b.b()).size();
                byte[] bArr = new byte[size6];
                while (i10 < size6) {
                    Object obj5 = arrayList.get(i10);
                    AbstractC5504s.f(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i10] = ((Byte) obj5).byteValue();
                    i10++;
                }
                return bArr;
            case 4:
                int size7 = ((List) c4593b.b()).size();
                short[] sArr = new short[size7];
                while (i10 < size7) {
                    Object obj6 = arrayList.get(i10);
                    AbstractC5504s.f(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i10] = ((Short) obj6).shortValue();
                    i10++;
                }
                return sArr;
            case 5:
                int size8 = ((List) c4593b.b()).size();
                int[] iArr = new int[size8];
                while (i10 < size8) {
                    Object obj7 = arrayList.get(i10);
                    AbstractC5504s.f(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i10] = ((Integer) obj7).intValue();
                    i10++;
                }
                return iArr;
            case 6:
                int size9 = ((List) c4593b.b()).size();
                float[] fArr = new float[size9];
                while (i10 < size9) {
                    Object obj8 = arrayList.get(i10);
                    AbstractC5504s.f(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i10] = ((Float) obj8).floatValue();
                    i10++;
                }
                return fArr;
            case 7:
                int size10 = ((List) c4593b.b()).size();
                long[] jArr = new long[size10];
                while (i10 < size10) {
                    Object obj9 = arrayList.get(i10);
                    AbstractC5504s.f(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i10] = ((Long) obj9).longValue();
                    i10++;
                }
                return jArr;
            case 8:
                int size11 = ((List) c4593b.b()).size();
                double[] dArr = new double[size11];
                while (i10 < size11) {
                    Object obj10 = arrayList.get(i10);
                    AbstractC5504s.f(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i10] = ((Double) obj10).doubleValue();
                    i10++;
                }
                return dArr;
        }
    }

    public static final AbstractC6453A b(Object obj) {
        AbstractC6453A abstractC6453A = obj instanceof AbstractC6453A ? (AbstractC6453A) obj : null;
        if (abstractC6453A != null) {
            return abstractC6453A;
        }
        C6494i0 c6494i0C = c(obj);
        return c6494i0C != null ? c6494i0C : d(obj);
    }

    public static final C6494i0 c(Object obj) {
        C6494i0 c6494i0 = obj instanceof C6494i0 ? (C6494i0) obj : null;
        if (c6494i0 != null) {
            return c6494i0;
        }
        AbstractC5501o abstractC5501o = obj instanceof AbstractC5501o ? (AbstractC5501o) obj : null;
        InterfaceC6013c interfaceC6013cCompute = abstractC5501o != null ? abstractC5501o.compute() : null;
        if (interfaceC6013cCompute instanceof C6494i0) {
            return (C6494i0) interfaceC6013cCompute;
        }
        return null;
    }

    public static final K0 d(Object obj) {
        K0 k02 = obj instanceof K0 ? (K0) obj : null;
        if (k02 != null) {
            return k02;
        }
        kotlin.jvm.internal.I i10 = obj instanceof kotlin.jvm.internal.I ? (kotlin.jvm.internal.I) obj : null;
        InterfaceC6013c interfaceC6013cCompute = i10 != null ? i10.compute() : null;
        if (interfaceC6013cCompute instanceof K0) {
            return (K0) interfaceC6013cCompute;
        }
        return null;
    }

    public static final List e(InterfaceC7367a interfaceC7367a) {
        Annotation annotationP;
        AbstractC5504s.h(interfaceC7367a, "<this>");
        InterfaceC7374h<InterfaceC7369c> annotations = interfaceC7367a.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7369c interfaceC7369c : annotations) {
            ye.h0 h0VarK = interfaceC7369c.k();
            if (h0VarK instanceof De.b) {
                annotationP = ((De.b) h0VarK).d();
            } else if (h0VarK instanceof l.a) {
                Ee.u uVarC = ((l.a) h0VarK).c();
                C1528g c1528g = uVarC instanceof C1528g ? (C1528g) uVarC : null;
                annotationP = c1528g != null ? c1528g.Q() : null;
            } else {
                annotationP = p(interfaceC7369c);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class f(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object g(Type type) {
        AbstractC5504s.h(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (AbstractC5504s.c(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (AbstractC5504s.c(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (AbstractC5504s.c(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (AbstractC5504s.c(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (AbstractC5504s.c(cls, Integer.TYPE)) {
            return 0;
        }
        if (AbstractC5504s.c(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (AbstractC5504s.c(cls, Long.TYPE)) {
            return 0L;
        }
        if (AbstractC5504s.c(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (AbstractC5504s.c(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC7223a h(Class moduleAnchor, Ze.p proto, Ue.d nameResolver, Ue.h typeTable, Ue.a metadataVersion, Function2 createDescriptor) {
        List listR0;
        AbstractC5504s.h(moduleAnchor, "moduleAnchor");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        AbstractC5504s.h(metadataVersion, "metadataVersion");
        AbstractC5504s.h(createDescriptor, "createDescriptor");
        De.k kVarA = Z0.a(moduleAnchor);
        if (proto instanceof Se.j) {
            listR0 = ((Se.j) proto).q0();
        } else {
            if (!(proto instanceof Se.o)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            listR0 = ((Se.o) proto).r0();
        }
        List list = listR0;
        C5683n c5683nA = kVarA.a();
        ye.H hB = kVarA.b();
        Ue.i iVarB = Ue.i.f19583b.b();
        AbstractC5504s.e(list);
        return (InterfaceC7223a) createDescriptor.invoke(new mf.K(new C5685p(c5683nA, nameResolver, hB, typeTable, iVarB, metadataVersion, null, null, list)), proto);
    }

    public static final ye.c0 i(InterfaceC7223a interfaceC7223a) {
        AbstractC5504s.h(interfaceC7223a, "<this>");
        if (interfaceC7223a.K() == null) {
            return null;
        }
        InterfaceC7235m interfaceC7235mB = interfaceC7223a.b();
        AbstractC5504s.f(interfaceC7235mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC7227e) interfaceC7235mB).J0();
    }

    public static final Xe.c j() {
        return f59518a;
    }

    public static final boolean k(InterfaceC6027q interfaceC6027q) {
        qf.S sA;
        AbstractC5504s.h(interfaceC6027q, "<this>");
        U0 u02 = interfaceC6027q instanceof U0 ? (U0) interfaceC6027q : null;
        return (u02 == null || (sA = u02.A()) == null || !bf.k.i(sA)) ? false : true;
    }

    public static final boolean l(InterfaceC6027q interfaceC6027q) {
        qf.S sA;
        AbstractC5504s.h(interfaceC6027q, "<this>");
        U0 u02 = interfaceC6027q instanceof U0 ? (U0) interfaceC6027q : null;
        return (u02 == null || (sA = u02.A()) == null || !bf.k.c(sA)) ? false : true;
    }

    private static final Class m(ClassLoader classLoader, Xe.b bVar, int i10) {
        Xe.b bVarN = C7139c.f64375a.n(bVar.a().i());
        if (bVarN != null) {
            bVar = bVarN;
        }
        return n(classLoader, bVar.f().a(), bVar.g().a(), i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class n(ClassLoader classLoader, String str, String str2, int i10) {
        if (AbstractC5504s.c(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + com.amazon.a.a.o.c.a.b.f34706a);
        }
        sb2.append(Df.r.J(str2, com.amazon.a.a.o.c.a.b.f34706a, '$', false, 4, null));
        if (i10 > 0) {
            sb2.append(";");
        }
        return De.e.a(classLoader, sb2.toString());
    }

    static /* synthetic */ Class o(ClassLoader classLoader, Xe.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m(classLoader, bVar, i10);
    }

    private static final Annotation p(InterfaceC7369c interfaceC7369c) {
        InterfaceC7227e interfaceC7227eL = ff.e.l(interfaceC7369c);
        Class clsQ = interfaceC7227eL != null ? q(interfaceC7227eL) : null;
        if (clsQ == null) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC7369c.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            Xe.f fVar = (Xe.f) entry.getKey();
            AbstractC4598g abstractC4598g = (AbstractC4598g) entry.getValue();
            ClassLoader classLoader = clsQ.getClassLoader();
            AbstractC5504s.g(classLoader, "getClassLoader(...)");
            Object objS = s(abstractC4598g, classLoader);
            Pair pairA = objS != null ? Td.z.a(fVar.b(), objS) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return (Annotation) te.f.h(clsQ, Ud.S.w(arrayList), null, 4, null);
    }

    public static final Class q(InterfaceC7227e interfaceC7227e) {
        AbstractC5504s.h(interfaceC7227e, "<this>");
        ye.h0 h0VarK = interfaceC7227e.k();
        AbstractC5504s.g(h0VarK, "getSource(...)");
        if (h0VarK instanceof Qe.z) {
            Qe.x xVarD = ((Qe.z) h0VarK).d();
            AbstractC5504s.f(xVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((De.f) xVarD).e();
        }
        if (h0VarK instanceof l.a) {
            Ee.u uVarC = ((l.a) h0VarK).c();
            AbstractC5504s.f(uVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((Ee.q) uVarC).s();
        }
        Xe.b bVarN = ff.e.n(interfaceC7227e);
        if (bVarN == null) {
            return null;
        }
        return m(AbstractC1527f.j(interfaceC7227e.getClass()), bVarN, 0);
    }

    public static final EnumC6031u r(AbstractC7242u abstractC7242u) {
        AbstractC5504s.h(abstractC7242u, "<this>");
        if (AbstractC5504s.c(abstractC7242u, AbstractC7241t.f65124e)) {
            return EnumC6031u.f56023a;
        }
        if (AbstractC5504s.c(abstractC7242u, AbstractC7241t.f65122c)) {
            return EnumC6031u.f56024b;
        }
        if (AbstractC5504s.c(abstractC7242u, AbstractC7241t.f65123d)) {
            return EnumC6031u.f56025c;
        }
        if (AbstractC5504s.c(abstractC7242u, AbstractC7241t.f65120a) || AbstractC5504s.c(abstractC7242u, AbstractC7241t.f65121b)) {
            return EnumC6031u.f56026d;
        }
        return null;
    }

    private static final Object s(AbstractC4598g abstractC4598g, ClassLoader classLoader) {
        if (abstractC4598g instanceof C4592a) {
            return p((InterfaceC7369c) ((C4592a) abstractC4598g).b());
        }
        if (abstractC4598g instanceof C4593b) {
            return a((C4593b) abstractC4598g, classLoader);
        }
        if (abstractC4598g instanceof C4602k) {
            Pair pair = (Pair) ((C4602k) abstractC4598g).b();
            Xe.b bVar = (Xe.b) pair.getFirst();
            Xe.f fVar = (Xe.f) pair.getSecond();
            Class clsO = o(classLoader, bVar, 0, 4, null);
            if (clsO != null) {
                return i1.a(clsO, fVar.b());
            }
            return null;
        }
        if (!(abstractC4598g instanceof C4610s)) {
            if ((abstractC4598g instanceof AbstractC4603l) || (abstractC4598g instanceof C4612u)) {
                return null;
            }
            return abstractC4598g.b();
        }
        C4610s.b bVar2 = (C4610s.b) ((C4610s) abstractC4598g).b();
        if (bVar2 instanceof C4610s.b.C0712b) {
            C4610s.b.C0712b c0712b = (C4610s.b.C0712b) bVar2;
            return m(classLoader, c0712b.b(), c0712b.a());
        }
        if (!(bVar2 instanceof C4610s.b.a)) {
            throw new Td.r();
        }
        InterfaceC7230h interfaceC7230hP = ((C4610s.b.a) bVar2).a().N0().p();
        InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
        if (interfaceC7227e != null) {
            return q(interfaceC7227e);
        }
        return null;
    }

    private static final List t(List list) throws IllegalAccessException, InvocationTargetException {
        List listE;
        if (list != null && list.isEmpty()) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC5504s.c(AbstractC4945a.b(AbstractC4945a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Annotation annotation = (Annotation) it2.next();
                    Class clsB = AbstractC4945a.b(AbstractC4945a.a(annotation));
                    if (!AbstractC5504s.c(clsB.getSimpleName(), "Container") || clsB.getAnnotation(kotlin.jvm.internal.Q.class) == null) {
                        listE = AbstractC2279u.e(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listE = AbstractC2273n.e((Annotation[]) objInvoke);
                    }
                    AbstractC2279u.D(arrayList, listE);
                }
                return arrayList;
            }
        }
        return list;
    }
}
