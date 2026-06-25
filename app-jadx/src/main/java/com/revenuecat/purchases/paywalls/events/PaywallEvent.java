package com.revenuecat.purchases.paywalls.events;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00047689B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J.\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010!R\u0014\u00104\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "Lcom/revenuecat/purchases/common/events/FeatureEvent;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "creationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "data", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "type", "<init>", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData$purchases_defaultsBc8Release", "()Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "toPaywallPostReceiptData", "component1", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "component2", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "component3", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "copy", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "getCreationData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "getData", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventType;", "getType", "isPriorityEvent", "()Z", "Companion", "$serializer", "CreationData", "Data", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaywallEvent implements FeatureEvent {
    private final CreationData creationData;
    private final Data data;
    private final PaywallEventType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {null, null, PaywallEventType.INSTANCE.serializer()};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return PaywallEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "Ljava/util/UUID;", DiagnosticsEntry.ID_KEY, "Ljava/util/Date;", "date", "<init>", "(Ljava/util/UUID;Ljava/util/Date;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/util/Date;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/util/Date;", "copy", "(Ljava/util/UUID;Ljava/util/Date;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "getId$annotations", "()V", "Ljava/util/Date;", "getDate", "getDate$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CreationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Date date;
        private final UUID id;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$CreationData;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return PaywallEvent$CreationData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC2154e
        public /* synthetic */ CreationData(int i10, UUID uuid, Date date, t0 t0Var) {
            if (3 != (i10 & 3)) {
                AbstractC2327f0.a(i10, 3, PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
            }
            this.id = uuid;
            this.date = date;
        }

        public static /* synthetic */ CreationData copy$default(CreationData creationData, UUID uuid, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uuid = creationData.id;
            }
            if ((i10 & 2) != 0) {
                date = creationData.date;
            }
            return creationData.copy(uuid, date);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CreationData self, d output, e serialDesc) {
            output.m(serialDesc, 0, UUIDSerializer.INSTANCE, self.id);
            output.m(serialDesc, 1, DateSerializer.INSTANCE, self.date);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Date getDate() {
            return this.date;
        }

        public final CreationData copy(UUID uuid, Date date) {
            AbstractC5504s.h(uuid, "id");
            AbstractC5504s.h(date, "date");
            return new CreationData(uuid, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) other;
            return AbstractC5504s.c(this.id, creationData.id) && AbstractC5504s.c(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.id;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CreationData(id=" + this.id + ", date=" + this.date + ')';
        }

        public CreationData(UUID id2, Date date) {
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(date, "date");
            this.id = id2;
            this.date = date;
        }

        public static /* synthetic */ void getDate$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ PaywallEvent(int i10, CreationData creationData, Data data, PaywallEventType paywallEventType, t0 t0Var) {
        if (7 != (i10 & 7)) {
            AbstractC2327f0.a(i10, 7, PaywallEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public static /* synthetic */ PaywallEvent copy$default(PaywallEvent paywallEvent, CreationData creationData, Data data, PaywallEventType paywallEventType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            creationData = paywallEvent.creationData;
        }
        if ((i10 & 2) != 0) {
            data = paywallEvent.data;
        }
        if ((i10 & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        return paywallEvent.copy(creationData, data, paywallEventType);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallEvent self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        output.m(serialDesc, 0, PaywallEvent$CreationData$$serializer.INSTANCE, self.creationData);
        output.m(serialDesc, 1, PaywallEventDataSerializer.INSTANCE, self.data);
        output.m(serialDesc, 2, bVarArr[2], self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CreationData getCreationData() {
        return this.creationData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaywallEventType getType() {
        return this.type;
    }

    public final PaywallEvent copy(CreationData creationData, Data data, PaywallEventType type) {
        AbstractC5504s.h(creationData, "creationData");
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(type, "type");
        return new PaywallEvent(creationData, data, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallEvent)) {
            return false;
        }
        PaywallEvent paywallEvent = (PaywallEvent) other;
        return AbstractC5504s.c(this.creationData, paywallEvent.creationData) && AbstractC5504s.c(this.data, paywallEvent.data) && this.type == paywallEvent.type;
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public final PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.creationData.hashCode() * 31) + this.data.hashCode()) * 31) + this.type.hashCode();
    }

    @Override // com.revenuecat.purchases.common.events.FeatureEvent
    public boolean isPriorityEvent() {
        return this.type == PaywallEventType.IMPRESSION;
    }

    public final PaywallPostReceiptData toPaywallPostReceiptData$purchases_defaultsBc8Release() {
        String paywallIdentifier = this.data.getPaywallIdentifier();
        String string = this.data.getSessionIdentifier().toString();
        AbstractC5504s.g(string, "data.sessionIdentifier.toString()");
        return new PaywallPostReceiptData(paywallIdentifier, string, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier(), this.data.getPresentedOfferingContext().getOfferingIdentifier());
    }

    public String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ')';
    }

    public PaywallEvent(CreationData creationData, Data data, PaywallEventType type) {
        AbstractC5504s.h(creationData, "creationData");
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(type, "type");
        this.creationData = creationData;
        this.data = data;
        this.type = type;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "paywallIdentifier", "", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "paywallRevision", "", "sessionIdentifier", "Ljava/util/UUID;", "displayMode", "localeIdentifier", "darkMode", "", "exitOfferType", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "exitOfferingIdentifier", "packageIdentifier", "productIdentifier", "errorCode", com.amazon.a.a.o.b.f34648f, "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getDarkMode", "()Z", "getDisplayMode", "()Ljava/lang/String;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "getExitOfferType", "()Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "getExitOfferingIdentifier", "getLocaleIdentifier", "getPackageIdentifier", "getPaywallIdentifier", "getPaywallRevision", "()I", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getProductIdentifier", "getSessionIdentifier$annotations", "()V", "getSessionIdentifier", "()Ljava/util/UUID;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;ILjava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "equals", "other", "hashCode", "toString", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean darkMode;
        private final String displayMode;
        private final Integer errorCode;
        private final String errorMessage;
        private final ExitOfferType exitOfferType;
        private final String exitOfferingIdentifier;
        private final String localeIdentifier;
        private final String packageIdentifier;
        private final String paywallIdentifier;
        private final int paywallRevision;
        private final PresentedOfferingContext presentedOfferingContext;
        private final String productIdentifier;
        private final UUID sessionIdentifier;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return PaywallEventDataSerializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Data(String str, PresentedOfferingContext presentedOfferingContext, int i10, UUID sessionIdentifier, String displayMode, String localeIdentifier, boolean z10, ExitOfferType exitOfferType, String str2, String str3, String str4, Integer num, String str5) {
            AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
            AbstractC5504s.h(sessionIdentifier, "sessionIdentifier");
            AbstractC5504s.h(displayMode, "displayMode");
            AbstractC5504s.h(localeIdentifier, "localeIdentifier");
            this.paywallIdentifier = str;
            this.presentedOfferingContext = presentedOfferingContext;
            this.paywallRevision = i10;
            this.sessionIdentifier = sessionIdentifier;
            this.displayMode = displayMode;
            this.localeIdentifier = localeIdentifier;
            this.darkMode = z10;
            this.exitOfferType = exitOfferType;
            this.exitOfferingIdentifier = str2;
            this.packageIdentifier = str3;
            this.productIdentifier = str4;
            this.errorCode = num;
            this.errorMessage = str5;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, PresentedOfferingContext presentedOfferingContext, int i10, UUID uuid, String str2, String str3, boolean z10, ExitOfferType exitOfferType, String str4, String str5, String str6, Integer num, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.paywallIdentifier;
            }
            return data.copy(str, (i11 & 2) != 0 ? data.presentedOfferingContext : presentedOfferingContext, (i11 & 4) != 0 ? data.paywallRevision : i10, (i11 & 8) != 0 ? data.sessionIdentifier : uuid, (i11 & 16) != 0 ? data.displayMode : str2, (i11 & 32) != 0 ? data.localeIdentifier : str3, (i11 & 64) != 0 ? data.darkMode : z10, (i11 & 128) != 0 ? data.exitOfferType : exitOfferType, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? data.exitOfferingIdentifier : str4, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? data.packageIdentifier : str5, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? data.productIdentifier : str6, (i11 & 2048) != 0 ? data.errorCode : num, (i11 & 4096) != 0 ? data.errorMessage : str7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaywallIdentifier() {
            return this.paywallIdentifier;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getPackageIdentifier() {
            return this.packageIdentifier;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getDisplayMode() {
            return this.displayMode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getDarkMode() {
            return this.darkMode;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final ExitOfferType getExitOfferType() {
            return this.exitOfferType;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getExitOfferingIdentifier() {
            return this.exitOfferingIdentifier;
        }

        public final Data copy(String paywallIdentifier, PresentedOfferingContext presentedOfferingContext, int paywallRevision, UUID sessionIdentifier, String displayMode, String localeIdentifier, boolean darkMode, ExitOfferType exitOfferType, String exitOfferingIdentifier, String packageIdentifier, String productIdentifier, Integer errorCode, String str) {
            AbstractC5504s.h(presentedOfferingContext, "presentedOfferingContext");
            AbstractC5504s.h(sessionIdentifier, "sessionIdentifier");
            AbstractC5504s.h(displayMode, "displayMode");
            AbstractC5504s.h(localeIdentifier, "localeIdentifier");
            return new Data(paywallIdentifier, presentedOfferingContext, paywallRevision, sessionIdentifier, displayMode, localeIdentifier, darkMode, exitOfferType, exitOfferingIdentifier, packageIdentifier, productIdentifier, errorCode, str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return AbstractC5504s.c(this.paywallIdentifier, data.paywallIdentifier) && AbstractC5504s.c(this.presentedOfferingContext, data.presentedOfferingContext) && this.paywallRevision == data.paywallRevision && AbstractC5504s.c(this.sessionIdentifier, data.sessionIdentifier) && AbstractC5504s.c(this.displayMode, data.displayMode) && AbstractC5504s.c(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode && this.exitOfferType == data.exitOfferType && AbstractC5504s.c(this.exitOfferingIdentifier, data.exitOfferingIdentifier) && AbstractC5504s.c(this.packageIdentifier, data.packageIdentifier) && AbstractC5504s.c(this.productIdentifier, data.productIdentifier) && AbstractC5504s.c(this.errorCode, data.errorCode) && AbstractC5504s.c(this.errorMessage, data.errorMessage);
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final String getDisplayMode() {
            return this.displayMode;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final ExitOfferType getExitOfferType() {
            return this.exitOfferType;
        }

        public final String getExitOfferingIdentifier() {
            return this.exitOfferingIdentifier;
        }

        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final String getPackageIdentifier() {
            return this.packageIdentifier;
        }

        public final String getPaywallIdentifier() {
            return this.paywallIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        public int hashCode() {
            String str = this.paywallIdentifier;
            int iHashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.presentedOfferingContext.hashCode()) * 31) + Integer.hashCode(this.paywallRevision)) * 31) + this.sessionIdentifier.hashCode()) * 31) + this.displayMode.hashCode()) * 31) + this.localeIdentifier.hashCode()) * 31) + Boolean.hashCode(this.darkMode)) * 31;
            ExitOfferType exitOfferType = this.exitOfferType;
            int iHashCode2 = (iHashCode + (exitOfferType == null ? 0 : exitOfferType.hashCode())) * 31;
            String str2 = this.exitOfferingIdentifier;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.packageIdentifier;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.productIdentifier;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.errorCode;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.errorMessage;
            return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Data(paywallIdentifier=" + this.paywallIdentifier + ", presentedOfferingContext=" + this.presentedOfferingContext + ", paywallRevision=" + this.paywallRevision + ", sessionIdentifier=" + this.sessionIdentifier + ", displayMode=" + this.displayMode + ", localeIdentifier=" + this.localeIdentifier + ", darkMode=" + this.darkMode + ", exitOfferType=" + this.exitOfferType + ", exitOfferingIdentifier=" + this.exitOfferingIdentifier + ", packageIdentifier=" + this.packageIdentifier + ", productIdentifier=" + this.productIdentifier + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
        }

        public /* synthetic */ Data(String str, PresentedOfferingContext presentedOfferingContext, int i10, UUID uuid, String str2, String str3, boolean z10, ExitOfferType exitOfferType, String str4, String str5, String str6, Integer num, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, presentedOfferingContext, i10, uuid, str2, str3, z10, (i11 & 128) != 0 ? null : exitOfferType, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str4, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str5, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str6, (i11 & 2048) != 0 ? null : num, (i11 & 4096) != 0 ? null : str7);
        }

        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }
    }
}
