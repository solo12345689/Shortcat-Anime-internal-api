package com.revenuecat.purchases.common;

import Td.L;
import Wf.C2361e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LWf/e;", "LTd/L;", "invoke", "(LWf/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class Backend$Companion$json$1 extends AbstractC5506u implements Function1 {
    public static final Backend$Companion$json$1 INSTANCE = new Backend$Companion$json$1();

    Backend$Companion$json$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2361e) obj);
        return L.f17438a;
    }

    public final void invoke(C2361e Json) {
        AbstractC5504s.h(Json, "$this$Json");
        Json.f(true);
    }
}
