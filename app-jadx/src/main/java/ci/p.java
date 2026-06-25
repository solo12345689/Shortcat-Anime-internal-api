package ci;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f33771d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a[] f33772e = new a[4];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f33773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33775c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f33776a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f33777b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map f33778c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final StringBuilder f33779d = new StringBuilder(128);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Class f33780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Class f33781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f33782g;

        a() {
        }

        private boolean b(Method method, Class cls) {
            this.f33779d.setLength(0);
            this.f33779d.append(method.getName());
            StringBuilder sb2 = this.f33779d;
            sb2.append('>');
            sb2.append(cls.getName());
            String string = this.f33779d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f33778c.put(string, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f33778c.put(string, cls2);
            return false;
        }

        boolean a(Method method, Class cls) {
            Object objPut = this.f33777b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f33777b.put(cls, this);
            }
            return b(method, cls);
        }

        void c(Class cls) {
            this.f33781f = cls;
            this.f33780e = cls;
            this.f33782g = false;
        }

        void d() {
            if (this.f33782g) {
                this.f33781f = null;
                return;
            }
            Class superclass = this.f33781f.getSuperclass();
            this.f33781f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f33781f = null;
            }
        }

        void e() {
            this.f33776a.clear();
            this.f33777b.clear();
            this.f33778c.clear();
            this.f33779d.setLength(0);
            this.f33780e = null;
            this.f33781f = null;
            this.f33782g = false;
        }
    }

    p(List list, boolean z10, boolean z11) {
        this.f33773a = list;
        this.f33774b = z10;
        this.f33775c = z11;
    }

    private List b(Class cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f33781f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private List c(Class cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f33781f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private void d(a aVar) {
        Method[] methods;
        try {
            try {
                methods = aVar.f33781f.getDeclaredMethods();
            } catch (LinkageError e10) {
                String str = "Could not inspect methods of " + aVar.f33781f.getName();
                throw new e(this.f33775c ? str + ". Please consider using EventBus annotation processor to avoid reflection." : str + ". Please make this class visible to EventBus annotation processor to avoid reflection.", e10);
            }
        } catch (Throwable unused) {
            methods = aVar.f33781f.getMethods();
            aVar.f33782g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    m mVar = (m) method.getAnnotation(m.class);
                    if (mVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f33776a.add(new o(method, cls, mVar.threadMode(), mVar.priority(), mVar.sticky()));
                        }
                    }
                } else if (this.f33774b && method.isAnnotationPresent(m.class)) {
                    throw new e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f33774b && method.isAnnotationPresent(m.class)) {
                throw new e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    private List e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f33776a);
        aVar.e();
        synchronized (f33772e) {
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                try {
                    a[] aVarArr = f33772e;
                    if (aVarArr[i10] == null) {
                        aVarArr[i10] = aVar;
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    private ei.a f(a aVar) {
        aVar.getClass();
        List list = this.f33773a;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return null;
    }

    private a g() {
        synchronized (f33772e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f33772e;
                    a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVarArr[i10] = null;
                        return aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new a();
        }
    }

    List a(Class cls) {
        Map map = f33771d;
        List list = (List) map.get(cls);
        if (list != null) {
            return list;
        }
        List listC = this.f33775c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
