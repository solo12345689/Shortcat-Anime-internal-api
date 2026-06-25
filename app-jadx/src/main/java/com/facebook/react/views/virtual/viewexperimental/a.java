package com.facebook.react.views.virtual.viewexperimental;

import Q7.e;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.uimanager.F;
import com.facebook.react.uimanager.M;
import com.facebook.react.views.scroll.r;
import com.facebook.react.views.scroll.s;
import com.facebook.react.views.scroll.v;
import com.facebook.react.views.view.g;
import h7.C4914b;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends g implements r, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Q7.a f38516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Q7.b f38517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f38518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s f38519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f38520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f38521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f38522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38525j;

    /* JADX INFO: renamed from: com.facebook.react.views.virtual.viewexperimental.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class C0634a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38526a;

        static {
            int[] iArr = new int[Q7.a.values().length];
            try {
                iArr[Q7.a.f14375b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q7.a.f14376c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q7.a.f14377d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38526a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.f38518c = e.f14385b;
        this.f38520e = new Rect();
        this.f38521f = new Rect();
        this.f38522g = new Rect();
    }

    private final void B() {
        E(false);
    }

    private final void D() {
        v virtualViewContainerState;
        if (!AbstractC5504s.c(this.f38520e, getContainerRelativeRect())) {
            s sVar = this.f38519d;
            if (sVar != null) {
                if (sVar != null && (virtualViewContainerState = sVar.getVirtualViewContainerState()) != null) {
                    virtualViewContainerState.m(this);
                }
                this.f38520e.set(getContainerRelativeRect());
                return;
            }
            return;
        }
        if (b.f38527a && C4914b.B()) {
            AbstractC7283a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:reportRectChangeToContainer", "no rect change " + getContainerRelativeRect());
        }
    }

    private final s E(boolean z10) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof s) {
                return (s) parent;
            }
            if (parent instanceof M) {
                return null;
            }
            if (parent instanceof View) {
                View view = (View) parent;
                view.removeOnLayoutChangeListener(this);
                if (z10) {
                    view.addOnLayoutChangeListener(this);
                }
            }
        }
        return null;
    }

    private final void F() {
        s sVar = this.f38519d;
        if (sVar == null) {
            return;
        }
        this.f38523h = 0;
        this.f38524i = 0;
        for (ViewParent parent = getParent(); parent != null && !AbstractC5504s.c(parent, sVar); parent = parent.getParent()) {
            if (parent instanceof View) {
                View view = (View) parent;
                this.f38523h += view.getLeft();
                this.f38524i += view.getTop();
            }
        }
        getContainerRelativeRect().set(getLeft() + this.f38523h, getTop() + this.f38524i, getRight() + this.f38523h, getBottom() + this.f38524i);
    }

    private final s getScrollView() {
        return E(true);
    }

    public final void C() {
        this.f38519d = getScrollView();
        if (this.f38525j) {
            F();
            D();
        }
        if (b.f38527a && C4914b.B()) {
            AbstractC7283a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:doAttachedToWindow", "");
        }
    }

    @Override // com.facebook.react.views.scroll.r
    public Rect getContainerRelativeRect() {
        return this.f38522g;
    }

    public final Q7.a getMode$ReactAndroid_release() {
        return this.f38516a;
    }

    public final Q7.b getModeChangeEmitter$ReactAndroid_release() {
        return this.f38517b;
    }

    public final String getNativeId$ReactAndroid_release() {
        Object tag = getTag(AbstractC3247l.f36906G);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public final e getRenderState$ReactAndroid_release() {
        return this.f38518c;
    }

    @Override // com.facebook.react.views.scroll.r
    public String getVirtualViewID() {
        String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
        if (nativeId$ReactAndroid_release == null) {
            nativeId$ReactAndroid_release = "unknown";
        }
        return nativeId$ReactAndroid_release + ":::" + getId();
    }

    @Override // com.facebook.react.views.scroll.r
    public void i(Q7.a newMode, Rect thresholdRect) {
        Q7.b bVar;
        Q7.b bVar2;
        AbstractC5504s.h(newMode, "newMode");
        AbstractC5504s.h(thresholdRect, "thresholdRect");
        if (this.f38517b == null || this.f38519d == null) {
            return;
        }
        Q7.a aVar = Q7.a.f14375b;
        if (newMode == aVar) {
            updateClippingRect(null);
        }
        Q7.a aVar2 = this.f38516a;
        if (newMode == aVar2) {
            if (b.f38527a && C4914b.B()) {
                AbstractC7283a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onModeChange", "no change " + newMode);
                return;
            }
            return;
        }
        this.f38516a = newMode;
        if (b.f38527a && C4914b.B()) {
            AbstractC7283a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onModeChange", aVar2 + "->" + newMode);
        }
        if (aVar2 == aVar) {
            updateClippingRect(null);
        }
        int i10 = C0634a.f38526a[newMode.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (aVar2 == aVar || (bVar2 = this.f38517b) == null) {
                    return;
                }
                bVar2.a(Q7.a.f14376c, getContainerRelativeRect(), thresholdRect, false);
                return;
            }
            if (i10 != 3) {
                throw new Td.r();
            }
            Q7.b bVar3 = this.f38517b;
            if (bVar3 != null) {
                bVar3.a(Q7.a.f14377d, getContainerRelativeRect(), thresholdRect, false);
                return;
            }
            return;
        }
        e eVar = this.f38518c;
        if (eVar == e.f14385b) {
            Q7.b bVar4 = this.f38517b;
            if (bVar4 != null) {
                bVar4.a(aVar, getContainerRelativeRect(), thresholdRect, true);
                return;
            }
            return;
        }
        if ((aVar2 == Q7.a.f14376c && eVar == e.f14386c) || (bVar = this.f38517b) == null) {
            return;
        }
        bVar.a(aVar, getContainerRelativeRect(), thresholdRect, true);
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        recycleView$ReactAndroid_release();
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f38525j = true;
        if (z10) {
            Rect containerRelativeRect = getContainerRelativeRect();
            int i14 = this.f38523h;
            int i15 = this.f38524i;
            containerRelativeRect.set(i10 + i14, i11 + i15, i12 + i14, i13 + i15);
            if (b.f38527a && C4914b.B()) {
                AbstractC7283a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onLayout", "containerRelativeRect=" + getContainerRelativeRect());
            }
            D();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i14 == i10 && i15 == i11) {
            return;
        }
        F();
        if (b.f38527a && C4914b.B()) {
            AbstractC7283a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onLayoutChange", "containerRelativeRect=" + getContainerRelativeRect());
        }
        D();
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        getContainerRelativeRect().set(getLeft() + this.f38523h, getTop() + this.f38524i, getRight() + this.f38523h, getBottom() + this.f38524i);
        if (b.f38527a && C4914b.B()) {
            AbstractC7283a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onSizeChanged", "container=" + getContainerRelativeRect());
        }
        D();
    }

    @Override // com.facebook.react.views.view.g
    public void recycleView$ReactAndroid_release() {
        v virtualViewContainerState;
        B();
        s sVar = this.f38519d;
        if (sVar != null && (virtualViewContainerState = sVar.getVirtualViewContainerState()) != null) {
            virtualViewContainerState.o(this);
        }
        this.f38519d = null;
        this.f38516a = null;
        this.f38517b = null;
        this.f38525j = false;
        this.f38520e.setEmpty();
        this.f38521f.setEmpty();
        getContainerRelativeRect().setEmpty();
    }

    public final void setMode$ReactAndroid_release(Q7.a aVar) {
        this.f38516a = aVar;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(Q7.b bVar) {
        this.f38517b = bVar;
    }

    public final void setRenderState$ReactAndroid_release(e eVar) {
        AbstractC5504s.h(eVar, "<set-?>");
        this.f38518c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.g, com.facebook.react.uimanager.F
    public void updateClippingRect(Set set) {
        if (get_removeClippedSubviews$ReactAndroid_release()) {
            if (this.f38519d == null) {
                super.updateClippingRect(set);
                return;
            }
            Rect clippingRect$ReactAndroid_release = getClippingRect$ReactAndroid_release();
            if (clippingRect$ReactAndroid_release == null) {
                throw new IllegalStateException("Required value was null.");
            }
            s sVar = this.f38519d;
            if (sVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC5504s.f(sVar, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactClippingViewGroup");
            F f10 = (F) sVar;
            if (C4914b.z()) {
                if (f10.getRemoveClippedSubviews()) {
                    f10.getClippingRect(clippingRect$ReactAndroid_release);
                } else {
                    ((View) f10).getDrawingRect(clippingRect$ReactAndroid_release);
                }
            } else {
                if (!f10.getRemoveClippedSubviews()) {
                    super.updateClippingRect(set);
                    return;
                }
                f10.getClippingRect(clippingRect$ReactAndroid_release);
            }
            clippingRect$ReactAndroid_release.intersect(getContainerRelativeRect());
            clippingRect$ReactAndroid_release.offset(-getContainerRelativeRect().left, -getContainerRelativeRect().top);
            if (AbstractC5504s.c(this.f38521f, clippingRect$ReactAndroid_release)) {
                return;
            }
            updateClippingToRect$ReactAndroid_release(clippingRect$ReactAndroid_release, set);
            this.f38521f.set(clippingRect$ReactAndroid_release);
        }
    }
}
