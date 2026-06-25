package te;

import Td.AbstractC2163n;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.F;
import he.AbstractC4945a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;
import se.Y0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f {
    public static final Object g(Class annotationClass, Map values, List methods) {
        AbstractC5504s.h(annotationClass, "annotationClass");
        AbstractC5504s.h(values, "values");
        AbstractC5504s.h(methods, "methods");
        Lazy lazyB = AbstractC2163n.b(new C6671b(values));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new d(annotationClass, values, AbstractC2163n.b(new C6672c(annotationClass, values)), lazyB, methods));
        AbstractC5504s.f(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean i(java.lang.Class r5, java.util.List r6, java.util.Map r7, java.lang.Object r8) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: te.f.i(java.lang.Class, java.util.List, java.util.Map, java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Map map) {
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return iHashCode;
    }

    private static final int k(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Class cls, Map map) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        F.t0(map.entrySet(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : e.f60925a);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        String string;
        AbstractC5504s.h(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            AbstractC5504s.g(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    private static final String n(Lazy lazy) {
        return (String) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Class cls, Map map, Lazy lazy, Lazy lazy2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(lazy2));
                }
            } else if (name.equals("toString")) {
                return n(lazy);
            }
        }
        if (AbstractC5504s.c(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, AbstractC2273n.H0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(AbstractC2273n.V0(objArr));
        sb2.append(')');
        throw new Y0(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void p(int i10, String str, Class cls) {
        String strU;
        InterfaceC6014d interfaceC6014dB = AbstractC5504s.c(cls, Class.class) ? O.b(InterfaceC6014d.class) : (cls.isArray() && AbstractC5504s.c(cls.getComponentType(), Class.class)) ? O.b(InterfaceC6014d[].class) : AbstractC4945a.e(cls);
        if (AbstractC5504s.c(interfaceC6014dB.u(), O.b(Object[].class).u())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(interfaceC6014dB.u());
            sb2.append('<');
            Class<?> componentType = AbstractC4945a.b(interfaceC6014dB).getComponentType();
            AbstractC5504s.g(componentType, "getComponentType(...)");
            sb2.append(AbstractC4945a.e(componentType).u());
            sb2.append('>');
            strU = sb2.toString();
        } else {
            strU = interfaceC6014dB.u();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof InterfaceC6014d) {
            obj = AbstractC4945a.b((InterfaceC6014d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof InterfaceC6014d[]) {
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                InterfaceC6014d[] interfaceC6014dArr = (InterfaceC6014d[]) obj;
                ArrayList arrayList = new ArrayList(interfaceC6014dArr.length);
                for (InterfaceC6014d interfaceC6014d : interfaceC6014dArr) {
                    arrayList.add(AbstractC4945a.b(interfaceC6014d));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
