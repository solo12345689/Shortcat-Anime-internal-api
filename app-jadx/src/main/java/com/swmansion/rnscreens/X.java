package com.swmansion.rnscreens;

import H9.l;
import Sa.o;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2777p0;
import androidx.core.view.L0;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.d0;
import db.C4579e;
import fb.C4792b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020)2\b\b\u0002\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u0010\u0018J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0007J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u00107J\u000f\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010\u0007J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010\u0007J\u000f\u0010<\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010\u0007J\u0019\u0010?\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J+\u0010E\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020A2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bE\u0010FJ!\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u001d2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bH\u0010IJ)\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0012H\u0016¢\u0006\u0004\bN\u0010OJ)\u0010P\u001a\u0004\u0018\u00010\n2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0012H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bR\u0010\u0007J\u000f\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bS\u0010\u0007J\u0017\u0010T\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\bT\u0010\u001cJ\u001f\u0010V\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010B\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0016H\u0016¢\u0006\u0004\bX\u0010\u0018J\u000f\u0010Y\u001a\u00020\bH\u0016¢\u0006\u0004\bY\u0010\u0007J\u000f\u0010[\u001a\u00020ZH\u0000¢\u0006\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010<R\u0016\u0010e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010<R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010j\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR$\u0010r\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR0\u0010y\u001a\u0010\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\b\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR*\u0010\u0086\u0001\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010.\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008c\u0001\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\\\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/swmansion/rnscreens/X;", "Lcom/swmansion/rnscreens/F;", "Lcom/swmansion/rnscreens/Y;", "Lcom/swmansion/rnscreens/y;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/y;)V", "()V", "LTd/L;", "f0", "Landroid/animation/Animator;", "W", "()Landroid/animation/Animator;", "X", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "V", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "screen", "", "m0", "(Lcom/swmansion/rnscreens/y;)Ljava/lang/Integer;", "T", "", "r0", "()Z", "Landroid/view/Menu;", "menu", "s0", "(Landroid/view/Menu;)V", "Landroid/view/View;", "a0", "()Landroid/view/View;", "LSa/b;", "sheetTransitionCoordinator", "P", "(LSa/b;)V", "Landroidx/core/view/L0;", "insetsCompat", "e0", "(Landroidx/core/view/L0;)V", "forceCreation", "LSa/g;", "j0", "(Z)LSa/g;", "LSa/o;", "l0", "()LSa/o;", "l", "h0", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "o0", "(Landroidx/appcompat/widget/Toolbar;)V", "hidden", "p0", "(Z)V", "translucent", "q0", "p", "H", "Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "onCreateAnimator", "(IZI)Landroid/animation/Animator;", "onStart", "onStop", "onPrepareOptionsMenu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "U", "Y", "LSa/c;", "i0", "()LSa/c;", "Lcom/swmansion/rnscreens/a;", "i", "Lcom/swmansion/rnscreens/a;", "appBarLayout", "j", "Landroidx/appcompat/widget/Toolbar;", "k", "isToolbarShadowHidden", "isToolbarTranslucent", "m", "LSa/b;", "n", "Landroid/view/View;", "lastFocusedChild", "Lcom/swmansion/rnscreens/d;", "o", "Lcom/swmansion/rnscreens/d;", "c0", "()Lcom/swmansion/rnscreens/d;", "setSearchView", "(Lcom/swmansion/rnscreens/d;)V", "searchView", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "n0", "(Lkotlin/jvm/functions/Function1;)V", "onSearchViewCreate", "Ldb/e;", "q", "Ldb/e;", "coordinatorLayout", "r", "LSa/g;", "dimmingDelegate", "s", "LSa/o;", "d0", "setSheetDelegate$react_native_screens_release", "(LSa/o;)V", "sheetDelegate", "t", "LSa/c;", "getBottomSheetWindowInsetListenerChain$react_native_screens_release", "setBottomSheetWindowInsetListenerChain$react_native_screens_release", "(LSa/c;)V", "bottomSheetWindowInsetListenerChain", "u", "Landroidx/core/view/L0;", "lastInsetsCompat", "Lcom/swmansion/rnscreens/S;", "b0", "()Lcom/swmansion/rnscreens/S;", "screenStack", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class X extends F implements Y {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C4523a appBarLayout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Toolbar toolbar;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isToolbarShadowHidden;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isToolbarTranslucent;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private Sa.b sheetTransitionCoordinator;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private View lastFocusedChild;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private C4526d searchView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Function1 onSearchViewCreate;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private C4579e coordinatorLayout;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Sa.g dimmingDelegate;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Sa.o sheetDelegate;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Sa.c bottomSheetWindowInsetListenerChain;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private L0 lastInsetsCompat;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends C2777p0.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Sa.o f44413a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ X f44414b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Sa.o oVar, X x10) {
            super(0);
            this.f44413a = oVar;
            this.f44414b = x10;
        }

        @Override // androidx.core.view.C2777p0.b
        public void onEnd(C2777p0 animation) {
            AbstractC5504s.h(animation, "animation");
            super.onEnd(animation);
            this.f44414b.k().y();
        }

        @Override // androidx.core.view.C2777p0.b
        public L0 onProgress(L0 insets, List runningAnimations) {
            AbstractC5504s.h(insets, "insets");
            AbstractC5504s.h(runningAnimations, "runningAnimations");
            if (Build.VERSION.SDK_INT >= 30) {
                this.f44413a.J(insets);
            }
            return insets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C4546y screenView) {
        super(screenView);
        AbstractC5504s.h(screenView, "screenView");
    }

    private final void P(final Sa.b sheetTransitionCoordinator) {
        final A container = k().getContainer();
        if (container != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.swmansion.rnscreens.U
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return X.Q(container, this, view, windowInsets);
                    }
                });
            } else {
                i0().a(new androidx.core.view.I() { // from class: com.swmansion.rnscreens.V
                    @Override // androidx.core.view.I
                    public final L0 d(View view, L0 l02) {
                        return X.R(this.f44397a, view, l02);
                    }
                });
            }
        }
        A container2 = k().getContainer();
        if (container2 != null) {
            container2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.swmansion.rnscreens.W
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    X.S(sheetTransitionCoordinator, this, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
    }

    public static final WindowInsets Q(A a10, X x10, View view, WindowInsets insets) {
        AbstractC5504s.h(view, "<unused var>");
        AbstractC5504s.h(insets, "insets");
        L0 l0A = L0.A(insets, a10);
        AbstractC5504s.g(l0A, "toWindowInsetsCompat(...)");
        x10.e0(l0A);
        return insets;
    }

    public static final L0 R(X x10, View view, L0 windowInsets) {
        AbstractC5504s.h(view, "<unused var>");
        AbstractC5504s.h(windowInsets, "windowInsets");
        x10.e0(windowInsets);
        return windowInsets;
    }

    public static final void S(Sa.b bVar, X x10, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        bVar.b(x10.k());
    }

    private final void T(C4546y screen) {
        float fMax = Math.max(com.facebook.react.uimanager.B.i(screen.getSheetCornerRadius()), 0.0f);
        l.b bVar = new l.b();
        bVar.A(0, fMax);
        bVar.F(0, fMax);
        H9.l lVarM = bVar.m();
        AbstractC5504s.g(lVarM, "build(...)");
        H9.h hVar = new H9.h(lVarM);
        Integer numM0 = m0(screen);
        hVar.setTint(numM0 != null ? numM0.intValue() : 0);
        screen.setBackground(hVar);
    }

    private final BottomSheetBehavior V() {
        return new BottomSheetBehavior();
    }

    private final Animator W() {
        Sa.o oVarL0 = l0();
        C4579e c4579e = null;
        Sa.g gVarK0 = k0(this, false, 1, null);
        C4546y c4546yK = k();
        C4579e c4579e2 = this.coordinatorLayout;
        if (c4579e2 == null) {
            AbstractC5504s.u("coordinatorLayout");
        } else {
            c4579e = c4579e2;
        }
        return oVarL0.q(new o.c(this, c4546yK, c4579e, gVarK0));
    }

    private final Animator X() {
        Sa.o oVarL0 = l0();
        C4579e c4579e = null;
        Sa.g gVarK0 = k0(this, false, 1, null);
        C4546y c4546yK = k();
        C4579e c4579e2 = this.coordinatorLayout;
        if (c4579e2 == null) {
            AbstractC5504s.u("coordinatorLayout");
        } else {
            c4579e = c4579e2;
        }
        return oVarL0.r(new o.c(this, c4546yK, c4579e, gVarK0));
    }

    private final View a0() {
        View viewK = k();
        while (viewK != null) {
            if (viewK.isFocused()) {
                return viewK;
            }
            viewK = viewK instanceof ViewGroup ? ((ViewGroup) viewK).getFocusedChild() : null;
        }
        return null;
    }

    private final S b0() {
        A container = k().getContainer();
        if (container instanceof S) {
            return (S) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    private final void e0(L0 insetsCompat) {
        if (AbstractC5504s.c(this.lastInsetsCompat, insetsCompat)) {
            return;
        }
        this.lastInsetsCompat = insetsCompat;
        Sa.o oVarL0 = l0();
        BottomSheetBehavior<C4546y> sheetBehavior = k().getSheetBehavior();
        AbstractC5504s.e(sheetBehavior);
        oVarL0.S(sheetBehavior);
        A container = k().getContainer();
        Sa.b bVar = null;
        if (container != null) {
            C4579e c4579e = this.coordinatorLayout;
            if (c4579e == null) {
                AbstractC5504s.u("coordinatorLayout");
                c4579e = null;
            }
            c4579e.forceLayout();
            C4579e c4579e2 = this.coordinatorLayout;
            if (c4579e2 == null) {
                AbstractC5504s.u("coordinatorLayout");
                c4579e2 = null;
            }
            c4579e2.measure(View.MeasureSpec.makeMeasureSpec(container.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container.getHeight(), 1073741824));
            C4579e c4579e3 = this.coordinatorLayout;
            if (c4579e3 == null) {
                AbstractC5504s.u("coordinatorLayout");
                c4579e3 = null;
            }
            c4579e3.layout(0, 0, container.getWidth(), container.getHeight());
        }
        k().u(true);
        Sa.b bVar2 = this.sheetTransitionCoordinator;
        if (bVar2 == null) {
            AbstractC5504s.u("sheetTransitionCoordinator");
        } else {
            bVar = bVar2;
        }
        bVar.a(k());
    }

    private final void f0() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof S) {
            ((S) parent).b0();
        }
    }

    public static final L0 g0(Sa.o oVar, View view, L0 windowInsets) {
        AbstractC5504s.h(view, "<unused var>");
        AbstractC5504s.h(windowInsets, "windowInsets");
        oVar.J(windowInsets);
        return windowInsets;
    }

    private final Sa.g j0(boolean forceCreation) {
        Sa.g gVar = this.dimmingDelegate;
        if (gVar == null || forceCreation) {
            if (gVar != null) {
                gVar.f(k().getSheetBehavior());
            }
            this.dimmingDelegate = new Sa.g(k().getReactContext(), k());
        }
        Sa.g gVar2 = this.dimmingDelegate;
        AbstractC5504s.e(gVar2);
        return gVar2;
    }

    static /* synthetic */ Sa.g k0(X x10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return x10.j0(z10);
    }

    private final Sa.o l0() {
        if (this.sheetDelegate == null) {
            this.sheetDelegate = new Sa.o(k());
        }
        Sa.o oVar = this.sheetDelegate;
        AbstractC5504s.e(oVar);
        return oVar;
    }

    private final Integer m0(C4546y screen) {
        Integer numValueOf;
        ColorStateList colorStateListJ;
        Drawable background = screen.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            numValueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            H9.h hVar = background2 instanceof H9.h ? (H9.h) background2 : null;
            numValueOf = (hVar == null || (colorStateListJ = hVar.J()) == null) ? null : Integer.valueOf(colorStateListJ.getDefaultColor());
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        B contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return null;
        }
        return fb.i.a(contentWrapper);
    }

    private final boolean r0() {
        a0 headerConfig = k().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i10 = 0; i10 < configSubviewsCount; i10++) {
                if (headerConfig.g(i10).getType() == d0.a.f44458e) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void s0(Menu menu) {
        menu.clear();
        if (r0()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                C4526d c4526d = new C4526d(context, this);
                this.searchView = c4526d;
                Function1 function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(c4526d);
                }
            }
            MenuItem menuItemAdd = menu.add("");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(this.searchView);
        }
    }

    @Override // com.swmansion.rnscreens.F
    public void H() {
        super.H();
        f0();
        k().k();
    }

    public boolean U() {
        A container = k().getContainer();
        if (!(container instanceof S)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!AbstractC5504s.c(((S) container).getRootScreen(), k())) {
            return true;
        }
        AbstractComponentCallbacksC2838q parentFragment = getParentFragment();
        if (parentFragment instanceof X) {
            return ((X) parentFragment).U();
        }
        return false;
    }

    public void Y() {
        b0().N(this);
    }

    public final void Z() {
        if (isRemoving() && isDetached()) {
            return;
        }
        C3284b0 reactContext = k().getReactContext();
        int iE = com.facebook.react.uimanager.f0.e(reactContext);
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.f0.c(reactContext, k().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new Ta.h(iE, k().getId()));
        }
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final C4526d getSearchView() {
        return this.searchView;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final Sa.o getSheetDelegate() {
        return this.sheetDelegate;
    }

    public void h0() {
        Toolbar toolbar;
        C4523a c4523a = this.appBarLayout;
        if (c4523a != null && (toolbar = this.toolbar) != null && toolbar.getParent() == c4523a) {
            c4523a.removeView(toolbar);
        }
        this.toolbar = null;
    }

    public final Sa.c i0() {
        if (this.bottomSheetWindowInsetListenerChain == null) {
            this.bottomSheetWindowInsetListenerChain = new Sa.c();
        }
        Sa.c cVar = this.bottomSheetWindowInsetListenerChain;
        AbstractC5504s.e(cVar);
        return cVar;
    }

    @Override // com.swmansion.rnscreens.F, com.swmansion.rnscreens.G
    public boolean l() {
        return k().s();
    }

    public final void n0(Function1 function1) {
        this.onSearchViewCreate = function1;
    }

    public void o0(Toolbar toolbar) {
        AbstractC5504s.h(toolbar, "toolbar");
        C4523a c4523a = this.appBarLayout;
        if (c4523a != null) {
            c4523a.addView(toolbar);
        }
        AppBarLayout.d dVar = new AppBarLayout.d(-1, -2);
        dVar.g(0);
        toolbar.setLayoutParams(dVar);
        this.toolbar = toolbar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        if (Sa.r.d(k())) {
            return enter ? W() : X();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        AbstractC5504s.h(menu, "menu");
        AbstractC5504s.h(inflater, "inflater");
        s0(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.F, androidx.fragment.app.AbstractComponentCallbacksC2838q
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C4523a c4523a;
        C4523a c4523a2;
        C4523a c4523a3;
        AbstractC5504s.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC5504s.g(contextRequireContext, "requireContext(...)");
        this.coordinatorLayout = new C4579e(contextRequireContext, this);
        C4546y c4546yK = k();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.n(Sa.r.d(k()) ? V() : this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior());
        c4546yK.setLayoutParams(fVar);
        C4579e c4579e = this.coordinatorLayout;
        if (c4579e == null) {
            AbstractC5504s.u("coordinatorLayout");
            c4579e = null;
        }
        c4579e.addView(Ua.c.c(k()));
        if (Sa.r.d(k())) {
            k().setClipToOutline(true);
            T(k());
            k().setElevation(k().getSheetElevation());
            final Sa.o oVarL0 = l0();
            BottomSheetBehavior<C4546y> sheetBehavior = k().getSheetBehavior();
            AbstractC5504s.e(sheetBehavior);
            Sa.o.n(oVarL0, sheetBehavior, null, 0, 6, null);
            Sa.g gVarJ0 = j0(true);
            C4546y c4546yK2 = k();
            C4579e c4579e2 = this.coordinatorLayout;
            if (c4579e2 == null) {
                AbstractC5504s.u("coordinatorLayout");
                c4579e2 = null;
            }
            gVarJ0.h(c4546yK2, c4579e2);
            C4546y c4546yK3 = k();
            BottomSheetBehavior<C4546y> sheetBehavior2 = k().getSheetBehavior();
            AbstractC5504s.e(sheetBehavior2);
            gVarJ0.g(c4546yK3, sheetBehavior2);
            if (!k().getSheetShouldOverflowTopInset()) {
                Sa.b bVar = new Sa.b();
                this.sheetTransitionCoordinator = bVar;
                P(bVar);
            }
            A container2 = k().getContainer();
            AbstractC5504s.e(container2);
            C4579e c4579e3 = this.coordinatorLayout;
            if (c4579e3 == null) {
                AbstractC5504s.u("coordinatorLayout");
                c4579e3 = null;
            }
            c4579e3.measure(View.MeasureSpec.makeMeasureSpec(container2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container2.getHeight(), 1073741824));
            C4579e c4579e4 = this.coordinatorLayout;
            if (c4579e4 == null) {
                AbstractC5504s.u("coordinatorLayout");
                c4579e4 = null;
            }
            c4579e4.layout(0, 0, container2.getWidth(), container2.getHeight());
            if (Build.VERSION.SDK_INT < 30) {
                Sa.c cVarI0 = i0();
                cVarI0.a(new androidx.core.view.I() { // from class: com.swmansion.rnscreens.T
                    @Override // androidx.core.view.I
                    public final L0 d(View view, L0 l02) {
                        return X.g0(oVarL0, view, l02);
                    }
                });
                AbstractC2747a0.w0(k(), cVarI0);
            }
            AbstractC2747a0.C0(k(), new a(oVarL0, this));
        } else {
            Context context = getContext();
            if (context != null) {
                c4523a = new C4523a(context);
                c4523a.setBackgroundColor(0);
                c4523a.setLayoutParams(new AppBarLayout.d(-1, -2));
            } else {
                c4523a = null;
            }
            this.appBarLayout = c4523a;
            C4579e c4579e5 = this.coordinatorLayout;
            if (c4579e5 == null) {
                AbstractC5504s.u("coordinatorLayout");
                c4579e5 = null;
            }
            c4579e5.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (c4523a3 = this.appBarLayout) != null) {
                c4523a3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (c4523a2 = this.appBarLayout) != null) {
                c4523a2.addView(Ua.c.c(toolbar));
            }
            setHasOptionsMenu(true);
        }
        C4579e c4579e6 = this.coordinatorLayout;
        if (c4579e6 != null) {
            return c4579e6;
        }
        AbstractC5504s.u("coordinatorLayout");
        return null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onPrepareOptionsMenu(Menu menu) {
        a0 headerConfig;
        AbstractC5504s.h(menu, "menu");
        if (!k().s() || ((headerConfig = k().getHeaderConfig()) != null && !headerConfig.h())) {
            s0(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStart() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStop() {
        if (C4792b.f46992a.a(getContext())) {
            this.lastFocusedChild = a0();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC5504s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.swmansion.rnscreens.F, com.swmansion.rnscreens.G
    public void p() {
        super.p();
        a0 headerConfig = k().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.l();
        }
    }

    public void p0(boolean hidden) {
        if (this.isToolbarShadowHidden != hidden) {
            C4523a c4523a = this.appBarLayout;
            if (c4523a != null) {
                c4523a.setElevation(hidden ? 0.0f : com.facebook.react.uimanager.B.i(4.0f));
            }
            C4523a c4523a2 = this.appBarLayout;
            if (c4523a2 != null) {
                c4523a2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = hidden;
        }
    }

    public void q0(boolean translucent) {
        if (this.isToolbarTranslucent != translucent) {
            ViewGroup.LayoutParams layoutParams = k().getLayoutParams();
            AbstractC5504s.f(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.f) layoutParams).n(translucent ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = translucent;
        }
    }

    public X() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
