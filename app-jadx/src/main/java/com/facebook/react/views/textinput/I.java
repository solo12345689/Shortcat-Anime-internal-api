package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class I implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3320j f38392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventDispatcher f38393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38396e;

    public I(C3320j editText) {
        AbstractC5504s.h(editText, "editText");
        this.f38392a = editText;
        ReactContext reactContextD = f0.d(editText);
        this.f38393b = f0.c(reactContextD, editText.getId());
        this.f38394c = f0.e(reactContextD);
    }

    @Override // com.facebook.react.views.textinput.K
    public void a(int i10, int i11, int i12, int i13) {
        if (this.f38395d == i10 && this.f38396e == i11) {
            return;
        }
        com.facebook.react.views.scroll.o oVarA = com.facebook.react.views.scroll.o.f38136k.a(this.f38394c, this.f38392a.getId(), com.facebook.react.views.scroll.p.f38152d, i10, i11, 0.0f, 0.0f, 0, 0, this.f38392a.getWidth(), this.f38392a.getHeight());
        EventDispatcher eventDispatcher = this.f38393b;
        if (eventDispatcher != null) {
            eventDispatcher.d(oVarA);
        }
        this.f38395d = i10;
        this.f38396e = i11;
    }
}
