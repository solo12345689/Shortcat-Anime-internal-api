package com.revenuecat.purchases.common;

import Td.L;
import Wf.C2361e;
import Yf.f;
import com.revenuecat.purchases.common.events.BackendEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LWf/e;", "LTd/L;", "invoke", "(LWf/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class JsonProvider$Companion$defaultJson$1 extends AbstractC5506u implements Function1 {
    public static final JsonProvider$Companion$defaultJson$1 INSTANCE = new JsonProvider$Companion$defaultJson$1();

    JsonProvider$Companion$defaultJson$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2361e) obj);
        return L.f17438a;
    }

    public final void invoke(C2361e Json) {
        AbstractC5504s.h(Json, "$this$Json");
        f fVar = new f();
        Yf.b bVar = new Yf.b(O.b(BackendEvent.class), null);
        bVar.b(O.b(BackendEvent.CustomerCenter.class), BackendEvent.CustomerCenter.INSTANCE.serializer());
        bVar.b(O.b(BackendEvent.Paywalls.class), BackendEvent.Paywalls.INSTANCE.serializer());
        bVar.a(fVar);
        Json.g(fVar.f());
        Json.c("discriminator");
        Json.d(false);
        Json.f(true);
    }
}
