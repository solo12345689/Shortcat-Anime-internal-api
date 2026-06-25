package com.swmansion.rnscreens.safearea;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import bb.C3040a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.views.view.g;
import com.swmansion.rnscreens.safearea.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends g implements I, ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f44718i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f44719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f44720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.swmansion.rnscreens.safearea.a f44721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.swmansion.rnscreens.safearea.a f44722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC3282a0 f44724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3040a f44725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f44726h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f44719a = reactContext;
        this.f44720b = new WeakReference(null);
        a.C0702a c0702a = com.swmansion.rnscreens.safearea.a.f44707e;
        this.f44721c = c0702a.b();
        this.f44722d = c0702a.b();
        this.f44726h = b.f44713a;
        AbstractC2747a0.w0(this, this);
    }

    private final c B() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof c)) {
            parent = parent.getParent();
        }
        if (parent instanceof c) {
            return (c) parent;
        }
        return null;
    }

    private final A1.b C(A1.b bVar) {
        C3040a c3040a = this.f44725g;
        int i10 = c3040a != null ? c3040a.b() : false ? 0 : bVar.f104a;
        C3040a c3040a2 = this.f44725g;
        int i11 = c3040a2 != null ? c3040a2.d() : false ? 0 : bVar.f105b;
        C3040a c3040a3 = this.f44725g;
        int i12 = c3040a3 != null ? c3040a3.c() : false ? 0 : bVar.f106c;
        C3040a c3040a4 = this.f44725g;
        A1.b bVarC = A1.b.c(i10, i11, i12, c3040a4 != null ? c3040a4.a() : false ? 0 : bVar.f107d);
        AbstractC5504s.g(bVarC, "of(...)");
        return bVarC;
    }

    private final void E() {
        a.C0702a c0702a = com.swmansion.rnscreens.safearea.a.f44707e;
        com.swmansion.rnscreens.safearea.a aVarC = c0702a.c(this.f44726h.b() ? this.f44721c : c0702a.b(), this.f44726h.c() ? this.f44722d : c0702a.b());
        InterfaceC3282a0 stateWrapper = getStateWrapper();
        if (stateWrapper != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("left", B.g(aVarC.c()));
            writableMapCreateMap.putDouble("top", B.g(aVarC.e()));
            writableMapCreateMap.putDouble("right", B.g(aVarC.d()));
            writableMapCreateMap.putDouble("bottom", B.g(aVarC.b()));
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putMap("insets", writableMapCreateMap);
            stateWrapper.updateState(writableMapCreateMap2);
        }
    }

    private final boolean F() {
        if (!this.f44723e) {
            return false;
        }
        this.f44723e = false;
        E();
        return true;
    }

    public final void D(com.swmansion.rnscreens.safearea.a newInterfaceInsets) {
        AbstractC5504s.h(newInterfaceInsets, "newInterfaceInsets");
        if (AbstractC5504s.c(newInterfaceInsets, this.f44721c)) {
            return;
        }
        this.f44721c = newInterfaceInsets;
        if (this.f44726h.b()) {
            this.f44723e = true;
        }
    }

    @Override // androidx.core.view.I
    public L0 d(View view, L0 insets) {
        boolean zC;
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(insets, "insets");
        A1.b bVarF = insets.f(L0.p.i() | L0.p.c());
        AbstractC5504s.g(bVarF, "getInsets(...)");
        if (!AbstractC5504s.c(bVarF, this.f44722d)) {
            this.f44722d = com.swmansion.rnscreens.safearea.a.f44707e.a(bVarF);
            if (this.f44726h.c()) {
                this.f44723e = true;
            }
        }
        L0.a aVar = new L0.a(insets);
        if (this.f44726h.c()) {
            A1.b bVarF2 = insets.f(L0.p.i());
            AbstractC5504s.g(bVarF2, "getInsets(...)");
            A1.b bVarC = C(bVarF2);
            A1.b bVarF3 = insets.f(L0.p.c());
            AbstractC5504s.g(bVarF3, "getInsets(...)");
            A1.b bVarC2 = C(bVarF3);
            zC = AbstractC5504s.c(bVarC2, A1.b.f103e);
            aVar.b(L0.p.i(), bVarC);
            aVar.b(L0.p.c(), bVarC2);
        } else {
            zC = false;
        }
        L0 l0A = aVar.a();
        AbstractC5504s.g(l0A, "build(...)");
        if (Build.VERSION.SDK_INT >= 30 || !zC) {
            return l0A;
        }
        L0 l0A2 = l0A.a();
        AbstractC5504s.g(l0A2, "consumeDisplayCutout(...)");
        return l0A2;
    }

    public final InterfaceC3282a0 getStateWrapper() {
        return this.f44724f;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        getViewTreeObserver().addOnPreDrawListener(this);
        c cVarB = B();
        if (cVarB == null) {
            super.onAttachedToWindow();
            return;
        }
        cVarB.setOnInterfaceInsetsChangeListener(this);
        this.f44720b = new WeakReference(cVarB);
        this.f44721c = cVarB.getInterfaceInsets();
        E();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        c cVar = (c) this.f44720b.get();
        if (cVar != null) {
            cVar.e(this);
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zF = F();
        if (zF) {
            requestLayout();
        }
        return !zF;
    }

    public final void setEdges(C3040a edges) {
        AbstractC5504s.h(edges, "edges");
        this.f44725g = edges;
        requestApplyInsets();
        this.f44723e = true;
    }

    public final void setInsetType(b insetType) {
        AbstractC5504s.h(insetType, "insetType");
        this.f44726h = insetType;
        requestApplyInsets();
        this.f44723e = true;
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f44724f = interfaceC3282a0;
    }
}
