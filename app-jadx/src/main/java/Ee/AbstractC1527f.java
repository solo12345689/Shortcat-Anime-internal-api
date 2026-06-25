package Ee;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import Xe.b;
import com.adjust.sdk.Constants;
import he.AbstractC4945a;
import ie.InterfaceC5082a;
import ie.InterfaceC5083b;
import ie.InterfaceC5084c;
import ie.InterfaceC5085d;
import ie.InterfaceC5086e;
import ie.InterfaceC5087f;
import ie.InterfaceC5088g;
import ie.InterfaceC5089h;
import ie.InterfaceC5090i;
import ie.InterfaceC5091j;
import ie.InterfaceC5092k;
import ie.InterfaceC5093l;
import ie.InterfaceC5094m;
import ie.InterfaceC5095n;
import ie.InterfaceC5096o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: Ee.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1527f {

    /* JADX INFO: renamed from: a */
    private static final List f5931a;

    /* JADX INFO: renamed from: b */
    private static final Map f5932b;

    /* JADX INFO: renamed from: c */
    private static final Map f5933c;

    /* JADX INFO: renamed from: d */
    private static final Map f5934d;

    static {
        int i10 = 0;
        List<InterfaceC6014d> listP = AbstractC2279u.p(O.b(Boolean.TYPE), O.b(Byte.TYPE), O.b(Character.TYPE), O.b(Double.TYPE), O.b(Float.TYPE), O.b(Integer.TYPE), O.b(Long.TYPE), O.b(Short.TYPE));
        f5931a = listP;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listP, 10));
        for (InterfaceC6014d interfaceC6014d : listP) {
            arrayList.add(Td.z.a(AbstractC4945a.c(interfaceC6014d), AbstractC4945a.d(interfaceC6014d)));
        }
        f5932b = S.w(arrayList);
        List<InterfaceC6014d> list = f5931a;
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
        for (InterfaceC6014d interfaceC6014d2 : list) {
            arrayList2.add(Td.z.a(AbstractC4945a.d(interfaceC6014d2), AbstractC4945a.c(interfaceC6014d2)));
        }
        f5933c = S.w(arrayList2);
        List listP2 = AbstractC2279u.p(InterfaceC5082a.class, Function1.class, Function2.class, InterfaceC5096o.class, ie.p.class, ie.q.class, ie.r.class, ie.s.class, ie.t.class, ie.u.class, InterfaceC5083b.class, InterfaceC5084c.class, InterfaceC5085d.class, InterfaceC5086e.class, InterfaceC5087f.class, InterfaceC5088g.class, InterfaceC5089h.class, InterfaceC5090i.class, InterfaceC5091j.class, InterfaceC5092k.class, InterfaceC5093l.class, InterfaceC5094m.class, InterfaceC5095n.class);
        ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(listP2, 10));
        for (Object obj : listP2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            arrayList3.add(Td.z.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f5934d = S.w(arrayList3);
    }

    public static final ParameterizedType a(ParameterizedType it) {
        AbstractC5504s.h(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    public static final Cf.i b(ParameterizedType it) {
        AbstractC5504s.h(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        AbstractC5504s.g(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC2273n.M(actualTypeArguments);
    }

    public static final Xe.b e(Class cls) {
        Xe.b bVarE;
        AbstractC5504s.h(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            AbstractC5504s.g(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (bVarE = e(declaringClass)) != null) {
                    Xe.f fVarM = Xe.f.m(cls.getSimpleName());
                    AbstractC5504s.g(fVarM, "identifier(...)");
                    Xe.b bVarD = bVarE.d(fVarM);
                    if (bVarD != null) {
                        return bVarD;
                    }
                }
                b.a aVar = Xe.b.f21759d;
                String name = cls.getName();
                AbstractC5504s.g(name, "getName(...)");
                return aVar.c(new Xe.c(name));
            }
        }
        String name2 = cls.getName();
        AbstractC5504s.g(name2, "getName(...)");
        Xe.c cVar = new Xe.c(name2);
        return new Xe.b(cVar.d(), Xe.c.f21763c.a(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String f(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                AbstractC5504s.g(name, "getName(...)");
                return Df.r.J(name, com.amazon.a.a.o.c.a.b.f34706a, '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            AbstractC5504s.g(name2, "getName(...)");
            sb2.append(Df.r.J(name2, com.amazon.a.a.o.c.a.b.f34706a, '/', false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals(Constants.LONG)) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        return (Integer) f5934d.get(cls);
    }

    public static final List h(Type type) {
        AbstractC5504s.h(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return AbstractC2279u.m();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return Cf.l.T(Cf.l.E(Cf.l.p(type, C1525d.f5929a), C1526e.f5930a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC5504s.g(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC2273n.V0(actualTypeArguments);
    }

    public static final Class i(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        return (Class) f5932b.get(cls);
    }

    public static final ClassLoader j(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC5504s.g(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class k(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        return (Class) f5933c.get(cls);
    }

    public static final boolean l(Class cls) {
        AbstractC5504s.h(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
