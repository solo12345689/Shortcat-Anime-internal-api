package com.facebook.react.uimanager;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.react.uimanager.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3306w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3306w f37845a = new C3306w();

    private C3306w() {
    }

    public static final void a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode == 0 || mode2 == 0) {
            throw new IllegalStateException("A catalyst view must have an explicit width and height given to it. This should normally happen as part of the standard catalyst UI framework.");
        }
    }
}
