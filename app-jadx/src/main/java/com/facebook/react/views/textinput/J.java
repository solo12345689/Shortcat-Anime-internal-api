package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3320j f38397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventDispatcher f38398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38401e;

    public J(C3320j editText) {
        AbstractC5504s.h(editText, "editText");
        this.f38397a = editText;
        ReactContext reactContextD = f0.d(editText);
        this.f38398b = f0.c(reactContextD, editText.getId());
        this.f38399c = f0.e(reactContextD);
    }

    @Override // com.facebook.react.views.textinput.L
    public void a(int i10, int i11) {
        double d10 = i10;
        double d11 = i11;
        int iMin = (int) Math.min(d10, d11);
        int iMax = (int) Math.max(d10, d11);
        if (this.f38400d == iMin && this.f38401e == iMax) {
            return;
        }
        EventDispatcher eventDispatcher = this.f38398b;
        if (eventDispatcher != null) {
            eventDispatcher.d(new E(this.f38399c, this.f38397a.getId(), iMin, iMax));
        }
        this.f38400d = iMin;
        this.f38401e = iMax;
    }
}
