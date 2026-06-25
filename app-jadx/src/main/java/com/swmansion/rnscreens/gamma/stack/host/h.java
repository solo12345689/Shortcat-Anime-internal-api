package com.swmansion.rnscreens.gamma.stack.host;

import Ud.AbstractC2279u;
import android.content.Context;
import android.util.Log;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.K;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends CoordinatorLayout implements K.o {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final a f44500E = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final List f44501A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final List f44502B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final List f44503C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final c f44504D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final WeakReference f44505y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private K f44506z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, WeakReference delegate) {
        super(context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(delegate, "delegate");
        this.f44505y = delegate;
        this.f44501A = new ArrayList();
        this.f44502B = new ArrayList();
        this.f44503C = new ArrayList();
        this.f44504D = new c();
        setId(Xa.g.f21728a.a());
    }

    private final List f0() {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f44502B) {
            Iterator it = this.f44501A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((com.swmansion.rnscreens.gamma.stack.screen.d) next).w() == eVar.a()) {
                    break;
                }
            }
            if (next == null) {
                throw new IllegalStateException("[RNScreens] Unable to find a fragment to pop");
            }
            com.swmansion.rnscreens.gamma.stack.screen.d dVar = (com.swmansion.rnscreens.gamma.stack.screen.d) next;
            if (this.f44501A.size() <= 1) {
                throw new IllegalStateException("[RNScreens] Attempt to pop last screen from the stack");
            }
            arrayList.add(new d(dVar));
            List list = this.f44501A;
            if (list.remove(AbstractC2279u.o(list)) != dVar) {
                throw new IllegalStateException("[RNScreens] Attempt to pop non-top screen");
            }
        }
        Iterator it2 = this.f44503C.iterator();
        while (it2.hasNext()) {
            com.swmansion.rnscreens.gamma.stack.screen.d dVarG0 = g0(((f) it2.next()).a());
            arrayList.add(new com.swmansion.rnscreens.gamma.stack.host.a(dVarG0, getId(), !this.f44501A.isEmpty(), false, 8, null));
            this.f44501A.add(dVarG0);
        }
        if (this.f44501A.isEmpty()) {
            throw new IllegalStateException("[RNScreens] Stack should never be empty after updates");
        }
        arrayList.add(new g((com.swmansion.rnscreens.gamma.stack.screen.d) AbstractC2279u.y0(this.f44501A)));
        this.f44502B.clear();
        this.f44503C.clear();
        return arrayList;
    }

    private final com.swmansion.rnscreens.gamma.stack.screen.d g0(com.swmansion.rnscreens.gamma.stack.screen.a aVar) {
        com.swmansion.rnscreens.gamma.stack.screen.d dVar = new com.swmansion.rnscreens.gamma.stack.screen.d(aVar);
        Log.d("StackContainer", "Created Fragment " + dVar + " for screen " + aVar.getScreenKey());
        return dVar;
    }

    private final boolean getHasPendingOperations() {
        return (this.f44503C.isEmpty() && this.f44502B.isEmpty()) ? false : true;
    }

    private final void h0() {
        Log.d("StackContainer", "StackContainer [" + getId() + "] MODEL BEGIN");
        Iterator it = this.f44501A.iterator();
        while (it.hasNext()) {
            Log.d("StackContainer", String.valueOf(((com.swmansion.rnscreens.gamma.stack.screen.d) it.next()).w().getScreenKey()));
        }
    }

    private final void k0(com.swmansion.rnscreens.gamma.stack.screen.d dVar) {
        Log.d("StackContainer", "StackContainer [" + getId() + "] natively removed fragment " + dVar.w().getScreenKey());
        if (!this.f44501A.remove(dVar)) {
            throw new IllegalArgumentException("[RNScreens] onNativeFragmentPop must be called with the fragment present in stack model");
        }
        if (this.f44501A.isEmpty()) {
            throw new IllegalStateException("[RNScreens] Stack model should not be empty after a native pop");
        }
        K kN0 = n0();
        if (kN0.H0() == dVar) {
            c.g(this.f44504D, kN0, AbstractC2279u.e(new g((com.swmansion.rnscreens.gamma.stack.screen.d) AbstractC2279u.y0(this.f44501A))), false, 4, null);
        }
    }

    private final void m0(K k10) {
        this.f44504D.f(k10, f0(), false);
        h0();
    }

    private final K n0() {
        K k10 = this.f44506z;
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
    }

    @Override // androidx.fragment.app.K.o
    public void b(AbstractComponentCallbacksC2838q fragment, boolean z10) {
        AbstractC5504s.h(fragment, "fragment");
        if (!(fragment instanceof com.swmansion.rnscreens.gamma.stack.screen.d)) {
            Log.w("StackContainer", "[RNScreens] Unexpected type of fragment: " + fragment.getClass().getSimpleName());
            return;
        }
        if (z10) {
            i iVar = (i) this.f44505y.get();
            if (iVar != null) {
                iVar.a(((com.swmansion.rnscreens.gamma.stack.screen.d) fragment).w());
            }
            if (this.f44501A.contains(fragment)) {
                k0((com.swmansion.rnscreens.gamma.stack.screen.d) fragment);
            }
        }
    }

    public final void i0(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC5504s.h(stackScreen, "stackScreen");
        this.f44502B.add(new e(stackScreen));
    }

    public final void j0(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC5504s.h(stackScreen, "stackScreen");
        this.f44503C.add(new f(stackScreen));
    }

    public final void l0() {
        if (getHasPendingOperations() && isAttachedToWindow()) {
            m0(n0());
        }
    }

    public final void o0() {
        K kA = Xa.b.f21725a.a(this);
        if (kA == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        kA.n(this);
        this.f44506z = kA;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        fb.e.f46994a.a("StackContainer", "StackContainer [" + getId() + "] attached to window");
        super.onAttachedToWindow();
        o0();
        l0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n0().p1(this);
        this.f44506z = null;
    }

    @Override // androidx.fragment.app.K.o
    public void onBackStackChanged() {
    }
}
