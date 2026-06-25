package com.revenuecat.purchases.common.events;

import Td.L;
import Wf.C2361e;
import Yf.b;
import Yf.f;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LWf/e;", "LTd/L;", "invoke", "(LWf/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class EventsManager$Companion$json$1 extends AbstractC5506u implements Function1 {
    public static final EventsManager$Companion$json$1 INSTANCE = new EventsManager$Companion$json$1();

    EventsManager$Companion$json$1() {
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
        b bVar = new b(O.b(BackendStoredEvent.class), null);
        bVar.b(O.b(BackendStoredEvent.CustomerCenter.class), BackendStoredEvent.CustomerCenter.INSTANCE.serializer());
        bVar.b(O.b(BackendStoredEvent.Paywalls.class), BackendStoredEvent.Paywalls.INSTANCE.serializer());
        bVar.b(O.b(BackendStoredEvent.Ad.class), BackendStoredEvent.Ad.INSTANCE.serializer());
        bVar.b(O.b(BackendStoredEvent.CustomPaywall.class), BackendStoredEvent.CustomPaywall.INSTANCE.serializer());
        bVar.a(fVar);
        Json.g(fVar.f());
        Json.e(false);
    }
}
