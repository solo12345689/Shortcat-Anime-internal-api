package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.C2865t;
import androidx.lifecycle.InterfaceC2854h;
import androidx.lifecycle.W;
import m2.AbstractC5628a;
import m2.C5629b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class Y implements InterfaceC2854h, P3.i, androidx.lifecycle.Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractComponentCallbacksC2838q f29912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.X f29913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f29914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private W.c f29915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2865t f29916e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private P3.h f29917f = null;

    Y(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, androidx.lifecycle.X x10, Runnable runnable) {
        this.f29912a = abstractComponentCallbacksC2838q;
        this.f29913b = x10;
        this.f29914c = runnable;
    }

    void a(AbstractC2857k.a aVar) {
        this.f29916e.g(aVar);
    }

    void b() {
        if (this.f29916e == null) {
            this.f29916e = new C2865t(this);
            P3.h hVarA = P3.h.a(this);
            this.f29917f = hVarA;
            hVarA.c();
            this.f29914c.run();
        }
    }

    boolean c() {
        return this.f29916e != null;
    }

    void d(Bundle bundle) {
        this.f29917f.d(bundle);
    }

    void e(Bundle bundle) {
        this.f29917f.e(bundle);
    }

    void f(AbstractC2857k.b bVar) {
        this.f29916e.l(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC2854h
    public AbstractC5628a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f29912a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C5629b c5629b = new C5629b();
        if (application != null) {
            c5629b.c(W.a.f30212e, application);
        }
        c5629b.c(androidx.lifecycle.L.f30172a, this.f29912a);
        c5629b.c(androidx.lifecycle.L.f30173b, this);
        if (this.f29912a.getArguments() != null) {
            c5629b.c(androidx.lifecycle.L.f30174c, this.f29912a.getArguments());
        }
        return c5629b;
    }

    @Override // androidx.lifecycle.InterfaceC2854h
    public W.c getDefaultViewModelProviderFactory() {
        Application application;
        W.c defaultViewModelProviderFactory = this.f29912a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f29912a.mDefaultFactory)) {
            this.f29915d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f29915d == null) {
            Context applicationContext = this.f29912a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29912a;
            this.f29915d = new androidx.lifecycle.P(application, abstractComponentCallbacksC2838q, abstractComponentCallbacksC2838q.getArguments());
        }
        return this.f29915d;
    }

    @Override // androidx.lifecycle.r
    public AbstractC2857k getLifecycle() {
        b();
        return this.f29916e;
    }

    @Override // P3.i
    public P3.f getSavedStateRegistry() {
        b();
        return this.f29917f.b();
    }

    @Override // androidx.lifecycle.Y
    public androidx.lifecycle.X getViewModelStore() {
        b();
        return this.f29913b;
    }
}
