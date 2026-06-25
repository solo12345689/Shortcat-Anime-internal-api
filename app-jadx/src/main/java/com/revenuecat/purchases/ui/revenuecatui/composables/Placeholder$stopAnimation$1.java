package com.revenuecat.purchases.ui.revenuecatui.composables;

import Zd.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.Placeholder", f = "Placeholder.kt", l = {188, 189, 190}, m = "stopAnimation$revenuecatui_defaultsBc8Release")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class Placeholder$stopAnimation$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Placeholder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Placeholder$stopAnimation$1(Placeholder placeholder, e eVar) {
        super(eVar);
        this.this$0 = placeholder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.stopAnimation$revenuecatui_defaultsBc8Release(this);
    }
}
