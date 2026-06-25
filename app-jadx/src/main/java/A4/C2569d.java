package a4;

import Td.L;
import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.AbstractC6015e;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: a4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2569d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f23768a;

    /* JADX INFO: renamed from: a4.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC6014d f23769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function1 f23770b;

        public a(InterfaceC6014d clazz, Function1 consumer) {
            AbstractC5504s.h(clazz, "clazz");
            AbstractC5504s.h(consumer, "consumer");
            this.f23769a = clazz;
            this.f23770b = consumer;
        }

        private final boolean b(Method method, Object[] objArr) {
            return AbstractC5504s.c(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean c(Method method, Object[] objArr) {
            return AbstractC5504s.c(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean d(Method method, Object[] objArr) {
            return AbstractC5504s.c(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean e(Method method, Object[] objArr) {
            return AbstractC5504s.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        public final void a(Object parameter) {
            AbstractC5504s.h(parameter, "parameter");
            this.f23770b.invoke(parameter);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            AbstractC5504s.h(obj, "obj");
            AbstractC5504s.h(method, "method");
            if (b(method, objArr)) {
                a(AbstractC6015e.a(this.f23769a, objArr != null ? objArr[0] : null));
                return L.f17438a;
            }
            if (c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (d(method, objArr)) {
                return Integer.valueOf(this.f23770b.hashCode());
            }
            if (e(method, objArr)) {
                return this.f23770b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    /* JADX INFO: renamed from: a4.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void dispose();
    }

    /* JADX INFO: renamed from: a4.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f23771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f23772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f23773c;

        c(Method method, Object obj, Object obj2) {
            this.f23771a = method;
            this.f23772b = obj;
            this.f23773c = obj2;
        }

        @Override // a4.C2569d.b
        public void dispose() throws IllegalAccessException, InvocationTargetException {
            this.f23771a.invoke(this.f23772b, this.f23773c);
        }
    }

    public C2569d(ClassLoader loader) {
        AbstractC5504s.h(loader, "loader");
        this.f23768a = loader;
    }

    private final Object a(InterfaceC6014d interfaceC6014d, Function1 function1) {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f23768a, new Class[]{d()}, new a(interfaceC6014d, function1));
        AbstractC5504s.g(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return objNewProxyInstance;
    }

    private final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f23768a.loadClass("java.util.function.Consumer");
        AbstractC5504s.g(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }

    public final Class b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final b c(Object obj, InterfaceC6014d clazz, String addMethodName, String removeMethodName, Activity activity, Function1 consumer) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(obj, "obj");
        AbstractC5504s.h(clazz, "clazz");
        AbstractC5504s.h(addMethodName, "addMethodName");
        AbstractC5504s.h(removeMethodName, "removeMethodName");
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(consumer, "consumer");
        Object objA = a(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, d()).invoke(obj, activity, objA);
        return new c(obj.getClass().getMethod(removeMethodName, d()), obj, objA);
    }
}
