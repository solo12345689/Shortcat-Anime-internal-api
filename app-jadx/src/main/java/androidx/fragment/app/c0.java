package androidx.fragment.app;

import Ud.AbstractC2279u;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C2632b;
import e2.AbstractC4641b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f29944g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f29945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f29946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f29947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29950f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c0 a(ViewGroup container, K fragmentManager) {
            AbstractC5504s.h(container, "container");
            AbstractC5504s.h(fragmentManager, "fragmentManager");
            d0 d0VarI0 = fragmentManager.I0();
            AbstractC5504s.g(d0VarI0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, d0VarI0);
        }

        public final c0 b(ViewGroup container, d0 factory) {
            AbstractC5504s.h(container, "container");
            AbstractC5504s.h(factory, "factory");
            Object tag = container.getTag(AbstractC4641b.f45786b);
            if (tag instanceof c0) {
                return (c0) tag;
            }
            c0 c0VarA = factory.a(container);
            AbstractC5504s.g(c0VarA, "factory.createController(container)");
            container.setTag(AbstractC4641b.f45786b, c0VarA);
            return c0VarA;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29953c;

        public final void a(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            if (!this.f29953c) {
                c(container);
            }
            this.f29953c = true;
        }

        public boolean b() {
            return this.f29951a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(C2632b backEvent, ViewGroup container) {
            AbstractC5504s.h(backEvent, "backEvent");
            AbstractC5504s.h(container, "container");
        }

        public void f(ViewGroup container) {
            AbstractC5504s.h(container, "container");
        }

        public final void g(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            if (!this.f29952b) {
                f(container);
            }
            this.f29952b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final S f29954l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b finalState, d.a lifecycleImpact, S fragmentStateManager) {
            AbstractC5504s.h(finalState, "finalState");
            AbstractC5504s.h(lifecycleImpact, "lifecycleImpact");
            AbstractC5504s.h(fragmentStateManager, "fragmentStateManager");
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = fragmentStateManager.k();
            AbstractC5504s.g(abstractComponentCallbacksC2838qK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, abstractComponentCallbacksC2838qK);
            this.f29954l = fragmentStateManager;
        }

        @Override // androidx.fragment.app.c0.d
        public void d() {
            super.d();
            h().mTransitioning = false;
            this.f29954l.m();
        }

        @Override // androidx.fragment.app.c0.d
        public void p() {
            if (n()) {
                return;
            }
            super.p();
            if (i() != d.a.ADDING) {
                if (i() == d.a.REMOVING) {
                    AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = this.f29954l.k();
                    AbstractC5504s.g(abstractComponentCallbacksC2838qK, "fragmentStateManager.fragment");
                    View viewRequireView = abstractComponentCallbacksC2838qK.requireView();
                    AbstractC5504s.g(viewRequireView, "fragment.requireView()");
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + abstractComponentCallbacksC2838qK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK2 = this.f29954l.k();
            AbstractC5504s.g(abstractComponentCallbacksC2838qK2, "fragmentStateManager.fragment");
            View viewFindFocus = abstractComponentCallbacksC2838qK2.mView.findFocus();
            if (viewFindFocus != null) {
                abstractComponentCallbacksC2838qK2.setFocusedView(viewFindFocus);
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC2838qK2);
                }
            }
            View viewRequireView2 = h().requireView();
            AbstractC5504s.g(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Adding fragment " + abstractComponentCallbacksC2838qK2 + " view " + viewRequireView2 + " to container in onStart");
                }
                this.f29954l.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Making view " + viewRequireView2 + " INVISIBLE in onStart");
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(abstractComponentCallbacksC2838qK2.getPostOnViewCreatedAlpha());
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + abstractComponentCallbacksC2838qK2.getPostOnViewCreatedAlpha() + " in onStart");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f29955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f29956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractComponentCallbacksC2838q f29957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f29958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f29959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f29960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f29961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f29963i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f29964j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final List f29965k;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f29970a = new a(null);

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    AbstractC5504s.h(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.c0$d$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public /* synthetic */ class C0509b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f29976a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f29976a = iArr;
                }
            }

            public static final b c(int i10) {
                return f29970a.b(i10);
            }

            public final void b(View view, ViewGroup container) {
                AbstractC5504s.h(view, "view");
                AbstractC5504s.h(container, "container");
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int i10 = C0509b.f29976a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (K.Q0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (K.Q0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29977a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f29977a = iArr;
            }
        }

        public d(b finalState, a lifecycleImpact, AbstractComponentCallbacksC2838q fragment) {
            AbstractC5504s.h(finalState, "finalState");
            AbstractC5504s.h(lifecycleImpact, "lifecycleImpact");
            AbstractC5504s.h(fragment, "fragment");
            this.f29955a = finalState;
            this.f29956b = lifecycleImpact;
            this.f29957c = fragment;
            this.f29958d = new ArrayList();
            this.f29963i = true;
            ArrayList arrayList = new ArrayList();
            this.f29964j = arrayList;
            this.f29965k = arrayList;
        }

        public final void a(Runnable listener) {
            AbstractC5504s.h(listener, "listener");
            this.f29958d.add(listener);
        }

        public final void b(b effect) {
            AbstractC5504s.h(effect, "effect");
            this.f29964j.add(effect);
        }

        public final void c(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            this.f29962h = false;
            if (this.f29959e) {
                return;
            }
            this.f29959e = true;
            if (this.f29964j.isEmpty()) {
                d();
                return;
            }
            Iterator it = AbstractC2279u.b1(this.f29965k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.f29962h = false;
            if (this.f29960f) {
                return;
            }
            if (K.Q0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f29960f = true;
            Iterator it = this.f29958d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(b effect) {
            AbstractC5504s.h(effect, "effect");
            if (this.f29964j.remove(effect) && this.f29964j.isEmpty()) {
                d();
            }
        }

        public final List f() {
            return this.f29965k;
        }

        public final b g() {
            return this.f29955a;
        }

        public final AbstractComponentCallbacksC2838q h() {
            return this.f29957c;
        }

        public final a i() {
            return this.f29956b;
        }

        public final boolean j() {
            return this.f29963i;
        }

        public final boolean k() {
            return this.f29959e;
        }

        public final boolean l() {
            return this.f29960f;
        }

        public final boolean m() {
            return this.f29961g;
        }

        public final boolean n() {
            return this.f29962h;
        }

        public final void o(b finalState, a lifecycleImpact) {
            AbstractC5504s.h(finalState, "finalState");
            AbstractC5504s.h(lifecycleImpact, "lifecycleImpact");
            int i10 = c.f29977a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f29955a == b.REMOVED) {
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29957c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f29956b + " to ADDING.");
                    }
                    this.f29955a = b.VISIBLE;
                    this.f29956b = a.ADDING;
                    this.f29963i = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29957c + " mFinalState = " + this.f29955a + " -> REMOVED. mLifecycleImpact  = " + this.f29956b + " to REMOVING.");
                }
                this.f29955a = b.REMOVED;
                this.f29956b = a.REMOVING;
                this.f29963i = true;
                return;
            }
            if (i10 == 3 && this.f29955a != b.REMOVED) {
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f29957c + " mFinalState = " + this.f29955a + " -> " + finalState + com.amazon.a.a.o.c.a.b.f34706a);
                }
                this.f29955a = finalState;
            }
        }

        public void p() {
            this.f29962h = true;
        }

        public final void q(boolean z10) {
            this.f29963i = z10;
        }

        public final void r(boolean z10) {
            this.f29961g = z10;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f29955a + " lifecycleImpact = " + this.f29956b + " fragment = " + this.f29957c + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29978a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f29978a = iArr;
        }
    }

    public c0(ViewGroup container) {
        AbstractC5504s.h(container, "container");
        this.f29945a = container;
        this.f29946b = new ArrayList();
        this.f29947c = new ArrayList();
    }

    private final void B(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) list.get(i10)).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList, ((d) it.next()).f());
        }
        List listB1 = AbstractC2279u.b1(AbstractC2279u.f1(arrayList));
        int size2 = listB1.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listB1.get(i11)).g(this.f29945a);
        }
    }

    private final void C() {
        for (d dVar : this.f29946b) {
            if (dVar.i() == d.a.ADDING) {
                View viewRequireView = dVar.h().requireView();
                AbstractC5504s.g(viewRequireView, "fragment.requireView()");
                dVar.o(d.b.f29970a.b(viewRequireView.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b bVar, d.a aVar, S s10) {
        synchronized (this.f29946b) {
            try {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
                AbstractC5504s.g(abstractComponentCallbacksC2838qK, "fragmentStateManager.fragment");
                d dVarO = o(abstractComponentCallbacksC2838qK);
                if (dVarO == null) {
                    if (s10.k().mTransitioning || s10.k().mRemoving) {
                        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK2 = s10.k();
                        AbstractC5504s.g(abstractComponentCallbacksC2838qK2, "fragmentStateManager.fragment");
                        dVarO = p(abstractComponentCallbacksC2838qK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, s10);
                this.f29946b.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0.h(this.f29924a, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0.i(this.f29940a, cVar);
                    }
                });
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(c0 this$0, c operation) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(operation, "$operation");
        if (this$0.f29946b.contains(operation)) {
            d.b bVarG = operation.g();
            View view = operation.h().mView;
            AbstractC5504s.g(view, "operation.fragment.mView");
            bVarG.b(view, this$0.f29945a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(c0 this$0, c operation) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(operation, "$operation");
        this$0.f29946b.remove(operation);
        this$0.f29947c.remove(operation);
    }

    private final d o(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        Object next;
        Iterator it = this.f29946b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (AbstractC5504s.c(dVar.h(), abstractComponentCallbacksC2838q) && !dVar.k()) {
                break;
            }
        }
        return (d) next;
    }

    private final d p(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        Object next;
        Iterator it = this.f29947c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (AbstractC5504s.c(dVar.h(), abstractComponentCallbacksC2838q) && !dVar.k()) {
                break;
            }
        }
        return (d) next;
    }

    public static final c0 u(ViewGroup viewGroup, K k10) {
        return f29944g.a(viewGroup, k10);
    }

    public static final c0 v(ViewGroup viewGroup, d0 d0Var) {
        return f29944g.b(viewGroup, d0Var);
    }

    private final boolean w(List list) {
        boolean z10;
        Iterator it = list.iterator();
        loop0: while (true) {
            z10 = true;
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (!dVar.f().isEmpty()) {
                    List listF = dVar.f();
                    if (listF == null || !listF.isEmpty()) {
                        Iterator it2 = listF.iterator();
                        while (it2.hasNext()) {
                            if (!((b) it2.next()).b()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AbstractC2279u.D(arrayList, ((d) it3.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List list) {
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).h().mTransitioning) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void A(C2632b backEvent) {
        AbstractC5504s.h(backEvent, "backEvent");
        if (K.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.a());
        }
        List list = this.f29947c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList, ((d) it.next()).f());
        }
        List listB1 = AbstractC2279u.b1(AbstractC2279u.f1(arrayList));
        int size = listB1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listB1.get(i10)).e(backEvent, this.f29945a);
        }
    }

    public final void D(boolean z10) {
        this.f29949e = z10;
    }

    public final void c(d operation) {
        AbstractC5504s.h(operation, "operation");
        if (operation.j()) {
            d.b bVarG = operation.g();
            View viewRequireView = operation.h().requireView();
            AbstractC5504s.g(viewRequireView, "operation.fragment.requireView()");
            bVarG.b(viewRequireView, this.f29945a);
            operation.q(false);
        }
    }

    public abstract void d(List list, boolean z10);

    public void e(List operations) {
        AbstractC5504s.h(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList, ((d) it.next()).f());
        }
        List listB1 = AbstractC2279u.b1(AbstractC2279u.f1(arrayList));
        int size = listB1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listB1.get(i10)).d(this.f29945a);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c((d) operations.get(i11));
        }
        List listB12 = AbstractC2279u.b1(operations);
        int size3 = listB12.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listB12.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.f29947c);
        e(this.f29947c);
    }

    public final void j(d.b finalState, S fragmentStateManager) {
        AbstractC5504s.h(finalState, "finalState");
        AbstractC5504s.h(fragmentStateManager, "fragmentStateManager");
        if (K.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(S fragmentStateManager) {
        AbstractC5504s.h(fragmentStateManager, "fragmentStateManager");
        if (K.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(S fragmentStateManager) {
        AbstractC5504s.h(fragmentStateManager, "fragmentStateManager");
        if (K.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(S fragmentStateManager) {
        AbstractC5504s.h(fragmentStateManager, "fragmentStateManager");
        if (K.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        boolean z10;
        if (this.f29950f) {
            return;
        }
        if (!this.f29945a.isAttachedToWindow()) {
            q();
            this.f29949e = false;
            return;
        }
        synchronized (this.f29946b) {
            try {
                List<d> listD1 = AbstractC2279u.d1(this.f29947c);
                this.f29947c.clear();
                Iterator it = listD1.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.f29946b.isEmpty() || !dVar.h().mTransitioning) {
                        z10 = false;
                    }
                    dVar.r(z10);
                }
                for (d dVar2 : listD1) {
                    if (this.f29948d) {
                        if (K.Q0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (K.Q0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.f29945a);
                    }
                    this.f29948d = false;
                    if (!dVar2.l()) {
                        this.f29947c.add(dVar2);
                    }
                }
                if (!this.f29946b.isEmpty()) {
                    C();
                    List listD12 = AbstractC2279u.d1(this.f29946b);
                    if (listD12.isEmpty()) {
                        return;
                    }
                    this.f29946b.clear();
                    this.f29947c.addAll(listD12);
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(listD12, this.f29949e);
                    boolean zW = w(listD12);
                    boolean zX = x(listD12);
                    if (!zX || zW) {
                        z10 = false;
                    }
                    this.f29948d = z10;
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zW + " \ntransition = " + zX);
                    }
                    if (!zX) {
                        B(listD12);
                        e(listD12);
                    } else if (zW) {
                        B(listD12);
                        int size = listD12.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c((d) listD12.get(i10));
                        }
                    }
                    this.f29949e = false;
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q() {
        if (K.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f29945a.isAttachedToWindow();
        synchronized (this.f29946b) {
            try {
                C();
                B(this.f29946b);
                List<d> listD1 = AbstractC2279u.d1(this.f29947c);
                Iterator it = listD1.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listD1) {
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f29945a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f29945a);
                }
                List<d> listD12 = AbstractC2279u.d1(this.f29946b);
                Iterator it2 = listD12.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : listD12) {
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f29945a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f29945a);
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.f29950f) {
            if (K.Q0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f29950f = false;
            n();
        }
    }

    public final d.a s(S fragmentStateManager) {
        AbstractC5504s.h(fragmentStateManager, "fragmentStateManager");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = fragmentStateManager.k();
        AbstractC5504s.g(abstractComponentCallbacksC2838qK, "fragmentStateManager.fragment");
        d dVarO = o(abstractComponentCallbacksC2838qK);
        d.a aVarI = dVarO != null ? dVarO.i() : null;
        d dVarP = p(abstractComponentCallbacksC2838qK);
        d.a aVarI2 = dVarP != null ? dVarP.i() : null;
        int i10 = aVarI == null ? -1 : e.f29978a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup t() {
        return this.f29945a;
    }

    public final boolean y() {
        return !this.f29946b.isEmpty();
    }

    public final void z() {
        Object objPrevious;
        synchronized (this.f29946b) {
            try {
                C();
                List list = this.f29946b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    d dVar = (d) objPrevious;
                    d.b.a aVar = d.b.f29970a;
                    View view = dVar.h().mView;
                    AbstractC5504s.g(view, "operation.fragment.mView");
                    d.b bVarA = aVar.a(view);
                    d.b bVarG = dVar.g();
                    d.b bVar = d.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) objPrevious;
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH = dVar2 != null ? dVar2.h() : null;
                this.f29950f = abstractComponentCallbacksC2838qH != null ? abstractComponentCallbacksC2838qH.isPostponed() : false;
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
