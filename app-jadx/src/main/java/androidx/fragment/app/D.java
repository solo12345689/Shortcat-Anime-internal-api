package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.K;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f29729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f29730b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K.l f29731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f29732b;

        public a(K.l callback, boolean z10) {
            AbstractC5504s.h(callback, "callback");
            this.f29731a = callback;
            this.f29732b = z10;
        }

        public final K.l a() {
            return this.f29731a;
        }

        public final boolean b() {
            return this.f29732b;
        }
    }

    public D(K fragmentManager) {
        AbstractC5504s.h(fragmentManager, "fragmentManager");
        this.f29729a = fragmentManager;
        this.f29730b = new CopyOnWriteArrayList();
    }

    public final void a(AbstractComponentCallbacksC2838q f10, Bundle bundle, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().a(f10, bundle, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().a(this.f29729a, f10, bundle);
            }
        }
    }

    public final void b(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        Context contextF = this.f29729a.D0().f();
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().b(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().b(this.f29729a, f10, contextF);
            }
        }
    }

    public final void c(AbstractComponentCallbacksC2838q f10, Bundle bundle, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().c(f10, bundle, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().c(this.f29729a, f10, bundle);
            }
        }
    }

    public final void d(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().d(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().d(this.f29729a, f10);
            }
        }
    }

    public final void e(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().e(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().e(this.f29729a, f10);
            }
        }
    }

    public final void f(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().f(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().f(this.f29729a, f10);
            }
        }
    }

    public final void g(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        Context contextF = this.f29729a.D0().f();
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().g(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().g(this.f29729a, f10, contextF);
            }
        }
    }

    public final void h(AbstractComponentCallbacksC2838q f10, Bundle bundle, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().h(f10, bundle, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().h(this.f29729a, f10, bundle);
            }
        }
    }

    public final void i(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().i(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().i(this.f29729a, f10);
            }
        }
    }

    public final void j(AbstractComponentCallbacksC2838q f10, Bundle outState, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractC5504s.h(outState, "outState");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().j(f10, outState, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().j(this.f29729a, f10, outState);
            }
        }
    }

    public final void k(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().k(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().k(this.f29729a, f10);
            }
        }
    }

    public final void l(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().l(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().l(this.f29729a, f10);
            }
        }
    }

    public final void m(AbstractComponentCallbacksC2838q f10, View v10, Bundle bundle, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractC5504s.h(v10, "v");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().m(f10, v10, bundle, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().m(this.f29729a, f10, v10, bundle);
            }
        }
    }

    public final void n(AbstractComponentCallbacksC2838q f10, boolean z10) {
        AbstractC5504s.h(f10, "f");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qG0 = this.f29729a.G0();
        if (abstractComponentCallbacksC2838qG0 != null) {
            K parentFragmentManager = abstractComponentCallbacksC2838qG0.getParentFragmentManager();
            AbstractC5504s.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.F0().n(f10, true);
        }
        for (a aVar : this.f29730b) {
            if (!z10 || aVar.b()) {
                aVar.a().n(this.f29729a, f10);
            }
        }
    }

    public final void o(K.l cb2, boolean z10) {
        AbstractC5504s.h(cb2, "cb");
        this.f29730b.add(new a(cb2, z10));
    }
}
