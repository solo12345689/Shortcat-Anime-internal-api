package androidx.lifecycle;

import Ud.AbstractC2279u;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2869x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2869x f30262a = new C2869x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f30263b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f30264c = new HashMap();

    private C2869x() {
    }

    private final InterfaceC2853g a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC5504s.e(objNewInstance);
            android.support.v4.media.session.b.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            AbstractC5504s.e(name);
            if (name.length() != 0) {
                AbstractC5504s.e(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                AbstractC5504s.g(canonicalName, "substring(...)");
            }
            AbstractC5504s.e(canonicalName);
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + com.amazon.a.a.o.c.a.b.f34706a + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            AbstractC5504s.f(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        AbstractC5504s.h(className, "className");
        return Df.r.K(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f30263b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class cls) {
        return cls != null && InterfaceC2863q.class.isAssignableFrom(cls);
    }

    public static final InterfaceC2861o f(Object object) {
        AbstractC5504s.h(object, "object");
        boolean z10 = object instanceof InterfaceC2861o;
        boolean z11 = object instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new C2851e((DefaultLifecycleObserver) object, (InterfaceC2861o) object);
        }
        if (z11) {
            return new C2851e((DefaultLifecycleObserver) object, null);
        }
        if (z10) {
            return (InterfaceC2861o) object;
        }
        Class<?> cls = object.getClass();
        C2869x c2869x = f30262a;
        if (c2869x.d(cls) != 2) {
            return new E(object);
        }
        Object obj = f30264c.get(cls);
        AbstractC5504s.e(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c2869x.a((Constructor) list.get(0), object);
            return new T(null);
        }
        int size = list.size();
        InterfaceC2853g[] interfaceC2853gArr = new InterfaceC2853g[size];
        for (int i10 = 0; i10 < size; i10++) {
            f30262a.a((Constructor) list.get(i10), object);
            interfaceC2853gArr[i10] = null;
        }
        return new C2850d(interfaceC2853gArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f30264c.put(cls, AbstractC2279u.e(constructorB));
            return 2;
        }
        if (C2849c.f30218c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            AbstractC5504s.e(superclass);
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f30264c.get(superclass);
            AbstractC5504s.e(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Iterator itA = AbstractC5489c.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls2 = (Class) itA.next();
            if (e(cls2)) {
                AbstractC5504s.e(cls2);
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f30264c.get(cls2);
                AbstractC5504s.e(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f30264c.put(cls, arrayList);
        return 2;
    }
}
