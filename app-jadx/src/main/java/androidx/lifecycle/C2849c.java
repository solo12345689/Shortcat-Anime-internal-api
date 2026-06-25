package androidx.lifecycle;

import androidx.lifecycle.AbstractC2857k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2849c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static C2849c f30218c = new C2849c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30219a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30220b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f30221a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f30222b;

        a(Map map) {
            this.f30222b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC2857k.a aVar = (AbstractC2857k.a) entry.getValue();
                List arrayList = (List) this.f30221a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f30221a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        private static void b(List list, r rVar, AbstractC2857k.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(rVar, aVar, obj);
                }
            }
        }

        void a(r rVar, AbstractC2857k.a aVar, Object obj) {
            b((List) this.f30221a.get(aVar), rVar, aVar, obj);
            b((List) this.f30221a.get(AbstractC2857k.a.ON_ANY), rVar, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f30223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f30224b;

        b(int i10, Method method) {
            this.f30223a = i10;
            this.f30224b = method;
            method.setAccessible(true);
        }

        void a(r rVar, AbstractC2857k.a aVar, Object obj) {
            try {
                int i10 = this.f30223a;
                if (i10 == 0) {
                    this.f30224b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f30224b.invoke(obj, rVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f30224b.invoke(obj, rVar, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30223a == bVar.f30223a && this.f30224b.getName().equals(bVar.f30224b.getName());
        }

        public int hashCode() {
            return (this.f30223a * 31) + this.f30224b.getName().hashCode();
        }
    }

    C2849c() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f30222b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f30222b.entrySet()) {
                e(map, (b) entry.getKey(), (AbstractC2857k.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            C c10 = (C) method.getAnnotation(C.class);
            if (c10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC2857k.a aVarValue = c10.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC2857k.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC2857k.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f30219a.put(cls, aVar);
        this.f30220b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, b bVar, AbstractC2857k.a aVar, Class cls) {
        AbstractC2857k.a aVar2 = (AbstractC2857k.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f30224b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f30219a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f30220b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((C) method.getAnnotation(C.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f30220b.put(cls, Boolean.FALSE);
        return false;
    }
}
