package Ee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Ee.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1524c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1524c f5925a = new C1524c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f5926b;

    /* JADX INFO: renamed from: Ee.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f5927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f5928b;

        public a(Method method, Method method2) {
            this.f5927a = method;
            this.f5928b = method2;
        }

        public final Method a() {
            return this.f5928b;
        }

        public final Method b() {
            return this.f5927a;
        }
    }

    private C1524c() {
    }

    public final a a(Member member) {
        AbstractC5504s.h(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), AbstractC1527f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List b(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodA;
        AbstractC5504s.h(member, "member");
        a aVarA = f5926b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f5926b;
                if (aVarA == null) {
                    aVarA = f5925a.a(member);
                    f5926b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            AbstractC5504s.f(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
