package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.module.AppGlideModule;
import h5.InterfaceC4906c;
import h5.o;
import i5.C5038c;
import i5.InterfaceC5036a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: k */
    private static volatile b f35566k;

    /* JADX INFO: renamed from: l */
    private static volatile boolean f35567l;

    /* JADX INFO: renamed from: a */
    private final U4.k f35568a;

    /* JADX INFO: renamed from: b */
    private final V4.d f35569b;

    /* JADX INFO: renamed from: c */
    private final W4.h f35570c;

    /* JADX INFO: renamed from: d */
    private final d f35571d;

    /* JADX INFO: renamed from: e */
    private final V4.b f35572e;

    /* JADX INFO: renamed from: f */
    private final o f35573f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC4906c f35574g;

    /* JADX INFO: renamed from: i */
    private final a f35576i;

    /* JADX INFO: renamed from: h */
    private final List f35575h = new ArrayList();

    /* JADX INFO: renamed from: j */
    private f f35577j = f.NORMAL;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        k5.f build();
    }

    b(Context context, U4.k kVar, W4.h hVar, V4.d dVar, V4.b bVar, o oVar, InterfaceC4906c interfaceC4906c, int i10, a aVar, Map map, List list, List list2, AppGlideModule appGlideModule, e eVar) {
        this.f35568a = kVar;
        this.f35569b = dVar;
        this.f35572e = bVar;
        this.f35570c = hVar;
        this.f35573f = oVar;
        this.f35574g = interfaceC4906c;
        this.f35576i = aVar;
        this.f35571d = new d(context, bVar, i.d(this, list2, appGlideModule), new l5.b(), aVar, map, list, kVar, eVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f35567l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f35567l = true;
        try {
            n(context, generatedAppGlideModule);
        } finally {
            f35567l = false;
        }
    }

    public static b d(Context context) {
        if (f35566k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleE = e(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f35566k == null) {
                        a(context, generatedAppGlideModuleE);
                    }
                } finally {
                }
            }
        }
        return f35566k;
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            r(e10);
            return null;
        } catch (InstantiationException e11) {
            r(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            r(e12);
            return null;
        } catch (InvocationTargetException e13) {
            r(e13);
            return null;
        }
    }

    private static o m(Context context) {
        o5.k.f(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    private static void n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new c(), generatedAppGlideModule);
    }

    private static void o(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listB = new C5038c(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set setD = generatedAppGlideModule.d();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                InterfaceC5036a interfaceC5036a = (InterfaceC5036a) it.next();
                if (setD.contains(interfaceC5036a.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + interfaceC5036a);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((InterfaceC5036a) it2.next()).getClass());
            }
        }
        cVar.c(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = listB.iterator();
        while (it3.hasNext()) {
            ((InterfaceC5036a) it3.next()).a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b bVarA = cVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(bVarA);
        f35566k = bVarA;
    }

    private static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k u(Activity activity) {
        return v(activity.getApplicationContext());
    }

    public static k v(Context context) {
        return m(context).d(context);
    }

    public void b() {
        o5.l.a();
        this.f35568a.e();
    }

    public void c() {
        o5.l.b();
        this.f35570c.b();
        this.f35569b.b();
        this.f35572e.b();
    }

    public V4.b f() {
        return this.f35572e;
    }

    public V4.d g() {
        return this.f35569b;
    }

    InterfaceC4906c h() {
        return this.f35574g;
    }

    public Context i() {
        return this.f35571d.getBaseContext();
    }

    d j() {
        return this.f35571d;
    }

    public h k() {
        return this.f35571d.h();
    }

    public o l() {
        return this.f35573f;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        s(i10);
    }

    void p(k kVar) {
        synchronized (this.f35575h) {
            try {
                if (this.f35575h.contains(kVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f35575h.add(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean q(l5.d dVar) {
        synchronized (this.f35575h) {
            try {
                Iterator it = this.f35575h.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).B(dVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(int i10) {
        o5.l.b();
        synchronized (this.f35575h) {
            try {
                Iterator it = this.f35575h.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35570c.a(i10);
        this.f35569b.a(i10);
        this.f35572e.a(i10);
    }

    void t(k kVar) {
        synchronized (this.f35575h) {
            try {
                if (!this.f35575h.contains(kVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f35575h.remove(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
