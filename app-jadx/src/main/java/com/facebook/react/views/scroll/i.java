package com.facebook.react.views.scroll;

import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        this.f38021a = com.facebook.react.modules.i18nmanager.a.f37029a.a().i(context);
    }

    @Override // com.facebook.react.views.view.g, com.facebook.react.uimanager.F
    public boolean getRemoveClippedSubviews() {
        return super.getRemoveClippedSubviews();
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f38021a) {
            setLeft(0);
            setTop(i11);
            setRight(i12 - i10);
            setBottom(i13);
        }
    }

    @Override // com.facebook.react.views.view.g
    public void setRemoveClippedSubviews(boolean z10) {
        if (this.f38021a) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z10);
        }
    }
}
