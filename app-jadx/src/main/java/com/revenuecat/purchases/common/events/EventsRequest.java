package com.revenuecat.purchases.common.events;

import Rf.b;
import Td.InterfaceC2154e;
import Ud.AbstractC2279u;
import Vf.AbstractC2327f0;
import Vf.C2324e;
import Vf.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsRequest;", "", "", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "events", "<init>", "(Ljava/util/List;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/util/List;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/EventsRequest;LUf/d;LTf/e;)V", "write$Self", "Ljava/util/List;", "getEvents$purchases_defaultsBc8Release", "()Ljava/util/List;", "", "getCacheKey", "cacheKey", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventsRequest {
    private final List<BackendEvent> events;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {new C2324e(BackendEvent.INSTANCE.serializer())};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsRequest$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/EventsRequest;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return EventsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ EventsRequest(int i10, List list, t0 t0Var) {
        if (1 != (i10 & 1)) {
            AbstractC2327f0.a(i10, 1, EventsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.events = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventsRequest) && AbstractC5504s.c(this.events, ((EventsRequest) obj).events);
    }

    public final List<String> getCacheKey() {
        List<BackendEvent> list = this.events;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((BackendEvent) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final List<BackendEvent> getEvents$purchases_defaultsBc8Release() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "EventsRequest(events=" + this.events + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventsRequest(List<? extends BackendEvent> events) {
        AbstractC5504s.h(events, "events");
        this.events = events;
    }
}
