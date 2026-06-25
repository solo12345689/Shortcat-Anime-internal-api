package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.swmansion.rnscreens.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4526d extends SearchView {

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private SearchView.l f44445P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private View.OnClickListener f44446Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private androidx.activity.G f44447R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private final C4531i f44448S0;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends androidx.activity.G {
        a() {
            super(true);
        }

        @Override // androidx.activity.G
        public void d() {
            C4526d.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4526d(Context context, AbstractComponentCallbacksC2838q fragment) {
        super(context);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(fragment, "fragment");
        a aVar = new a();
        this.f44447R0 = aVar;
        this.f44448S0 = new C4531i(fragment, aVar);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4526d.m0(this.f44441a, view);
            }
        });
        super.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.c
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                return C4526d.n0(this.f44443a);
            }
        });
        setMaxWidth(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(C4526d c4526d, View view) {
        View.OnClickListener onClickListener = c4526d.f44446Q0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        c4526d.f44448S0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n0(C4526d c4526d) {
        SearchView.l lVar = c4526d.f44445P0;
        boolean zA = lVar != null ? lVar.a() : false;
        c4526d.f44448S0.c();
        return zA;
    }

    public final boolean getOverrideBackAction() {
        return this.f44448S0.a();
    }

    public final void o0() {
        p0();
        setIconified(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (J()) {
            return;
        }
        this.f44448S0.b();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44448S0.c();
    }

    public final void p0() {
        b0("", false);
    }

    public final void q0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.l lVar) {
        this.f44445P0 = lVar;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f44446Q0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z10) {
        this.f44448S0.d(z10);
    }

    public final void setText(String text) {
        AbstractC5504s.h(text, "text");
        b0(text, false);
    }
}
