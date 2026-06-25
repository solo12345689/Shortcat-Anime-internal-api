package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.swmansion.rnscreens.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4523a extends AppBarLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4523a(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
    }

    private final void G(int i10) {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight() + i10, 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom() + i10);
    }

    public final void H(int i10) {
        G(i10);
    }
}
