package androidx.fragment.app;

import P3.f;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C2632b;
import androidx.core.view.InterfaceC2787v;
import androidx.fragment.app.U;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import com.revenuecat.purchases.common.Constants;
import e2.AbstractC4641b;
import f2.C4755c;
import g.AbstractC4814d;
import g.AbstractC4816f;
import g.C4811a;
import g.C4818h;
import g.InterfaceC4812b;
import g.InterfaceC4817g;
import h.AbstractC4888a;
import h.C4889b;
import h.C4890c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import y1.InterfaceC7196d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: U */
    private static boolean f29744U = false;

    /* JADX INFO: renamed from: V */
    static boolean f29745V = true;

    /* JADX INFO: renamed from: A */
    AbstractComponentCallbacksC2838q f29746A;

    /* JADX INFO: renamed from: F */
    private AbstractC4814d f29751F;

    /* JADX INFO: renamed from: G */
    private AbstractC4814d f29752G;

    /* JADX INFO: renamed from: H */
    private AbstractC4814d f29753H;

    /* JADX INFO: renamed from: J */
    private boolean f29755J;

    /* JADX INFO: renamed from: K */
    private boolean f29756K;

    /* JADX INFO: renamed from: L */
    private boolean f29757L;

    /* JADX INFO: renamed from: M */
    private boolean f29758M;

    /* JADX INFO: renamed from: N */
    private boolean f29759N;

    /* JADX INFO: renamed from: O */
    private ArrayList f29760O;

    /* JADX INFO: renamed from: P */
    private ArrayList f29761P;

    /* JADX INFO: renamed from: Q */
    private ArrayList f29762Q;

    /* JADX INFO: renamed from: R */
    private N f29763R;

    /* JADX INFO: renamed from: S */
    private C4755c.C0750c f29764S;

    /* JADX INFO: renamed from: b */
    private boolean f29767b;

    /* JADX INFO: renamed from: e */
    private ArrayList f29770e;

    /* JADX INFO: renamed from: g */
    private androidx.activity.H f29772g;

    /* JADX INFO: renamed from: x */
    private A f29789x;

    /* JADX INFO: renamed from: y */
    private AbstractC2844x f29790y;

    /* JADX INFO: renamed from: z */
    private AbstractComponentCallbacksC2838q f29791z;

    /* JADX INFO: renamed from: a */
    private final ArrayList f29766a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final T f29768c = new T();

    /* JADX INFO: renamed from: d */
    ArrayList f29769d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final C f29771f = new C(this);

    /* JADX INFO: renamed from: h */
    C2822a f29773h = null;

    /* JADX INFO: renamed from: i */
    boolean f29774i = false;

    /* JADX INFO: renamed from: j */
    private final androidx.activity.G f29775j = new b(false);

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f29776k = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    private final Map f29777l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    private final Map f29778m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    private final Map f29779n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o */
    ArrayList f29780o = new ArrayList();

    /* JADX INFO: renamed from: p */
    private final D f29781p = new D(this);

    /* JADX INFO: renamed from: q */
    private final CopyOnWriteArrayList f29782q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: r */
    private final K1.a f29783r = new K1.a() { // from class: androidx.fragment.app.E
        @Override // K1.a
        public final void accept(Object obj) {
            K.f(this.f29733a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s */
    private final K1.a f29784s = new K1.a() { // from class: androidx.fragment.app.F
        @Override // K1.a
        public final void accept(Object obj) {
            K.a(this.f29734a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t */
    private final K1.a f29785t = new K1.a() { // from class: androidx.fragment.app.G
        @Override // K1.a
        public final void accept(Object obj) {
            K.e(this.f29740a, (androidx.core.app.j) obj);
        }
    };

    /* JADX INFO: renamed from: u */
    private final K1.a f29786u = new K1.a() { // from class: androidx.fragment.app.H
        @Override // K1.a
        public final void accept(Object obj) {
            K.d(this.f29741a, (androidx.core.app.v) obj);
        }
    };

    /* JADX INFO: renamed from: v */
    private final androidx.core.view.B f29787v = new c();

    /* JADX INFO: renamed from: w */
    int f29788w = -1;

    /* JADX INFO: renamed from: B */
    private AbstractC2846z f29747B = null;

    /* JADX INFO: renamed from: C */
    private AbstractC2846z f29748C = new d();

    /* JADX INFO: renamed from: D */
    private d0 f29749D = null;

    /* JADX INFO: renamed from: E */
    private d0 f29750E = new e();

    /* JADX INFO: renamed from: I */
    ArrayDeque f29754I = new ArrayDeque();

    /* JADX INFO: renamed from: T */
    private Runnable f29765T = new f();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC4812b {
        a() {
        }

        @Override // g.InterfaceC4812b
        /* JADX INFO: renamed from: a */
        public void onActivityResult(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            m mVar = (m) K.this.f29754I.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = mVar.f29806a;
            int i11 = mVar.f29807b;
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qI = K.this.f29768c.i(str);
            if (abstractComponentCallbacksC2838qI != null) {
                abstractComponentCallbacksC2838qI.onRequestPermissionsResult(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends androidx.activity.G {
        b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.G
        public void c() {
            if (K.Q0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + K.f29745V + " fragment manager " + K.this);
            }
            if (K.f29745V) {
                K.this.t();
            }
        }

        @Override // androidx.activity.G
        public void d() {
            if (K.Q0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + K.f29745V + " fragment manager " + K.this);
            }
            K.this.M0();
        }

        @Override // androidx.activity.G
        public void e(C2632b c2632b) {
            if (K.Q0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + K.f29745V + " fragment manager " + K.this);
            }
            K k10 = K.this;
            if (k10.f29773h != null) {
                Iterator it = k10.B(new ArrayList(Collections.singletonList(K.this.f29773h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((c0) it.next()).A(c2632b);
                }
                Iterator it2 = K.this.f29780o.iterator();
                while (it2.hasNext()) {
                    ((o) it2.next()).a(c2632b);
                }
            }
        }

        @Override // androidx.activity.G
        public void f(C2632b c2632b) {
            if (K.Q0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + K.f29745V + " fragment manager " + K.this);
            }
            if (K.f29745V) {
                K.this.e0();
                K.this.m1();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements androidx.core.view.B {
        c() {
        }

        @Override // androidx.core.view.B
        public void a(Menu menu) {
            K.this.R(menu);
        }

        @Override // androidx.core.view.B
        public void b(Menu menu) {
            K.this.V(menu);
        }

        @Override // androidx.core.view.B
        public boolean c(MenuItem menuItem) {
            return K.this.Q(menuItem);
        }

        @Override // androidx.core.view.B
        public void d(Menu menu, MenuInflater menuInflater) {
            K.this.J(menu, menuInflater);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends AbstractC2846z {
        d() {
        }

        @Override // androidx.fragment.app.AbstractC2846z
        public AbstractComponentCallbacksC2838q a(ClassLoader classLoader, String str) {
            return K.this.D0().b(K.this.D0().f(), str, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements d0 {
        e() {
        }

        @Override // androidx.fragment.app.d0
        public c0 a(ViewGroup viewGroup) {
            return new C2827f(viewGroup);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            K.this.h0(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements InterfaceC2861o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f29798a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ P f29799b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC2857k f29800c;

        g(String str, P p10, AbstractC2857k abstractC2857k) {
            this.f29798a = str;
            this.f29799b = p10;
            this.f29800c = abstractC2857k;
        }

        @Override // androidx.lifecycle.InterfaceC2861o
        public void g(androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
            Bundle bundle;
            if (aVar == AbstractC2857k.a.ON_START && (bundle = (Bundle) K.this.f29778m.get(this.f29798a)) != null) {
                this.f29799b.a(this.f29798a, bundle);
                K.this.y(this.f29798a);
            }
            if (aVar == AbstractC2857k.a.ON_DESTROY) {
                this.f29800c.removeObserver(this);
                K.this.f29779n.remove(this.f29798a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements O {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractComponentCallbacksC2838q f29802a;

        h(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
            this.f29802a = abstractComponentCallbacksC2838q;
        }

        @Override // androidx.fragment.app.O
        public void a(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
            this.f29802a.onAttachFragment(abstractComponentCallbacksC2838q);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i implements InterfaceC4812b {
        i() {
        }

        @Override // g.InterfaceC4812b
        /* JADX INFO: renamed from: a */
        public void onActivityResult(C4811a c4811a) {
            m mVar = (m) K.this.f29754I.pollLast();
            if (mVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVar.f29806a;
            int i10 = mVar.f29807b;
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qI = K.this.f29768c.i(str);
            if (abstractComponentCallbacksC2838qI != null) {
                abstractComponentCallbacksC2838qI.onActivityResult(i10, c4811a.b(), c4811a.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j implements InterfaceC4812b {
        j() {
        }

        @Override // g.InterfaceC4812b
        /* JADX INFO: renamed from: a */
        public void onActivityResult(C4811a c4811a) {
            m mVar = (m) K.this.f29754I.pollFirst();
            if (mVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVar.f29806a;
            int i10 = mVar.f29807b;
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qI = K.this.f29768c.i(str);
            if (abstractComponentCallbacksC2838qI != null) {
                abstractComponentCallbacksC2838qI.onActivityResult(i10, c4811a.b(), c4811a.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class k extends AbstractC4888a {
        k() {
        }

        @Override // h.AbstractC4888a
        /* JADX INFO: renamed from: a */
        public Intent createIntent(Context context, C4818h c4818h) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = c4818h.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c4818h = new C4818h.a(c4818h.d()).b(null).c(c4818h.c(), c4818h.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c4818h);
            if (K.Q0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // h.AbstractC4888a
        /* JADX INFO: renamed from: b */
        public C4811a parseResult(int i10, Intent intent) {
            return new C4811a(i10, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class n implements P {

        /* JADX INFO: renamed from: a */
        private final AbstractC2857k f29808a;

        /* JADX INFO: renamed from: b */
        private final P f29809b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC2861o f29810c;

        n(AbstractC2857k abstractC2857k, P p10, InterfaceC2861o interfaceC2861o) {
            this.f29808a = abstractC2857k;
            this.f29809b = p10;
            this.f29810c = interfaceC2861o;
        }

        @Override // androidx.fragment.app.P
        public void a(String str, Bundle bundle) {
            this.f29809b.a(str, bundle);
        }

        public boolean b(AbstractC2857k.b bVar) {
            return this.f29808a.getCurrentState().b(bVar);
        }

        public void c() {
            this.f29808a.removeObserver(this.f29810c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface p {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class q implements p {

        /* JADX INFO: renamed from: a */
        final String f29811a;

        /* JADX INFO: renamed from: b */
        final int f29812b;

        /* JADX INFO: renamed from: c */
        final int f29813c;

        q(String str, int i10, int i11) {
            this.f29811a = str;
            this.f29812b = i10;
            this.f29813c = i11;
        }

        @Override // androidx.fragment.app.K.p
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = K.this.f29746A;
            if (abstractComponentCallbacksC2838q == null || this.f29812b >= 0 || this.f29811a != null || !abstractComponentCallbacksC2838q.getChildFragmentManager().h1()) {
                return K.this.k1(arrayList, arrayList2, this.f29811a, this.f29812b, this.f29813c);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class r implements p {
        r() {
        }

        @Override // androidx.fragment.app.K.p
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean zL1 = K.this.l1(arrayList, arrayList2);
            if (!K.this.f29780o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(K.this.v0((C2822a) it.next()));
                }
                for (o oVar : K.this.f29780o) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        oVar.c((AbstractComponentCallbacksC2838q) it2.next(), zBooleanValue);
                    }
                }
            }
            return zL1;
        }
    }

    private Set A() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f29768c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((S) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(c0.v(viewGroup, I0()));
            }
        }
        return hashSet;
    }

    private ViewGroup A0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        ViewGroup viewGroup = abstractComponentCallbacksC2838q.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC2838q.mContainerId > 0 && this.f29790y.d()) {
            View viewC = this.f29790y.c(abstractComponentCallbacksC2838q.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private void C1(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        ViewGroup viewGroupA0 = A0(abstractComponentCallbacksC2838q);
        if (viewGroupA0 == null || abstractComponentCallbacksC2838q.getEnterAnim() + abstractComponentCallbacksC2838q.getExitAnim() + abstractComponentCallbacksC2838q.getPopEnterAnim() + abstractComponentCallbacksC2838q.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupA0.getTag(AbstractC4641b.f45787c) == null) {
            viewGroupA0.setTag(AbstractC4641b.f45787c, abstractComponentCallbacksC2838q);
        }
        ((AbstractComponentCallbacksC2838q) viewGroupA0.getTag(AbstractC4641b.f45787c)).setPopDirection(abstractComponentCallbacksC2838q.getPopDirection());
    }

    private void E1() {
        Iterator it = this.f29768c.k().iterator();
        while (it.hasNext()) {
            e1((S) it.next());
        }
    }

    private void F1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Z("FragmentManager"));
        A a10 = this.f29789x;
        if (a10 != null) {
            try {
                a10.i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            d0("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    private void G1() {
        synchronized (this.f29766a) {
            try {
                if (!this.f29766a.isEmpty()) {
                    this.f29775j.j(true);
                    if (Q0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = x0() > 0 && V0(this.f29791z);
                if (Q0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f29775j.j(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static AbstractComponentCallbacksC2838q K0(View view) {
        Object tag = view.getTag(AbstractC4641b.f45785a);
        if (tag instanceof AbstractComponentCallbacksC2838q) {
            return (AbstractComponentCallbacksC2838q) tag;
        }
        return null;
    }

    public static boolean Q0(int i10) {
        return f29744U || Log.isLoggable("FragmentManager", i10);
    }

    private boolean R0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        return (abstractComponentCallbacksC2838q.mHasMenu && abstractComponentCallbacksC2838q.mMenuVisible) || abstractComponentCallbacksC2838q.mChildFragmentManager.u();
    }

    private void S(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (abstractComponentCallbacksC2838q == null || !abstractComponentCallbacksC2838q.equals(m0(abstractComponentCallbacksC2838q.mWho))) {
            return;
        }
        abstractComponentCallbacksC2838q.performPrimaryNavigationFragmentChanged();
    }

    private boolean S0() {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29791z;
        if (abstractComponentCallbacksC2838q == null) {
            return true;
        }
        return abstractComponentCallbacksC2838q.isAdded() && this.f29791z.getParentFragmentManager().S0();
    }

    private void Z(int i10) {
        try {
            this.f29767b = true;
            this.f29768c.d(i10);
            b1(i10, false);
            Iterator it = A().iterator();
            while (it.hasNext()) {
                ((c0) it.next()).q();
            }
            this.f29767b = false;
            h0(true);
        } catch (Throwable th2) {
            this.f29767b = false;
            throw th2;
        }
    }

    public static /* synthetic */ void a(K k10, Integer num) {
        if (k10.S0() && num.intValue() == 80) {
            k10.M(false);
        }
    }

    public static /* synthetic */ void c(K k10) {
        Iterator it = k10.f29780o.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
    }

    private void c0() {
        if (this.f29759N) {
            this.f29759N = false;
            E1();
        }
    }

    public static /* synthetic */ void d(K k10, androidx.core.app.v vVar) {
        if (k10.S0()) {
            k10.U(vVar.a(), false);
        }
    }

    public static /* synthetic */ void e(K k10, androidx.core.app.j jVar) {
        if (k10.S0()) {
            k10.N(jVar.a(), false);
        }
    }

    public void e0() {
        Iterator it = A().iterator();
        while (it.hasNext()) {
            ((c0) it.next()).q();
        }
    }

    public static /* synthetic */ void f(K k10, Configuration configuration) {
        if (k10.S0()) {
            k10.G(configuration, false);
        }
    }

    private void g0(boolean z10) {
        if (this.f29767b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f29789x == null) {
            if (!this.f29758M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f29789x.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            v();
        }
        if (this.f29760O == null) {
            this.f29760O = new ArrayList();
            this.f29761P = new ArrayList();
        }
    }

    private static void j0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C2822a c2822a = (C2822a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c2822a.w(-1);
                c2822a.C();
            } else {
                c2822a.w(1);
                c2822a.B();
            }
            i10++;
        }
    }

    private boolean j1(String str, int i10, int i11) {
        h0(false);
        g0(true);
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29746A;
        if (abstractComponentCallbacksC2838q != null && i10 < 0 && str == null && abstractComponentCallbacksC2838q.getChildFragmentManager().h1()) {
            return true;
        }
        boolean zK1 = k1(this.f29760O, this.f29761P, str, i10, i11);
        if (zK1) {
            this.f29767b = true;
            try {
                q1(this.f29760O, this.f29761P);
            } finally {
                w();
            }
        }
        G1();
        c0();
        this.f29768c.b();
        return zK1;
    }

    private void k0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = ((C2822a) arrayList.get(i10)).f29876r;
        ArrayList arrayList3 = this.f29762Q;
        if (arrayList3 == null) {
            this.f29762Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f29762Q.addAll(this.f29768c.o());
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH0 = H0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C2822a c2822a = (C2822a) arrayList.get(i12);
            abstractComponentCallbacksC2838qH0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? c2822a.D(this.f29762Q, abstractComponentCallbacksC2838qH0) : c2822a.G(this.f29762Q, abstractComponentCallbacksC2838qH0);
            z11 = z11 || c2822a.f29867i;
        }
        this.f29762Q.clear();
        if (!z10 && this.f29788w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((C2822a) arrayList.get(i13)).f29861c.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = ((U.a) it.next()).f29879b;
                    if (abstractComponentCallbacksC2838q != null && abstractComponentCallbacksC2838q.mFragmentManager != null) {
                        this.f29768c.r(C(abstractComponentCallbacksC2838q));
                    }
                }
            }
        }
        j0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && !this.f29780o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(v0((C2822a) it2.next()));
            }
            if (this.f29773h == null) {
                for (o oVar : this.f29780o) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        oVar.c((AbstractComponentCallbacksC2838q) it3.next(), zBooleanValue);
                    }
                }
                for (o oVar2 : this.f29780o) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        oVar2.b((AbstractComponentCallbacksC2838q) it4.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C2822a c2822a2 = (C2822a) arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = c2822a2.f29861c.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = ((U.a) c2822a2.f29861c.get(size)).f29879b;
                    if (abstractComponentCallbacksC2838q2 != null) {
                        C(abstractComponentCallbacksC2838q2).m();
                    }
                }
            } else {
                Iterator it5 = c2822a2.f29861c.iterator();
                while (it5.hasNext()) {
                    AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = ((U.a) it5.next()).f29879b;
                    if (abstractComponentCallbacksC2838q3 != null) {
                        C(abstractComponentCallbacksC2838q3).m();
                    }
                }
            }
        }
        b1(this.f29788w, true);
        for (c0 c0Var : B(arrayList, i10, i11)) {
            c0Var.D(zBooleanValue);
            c0Var.z();
            c0Var.n();
        }
        while (i10 < i11) {
            C2822a c2822a3 = (C2822a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && c2822a3.f29922v >= 0) {
                c2822a3.f29922v = -1;
            }
            c2822a3.F();
            i10++;
        }
        if (z11) {
            s1();
        }
    }

    private int n0(String str, int i10, boolean z10) {
        if (this.f29769d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f29769d.size() - 1;
        }
        int size = this.f29769d.size() - 1;
        while (size >= 0) {
            C2822a c2822a = (C2822a) this.f29769d.get(size);
            if ((str != null && str.equals(c2822a.E())) || (i10 >= 0 && i10 == c2822a.f29922v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f29769d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2822a c2822a2 = (C2822a) this.f29769d.get(size - 1);
            if ((str == null || !str.equals(c2822a2.E())) && (i10 < 0 || i10 != c2822a2.f29922v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public static AbstractComponentCallbacksC2838q o0(View view) {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qT0 = t0(view);
        if (abstractComponentCallbacksC2838qT0 != null) {
            return abstractComponentCallbacksC2838qT0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private void q1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C2822a) arrayList.get(i10)).f29876r) {
                if (i11 != i10) {
                    k0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C2822a) arrayList.get(i11)).f29876r) {
                        i11++;
                    }
                }
                k0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            k0(arrayList, arrayList2, i11, size);
        }
    }

    public static K s0(View view) {
        AbstractActivityC2842v abstractActivityC2842v;
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qT0 = t0(view);
        if (abstractComponentCallbacksC2838qT0 != null) {
            if (abstractComponentCallbacksC2838qT0.isAdded()) {
                return abstractComponentCallbacksC2838qT0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC2838qT0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC2842v = null;
                break;
            }
            if (context instanceof AbstractActivityC2842v) {
                abstractActivityC2842v = (AbstractActivityC2842v) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC2842v != null) {
            return abstractActivityC2842v.C();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private void s1() {
        for (int i10 = 0; i10 < this.f29780o.size(); i10++) {
            ((o) this.f29780o.get(i10)).onBackStackChanged();
        }
    }

    static AbstractComponentCallbacksC2838q t0(View view) {
        while (view != null) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK0 = K0(view);
            if (abstractComponentCallbacksC2838qK0 != null) {
                return abstractComponentCallbacksC2838qK0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void u0() {
        Iterator it = A().iterator();
        while (it.hasNext()) {
            ((c0) it.next()).r();
        }
    }

    static int u1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private void v() {
        if (X0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void w() {
        this.f29767b = false;
        this.f29761P.clear();
        this.f29760O.clear();
    }

    private boolean w0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f29766a) {
            if (this.f29766a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f29766a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((p) this.f29766a.get(i10)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f29766a.clear();
                this.f29789x.h().removeCallbacks(this.f29765T);
            }
        }
    }

    private void x() {
        A a10 = this.f29789x;
        if (a10 instanceof androidx.lifecycle.Y ? this.f29768c.p().j() : a10.f() instanceof Activity ? !((Activity) this.f29789x.f()).isChangingConfigurations() : true) {
            Iterator it = this.f29777l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C2824c) it.next()).f29942a.iterator();
                while (it2.hasNext()) {
                    this.f29768c.p().c((String) it2.next(), false);
                }
            }
        }
    }

    private N y0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        return this.f29763R.f(abstractComponentCallbacksC2838q);
    }

    void A1(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, AbstractC2857k.b bVar) {
        if (abstractComponentCallbacksC2838q.equals(m0(abstractComponentCallbacksC2838q.mWho)) && (abstractComponentCallbacksC2838q.mHost == null || abstractComponentCallbacksC2838q.mFragmentManager == this)) {
            abstractComponentCallbacksC2838q.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2838q + " is not an active fragment of FragmentManager " + this);
    }

    Set B(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((C2822a) arrayList.get(i10)).f29861c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = ((U.a) it.next()).f29879b;
                if (abstractComponentCallbacksC2838q != null && (viewGroup = abstractComponentCallbacksC2838q.mContainer) != null) {
                    hashSet.add(c0.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public AbstractC2846z B0() {
        AbstractC2846z abstractC2846z = this.f29747B;
        if (abstractC2846z != null) {
            return abstractC2846z;
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29791z;
        return abstractComponentCallbacksC2838q != null ? abstractComponentCallbacksC2838q.mFragmentManager.B0() : this.f29748C;
    }

    void B1(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (abstractComponentCallbacksC2838q == null || (abstractComponentCallbacksC2838q.equals(m0(abstractComponentCallbacksC2838q.mWho)) && (abstractComponentCallbacksC2838q.mHost == null || abstractComponentCallbacksC2838q.mFragmentManager == this))) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29746A;
            this.f29746A = abstractComponentCallbacksC2838q;
            S(abstractComponentCallbacksC2838q2);
            S(this.f29746A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2838q + " is not an active fragment of FragmentManager " + this);
    }

    S C(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        S sN = this.f29768c.n(abstractComponentCallbacksC2838q.mWho);
        if (sN != null) {
            return sN;
        }
        S s10 = new S(this.f29781p, this.f29768c, abstractComponentCallbacksC2838q);
        s10.o(this.f29789x.f().getClassLoader());
        s10.s(this.f29788w);
        return s10;
    }

    public List C0() {
        return this.f29768c.o();
    }

    void D(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (Q0(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC2838q);
        }
        if (abstractComponentCallbacksC2838q.mDetached) {
            return;
        }
        abstractComponentCallbacksC2838q.mDetached = true;
        if (abstractComponentCallbacksC2838q.mAdded) {
            if (Q0(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC2838q);
            }
            this.f29768c.u(abstractComponentCallbacksC2838q);
            if (R0(abstractComponentCallbacksC2838q)) {
                this.f29755J = true;
            }
            C1(abstractComponentCallbacksC2838q);
        }
    }

    public A D0() {
        return this.f29789x;
    }

    void D1(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (Q0(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC2838q);
        }
        if (abstractComponentCallbacksC2838q.mHidden) {
            abstractComponentCallbacksC2838q.mHidden = false;
            abstractComponentCallbacksC2838q.mHiddenChanged = !abstractComponentCallbacksC2838q.mHiddenChanged;
        }
    }

    void E() {
        this.f29756K = false;
        this.f29757L = false;
        this.f29763R.l(false);
        Z(4);
    }

    LayoutInflater.Factory2 E0() {
        return this.f29771f;
    }

    void F() {
        this.f29756K = false;
        this.f29757L = false;
        this.f29763R.l(false);
        Z(0);
    }

    D F0() {
        return this.f29781p;
    }

    void G(Configuration configuration, boolean z10) {
        if (z10 && (this.f29789x instanceof InterfaceC7196d)) {
            F1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.performConfigurationChanged(configuration);
                if (z10) {
                    abstractComponentCallbacksC2838q.mChildFragmentManager.G(configuration, true);
                }
            }
        }
    }

    AbstractComponentCallbacksC2838q G0() {
        return this.f29791z;
    }

    boolean H(MenuItem menuItem) {
        if (this.f29788w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null && abstractComponentCallbacksC2838q.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public AbstractComponentCallbacksC2838q H0() {
        return this.f29746A;
    }

    void I() {
        this.f29756K = false;
        this.f29757L = false;
        this.f29763R.l(false);
        Z(1);
    }

    d0 I0() {
        d0 d0Var = this.f29749D;
        if (d0Var != null) {
            return d0Var;
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29791z;
        return abstractComponentCallbacksC2838q != null ? abstractComponentCallbacksC2838q.mFragmentManager.I0() : this.f29750E;
    }

    boolean J(Menu menu, MenuInflater menuInflater) {
        if (this.f29788w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null && U0(abstractComponentCallbacksC2838q) && abstractComponentCallbacksC2838q.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC2838q);
                z10 = true;
            }
        }
        if (this.f29770e != null) {
            for (int i10 = 0; i10 < this.f29770e.size(); i10++) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = (AbstractComponentCallbacksC2838q) this.f29770e.get(i10);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC2838q2)) {
                    abstractComponentCallbacksC2838q2.onDestroyOptionsMenu();
                }
            }
        }
        this.f29770e = arrayList;
        return z10;
    }

    public C4755c.C0750c J0() {
        return this.f29764S;
    }

    void K() {
        this.f29758M = true;
        h0(true);
        e0();
        x();
        Z(-1);
        Object obj = this.f29789x;
        if (obj instanceof y1.e) {
            ((y1.e) obj).removeOnTrimMemoryListener(this.f29784s);
        }
        Object obj2 = this.f29789x;
        if (obj2 instanceof InterfaceC7196d) {
            ((InterfaceC7196d) obj2).removeOnConfigurationChangedListener(this.f29783r);
        }
        Object obj3 = this.f29789x;
        if (obj3 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj3).removeOnMultiWindowModeChangedListener(this.f29785t);
        }
        Object obj4 = this.f29789x;
        if (obj4 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj4).removeOnPictureInPictureModeChangedListener(this.f29786u);
        }
        Object obj5 = this.f29789x;
        if ((obj5 instanceof InterfaceC2787v) && this.f29791z == null) {
            ((InterfaceC2787v) obj5).removeMenuProvider(this.f29787v);
        }
        this.f29789x = null;
        this.f29790y = null;
        this.f29791z = null;
        if (this.f29772g != null) {
            this.f29775j.h();
            this.f29772g = null;
        }
        AbstractC4814d abstractC4814d = this.f29751F;
        if (abstractC4814d != null) {
            abstractC4814d.c();
            this.f29752G.c();
            this.f29753H.c();
        }
    }

    void L() {
        Z(1);
    }

    androidx.lifecycle.X L0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        return this.f29763R.i(abstractComponentCallbacksC2838q);
    }

    void M(boolean z10) {
        if (z10 && (this.f29789x instanceof y1.e)) {
            F1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.performLowMemory();
                if (z10) {
                    abstractComponentCallbacksC2838q.mChildFragmentManager.M(true);
                }
            }
        }
    }

    void M0() {
        this.f29774i = true;
        h0(true);
        this.f29774i = false;
        if (!f29745V || this.f29773h == null) {
            if (this.f29775j.g()) {
                if (Q0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                h1();
                return;
            } else {
                if (Q0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f29772g.l();
                return;
            }
        }
        if (!this.f29780o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(v0(this.f29773h));
            for (o oVar : this.f29780o) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    oVar.b((AbstractComponentCallbacksC2838q) it.next(), true);
                }
            }
        }
        Iterator it2 = this.f29773h.f29861c.iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = ((U.a) it2.next()).f29879b;
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.mTransitioning = false;
            }
        }
        Iterator it3 = B(new ArrayList(Collections.singletonList(this.f29773h)), 0, 1).iterator();
        while (it3.hasNext()) {
            ((c0) it3.next()).f();
        }
        Iterator it4 = this.f29773h.f29861c.iterator();
        while (it4.hasNext()) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = ((U.a) it4.next()).f29879b;
            if (abstractComponentCallbacksC2838q2 != null && abstractComponentCallbacksC2838q2.mContainer == null) {
                C(abstractComponentCallbacksC2838q2).m();
            }
        }
        this.f29773h = null;
        G1();
        if (Q0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f29775j.g() + " for  FragmentManager " + this);
        }
    }

    void N(boolean z10, boolean z11) {
        if (z11 && (this.f29789x instanceof androidx.core.app.r)) {
            F1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.performMultiWindowModeChanged(z10);
                if (z11) {
                    abstractComponentCallbacksC2838q.mChildFragmentManager.N(z10, true);
                }
            }
        }
    }

    void N0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (Q0(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC2838q);
        }
        if (abstractComponentCallbacksC2838q.mHidden) {
            return;
        }
        abstractComponentCallbacksC2838q.mHidden = true;
        abstractComponentCallbacksC2838q.mHiddenChanged = true ^ abstractComponentCallbacksC2838q.mHiddenChanged;
        C1(abstractComponentCallbacksC2838q);
    }

    void O(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        Iterator it = this.f29782q.iterator();
        while (it.hasNext()) {
            ((O) it.next()).a(this, abstractComponentCallbacksC2838q);
        }
    }

    void O0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (abstractComponentCallbacksC2838q.mAdded && R0(abstractComponentCallbacksC2838q)) {
            this.f29755J = true;
        }
    }

    void P() {
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.l()) {
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.onHiddenChanged(abstractComponentCallbacksC2838q.isHidden());
                abstractComponentCallbacksC2838q.mChildFragmentManager.P();
            }
        }
    }

    public boolean P0() {
        return this.f29758M;
    }

    boolean Q(MenuItem menuItem) {
        if (this.f29788w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null && abstractComponentCallbacksC2838q.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void R(Menu menu) {
        if (this.f29788w < 1) {
            return;
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.performOptionsMenuClosed(menu);
            }
        }
    }

    void T() {
        Z(5);
    }

    boolean T0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (abstractComponentCallbacksC2838q == null) {
            return false;
        }
        return abstractComponentCallbacksC2838q.isHidden();
    }

    void U(boolean z10, boolean z11) {
        if (z11 && (this.f29789x instanceof androidx.core.app.s)) {
            F1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.performPictureInPictureModeChanged(z10);
                if (z11) {
                    abstractComponentCallbacksC2838q.mChildFragmentManager.U(z10, true);
                }
            }
        }
    }

    boolean U0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (abstractComponentCallbacksC2838q == null) {
            return true;
        }
        return abstractComponentCallbacksC2838q.isMenuVisible();
    }

    boolean V(Menu menu) {
        boolean z10 = false;
        if (this.f29788w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null && U0(abstractComponentCallbacksC2838q) && abstractComponentCallbacksC2838q.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    boolean V0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (abstractComponentCallbacksC2838q == null) {
            return true;
        }
        K k10 = abstractComponentCallbacksC2838q.mFragmentManager;
        return abstractComponentCallbacksC2838q.equals(k10.H0()) && V0(k10.f29791z);
    }

    void W() {
        G1();
        S(this.f29746A);
    }

    boolean W0(int i10) {
        return this.f29788w >= i10;
    }

    void X() {
        this.f29756K = false;
        this.f29757L = false;
        this.f29763R.l(false);
        Z(7);
    }

    public boolean X0() {
        return this.f29756K || this.f29757L;
    }

    void Y() {
        this.f29756K = false;
        this.f29757L = false;
        this.f29763R.l(false);
        Z(5);
    }

    void Y0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, String[] strArr, int i10) {
        if (this.f29753H == null) {
            this.f29789x.l(abstractComponentCallbacksC2838q, strArr, i10);
            return;
        }
        this.f29754I.addLast(new m(abstractComponentCallbacksC2838q.mWho, i10));
        this.f29753H.a(strArr);
    }

    void Z0(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Intent intent, int i10, Bundle bundle) {
        if (this.f29751F == null) {
            this.f29789x.n(abstractComponentCallbacksC2838q, intent, i10, bundle);
            return;
        }
        this.f29754I.addLast(new m(abstractComponentCallbacksC2838q.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f29751F.a(intent);
    }

    void a0() {
        this.f29757L = true;
        this.f29763R.l(true);
        Z(4);
    }

    void a1(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.f29752G == null) {
            this.f29789x.o(abstractComponentCallbacksC2838q, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Q0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + abstractComponentCallbacksC2838q);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C4818h c4818hA = new C4818h.a(intentSender).b(intent).c(i12, i11).a();
        this.f29754I.addLast(new m(abstractComponentCallbacksC2838q.mWho, i10));
        if (Q0(2)) {
            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC2838q + "is launching an IntentSender for result ");
        }
        this.f29752G.a(c4818hA);
    }

    void b0() {
        Z(2);
    }

    void b1(int i10, boolean z10) {
        A a10;
        if (this.f29789x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f29788w) {
            this.f29788w = i10;
            this.f29768c.t();
            E1();
            if (this.f29755J && (a10 = this.f29789x) != null && this.f29788w == 7) {
                a10.p();
                this.f29755J = false;
            }
        }
    }

    void c1() {
        if (this.f29789x == null) {
            return;
        }
        this.f29756K = false;
        this.f29757L = false;
        this.f29763R.l(false);
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.o()) {
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.noteStateNotSaved();
            }
        }
    }

    public void d0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f29768c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f29770e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = (AbstractComponentCallbacksC2838q) this.f29770e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2838q.toString());
            }
        }
        int size2 = this.f29769d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C2822a c2822a = (C2822a) this.f29769d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c2822a.toString());
                c2822a.z(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f29776k.get());
        synchronized (this.f29766a) {
            try {
                int size3 = this.f29766a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        p pVar = (p) this.f29766a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(pVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f29789x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f29790y);
        if (this.f29791z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f29791z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f29788w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f29756K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f29757L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f29758M);
        if (this.f29755J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f29755J);
        }
    }

    public final void d1(FragmentContainerView fragmentContainerView) {
        View view;
        for (S s10 : this.f29768c.k()) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
            if (abstractComponentCallbacksC2838qK.mContainerId == fragmentContainerView.getId() && (view = abstractComponentCallbacksC2838qK.mView) != null && view.getParent() == null) {
                abstractComponentCallbacksC2838qK.mContainer = fragmentContainerView;
                s10.b();
                s10.m();
            }
        }
    }

    void e1(S s10) {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
        if (abstractComponentCallbacksC2838qK.mDeferStart) {
            if (this.f29767b) {
                this.f29759N = true;
            } else {
                abstractComponentCallbacksC2838qK.mDeferStart = false;
                s10.m();
            }
        }
    }

    void f0(p pVar, boolean z10) {
        if (!z10) {
            if (this.f29789x == null) {
                if (!this.f29758M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            v();
        }
        synchronized (this.f29766a) {
            try {
                if (this.f29789x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f29766a.add(pVar);
                    w1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void f1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            f0(new q(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void g1(String str, int i10) {
        f0(new q(str, -1, i10), false);
    }

    boolean h0(boolean z10) {
        C2822a c2822a;
        g0(z10);
        boolean z11 = false;
        if (!this.f29774i && (c2822a = this.f29773h) != null) {
            c2822a.f29921u = false;
            c2822a.x();
            if (Q0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f29773h + " as part of execPendingActions for actions " + this.f29766a);
            }
            this.f29773h.y(false, false);
            this.f29766a.add(0, this.f29773h);
            Iterator it = this.f29773h.f29861c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = ((U.a) it.next()).f29879b;
                if (abstractComponentCallbacksC2838q != null) {
                    abstractComponentCallbacksC2838q.mTransitioning = false;
                }
            }
            this.f29773h = null;
        }
        while (w0(this.f29760O, this.f29761P)) {
            z11 = true;
            this.f29767b = true;
            try {
                q1(this.f29760O, this.f29761P);
            } finally {
                w();
            }
        }
        G1();
        c0();
        this.f29768c.b();
        return z11;
    }

    public boolean h1() {
        return j1(null, -1, 0);
    }

    void i0(p pVar, boolean z10) {
        if (z10 && (this.f29789x == null || this.f29758M)) {
            return;
        }
        g0(z10);
        C2822a c2822a = this.f29773h;
        boolean z11 = false;
        if (c2822a != null) {
            c2822a.f29921u = false;
            c2822a.x();
            if (Q0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f29773h + " as part of execSingleAction for action " + pVar);
            }
            this.f29773h.y(false, false);
            boolean zA = this.f29773h.a(this.f29760O, this.f29761P);
            Iterator it = this.f29773h.f29861c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = ((U.a) it.next()).f29879b;
                if (abstractComponentCallbacksC2838q != null) {
                    abstractComponentCallbacksC2838q.mTransitioning = false;
                }
            }
            this.f29773h = null;
            z11 = zA;
        }
        boolean zA2 = pVar.a(this.f29760O, this.f29761P);
        if (z11 || zA2) {
            this.f29767b = true;
            try {
                q1(this.f29760O, this.f29761P);
            } finally {
                w();
            }
        }
        G1();
        c0();
        this.f29768c.b();
    }

    public boolean i1(int i10, int i11) {
        if (i10 >= 0) {
            return j1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    void k(C2822a c2822a) {
        this.f29769d.add(c2822a);
    }

    boolean k1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iN0 = n0(str, i10, (i11 & 1) != 0);
        if (iN0 < 0) {
            return false;
        }
        for (int size = this.f29769d.size() - 1; size >= iN0; size--) {
            arrayList.add((C2822a) this.f29769d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    S l(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        String str = abstractComponentCallbacksC2838q.mPreviousWho;
        if (str != null) {
            C4755c.f(abstractComponentCallbacksC2838q, str);
        }
        if (Q0(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC2838q);
        }
        S sC = C(abstractComponentCallbacksC2838q);
        abstractComponentCallbacksC2838q.mFragmentManager = this;
        this.f29768c.r(sC);
        if (!abstractComponentCallbacksC2838q.mDetached) {
            this.f29768c.a(abstractComponentCallbacksC2838q);
            abstractComponentCallbacksC2838q.mRemoving = false;
            if (abstractComponentCallbacksC2838q.mView == null) {
                abstractComponentCallbacksC2838q.mHiddenChanged = false;
            }
            if (R0(abstractComponentCallbacksC2838q)) {
                this.f29755J = true;
            }
        }
        return sC;
    }

    public boolean l0() {
        boolean zH0 = h0(true);
        u0();
        return zH0;
    }

    boolean l1(ArrayList arrayList, ArrayList arrayList2) {
        if (Q0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f29766a);
        }
        if (this.f29769d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList arrayList3 = this.f29769d;
        C2822a c2822a = (C2822a) arrayList3.get(arrayList3.size() - 1);
        this.f29773h = c2822a;
        Iterator it = c2822a.f29861c.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = ((U.a) it.next()).f29879b;
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.mTransitioning = true;
            }
        }
        return k1(arrayList, arrayList2, null, -1, 0);
    }

    public void m(O o10) {
        this.f29782q.add(o10);
    }

    AbstractComponentCallbacksC2838q m0(String str) {
        return this.f29768c.f(str);
    }

    void m1() {
        f0(new r(), false);
    }

    public void n(o oVar) {
        this.f29780o.add(oVar);
    }

    public void n1(l lVar, boolean z10) {
        this.f29781p.o(lVar, z10);
    }

    void o(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        this.f29763R.a(abstractComponentCallbacksC2838q);
    }

    void o1(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (Q0(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC2838q + " nesting=" + abstractComponentCallbacksC2838q.mBackStackNesting);
        }
        boolean zIsInBackStack = abstractComponentCallbacksC2838q.isInBackStack();
        if (abstractComponentCallbacksC2838q.mDetached && zIsInBackStack) {
            return;
        }
        this.f29768c.u(abstractComponentCallbacksC2838q);
        if (R0(abstractComponentCallbacksC2838q)) {
            this.f29755J = true;
        }
        abstractComponentCallbacksC2838q.mRemoving = true;
        C1(abstractComponentCallbacksC2838q);
    }

    int p() {
        return this.f29776k.getAndIncrement();
    }

    public AbstractComponentCallbacksC2838q p0(int i10) {
        return this.f29768c.g(i10);
    }

    public void p1(o oVar) {
        this.f29780o.remove(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void q(A a10, AbstractC2844x abstractC2844x, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        String str;
        if (this.f29789x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f29789x = a10;
        this.f29790y = abstractC2844x;
        this.f29791z = abstractComponentCallbacksC2838q;
        if (abstractComponentCallbacksC2838q != null) {
            m(new h(abstractComponentCallbacksC2838q));
        } else if (a10 instanceof O) {
            m((O) a10);
        }
        if (this.f29791z != null) {
            G1();
        }
        if (a10 instanceof androidx.activity.K) {
            androidx.activity.K k10 = (androidx.activity.K) a10;
            androidx.activity.H onBackPressedDispatcher = k10.getOnBackPressedDispatcher();
            this.f29772g = onBackPressedDispatcher;
            androidx.lifecycle.r rVar = k10;
            if (abstractComponentCallbacksC2838q != null) {
                rVar = abstractComponentCallbacksC2838q;
            }
            onBackPressedDispatcher.i(rVar, this.f29775j);
        }
        if (abstractComponentCallbacksC2838q != null) {
            this.f29763R = abstractComponentCallbacksC2838q.mFragmentManager.y0(abstractComponentCallbacksC2838q);
        } else if (a10 instanceof androidx.lifecycle.Y) {
            this.f29763R = N.g(((androidx.lifecycle.Y) a10).getViewModelStore());
        } else {
            this.f29763R = new N(false);
        }
        this.f29763R.l(X0());
        this.f29768c.A(this.f29763R);
        Object obj = this.f29789x;
        if ((obj instanceof P3.i) && abstractComponentCallbacksC2838q == null) {
            P3.f savedStateRegistry = ((P3.i) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new f.b() { // from class: androidx.fragment.app.I
                @Override // P3.f.b
                public final Bundle a() {
                    return this.f29742a.v1();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                t1(bundleA);
            }
        }
        Object obj2 = this.f29789x;
        if (obj2 instanceof InterfaceC4817g) {
            AbstractC4816f activityResultRegistry = ((InterfaceC4817g) obj2).getActivityResultRegistry();
            if (abstractComponentCallbacksC2838q != null) {
                str = abstractComponentCallbacksC2838q.mWho + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f29751F = activityResultRegistry.m(str2 + "StartActivityForResult", new C4890c(), new i());
            this.f29752G = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new k(), new j());
            this.f29753H = activityResultRegistry.m(str2 + "RequestPermissions", new C4889b(), new a());
        }
        Object obj3 = this.f29789x;
        if (obj3 instanceof InterfaceC7196d) {
            ((InterfaceC7196d) obj3).addOnConfigurationChangedListener(this.f29783r);
        }
        Object obj4 = this.f29789x;
        if (obj4 instanceof y1.e) {
            ((y1.e) obj4).addOnTrimMemoryListener(this.f29784s);
        }
        Object obj5 = this.f29789x;
        if (obj5 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj5).addOnMultiWindowModeChangedListener(this.f29785t);
        }
        Object obj6 = this.f29789x;
        if (obj6 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj6).addOnPictureInPictureModeChangedListener(this.f29786u);
        }
        Object obj7 = this.f29789x;
        if ((obj7 instanceof InterfaceC2787v) && abstractComponentCallbacksC2838q == null) {
            ((InterfaceC2787v) obj7).addMenuProvider(this.f29787v);
        }
    }

    public AbstractComponentCallbacksC2838q q0(String str) {
        return this.f29768c.h(str);
    }

    void r(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (Q0(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC2838q);
        }
        if (abstractComponentCallbacksC2838q.mDetached) {
            abstractComponentCallbacksC2838q.mDetached = false;
            if (abstractComponentCallbacksC2838q.mAdded) {
                return;
            }
            this.f29768c.a(abstractComponentCallbacksC2838q);
            if (Q0(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC2838q);
            }
            if (R0(abstractComponentCallbacksC2838q)) {
                this.f29755J = true;
            }
        }
    }

    AbstractComponentCallbacksC2838q r0(String str) {
        return this.f29768c.i(str);
    }

    void r1(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        this.f29763R.k(abstractComponentCallbacksC2838q);
    }

    public U s() {
        return new C2822a(this);
    }

    void t() {
        if (Q0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f29773h);
        }
        C2822a c2822a = this.f29773h;
        if (c2822a != null) {
            c2822a.f29921u = false;
            c2822a.x();
            this.f29773h.r(true, new Runnable() { // from class: androidx.fragment.app.J
                @Override // java.lang.Runnable
                public final void run() {
                    K.c(this.f29743a);
                }
            });
            this.f29773h.h();
            this.f29774i = true;
            l0();
            this.f29774i = false;
            this.f29773h = null;
        }
    }

    void t1(Parcelable parcelable) {
        S s10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f29789x.f().getClassLoader());
                this.f29778m.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f29789x.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f29768c.x(map);
        M m10 = (M) bundle3.getParcelable("state");
        if (m10 == null) {
            return;
        }
        this.f29768c.v();
        Iterator it = m10.f29816a.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f29768c.B((String) it.next(), null);
            if (bundleB != null) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qE = this.f29763R.e(((Q) bundleB.getParcelable("state")).f29833b);
                if (abstractComponentCallbacksC2838qE != null) {
                    if (Q0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC2838qE);
                    }
                    s10 = new S(this.f29781p, this.f29768c, abstractComponentCallbacksC2838qE, bundleB);
                } else {
                    s10 = new S(this.f29781p, this.f29768c, this.f29789x.f().getClassLoader(), B0(), bundleB);
                }
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
                abstractComponentCallbacksC2838qK.mSavedFragmentState = bundleB;
                abstractComponentCallbacksC2838qK.mFragmentManager = this;
                if (Q0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC2838qK.mWho + "): " + abstractComponentCallbacksC2838qK);
                }
                s10.o(this.f29789x.f().getClassLoader());
                this.f29768c.r(s10);
                s10.s(this.f29788w);
            }
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29763R.h()) {
            if (!this.f29768c.c(abstractComponentCallbacksC2838q.mWho)) {
                if (Q0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC2838q + " that was not found in the set of active Fragments " + m10.f29816a);
                }
                this.f29763R.k(abstractComponentCallbacksC2838q);
                abstractComponentCallbacksC2838q.mFragmentManager = this;
                S s11 = new S(this.f29781p, this.f29768c, abstractComponentCallbacksC2838q);
                s11.s(1);
                s11.m();
                abstractComponentCallbacksC2838q.mRemoving = true;
                s11.m();
            }
        }
        this.f29768c.w(m10.f29817b);
        if (m10.f29818c != null) {
            this.f29769d = new ArrayList(m10.f29818c.length);
            int i10 = 0;
            while (true) {
                C2823b[] c2823bArr = m10.f29818c;
                if (i10 >= c2823bArr.length) {
                    break;
                }
                C2822a c2822aB = c2823bArr[i10].b(this);
                if (Q0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + c2822aB.f29922v + "): " + c2822aB);
                    PrintWriter printWriter = new PrintWriter(new Z("FragmentManager"));
                    c2822aB.A("  ", printWriter, false);
                    printWriter.close();
                }
                this.f29769d.add(c2822aB);
                i10++;
            }
        } else {
            this.f29769d = new ArrayList();
        }
        this.f29776k.set(m10.f29819d);
        String str3 = m10.f29820e;
        if (str3 != null) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qM0 = m0(str3);
            this.f29746A = abstractComponentCallbacksC2838qM0;
            S(abstractComponentCallbacksC2838qM0);
        }
        ArrayList arrayList = m10.f29821f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f29777l.put((String) arrayList.get(i11), (C2824c) m10.f29822g.get(i11));
            }
        }
        this.f29754I = new ArrayDeque(m10.f29823h);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29791z;
        if (abstractComponentCallbacksC2838q != null) {
            sb2.append(abstractComponentCallbacksC2838q.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f29791z)));
            sb2.append("}");
        } else {
            A a10 = this.f29789x;
            if (a10 != null) {
                sb2.append(a10.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f29789x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    boolean u() {
        boolean zR0 = false;
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29768c.l()) {
            if (abstractComponentCallbacksC2838q != null) {
                zR0 = R0(abstractComponentCallbacksC2838q);
            }
            if (zR0) {
                return true;
            }
        }
        return false;
    }

    Set v0(C2822a c2822a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c2822a.f29861c.size(); i10++) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = ((U.a) c2822a.f29861c.get(i10)).f29879b;
            if (abstractComponentCallbacksC2838q != null && c2822a.f29867i) {
                hashSet.add(abstractComponentCallbacksC2838q);
            }
        }
        return hashSet;
    }

    public Bundle v1() {
        C2823b[] c2823bArr;
        Bundle bundle = new Bundle();
        u0();
        e0();
        h0(true);
        this.f29756K = true;
        this.f29763R.l(true);
        ArrayList arrayListY = this.f29768c.y();
        HashMap mapM = this.f29768c.m();
        if (!mapM.isEmpty()) {
            ArrayList arrayListZ = this.f29768c.z();
            int size = this.f29769d.size();
            if (size > 0) {
                c2823bArr = new C2823b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c2823bArr[i10] = new C2823b((C2822a) this.f29769d.get(i10));
                    if (Q0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f29769d.get(i10));
                    }
                }
            } else {
                c2823bArr = null;
            }
            M m10 = new M();
            m10.f29816a = arrayListY;
            m10.f29817b = arrayListZ;
            m10.f29818c = c2823bArr;
            m10.f29819d = this.f29776k.get();
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29746A;
            if (abstractComponentCallbacksC2838q != null) {
                m10.f29820e = abstractComponentCallbacksC2838q.mWho;
            }
            m10.f29821f.addAll(this.f29777l.keySet());
            m10.f29822g.addAll(this.f29777l.values());
            m10.f29823h = new ArrayList(this.f29754I);
            bundle.putParcelable("state", m10);
            for (String str : this.f29778m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f29778m.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
            }
        } else if (Q0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    void w1() {
        synchronized (this.f29766a) {
            try {
                if (this.f29766a.size() == 1) {
                    this.f29789x.h().removeCallbacks(this.f29765T);
                    this.f29789x.h().post(this.f29765T);
                    G1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int x0() {
        return this.f29769d.size() + (this.f29773h != null ? 1 : 0);
    }

    void x1(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, boolean z10) {
        ViewGroup viewGroupA0 = A0(abstractComponentCallbacksC2838q);
        if (viewGroupA0 == null || !(viewGroupA0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupA0).setDrawDisappearingViewsLast(!z10);
    }

    public final void y(String str) {
        this.f29778m.remove(str);
        if (Q0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public final void y1(String str, Bundle bundle) {
        n nVar = (n) this.f29779n.get(str);
        if (nVar == null || !nVar.b(AbstractC2857k.b.f30238d)) {
            this.f29778m.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
        if (Q0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final void z(String str) {
        n nVar = (n) this.f29779n.remove(str);
        if (nVar != null) {
            nVar.c();
        }
        if (Q0(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    AbstractC2844x z0() {
        return this.f29790y;
    }

    public final void z1(String str, androidx.lifecycle.r rVar, P p10) {
        AbstractC2857k lifecycle = rVar.getLifecycle();
        if (lifecycle.getCurrentState() == AbstractC2857k.b.f30235a) {
            return;
        }
        g gVar = new g(str, p10, lifecycle);
        n nVar = (n) this.f29779n.put(str, new n(lifecycle, p10, gVar));
        if (nVar != null) {
            nVar.c();
        }
        if (Q0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + p10);
        }
        lifecycle.addObserver(gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        String f29806a;

        /* JADX INFO: renamed from: b */
        int f29807b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public m[] newArray(int i10) {
                return new m[i10];
            }
        }

        m(String str, int i10) {
            this.f29806a = str;
            this.f29807b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f29806a);
            parcel.writeInt(this.f29807b);
        }

        m(Parcel parcel) {
            this.f29806a = parcel.readString();
            this.f29807b = parcel.readInt();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface o {
        void b(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, boolean z10);

        void onBackStackChanged();

        default void d() {
        }

        default void a(C2632b c2632b) {
        }

        default void c(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, boolean z10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class l {
        public abstract void m(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, View view, Bundle bundle);

        public void d(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        }

        public void e(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        }

        public void f(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        }

        public void i(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        }

        public void k(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        }

        public void l(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        }

        public void n(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        }

        public void a(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Bundle bundle) {
        }

        public void b(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Context context) {
        }

        public void c(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Bundle bundle) {
        }

        public void g(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Context context) {
        }

        public void h(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Bundle bundle) {
        }

        public void j(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Bundle bundle) {
        }
    }
}
