package Xb;

import Xb.i;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21741a = a.f21742a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f21742a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object e(Method method, Class cls, int i10) {
            return method.invoke(null, cls, Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object f(Method method, Object obj, Class cls) {
            return method.invoke(obj, cls);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object g(Class cls) {
            throw new IllegalArgumentException("Cannot allocate " + cls);
        }

        public final i d(final Class clazz) {
            AbstractC5504s.h(clazz, "clazz");
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, Object.class);
                    AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                    final int iIntValue = ((Integer) objInvoke).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new i() { // from class: Xb.f
                        @Override // Xb.i
                        public final Object b() {
                            return i.a.e(declaredMethod2, clazz, iIntValue);
                        }
                    };
                } catch (Throwable unused) {
                    return new i() { // from class: Xb.h
                        @Override // Xb.i
                        public final Object b() {
                            return i.a.g(clazz);
                        }
                    };
                }
            } catch (Throwable unused2) {
                Class<?> cls = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                final Object obj = declaredField.get(null);
                final Method method = cls.getMethod("allocateInstance", Class.class);
                return new i() { // from class: Xb.g
                    @Override // Xb.i
                    public final Object b() {
                        return i.a.f(method, obj, clazz);
                    }
                };
            }
        }
    }

    Object b();
}
