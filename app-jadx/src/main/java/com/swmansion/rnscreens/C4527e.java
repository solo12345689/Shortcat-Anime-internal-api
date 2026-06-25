package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.L0;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.C3284b0;
import fb.AbstractC4794d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.swmansion.rnscreens.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C4527e extends Toolbar {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private A1.b f44461A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private boolean f44462B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private boolean f44463C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final Choreographer.FrameCallback f44464D0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final a0 f44465w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final boolean f44466x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final boolean f44467y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f44468z0;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Choreographer.FrameCallback {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            C4527e.this.f44463C0 = false;
            C4527e c4527e = C4527e.this;
            c4527e.measure(View.MeasureSpec.makeMeasureSpec(c4527e.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C4527e.this.getHeight(), Integer.MIN_VALUE));
            C4527e c4527e2 = C4527e.this;
            c4527e2.layout(c4527e2.getLeft(), C4527e.this.getTop(), C4527e.this.getRight(), C4527e.this.getBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4527e(Context context, a0 config) {
        super(context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(config, "config");
        this.f44465w0 = config;
        this.f44466x0 = true;
        this.f44467y0 = true;
        A1.b NONE = A1.b.f103e;
        AbstractC5504s.g(NONE, "NONE");
        this.f44461A0 = NONE;
        getMenu();
        this.f44464D0 = new a();
    }

    private final void T(int i10, int i11, int i12, int i13) {
        this.f44468z0 = true;
        U();
        setPadding(i10, i11, i12, i13);
    }

    private final void U() {
        this.f44462B0 = this.f44466x0;
    }

    public final void V() {
        setContentInsetStartWithNavigation(this.f44465w0.getPreferredContentInsetStartWithNavigation());
        J(this.f44465w0.getPreferredContentInsetStart(), this.f44465w0.getPreferredContentInsetEnd());
    }

    public final a0 getConfig() {
        return this.f44465w0;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        A1.b bVarB = AbstractC4794d.b(this, L0.p.c(), windowInsetsOnApplyWindowInsets, false, 4, null);
        A1.b bVarB2 = AbstractC4794d.b(this, L0.p.i(), windowInsetsOnApplyWindowInsets, false, 4, null);
        A1.b bVarC = A1.b.c(bVarB.f104a + bVarB2.f104a, 0, bVarB.f106c + bVarB2.f106c, 0);
        AbstractC5504s.g(bVarC, "of(...)");
        A1.b bVarC2 = A1.b.c(0, Math.max(bVarB.f105b, this.f44467y0 ? bVarB2.f105b : 0), 0, Math.max(bVarB.f107d, 0));
        AbstractC5504s.g(bVarC2, "of(...)");
        A1.b bVarA = A1.b.a(bVarC, bVarC2);
        AbstractC5504s.g(bVarA, "add(...)");
        if (!AbstractC5504s.c(this.f44461A0, bVarA)) {
            this.f44461A0 = bVarA;
            T(bVarA.f104a, bVarA.f105b, bVarA.f106c, bVarA.f107d);
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f44465w0.k(this, z10 || this.f44462B0);
        this.f44462B0 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        ViewParent parent = getParent();
        Integer numValueOf = null;
        C4523a c4523a = parent instanceof C4523a ? (C4523a) parent : null;
        if (c4523a != null && this.f44468z0 && !c4523a.isInLayout()) {
            c4523a.H(getPaddingTop());
            this.f44468z0 = false;
        }
        Context context = getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        Activity currentActivity = ((C3284b0) context).getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            numValueOf = Integer.valueOf(attributes.softInputMode);
        }
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.f44463C0 || this.f44464D0 == null) {
            return;
        }
        this.f44463C0 = true;
        com.facebook.react.modules.core.b.f36977f.a().k(b.a.f36986d, this.f44464D0);
    }
}
