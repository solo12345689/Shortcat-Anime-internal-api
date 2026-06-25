package com.amazon.a.a.o;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f34725a = new c("Reflection");

    public static Class<?> a(String str) {
        com.amazon.a.a.o.a.a.a((Object) str, "String className");
        try {
            return Thread.currentThread().getContextClassLoader().loadClass(str);
        } catch (ClassNotFoundException unused) {
            if (!c.f34699a) {
                return null;
            }
            f34725a.a("ClassNoFound: " + str);
            return null;
        }
    }

    public static boolean b(Method method) {
        com.amazon.a.a.o.a.a.a((Object) method, "Method m");
        return method.getReturnType().equals(Void.TYPE);
    }

    public static boolean c(Method method) {
        com.amazon.a.a.o.a.a.a((Object) method, "Method m");
        return (method.getModifiers() & 8) != 0;
    }

    public static boolean a(Method method) {
        com.amazon.a.a.o.a.a.a((Object) method, "Method m");
        return method.getParameterTypes().length > 0;
    }
}
