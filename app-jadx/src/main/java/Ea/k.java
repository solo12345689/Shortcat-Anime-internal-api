package Ea;

import Aa.f;
import Ea.n;
import Ud.AbstractC2279u;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2777p0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.f0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import za.C7347b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends C2777p0.b implements I, n {

    /* JADX INFO: renamed from: a */
    private final com.facebook.react.views.view.g f5842a;

    /* JADX INFO: renamed from: b */
    private final View f5843b;

    /* JADX INFO: renamed from: c */
    private final C3284b0 f5844c;

    /* JADX INFO: renamed from: d */
    private final l f5845d;

    /* JADX INFO: renamed from: e */
    private final int f5846e;

    /* JADX INFO: renamed from: f */
    private double f5847f;

    /* JADX INFO: renamed from: g */
    private double f5848g;

    /* JADX INFO: renamed from: h */
    private boolean f5849h;

    /* JADX INFO: renamed from: i */
    private boolean f5850i;

    /* JADX INFO: renamed from: j */
    private int f5851j;

    /* JADX INFO: renamed from: k */
    private int f5852k;

    /* JADX INFO: renamed from: l */
    private HashSet f5853l;

    /* JADX INFO: renamed from: m */
    private boolean f5854m;

    /* JADX INFO: renamed from: n */
    private final ViewTreeObserver.OnGlobalFocusChangeListener f5855n;

    /* JADX INFO: renamed from: o */
    private g f5856o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.facebook.react.views.view.g eventPropagationView, View view, C3284b0 c3284b0, l config) {
        super(config.b());
        AbstractC5504s.h(eventPropagationView, "eventPropagationView");
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(config, "config");
        this.f5842a = eventPropagationView;
        this.f5843b = view;
        this.f5844c = c3284b0;
        this.f5845d = config;
        this.f5846e = f0.f(eventPropagationView);
        this.f5852k = -1;
        this.f5853l = new HashSet();
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: Ea.j
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                k.f(this.f5841a, view2, view3);
            }
        };
        this.f5855n = onGlobalFocusChangeListener;
        if ((config.a() & config.d()) != 0) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values");
        }
        this.f5856o = new g(view, eventPropagationView, c3284b0);
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public static final void f(k kVar, View view, View view2) {
        if (view2 instanceof EditText) {
            kVar.f5852k = ((EditText) view2).getId();
            if (!kVar.f5849h || view == null) {
                return;
            }
            C3284b0 c3284b0 = kVar.f5844c;
            int id2 = kVar.f5842a.getId();
            int i10 = kVar.f5846e;
            int id3 = kVar.f5842a.getId();
            f.a aVar = Aa.f.f342f;
            Ba.g.a(c3284b0, id2, new Aa.f(i10, id3, aVar.d(), kVar.f5847f, 1.0d, 0, kVar.f5852k));
            Ba.g.a(kVar.f5844c, kVar.f5842a.getId(), new Aa.f(kVar.f5846e, kVar.f5842a.getId(), aVar.a(), kVar.f5847f, 1.0d, 0, kVar.f5852k));
            Ba.g.b(kVar.f5844c, "KeyboardController::keyboardWillShow", kVar.h(kVar.f5847f));
            Ba.g.b(kVar.f5844c, "KeyboardController::keyboardDidShow", kVar.h(kVar.f5847f));
        }
    }

    private final double g() {
        A1.b bVarF;
        A1.b bVarF2;
        L0 l0F = AbstractC2747a0.F(this.f5843b);
        int i10 = 0;
        int i11 = (l0F == null || (bVarF2 = l0F.f(L0.p.d())) == null) ? 0 : bVarF2.f107d;
        if (!this.f5845d.c() && l0F != null && (bVarF = l0F.f(L0.p.g())) != null) {
            i10 = bVarF.f107d;
        }
        return AbstractC5874j.c(Ba.d.a(i11 - i10), 0.0d);
    }

    private final WritableMap h(double d10) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("height", d10);
        writableMapCreateMap.putInt("duration", this.f5851j);
        writableMapCreateMap.putDouble(DiagnosticsEntry.TIMESTAMP_KEY, System.currentTimeMillis());
        writableMapCreateMap.putInt("target", this.f5852k);
        EditText editTextB = Ka.a.f10969a.b();
        writableMapCreateMap.putString("type", editTextB != null ? Ba.c.f(editTextB) : null);
        writableMapCreateMap.putString("appearance", Ba.g.c(this.f5844c));
        return writableMapCreateMap;
    }

    private final boolean j() {
        return this.f5851j == -1;
    }

    private final boolean k() {
        L0 l0F = AbstractC2747a0.F(this.f5843b);
        if (l0F != null) {
            return l0F.r(L0.p.d());
        }
        return false;
    }

    public static final void m(k kVar, C2777p0 c2777p0) {
        double dG = kVar.g();
        kVar.f5849h = kVar.k();
        kVar.f5848g = dG;
        if (kVar.f5853l.contains(c2777p0)) {
            kVar.f5851j = 0;
            kVar.f5853l.remove(c2777p0);
            return;
        }
        Ba.g.b(kVar.f5844c, "KeyboardController::" + (!kVar.f5849h ? "keyboardDidHide" : "keyboardDidShow"), kVar.h(dG));
        Ba.g.a(kVar.f5844c, kVar.f5842a.getId(), new Aa.f(kVar.f5846e, kVar.f5842a.getId(), Aa.f.f342f.a(), dG, !kVar.f5849h ? 0.0d : 1.0d, kVar.f5851j, kVar.f5852k));
        kVar.f5851j = 0;
        Ba.g.d(kVar.f5844c, kVar.f5842a.getId());
    }

    private final void n(double d10) {
        this.f5851j = 0;
        Ba.g.b(this.f5844c, "KeyboardController::keyboardWillShow", h(d10));
        f.a aVar = Aa.f.f342f;
        Iterator it = AbstractC2279u.p(aVar.d(), aVar.c(), aVar.a()).iterator();
        while (it.hasNext()) {
            Ba.g.a(this.f5844c, this.f5842a.getId(), new Aa.f(this.f5846e, this.f5842a.getId(), (f.a.EnumC0007a) it.next(), d10, 1.0d, 0, this.f5852k));
        }
        Ba.g.b(this.f5844c, "KeyboardController::keyboardDidShow", h(d10));
        Ba.g.d(this.f5844c, this.f5842a.getId());
        this.f5847f = d10;
    }

    public static /* synthetic */ void q(k kVar, Double d10, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        if ((i10 & 2) != 0) {
            bool = null;
        }
        kVar.p(d10, bool);
    }

    @Override // Ea.n
    public void a(boolean z10) {
        this.f5854m = z10;
    }

    @Override // androidx.core.view.I
    public L0 d(View v10, L0 insets) {
        AbstractC5504s.h(v10, "v");
        AbstractC5504s.h(insets, "insets");
        double dG = g();
        boolean z10 = (this.f5849h && k()) && !(this.f5850i || Ca.a.f2906a.a());
        boolean z11 = this.f5847f == dG;
        if (z10 && !z11 && !m.f5862b) {
            Fa.a.b(Fa.a.f6597a, m.f5861a, "onApplyWindowInsets: " + this.f5847f + " -> " + dG, null, 4, null);
            g gVar = this.f5856o;
            if (gVar != null) {
                gVar.l();
            }
            n(dG);
        }
        return insets;
    }

    public final void e() {
        this.f5843b.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f5855n);
        g gVar = this.f5856o;
        if (gVar != null) {
            gVar.f();
        }
    }

    public final g i() {
        return this.f5856o;
    }

    public boolean l() {
        return this.f5854m;
    }

    public void o(boolean z10) {
        n.a.a(this, z10);
    }

    @Override // androidx.core.view.C2777p0.b
    public void onEnd(final C2777p0 animation) {
        AbstractC5504s.h(animation, "animation");
        super.onEnd(animation);
        if (!Ba.j.a(animation) || l()) {
            return;
        }
        this.f5850i = false;
        this.f5851j = (int) animation.b();
        Runnable runnable = new Runnable() { // from class: Ea.i
            @Override // java.lang.Runnable
            public final void run() {
                k.m(this.f5839a, animation);
            }
        };
        if (j()) {
            this.f5843b.postDelayed(runnable, C7347b.f66027a.a());
        } else {
            runnable.run();
        }
    }

    @Override // androidx.core.view.C2777p0.b
    public L0 onProgress(L0 insets, List runningAnimations) {
        Object next;
        AbstractC5504s.h(insets, "insets");
        AbstractC5504s.h(runningAnimations, "runningAnimations");
        Iterator it = runningAnimations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C2777p0 c2777p0 = (C2777p0) next;
            if (Ba.j.a(c2777p0) && !this.f5853l.contains(c2777p0)) {
                break;
            }
        }
        boolean z10 = next == null;
        if (!l() && !z10) {
            A1.b bVarF = insets.f(this.f5845d.a());
            AbstractC5504s.g(bVarF, "getInsets(...)");
            A1.b NONE = insets.f(this.f5845d.d());
            AbstractC5504s.g(NONE, "getInsets(...)");
            if (this.f5845d.c()) {
                NONE = A1.b.f103e;
                AbstractC5504s.g(NONE, "NONE");
            }
            A1.b bVarB = A1.b.b(A1.b.e(bVarF, NONE), A1.b.f103e);
            AbstractC5504s.g(bVarB, "let(...)");
            float f10 = bVarB.f107d - bVarB.f105b;
            double dA = Ba.d.a(f10);
            double d10 = 0.0d;
            try {
                double dAbs = Math.abs(dA / this.f5847f);
                if (!Double.isNaN(dAbs)) {
                    if (!Double.isInfinite(dAbs)) {
                        d10 = dAbs;
                    }
                }
            } catch (ArithmeticException e10) {
                Fa.a.d(Fa.a.f6597a, m.f5861a, "Caught arithmetic exception during `progress` calculation: " + e10, null, 4, null);
            }
            double d11 = d10;
            Fa.a aVar = Fa.a.f6597a;
            String str = m.f5861a;
            Ca.a aVar2 = Ca.a.f2906a;
            Fa.a.b(aVar, str, "DiffY: " + f10 + " " + dA + " " + d11 + " " + aVar2.a() + " " + this.f5852k, null, 4, null);
            Ba.g.a(this.f5844c, this.f5842a.getId(), new Aa.f(this.f5846e, this.f5842a.getId(), aVar2.a() ? Aa.f.f342f.b() : Aa.f.f342f.c(), dA, d11, this.f5851j, this.f5852k));
        }
        return insets;
    }

    @Override // androidx.core.view.C2777p0.b
    public C2777p0.a onStart(C2777p0 animation, C2777p0.a bounds) {
        AbstractC5504s.h(animation, "animation");
        AbstractC5504s.h(bounds, "bounds");
        if (!Ba.j.a(animation) || l()) {
            return bounds;
        }
        this.f5850i = true;
        this.f5849h = k();
        this.f5851j = (int) animation.b();
        double dG = g();
        if (this.f5849h) {
            this.f5847f = dG;
        }
        g gVar = this.f5856o;
        if (gVar != null) {
            gVar.l();
        }
        boolean z10 = (dG == 0.0d || this.f5848g == dG) ? false : true;
        boolean z11 = this.f5849h && this.f5848g != 0.0d;
        if (z10 && z11 && m.f5862b) {
            n(dG);
            this.f5853l.add(animation);
            return bounds;
        }
        Ba.g.b(this.f5844c, "KeyboardController::" + (!this.f5849h ? "keyboardWillHide" : "keyboardWillShow"), h(dG));
        Fa.a.b(Fa.a.f6597a, m.f5861a, "HEIGHT:: " + dG + " TAG:: " + this.f5852k, null, 4, null);
        C3284b0 c3284b0 = this.f5844c;
        int id2 = this.f5842a.getId();
        double d10 = 0.0d;
        int i10 = this.f5846e;
        int id3 = this.f5842a.getId();
        f.a.EnumC0007a enumC0007aD = Aa.f.f342f.d();
        if (this.f5849h) {
            d10 = 1.0d;
        }
        Ba.g.a(c3284b0, id2, new Aa.f(i10, id3, enumC0007aD, dG, d10, this.f5851j, this.f5852k));
        C2777p0.a aVarOnStart = super.onStart(animation, bounds);
        AbstractC5504s.g(aVarOnStart, "onStart(...)");
        return aVarOnStart;
    }

    public final void p(Double d10, Boolean bool) {
        double dDoubleValue = d10 != null ? d10.doubleValue() : g();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : k();
        this.f5849h = zBooleanValue;
        this.f5848g = dDoubleValue;
        this.f5850i = false;
        this.f5851j = 0;
        Ba.g.b(this.f5844c, "KeyboardController::" + (!zBooleanValue ? "keyboardDidHide" : "keyboardDidShow"), h(dDoubleValue));
        f.a aVar = Aa.f.f342f;
        Iterator it = AbstractC2279u.p(aVar.c(), aVar.a()).iterator();
        while (it.hasNext()) {
            Ba.g.a(this.f5844c, this.f5842a.getId(), new Aa.f(this.f5846e, this.f5842a.getId(), (f.a.EnumC0007a) it.next(), dDoubleValue, !this.f5849h ? 0.0d : 1.0d, this.f5851j, this.f5852k));
        }
    }
}
