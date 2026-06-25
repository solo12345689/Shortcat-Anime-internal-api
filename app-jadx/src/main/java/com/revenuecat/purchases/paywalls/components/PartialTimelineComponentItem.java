package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.C2330h;
import Vf.t0;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "connector", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "getConnector", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialTimelineComponentItem implements PartialComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TimelineComponent.Connector connector;
    private final Boolean visible;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return PartialTimelineComponentItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTimelineComponentItem() {
        this((Boolean) null, (TimelineComponent.Connector) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialTimelineComponentItem self, d output, e serialDesc) {
        if (output.g(serialDesc, 0) || self.visible != null) {
            output.f(serialDesc, 0, C2330h.f20193a, self.visible);
        }
        if (!output.g(serialDesc, 1) && self.connector == null) {
            return;
        }
        output.f(serialDesc, 1, TimelineComponent$Connector$$serializer.INSTANCE, self.connector);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTimelineComponentItem)) {
            return false;
        }
        PartialTimelineComponentItem partialTimelineComponentItem = (PartialTimelineComponentItem) obj;
        return AbstractC5504s.c(this.visible, partialTimelineComponentItem.visible) && AbstractC5504s.c(this.connector, partialTimelineComponentItem.connector);
    }

    public final /* synthetic */ TimelineComponent.Connector getConnector() {
        return this.connector;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        TimelineComponent.Connector connector = this.connector;
        return iHashCode + (connector != null ? connector.hashCode() : 0);
    }

    public String toString() {
        return "PartialTimelineComponentItem(visible=" + this.visible + ", connector=" + this.connector + ')';
    }

    @InterfaceC2154e
    public /* synthetic */ PartialTimelineComponentItem(int i10, Boolean bool, TimelineComponent.Connector connector, t0 t0Var) {
        if ((i10 & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i10 & 2) == 0) {
            this.connector = null;
        } else {
            this.connector = connector;
        }
    }

    public PartialTimelineComponentItem(Boolean bool, TimelineComponent.Connector connector) {
        this.visible = bool;
        this.connector = connector;
    }

    public /* synthetic */ PartialTimelineComponentItem(Boolean bool, TimelineComponent.Connector connector, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : connector);
    }
}
