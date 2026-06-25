package com.revenuecat.purchases.ui.revenuecatui.extensions;

import C.A;
import androidx.compose.foundation.layout.p;
import i1.C5015h;
import i1.EnumC5027t;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LC/A;", "Li1/t;", "layoutDirection", "Li1/h;", "calculateHorizontalPadding", "(LC/A;Li1/t;)F", "calculateVerticalPadding", "(LC/A;)F", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class PaddingValuesKt {
    public static final /* synthetic */ float calculateHorizontalPadding(A a10, EnumC5027t layoutDirection) {
        AbstractC5504s.h(a10, "<this>");
        AbstractC5504s.h(layoutDirection, "layoutDirection");
        return C5015h.n(p.g(a10, layoutDirection) + p.f(a10, layoutDirection));
    }

    public static final /* synthetic */ float calculateVerticalPadding(A a10) {
        AbstractC5504s.h(a10, "<this>");
        return C5015h.n(a10.d() + a10.c());
    }
}
