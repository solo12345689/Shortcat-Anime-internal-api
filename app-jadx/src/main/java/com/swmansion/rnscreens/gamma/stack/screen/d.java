package com.swmansion.rnscreens.gamma.stack.screen;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.lifecycle.r;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractComponentCallbacksC2838q {

    /* JADX INFO: renamed from: a */
    private final a f44530a;

    /* JADX INFO: renamed from: b */
    private b f44531b;

    public d(a stackScreen) {
        AbstractC5504s.h(stackScreen, "stackScreen");
        this.f44530a = stackScreen;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5504s.h(inflater, "inflater");
        return this.f44530a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onDestroy() {
        super.onDestroy();
        Log.i("StackScreenFragment", "onDestroy");
        this.f44530a.c();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onDestroyView() {
        super.onDestroyView();
        this.f44531b = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC5504s.h(view, "view");
        super.onViewCreated(view, bundle);
        a aVar = this.f44530a;
        r viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5504s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f44531b = aVar.a(viewLifecycleOwner);
    }

    public final a w() {
        return this.f44530a;
    }
}
