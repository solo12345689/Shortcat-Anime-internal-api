package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import Td.r;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/e;", "Landroidx/compose/foundation/o;", "scrollState", "Lz/q;", "scrollOrientation", "scrollable", "(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/q;)Landroidx/compose/ui/e;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ScrollableKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ e scrollable(e eVar, o scrollState, q scrollOrientation) {
        e eVarF;
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(scrollState, "scrollState");
        AbstractC5504s.h(scrollOrientation, "scrollOrientation");
        int i10 = WhenMappings.$EnumSwitchMapping$0[scrollOrientation.ordinal()];
        if (i10 == 1) {
            eVarF = m.f(e.f26613a, scrollState, false, null, false, 14, null);
        } else {
            if (i10 != 2) {
                throw new r();
            }
            eVarF = m.b(e.f26613a, scrollState, false, null, false, 14, null);
        }
        return eVar.then(eVarF);
    }
}
