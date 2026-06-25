package O5;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import z5.AbstractC7283a;
import z6.C7305t;
import z6.C7306u;
import z6.y;
import z6.z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a */
    private static final Class f13008a = d.class;

    /* JADX INFO: renamed from: b */
    private static g f13009b = null;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f13010c = false;

    public static C7305t a() {
        return b().j();
    }

    public static y b() {
        return y.l();
    }

    public static boolean c() {
        return f13010c;
    }

    public static void d(Context context) {
        e(context, null, null);
    }

    public static void e(Context context, C7306u c7306u, b bVar) {
        f(context, c7306u, bVar, true);
    }

    public static void f(Context context, C7306u c7306u, b bVar, boolean z10) {
        if (L6.b.d()) {
            L6.b.a("Fresco#initialize");
        }
        if (f13010c) {
            AbstractC7283a.E(f13008a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f13010c = true;
        }
        z.b(z10);
        if (!R7.a.c()) {
            if (L6.b.d()) {
                L6.b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    try {
                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                    } catch (ClassNotFoundException unused) {
                        R7.a.b(new R7.c());
                        if (L6.b.d()) {
                        }
                    } catch (NoSuchMethodException unused2) {
                        R7.a.b(new R7.c());
                        if (L6.b.d()) {
                        }
                    }
                } catch (IllegalAccessException unused3) {
                    R7.a.b(new R7.c());
                    if (L6.b.d()) {
                    }
                } catch (InvocationTargetException unused4) {
                    R7.a.b(new R7.c());
                    if (L6.b.d()) {
                    }
                }
                if (L6.b.d()) {
                    L6.b.b();
                }
            } catch (Throwable th2) {
                if (L6.b.d()) {
                    L6.b.b();
                }
                throw th2;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (c7306u == null) {
            y.s(applicationContext);
        } else {
            y.t(c7306u);
        }
        g(applicationContext, bVar);
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    private static void g(Context context, b bVar) {
        if (L6.b.d()) {
            L6.b.a("Fresco.initializeDrawee");
        }
        g gVar = new g(context, bVar);
        f13009b = gVar;
        Z5.e.g(gVar);
        if (L6.b.d()) {
            L6.b.b();
        }
    }

    public static f h() {
        return f13009b.get();
    }
}
