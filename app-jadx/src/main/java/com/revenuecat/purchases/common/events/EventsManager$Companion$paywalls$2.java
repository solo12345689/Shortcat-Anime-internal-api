package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class EventsManager$Companion$paywalls$2 extends AbstractC5502p implements Function1 {
    EventsManager$Companion$paywalls$2(Object obj) {
        super(1, obj, PaywallStoredEvent.Companion.class, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PaywallStoredEvent invoke(String p02) {
        AbstractC5504s.h(p02, "p0");
        return ((PaywallStoredEvent.Companion) this.receiver).fromString(p02);
    }
}
