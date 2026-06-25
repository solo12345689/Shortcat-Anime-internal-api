package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.f;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import t.C6552b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a */
    static c f24396a = new c(new d());

    /* JADX INFO: renamed from: b */
    private static int f24397b = -100;

    /* JADX INFO: renamed from: c */
    private static G1.i f24398c = null;

    /* JADX INFO: renamed from: d */
    private static G1.i f24399d = null;

    /* JADX INFO: renamed from: e */
    private static Boolean f24400e = null;

    /* JADX INFO: renamed from: f */
    private static boolean f24401f = false;

    /* JADX INFO: renamed from: g */
    private static final C6552b f24402g = new C6552b();

    /* JADX INFO: renamed from: h */
    private static final Object f24403h = new Object();

    /* JADX INFO: renamed from: i */
    private static final Object f24404i = new Object();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements Executor {

        /* JADX INFO: renamed from: a */
        private final Object f24405a = new Object();

        /* JADX INFO: renamed from: b */
        final Queue f24406b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        final Executor f24407c;

        /* JADX INFO: renamed from: d */
        Runnable f24408d;

        c(Executor executor) {
            this.f24407c = executor;
        }

        public static /* synthetic */ void b(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.c();
            }
        }

        protected void c() {
            synchronized (this.f24405a) {
                try {
                    Runnable runnable = (Runnable) this.f24406b.poll();
                    this.f24408d = runnable;
                    if (runnable != null) {
                        this.f24407c.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f24405a) {
                try {
                    this.f24406b.add(new Runnable() { // from class: androidx.appcompat.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.c.b(this.f24409a, runnable);
                        }
                    });
                    if (this.f24408d == null) {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    f() {
    }

    static void F(f fVar) {
        synchronized (f24403h) {
            G(fVar);
        }
    }

    private static void G(f fVar) {
        synchronized (f24403h) {
            try {
                Iterator it = f24402g.iterator();
                while (it.hasNext()) {
                    f fVar2 = (f) ((WeakReference) it.next()).get();
                    if (fVar2 == fVar || fVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void L(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f24397b != i10) {
            f24397b = i10;
            g();
        }
    }

    static void Q(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().f()) {
                    String strB = androidx.core.app.f.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void R(final Context context) {
        if (w(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f24401f) {
                    return;
                }
                f24396a.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.c(context);
                    }
                });
                return;
            }
            synchronized (f24404i) {
                try {
                    G1.i iVar = f24398c;
                    if (iVar == null) {
                        if (f24399d == null) {
                            f24399d = G1.i.b(androidx.core.app.f.b(context));
                        }
                        if (f24399d.f()) {
                        } else {
                            f24398c = f24399d;
                        }
                    } else if (!iVar.equals(f24399d)) {
                        G1.i iVar2 = f24398c;
                        f24399d = iVar2;
                        androidx.core.app.f.a(context, iVar2.h());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        Q(context);
        f24401f = true;
    }

    static void d(f fVar) {
        synchronized (f24403h) {
            G(fVar);
            f24402g.add(new WeakReference(fVar));
        }
    }

    private static void g() {
        synchronized (f24403h) {
            try {
                Iterator it = f24402g.iterator();
                while (it.hasNext()) {
                    f fVar = (f) ((WeakReference) it.next()).get();
                    if (fVar != null) {
                        fVar.f();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f j(Activity activity, androidx.appcompat.app.d dVar) {
        return new h(activity, dVar);
    }

    public static f k(Dialog dialog, androidx.appcompat.app.d dVar) {
        return new h(dialog, dVar);
    }

    public static G1.i m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objQ = q();
            if (objQ != null) {
                return G1.i.i(b.a(objQ));
            }
        } else {
            G1.i iVar = f24398c;
            if (iVar != null) {
                return iVar;
            }
        }
        return G1.i.e();
    }

    public static int o() {
        return f24397b;
    }

    static Object q() {
        Context contextN;
        Iterator it = f24402g.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null && (contextN = fVar.n()) != null) {
                return contextN.getSystemService("locale");
            }
        }
        return null;
    }

    static G1.i s() {
        return f24398c;
    }

    static boolean w(Context context) {
        if (f24400e == null) {
            try {
                Bundle bundle = t.a(context).metaData;
                if (bundle != null) {
                    f24400e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f24400e = Boolean.FALSE;
            }
        }
        return f24400e.booleanValue();
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i10);

    public abstract void I(int i10);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void N(Toolbar toolbar);

    public abstract void O(int i10);

    public abstract void P(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i10);

    public abstract Context n();

    public abstract int p();

    public abstract MenuInflater r();

    public abstract AbstractC2646a t();

    public abstract void u();

    public abstract void v();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();

    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void h(Context context) {
    }
}
