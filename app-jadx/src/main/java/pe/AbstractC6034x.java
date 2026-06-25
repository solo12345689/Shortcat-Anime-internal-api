package pe;

import Ud.AbstractC2279u;
import he.AbstractC4945a;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.InterfaceC5505t;

/* JADX INFO: renamed from: pe.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6034x {

    /* JADX INFO: renamed from: pe.x$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56034a;

        static {
            int[] iArr = new int[EnumC6030t.values().length];
            try {
                iArr[EnumC6030t.f56019b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6030t.f56018a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6030t.f56020c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f56034a = iArr;
        }
    }

    /* JADX INFO: renamed from: pe.x$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f56035a = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class p02) {
            AbstractC5504s.h(p02, "p0");
            return p02.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(InterfaceC6027q interfaceC6027q, boolean z10) {
        InterfaceC6016f interfaceC6016fC = interfaceC6027q.c();
        if (interfaceC6016fC instanceof InterfaceC6028r) {
            return new C6033w((InterfaceC6028r) interfaceC6016fC);
        }
        if (!(interfaceC6016fC instanceof InterfaceC6014d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + interfaceC6027q);
        }
        InterfaceC6014d interfaceC6014d = (InterfaceC6014d) interfaceC6016fC;
        Class clsC = z10 ? AbstractC4945a.c(interfaceC6014d) : AbstractC4945a.b(interfaceC6014d);
        List listE = interfaceC6027q.e();
        if (listE.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listE);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        C6029s c6029s = (C6029s) AbstractC2279u.O0(listE);
        if (c6029s == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC6027q);
        }
        EnumC6030t enumC6030tA = c6029s.a();
        InterfaceC6027q interfaceC6027qB = c6029s.b();
        int i10 = enumC6030tA == null ? -1 : a.f56034a[enumC6030tA.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsC;
        }
        if (i10 != 2 && i10 != 3) {
            throw new Td.r();
        }
        AbstractC5504s.e(interfaceC6027qB);
        Type typeD = d(interfaceC6027qB, false, 1, null);
        return typeD instanceof Class ? clsC : new C6011a(typeD);
    }

    static /* synthetic */ Type d(InterfaceC6027q interfaceC6027q, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(interfaceC6027q, z10);
    }

    private static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((C6029s) it.next()));
            }
            return new C6032v(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((C6029s) it2.next()));
            }
            return new C6032v(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((C6029s) it3.next()));
        }
        return new C6032v(cls, typeE, arrayList3);
    }

    public static final Type f(InterfaceC6027q interfaceC6027q) {
        Type typeF;
        AbstractC5504s.h(interfaceC6027q, "<this>");
        return (!(interfaceC6027q instanceof InterfaceC5505t) || (typeF = ((InterfaceC5505t) interfaceC6027q).f()) == null) ? d(interfaceC6027q, false, 1, null) : typeF;
    }

    private static final Type g(C6029s c6029s) {
        EnumC6030t enumC6030tD = c6029s.d();
        if (enumC6030tD == null) {
            return C6035y.f56036c.a();
        }
        InterfaceC6027q interfaceC6027qC = c6029s.c();
        AbstractC5504s.e(interfaceC6027qC);
        int i10 = a.f56034a[enumC6030tD.ordinal()];
        if (i10 == 1) {
            return new C6035y(null, c(interfaceC6027qC, true));
        }
        if (i10 == 2) {
            return c(interfaceC6027qC, true);
        }
        if (i10 == 3) {
            return new C6035y(c(interfaceC6027qC, true), null);
        }
        throw new Td.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            AbstractC5504s.g(name, "getName(...)");
            return name;
        }
        Cf.i iVarP = Cf.l.p(type, b.f56035a);
        return ((Class) Cf.l.J(iVarP)).getName() + Df.r.G("[]", Cf.l.w(iVarP));
    }
}
