package com.swmansion.rnscreens;

import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.swmansion.rnscreens.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4531i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractComponentCallbacksC2838q f44631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.activity.G f44632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44634d;

    public C4531i(AbstractComponentCallbacksC2838q fragment, androidx.activity.G onBackPressedCallback) {
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(onBackPressedCallback, "onBackPressedCallback");
        this.f44631a = fragment;
        this.f44632b = onBackPressedCallback;
        this.f44634d = true;
    }

    public final boolean a() {
        return this.f44634d;
    }

    public final void b() {
        androidx.activity.H onBackPressedDispatcher;
        if (this.f44633c || !this.f44634d) {
            return;
        }
        AbstractActivityC2842v activity = this.f44631a.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.i(this.f44631a, this.f44632b);
        }
        this.f44633c = true;
    }

    public final void c() {
        if (this.f44633c) {
            this.f44632b.h();
            this.f44633c = false;
        }
    }

    public final void d(boolean z10) {
        this.f44634d = z10;
    }
}
