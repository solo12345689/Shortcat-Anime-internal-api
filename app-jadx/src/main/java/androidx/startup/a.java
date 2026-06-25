package androidx.startup;

import V3.b;
import V3.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f32219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f32220e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f32223c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f32222b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f32221a = new HashMap();

    a(Context context) {
        this.f32223c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objB;
        if (X3.a.h()) {
            try {
                X3.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                X3.a.f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f32221a.containsKey(cls)) {
            objB = this.f32221a.get(cls);
        } else {
            set.add(cls);
            try {
                V3.a aVar = (V3.a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = aVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f32221a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = aVar.b(this.f32223c);
                set.remove(cls);
                this.f32221a.put(cls, objB);
            } catch (Throwable th3) {
                throw new c(th3);
            }
        }
        X3.a.f();
        return objB;
    }

    public static a e(Context context) {
        if (f32219d == null) {
            synchronized (f32220e) {
                try {
                    if (f32219d == null) {
                        f32219d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f32219d;
    }

    void a() {
        try {
            try {
                X3.a.c("Startup");
                b(this.f32223c.getPackageManager().getProviderInfo(new ComponentName(this.f32223c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } finally {
            X3.a.f();
        }
    }

    void b(Bundle bundle) {
        String string = this.f32223c.getString(b.f19734a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (V3.a.class.isAssignableFrom(cls)) {
                            this.f32222b.add(cls);
                        }
                    }
                }
                Iterator it = this.f32222b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f32220e) {
            try {
                objD = this.f32221a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f32222b.contains(cls);
    }
}
