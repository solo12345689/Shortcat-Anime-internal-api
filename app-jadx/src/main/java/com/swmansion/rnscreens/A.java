package com.swmansion.rnscreens;

import Ud.AbstractC2279u;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C4546y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class A extends ViewGroup {

    /* JADX INFO: renamed from: a */
    protected final ArrayList f44330a;

    /* JADX INFO: renamed from: b */
    protected androidx.fragment.app.K f44331b;

    /* JADX INFO: renamed from: c */
    private boolean f44332c;

    /* JADX INFO: renamed from: d */
    private boolean f44333d;

    /* JADX INFO: renamed from: e */
    private boolean f44334e;

    /* JADX INFO: renamed from: f */
    private final Choreographer.FrameCallback f44335f;

    /* JADX INFO: renamed from: g */
    private G f44336g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Choreographer.FrameCallback {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            A.this.f44334e = false;
            A a10 = A.this;
            a10.measure(View.MeasureSpec.makeMeasureSpec(a10.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(A.this.getHeight(), 1073741824));
            A a11 = A.this;
            a11.layout(a11.getLeft(), A.this.getTop(), A.this.getRight(), A.this.getBottom());
        }
    }

    public A(Context context) {
        super(context);
        this.f44330a = new ArrayList();
        this.f44335f = new a();
    }

    private final void A() {
        boolean z10;
        Td.L l10;
        ViewParent parent = this;
        while (true) {
            z10 = parent instanceof com.facebook.react.W;
            if (z10 || (parent instanceof Va.a) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            AbstractC5504s.g(parent, "getParent(...)");
        }
        if (parent instanceof C4546y) {
            G fragmentWrapper = ((C4546y) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.f44336g = fragmentWrapper;
                fragmentWrapper.o(this);
                androidx.fragment.app.K childFragmentManager = fragmentWrapper.a().getChildFragmentManager();
                AbstractC5504s.g(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                l10 = Td.L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (!(parent instanceof Va.a)) {
            if (!z10) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
            }
            setFragmentManager(j((com.facebook.react.W) parent));
            return;
        }
        AbstractComponentCallbacksC2838q associatedFragment = ((Va.a) parent).getAssociatedFragment();
        if (associatedFragment != null) {
            androidx.fragment.app.K childFragmentManager2 = associatedFragment.getChildFragmentManager();
            AbstractC5504s.g(childFragmentManager2, "getChildFragmentManager(...)");
            setFragmentManager(childFragmentManager2);
        } else {
            throw new IllegalStateException(("[RNScreens] Parent " + parent + " returned nullish fragment").toString());
        }
    }

    private final void f(androidx.fragment.app.U u10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        u10.b(getId(), abstractComponentCallbacksC2838q);
    }

    private final void i(androidx.fragment.app.U u10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        u10.n(abstractComponentCallbacksC2838q);
    }

    private final androidx.fragment.app.K j(com.facebook.react.W w10) {
        boolean z10;
        Context context = w10.getContext();
        while (true) {
            z10 = context instanceof AbstractActivityC2842v;
            if (z10 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z10) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        AbstractActivityC2842v abstractActivityC2842v = (AbstractActivityC2842v) context;
        if (abstractActivityC2842v.C().C0().isEmpty()) {
            androidx.fragment.app.K kC = abstractActivityC2842v.C();
            AbstractC5504s.e(kC);
            return kC;
        }
        try {
            androidx.fragment.app.K childFragmentManager = androidx.fragment.app.K.o0(w10).getChildFragmentManager();
            AbstractC5504s.e(childFragmentManager);
            return childFragmentManager;
        } catch (IllegalStateException unused) {
            androidx.fragment.app.K kC2 = abstractActivityC2842v.C();
            AbstractC5504s.e(kC2);
            return kC2;
        }
    }

    private final C4546y.a k(G g10) {
        return g10.k().getActivityState();
    }

    private final void s() {
        this.f44333d = true;
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C3284b0) context).b().runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.z
            @Override // java.lang.Runnable
            public final void run() {
                A.t(this.f44821a);
            }
        });
    }

    private final void setFragmentManager(androidx.fragment.app.K k10) {
        this.f44331b = k10;
        w();
    }

    public static final void t(A a10) {
        a10.v();
    }

    private final void y(androidx.fragment.app.K k10) {
        androidx.fragment.app.U uS = k10.s();
        AbstractC5504s.g(uS, "beginTransaction(...)");
        boolean z10 = false;
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : k10.C0()) {
            if ((abstractComponentCallbacksC2838q instanceof F) && ((F) abstractComponentCallbacksC2838q).k().getContainer() == this) {
                uS.n(abstractComponentCallbacksC2838q);
                z10 = true;
            }
        }
        if (z10) {
            uS.k();
        }
    }

    protected G c(C4546y screen) {
        AbstractC5504s.h(screen, "screen");
        return new F(screen);
    }

    public final void d(C4546y screen, int i10) {
        AbstractC5504s.h(screen, "screen");
        G gC = c(screen);
        screen.setFragmentWrapper(gC);
        this.f44330a.add(i10, gC);
        screen.setContainer(this);
        s();
    }

    public final void e() {
        if (this.f44330a.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.U uG = g();
        C4546y topScreen = getTopScreen();
        AbstractC5504s.f(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        AbstractComponentCallbacksC2838q fragment = topScreen.getFragment();
        AbstractC5504s.f(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        i(uG, fragment);
        ArrayList arrayList = this.f44330a;
        f(uG, ((G) arrayList.get(arrayList.size() - 2)).a());
        AbstractComponentCallbacksC2838q fragment2 = topScreen.getFragment();
        AbstractC5504s.f(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        f(uG, fragment2);
        uG.k();
    }

    protected final androidx.fragment.app.U g() {
        androidx.fragment.app.K k10 = this.f44331b;
        if (k10 == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        androidx.fragment.app.U uV = k10.s().v(true);
        AbstractC5504s.g(uV, "setReorderingAllowed(...)");
        return uV;
    }

    public final int getScreenCount() {
        return this.f44330a.size();
    }

    public C4546y getTopScreen() {
        Object next;
        Iterator it = this.f44330a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (k((G) next) == C4546y.a.f44789c) {
                break;
            }
        }
        G g10 = (G) next;
        if (g10 != null) {
            return g10.k();
        }
        return null;
    }

    public final void h() {
        if (this.f44330a.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.U uG = g();
        ArrayList arrayList = this.f44330a;
        i(uG, ((G) arrayList.get(arrayList.size() - 2)).a());
        uG.k();
    }

    public final C4546y l(int i10) {
        return ((G) this.f44330a.get(i10)).k();
    }

    public final G m(int i10) {
        Object obj = this.f44330a.get(i10);
        AbstractC5504s.g(obj, "get(...)");
        return (G) obj;
    }

    public boolean n(G g10) {
        return AbstractC2279u.e0(this.f44330a, g10);
    }

    protected void o() {
        G fragmentWrapper;
        C4546y topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44332c = true;
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.fragment.app.K k10 = this.f44331b;
        if (k10 != null && !k10.P0()) {
            y(k10);
            k10.l0();
        }
        G g10 = this.f44336g;
        if (g10 != null) {
            g10.q(this);
        }
        this.f44336g = null;
        super.onDetachedFromWindow();
        this.f44332c = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(childCount);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(i10, i11);
        }
    }

    public final void p(C4546y screen) {
        AbstractC5504s.h(screen, "screen");
        if (getContext() instanceof ReactContext) {
            int iE = com.facebook.react.uimanager.f0.e(getContext());
            Context context = getContext();
            AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c((ReactContext) context, screen.getId());
            if (eventDispatcherC != null) {
                eventDispatcherC.d(new Ta.h(iE, screen.getId()));
            }
        }
    }

    public final void q() {
        C4546y topScreen = getTopScreen();
        AbstractC5504s.f(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int iE = com.facebook.react.uimanager.f0.e(getContext());
            Context context = getContext();
            AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c((ReactContext) context, topScreen.getId());
            if (eventDispatcherC != null) {
                eventDispatcherC.d(new Ta.h(iE, topScreen.getId()));
            }
        }
    }

    public final void r() {
        w();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        AbstractC5504s.h(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f44334e || this.f44335f == null) {
            return;
        }
        this.f44334e = true;
        com.facebook.react.modules.core.b.f36977f.a().k(b.a.f36986d, this.f44335f);
    }

    public void u() {
        androidx.fragment.app.U uG = g();
        androidx.fragment.app.K k10 = this.f44331b;
        if (k10 == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(k10.C0());
        Iterator it = this.f44330a.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC5504s.g(next, "next(...)");
            G g10 = (G) next;
            if (k(g10) == C4546y.a.f44787a && g10.a().isAdded()) {
                i(uG, g10.a());
            }
            hashSet.remove(g10.a());
        }
        boolean z10 = false;
        if (!hashSet.isEmpty()) {
            for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : (AbstractComponentCallbacksC2838q[]) hashSet.toArray(new AbstractComponentCallbacksC2838q[0])) {
                if ((abstractComponentCallbacksC2838q instanceof F) && ((F) abstractComponentCallbacksC2838q).k().getContainer() == null) {
                    i(uG, abstractComponentCallbacksC2838q);
                }
            }
        }
        boolean z11 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.f44330a.iterator();
        AbstractC5504s.g(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            AbstractC5504s.g(next2, "next(...)");
            G g11 = (G) next2;
            g11.k().setTransitioning(z11);
            if (k(g11) != C4546y.a.f44787a) {
                if (g11.a().isAdded()) {
                    if (z10) {
                        i(uG, g11.a());
                        arrayList.add(g11);
                    }
                } else if (z10) {
                    arrayList.add(g11);
                } else {
                    f(uG, g11.a());
                    z10 = true;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        AbstractC5504s.g(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next3 = it3.next();
            AbstractC5504s.g(next3, "next(...)");
            f(uG, ((G) next3).a());
        }
        uG.k();
    }

    public final void v() {
        androidx.fragment.app.K k10;
        if (this.f44333d && this.f44332c && (k10 = this.f44331b) != null) {
            if (k10 == null || !k10.P0()) {
                this.f44333d = false;
                u();
                o();
            }
        }
    }

    protected final void w() {
        this.f44333d = true;
        v();
    }

    public void x() {
        Iterator it = this.f44330a.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC5504s.g(next, "next(...)");
            ((G) next).k().setContainer(null);
        }
        this.f44330a.clear();
        s();
    }

    public void z(int i10) {
        ((G) this.f44330a.get(i10)).k().setContainer(null);
        this.f44330a.remove(i10);
        s();
    }
}
