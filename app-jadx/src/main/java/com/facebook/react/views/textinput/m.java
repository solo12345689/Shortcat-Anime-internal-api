package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements InterfaceC3311a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3320j f38462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventDispatcher f38463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38466e;

    public m(C3320j editText) {
        AbstractC5504s.h(editText, "editText");
        this.f38462a = editText;
        ReactContext reactContextD = f0.d(editText);
        this.f38463b = f0.c(reactContextD, editText.getId());
        this.f38464c = f0.e(reactContextD);
    }

    @Override // com.facebook.react.views.textinput.InterfaceC3311a
    public void a() {
        int width = this.f38462a.getWidth();
        int height = this.f38462a.getHeight();
        if (this.f38462a.getLayout() != null) {
            width = this.f38462a.getCompoundPaddingLeft() + this.f38462a.getLayout().getWidth() + this.f38462a.getCompoundPaddingRight();
            height = this.f38462a.getCompoundPaddingTop() + this.f38462a.getLayout().getHeight() + this.f38462a.getCompoundPaddingBottom();
        }
        if (width == this.f38465d && height == this.f38466e) {
            return;
        }
        this.f38466e = height;
        this.f38465d = width;
        EventDispatcher eventDispatcher = this.f38463b;
        if (eventDispatcher != null) {
            eventDispatcher.d(new C3312b(this.f38464c, this.f38462a.getId(), com.facebook.react.uimanager.B.g(width), com.facebook.react.uimanager.B.g(height)));
        }
    }
}
