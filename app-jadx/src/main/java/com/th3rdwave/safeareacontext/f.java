package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ie.InterfaceC5096o;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends com.facebook.react.views.view.g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC5096o f44856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f44857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f44858c;

    public f(Context context) {
        super(context);
    }

    private final void B() {
        a aVarE;
        InterfaceC5096o interfaceC5096o = this.f44856a;
        if (interfaceC5096o == null || (aVarE = h.e(this)) == null) {
            return;
        }
        View rootView = getRootView();
        AbstractC5504s.f(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        c cVarA = h.a((ViewGroup) rootView, this);
        if (cVarA == null) {
            return;
        }
        if (AbstractC5504s.c(this.f44857b, aVarE) && AbstractC5504s.c(this.f44858c, cVarA)) {
            return;
        }
        interfaceC5096o.invoke(this, aVarE, cVarA);
        this.f44857b = aVarE;
        this.f44858c = cVarA;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        B();
        return true;
    }

    public final void setOnInsetsChangeHandler(InterfaceC5096o interfaceC5096o) {
        this.f44856a = interfaceC5096o;
        B();
    }
}
