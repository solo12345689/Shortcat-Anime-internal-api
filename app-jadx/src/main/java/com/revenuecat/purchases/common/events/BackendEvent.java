package com.revenuecat.purchases.common.events;

import Rf.h;
import Td.AbstractC2163n;
import Td.InterfaceC2154e;
import Td.q;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.J;
import Vf.Q;
import Vf.t0;
import Vf.x0;
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode;
import com.revenuecat.purchases.customercenter.events.CustomerCenterEventType;
import com.revenuecat.purchases.utils.Event;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0011\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent;", "Lcom/revenuecat/purchases/utils/Event;", "<init>", "()V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendEvent;LUf/d;LTf/e;)V", "Companion", "Ad", "CustomPaywall", "CustomerCenter", "Paywalls", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BackendEvent implements Event {
    public static final int AD_EVENT_SCHEMA_VERSION = 1;
    public static final int CUSTOMER_CENTER_EVENT_SCHEMA_VERSION = 1;
    public static final int CUSTOM_PAYWALL_EVENT_SCHEMA_VERSION = 1;
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, Companion.AnonymousClass1.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0002cbB£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016BË\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010%J\u0012\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010%J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u00108JÀ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010%J\u0010\u0010<\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b<\u0010'J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bF\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010B\u0012\u0004\bL\u0010J\u001a\u0004\bK\u0010%R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bN\u0010J\u001a\u0004\bM\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bP\u0010J\u001a\u0004\bO\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bQ\u0010%R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bS\u0010J\u001a\u0004\bR\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bU\u0010J\u001a\u0004\bT\u0010%R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bW\u0010J\u001a\u0004\bV\u0010%R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010B\u0012\u0004\bY\u0010J\u001a\u0004\bX\u0010%R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010Z\u0012\u0004\b\\\u0010J\u001a\u0004\b[\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\b]\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\b^\u0010%R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010_\u0012\u0004\ba\u0010J\u001a\u0004\b`\u00108¨\u0006d"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", DiagnosticsEntry.ID_KEY, "", DiagnosticsEntry.VERSION_KEY, "type", "", DiagnosticsEntry.TIMESTAMP_KEY, "networkName", "mediatorName", "adFormat", "placement", "adUnitId", "impressionId", "appUserID", "appSessionID", "revenueMicros", b.f34634a, "precision", "mediatorErrorCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()J", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Long;", "component14", "component15", "component16", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getVersion", "getType", "J", "getTimestamp", "getTimestamp$annotations", "()V", "getNetworkName", "getNetworkName$annotations", "getMediatorName", "getMediatorName$annotations", "getAdFormat", "getAdFormat$annotations", "getPlacement", "getAdUnitId", "getAdUnitId$annotations", "getImpressionId", "getImpressionId$annotations", "getAppUserID", "getAppUserID$annotations", "getAppSessionID", "getAppSessionID$annotations", "Ljava/lang/Long;", "getRevenueMicros", "getRevenueMicros$annotations", "getCurrency", "getPrecision", "Ljava/lang/Integer;", "getMediatorErrorCode", "getMediatorErrorCode$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Ad extends BackendEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adFormat;
        private final String adUnitId;
        private final String appSessionID;
        private final String appUserID;
        private final String currency;
        private final String id;
        private final String impressionId;
        private final Integer mediatorErrorCode;
        private final String mediatorName;
        private final String networkName;
        private final String placement;
        private final String precision;
        private final Long revenueMicros;
        private final long timestamp;
        private final String type;
        private final int version;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Ad$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Rf.b serializer() {
                return BackendEvent$Ad$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC2154e
        public /* synthetic */ Ad(int i10, String str, int i11, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l10, String str11, String str12, Integer num, t0 t0Var) {
            super(i10, t0Var);
            if (4015 != (i10 & 4015)) {
                AbstractC2327f0.a(i10, 4015, BackendEvent$Ad$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.version = i11;
            this.type = str2;
            this.timestamp = j10;
            if ((i10 & 16) == 0) {
                this.networkName = null;
            } else {
                this.networkName = str3;
            }
            this.mediatorName = str4;
            if ((i10 & 64) == 0) {
                this.adFormat = null;
            } else {
                this.adFormat = str5;
            }
            this.placement = str6;
            this.adUnitId = str7;
            this.impressionId = str8;
            this.appUserID = str9;
            this.appSessionID = str10;
            if ((i10 & 4096) == 0) {
                this.revenueMicros = null;
            } else {
                this.revenueMicros = l10;
            }
            if ((i10 & 8192) == 0) {
                this.currency = null;
            } else {
                this.currency = str11;
            }
            if ((i10 & 16384) == 0) {
                this.precision = null;
            } else {
                this.precision = str12;
            }
            if ((i10 & 32768) == 0) {
                this.mediatorErrorCode = null;
            } else {
                this.mediatorErrorCode = num;
            }
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Ad self, d output, e serialDesc) {
            BackendEvent.write$Self(self, output, serialDesc);
            output.k(serialDesc, 0, self.id);
            output.p(serialDesc, 1, self.version);
            output.k(serialDesc, 2, self.type);
            output.o(serialDesc, 3, self.timestamp);
            if (output.g(serialDesc, 4) || self.networkName != null) {
                output.f(serialDesc, 4, x0.f20253a, self.networkName);
            }
            output.k(serialDesc, 5, self.mediatorName);
            if (output.g(serialDesc, 6) || self.adFormat != null) {
                output.f(serialDesc, 6, x0.f20253a, self.adFormat);
            }
            x0 x0Var = x0.f20253a;
            output.f(serialDesc, 7, x0Var, self.placement);
            output.k(serialDesc, 8, self.adUnitId);
            output.f(serialDesc, 9, x0Var, self.impressionId);
            output.k(serialDesc, 10, self.appUserID);
            output.k(serialDesc, 11, self.appSessionID);
            if (output.g(serialDesc, 12) || self.revenueMicros != null) {
                output.f(serialDesc, 12, Q.f20164a, self.revenueMicros);
            }
            if (output.g(serialDesc, 13) || self.currency != null) {
                output.f(serialDesc, 13, x0Var, self.currency);
            }
            if (output.g(serialDesc, 14) || self.precision != null) {
                output.f(serialDesc, 14, x0Var, self.precision);
            }
            if (!output.g(serialDesc, 15) && self.mediatorErrorCode == null) {
                return;
            }
            output.f(serialDesc, 15, J.f20144a, self.mediatorErrorCode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getImpressionId() {
            return this.impressionId;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getAppUserID() {
            return this.appUserID;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getAppSessionID() {
            return this.appSessionID;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Long getRevenueMicros() {
            return this.revenueMicros;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getPrecision() {
            return this.precision;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getNetworkName() {
            return this.networkName;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getMediatorName() {
            return this.mediatorName;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAdFormat() {
            return this.adFormat;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getPlacement() {
            return this.placement;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public final Ad copy(String str, int i10, String type, long j10, String networkName, String mediatorName, String adFormat, String placement, String adUnitId, String impressionId, String appUserID, String appSessionID, Long revenueMicros, String str2, String precision, Integer mediatorErrorCode) {
            AbstractC5504s.h(str, "id");
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(mediatorName, "mediatorName");
            AbstractC5504s.h(adUnitId, "adUnitId");
            AbstractC5504s.h(appUserID, "appUserID");
            AbstractC5504s.h(appSessionID, "appSessionID");
            return new Ad(str, i10, type, j10, networkName, mediatorName, adFormat, placement, adUnitId, impressionId, appUserID, appSessionID, revenueMicros, str2, precision, mediatorErrorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ad)) {
                return false;
            }
            Ad ad2 = (Ad) other;
            return AbstractC5504s.c(this.id, ad2.id) && this.version == ad2.version && AbstractC5504s.c(this.type, ad2.type) && this.timestamp == ad2.timestamp && AbstractC5504s.c(this.networkName, ad2.networkName) && AbstractC5504s.c(this.mediatorName, ad2.mediatorName) && AbstractC5504s.c(this.adFormat, ad2.adFormat) && AbstractC5504s.c(this.placement, ad2.placement) && AbstractC5504s.c(this.adUnitId, ad2.adUnitId) && AbstractC5504s.c(this.impressionId, ad2.impressionId) && AbstractC5504s.c(this.appUserID, ad2.appUserID) && AbstractC5504s.c(this.appSessionID, ad2.appSessionID) && AbstractC5504s.c(this.revenueMicros, ad2.revenueMicros) && AbstractC5504s.c(this.currency, ad2.currency) && AbstractC5504s.c(this.precision, ad2.precision) && AbstractC5504s.c(this.mediatorErrorCode, ad2.mediatorErrorCode);
        }

        public final String getAdFormat() {
            return this.adFormat;
        }

        public final String getAdUnitId() {
            return this.adUnitId;
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImpressionId() {
            return this.impressionId;
        }

        public final Integer getMediatorErrorCode() {
            return this.mediatorErrorCode;
        }

        public final String getMediatorName() {
            return this.mediatorName;
        }

        public final String getNetworkName() {
            return this.networkName;
        }

        public final String getPlacement() {
            return this.placement;
        }

        public final String getPrecision() {
            return this.precision;
        }

        public final Long getRevenueMicros() {
            return this.revenueMicros;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31;
            String str = this.networkName;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mediatorName.hashCode()) * 31;
            String str2 = this.adFormat;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placement;
            int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.adUnitId.hashCode()) * 31;
            String str4 = this.impressionId;
            int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.appUserID.hashCode()) * 31) + this.appSessionID.hashCode()) * 31;
            Long l10 = this.revenueMicros;
            int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str5 = this.currency;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.precision;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.mediatorErrorCode;
            return iHashCode8 + (num != null ? num.hashCode() : 0);
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            return "Ad(id=" + this.id + ", version=" + this.version + ", type=" + this.type + ", timestamp=" + this.timestamp + ", networkName=" + this.networkName + ", mediatorName=" + this.mediatorName + ", adFormat=" + this.adFormat + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", appUserID=" + this.appUserID + ", appSessionID=" + this.appSessionID + ", revenueMicros=" + this.revenueMicros + ", currency=" + this.currency + ", precision=" + this.precision + ", mediatorErrorCode=" + this.mediatorErrorCode + ')';
        }

        public /* synthetic */ Ad(String str, int i10, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l10, String str11, String str12, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, str2, j10, (i11 & 16) != 0 ? null : str3, str4, (i11 & 64) != 0 ? null : str5, str6, str7, str8, str9, str10, (i11 & 4096) != 0 ? null : l10, (i11 & 8192) != 0 ? null : str11, (i11 & 16384) != 0 ? null : str12, (i11 & 32768) != 0 ? null : num);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ad(String id2, int i10, String type, long j10, String str, String mediatorName, String str2, String str3, String adUnitId, String str4, String appUserID, String appSessionID, Long l10, String str5, String str6, Integer num) {
            super(null);
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(mediatorName, "mediatorName");
            AbstractC5504s.h(adUnitId, "adUnitId");
            AbstractC5504s.h(appUserID, "appUserID");
            AbstractC5504s.h(appSessionID, "appSessionID");
            this.id = id2;
            this.version = i10;
            this.type = type;
            this.timestamp = j10;
            this.networkName = str;
            this.mediatorName = mediatorName;
            this.adFormat = str2;
            this.placement = str3;
            this.adUnitId = adUnitId;
            this.impressionId = str4;
            this.appUserID = appUserID;
            this.appSessionID = appSessionID;
            this.revenueMicros = l10;
            this.currency = str5;
            this.precision = str6;
            this.mediatorErrorCode = num;
        }

        public static /* synthetic */ void getAdFormat$annotations() {
        }

        public static /* synthetic */ void getAdUnitId$annotations() {
        }

        public static /* synthetic */ void getAppSessionID$annotations() {
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getImpressionId$annotations() {
        }

        public static /* synthetic */ void getMediatorErrorCode$annotations() {
        }

        public static /* synthetic */ void getMediatorName$annotations() {
        }

        public static /* synthetic */ void getNetworkName$annotations() {
        }

        public static /* synthetic */ void getRevenueMicros$annotations() {
        }

        public static /* synthetic */ void getTimestamp$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "serializer", "()LRf/b;", "", "AD_EVENT_SCHEMA_VERSION", "I", "CUSTOMER_CENTER_EVENT_SCHEMA_VERSION", "CUSTOM_PAYWALL_EVENT_SCHEMA_VERSION", "PAYWALL_EVENT_SCHEMA_VERSION", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.BackendEvent$Companion$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            public final Rf.b invoke() {
                return new h("com.revenuecat.purchases.common.events.BackendEvent", O.b(BackendEvent.class), new InterfaceC6014d[]{O.b(Ad.class), O.b(CustomPaywall.class), O.b(CustomerCenter.class), O.b(Paywalls.class)}, new Rf.b[]{BackendEvent$Ad$$serializer.INSTANCE, BackendEvent$CustomPaywall$$serializer.INSTANCE, BackendEvent$CustomerCenter$$serializer.INSTANCE, BackendEvent$Paywalls$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Rf.b get$cachedSerializer() {
            return (Rf.b) BackendEvent.$cachedSerializer$delegate.getValue();
        }

        public final Rf.b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBo\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010\u001d¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", DiagnosticsEntry.ID_KEY, "", DiagnosticsEntry.VERSION_KEY, "type", "appUserID", "appSessionID", "", DiagnosticsEntry.TIMESTAMP_KEY, "paywallID", "offeringID", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()J", "component7", "component8", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getVersion", "getType", "getAppUserID", "getAppUserID$annotations", "()V", "getAppSessionID", "getAppSessionID$annotations", "J", "getTimestamp", "getPaywallID", "getPaywallID$annotations", "getOfferingID", "getOfferingID$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomPaywall extends BackendEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String appSessionID;
        private final String appUserID;
        private final String id;
        private final String offeringID;
        private final String paywallID;
        private final long timestamp;
        private final String type;
        private final int version;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Rf.b serializer() {
                return BackendEvent$CustomPaywall$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC2154e
        public /* synthetic */ CustomPaywall(int i10, String str, int i11, String str2, String str3, String str4, long j10, String str5, String str6, t0 t0Var) {
            super(i10, t0Var);
            if (47 != (i10 & 47)) {
                AbstractC2327f0.a(i10, 47, BackendEvent$CustomPaywall$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.version = i11;
            this.type = str2;
            this.appUserID = str3;
            if ((i10 & 16) == 0) {
                this.appSessionID = null;
            } else {
                this.appSessionID = str4;
            }
            this.timestamp = j10;
            if ((i10 & 64) == 0) {
                this.paywallID = null;
            } else {
                this.paywallID = str5;
            }
            if ((i10 & 128) == 0) {
                this.offeringID = null;
            } else {
                this.offeringID = str6;
            }
        }

        public static /* synthetic */ CustomPaywall copy$default(CustomPaywall customPaywall, String str, int i10, String str2, String str3, String str4, long j10, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customPaywall.id;
            }
            if ((i11 & 2) != 0) {
                i10 = customPaywall.version;
            }
            if ((i11 & 4) != 0) {
                str2 = customPaywall.type;
            }
            if ((i11 & 8) != 0) {
                str3 = customPaywall.appUserID;
            }
            if ((i11 & 16) != 0) {
                str4 = customPaywall.appSessionID;
            }
            if ((i11 & 32) != 0) {
                j10 = customPaywall.timestamp;
            }
            if ((i11 & 64) != 0) {
                str5 = customPaywall.paywallID;
            }
            if ((i11 & 128) != 0) {
                str6 = customPaywall.offeringID;
            }
            long j11 = j10;
            String str7 = str3;
            String str8 = str4;
            String str9 = str2;
            return customPaywall.copy(str, i10, str9, str7, str8, j11, str5, str6);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomPaywall self, d output, e serialDesc) {
            BackendEvent.write$Self(self, output, serialDesc);
            output.k(serialDesc, 0, self.id);
            output.p(serialDesc, 1, self.version);
            output.k(serialDesc, 2, self.type);
            output.k(serialDesc, 3, self.appUserID);
            if (output.g(serialDesc, 4) || self.appSessionID != null) {
                output.f(serialDesc, 4, x0.f20253a, self.appSessionID);
            }
            output.o(serialDesc, 5, self.timestamp);
            if (output.g(serialDesc, 6) || self.paywallID != null) {
                output.f(serialDesc, 6, x0.f20253a, self.paywallID);
            }
            if (!output.g(serialDesc, 7) && self.offeringID == null) {
                return;
            }
            output.f(serialDesc, 7, x0.f20253a, self.offeringID);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAppUserID() {
            return this.appUserID;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAppSessionID() {
            return this.appSessionID;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPaywallID() {
            return this.paywallID;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getOfferingID() {
            return this.offeringID;
        }

        public final CustomPaywall copy(String str, int i10, String type, String appUserID, String appSessionID, long j10, String paywallID, String offeringID) {
            AbstractC5504s.h(str, "id");
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(appUserID, "appUserID");
            return new CustomPaywall(str, i10, type, appUserID, appSessionID, j10, paywallID, offeringID);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomPaywall)) {
                return false;
            }
            CustomPaywall customPaywall = (CustomPaywall) other;
            return AbstractC5504s.c(this.id, customPaywall.id) && this.version == customPaywall.version && AbstractC5504s.c(this.type, customPaywall.type) && AbstractC5504s.c(this.appUserID, customPaywall.appUserID) && AbstractC5504s.c(this.appSessionID, customPaywall.appSessionID) && this.timestamp == customPaywall.timestamp && AbstractC5504s.c(this.paywallID, customPaywall.paywallID) && AbstractC5504s.c(this.offeringID, customPaywall.offeringID);
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final String getId() {
            return this.id;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final String getPaywallID() {
            return this.paywallID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31;
            String str = this.appSessionID;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31;
            String str2 = this.paywallID;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.offeringID;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            return "CustomPaywall(id=" + this.id + ", version=" + this.version + ", type=" + this.type + ", appUserID=" + this.appUserID + ", appSessionID=" + this.appSessionID + ", timestamp=" + this.timestamp + ", paywallID=" + this.paywallID + ", offeringID=" + this.offeringID + ')';
        }

        public /* synthetic */ CustomPaywall(String str, int i10, String str2, String str3, String str4, long j10, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, str2, str3, (i11 & 16) != 0 ? null : str4, j10, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPaywall(String id2, int i10, String type, String appUserID, String str, long j10, String str2, String str3) {
            super(null);
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(appUserID, "appUserID");
            this.id = id2;
            this.version = i10;
            this.type = type;
            this.appUserID = appUserID;
            this.appSessionID = str;
            this.timestamp = j10;
            this.paywallID = str2;
            this.offeringID = str3;
        }

        public static /* synthetic */ void getAppSessionID$annotations() {
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getOfferingID$annotations() {
        }

        public static /* synthetic */ void getPaywallID$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u0000 Y2\u00020\u0001:\u0002ZYBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0099\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ(\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010%J\u008e\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010%J\u0010\u0010:\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b:\u0010'J\u001a\u0010=\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010A\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010)R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bH\u0010D\u001a\u0004\bG\u0010%R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bJ\u0010D\u001a\u0004\bI\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bL\u0010-R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010M\u0012\u0004\bO\u0010D\u001a\u0004\bN\u0010/R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bP\u0010%R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Q\u0012\u0004\bS\u0010D\u001a\u0004\bR\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\bU\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bV\u0010%R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010?\u0012\u0004\bX\u0010D\u001a\u0004\bW\u0010%¨\u0006["}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", DiagnosticsEntry.ID_KEY, "", "revisionID", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "type", "appUserID", "appSessionID", "", DiagnosticsEntry.TIMESTAMP_KEY, "", "darkMode", "locale", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "displayMode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "path", "url", "surveyOptionID", "<init>", "(Ljava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "component4", "component5", "component6", "()J", "component7", "()Z", "component8", "component9", "()Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "component10", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "component11", "component12", "copy", "(Ljava/lang/String;ILcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getRevisionID", "getRevisionID$annotations", "()V", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterEventType;", "getType", "getAppUserID", "getAppUserID$annotations", "getAppSessionID", "getAppSessionID$annotations", "J", "getTimestamp", "Z", "getDarkMode", "getDarkMode$annotations", "getLocale", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;", "getDisplayMode", "getDisplayMode$annotations", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "getPath", "getUrl", "getSurveyOptionID", "getSurveyOptionID$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomerCenter extends BackendEvent {
        private final String appSessionID;
        private final String appUserID;
        private final boolean darkMode;
        private final CustomerCenterDisplayMode displayMode;
        private final String id;
        private final String locale;
        private final CustomerCenterConfigData.HelpPath.PathType path;
        private final int revisionID;
        private final String surveyOptionID;
        private final long timestamp;
        private final CustomerCenterEventType type;
        private final String url;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Rf.b[] $childSerializers = {null, null, CustomerCenterEventType.INSTANCE.serializer(), null, null, null, null, null, CustomerCenterDisplayMode.INSTANCE.serializer(), CustomerCenterConfigData.HelpPath.PathType.INSTANCE.serializer(), null, null};

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Rf.b serializer() {
                return BackendEvent$CustomerCenter$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC2154e
        public /* synthetic */ CustomerCenter(int i10, String str, int i11, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j10, boolean z10, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, t0 t0Var) {
            super(i10, t0Var);
            if (4095 != (i10 & 4095)) {
                AbstractC2327f0.a(i10, 4095, BackendEvent$CustomerCenter$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.revisionID = i11;
            this.type = customerCenterEventType;
            this.appUserID = str2;
            this.appSessionID = str3;
            this.timestamp = j10;
            this.darkMode = z10;
            this.locale = str4;
            this.displayMode = customerCenterDisplayMode;
            this.path = pathType;
            this.url = str5;
            this.surveyOptionID = str6;
        }

        public static /* synthetic */ CustomerCenter copy$default(CustomerCenter customerCenter, String str, int i10, CustomerCenterEventType customerCenterEventType, String str2, String str3, long j10, boolean z10, String str4, CustomerCenterDisplayMode customerCenterDisplayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customerCenter.id;
            }
            return customerCenter.copy(str, (i11 & 2) != 0 ? customerCenter.revisionID : i10, (i11 & 4) != 0 ? customerCenter.type : customerCenterEventType, (i11 & 8) != 0 ? customerCenter.appUserID : str2, (i11 & 16) != 0 ? customerCenter.appSessionID : str3, (i11 & 32) != 0 ? customerCenter.timestamp : j10, (i11 & 64) != 0 ? customerCenter.darkMode : z10, (i11 & 128) != 0 ? customerCenter.locale : str4, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? customerCenter.displayMode : customerCenterDisplayMode, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? customerCenter.path : pathType, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? customerCenter.url : str5, (i11 & 2048) != 0 ? customerCenter.surveyOptionID : str6);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomerCenter self, d output, e serialDesc) {
            BackendEvent.write$Self(self, output, serialDesc);
            Rf.b[] bVarArr = $childSerializers;
            output.k(serialDesc, 0, self.id);
            output.p(serialDesc, 1, self.revisionID);
            output.m(serialDesc, 2, bVarArr[2], self.type);
            output.k(serialDesc, 3, self.appUserID);
            output.k(serialDesc, 4, self.appSessionID);
            output.o(serialDesc, 5, self.timestamp);
            output.B(serialDesc, 6, self.darkMode);
            output.k(serialDesc, 7, self.locale);
            output.m(serialDesc, 8, bVarArr[8], self.displayMode);
            output.f(serialDesc, 9, bVarArr[9], self.path);
            x0 x0Var = x0.f20253a;
            output.f(serialDesc, 10, x0Var, self.url);
            output.f(serialDesc, 11, x0Var, self.surveyOptionID);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final CustomerCenterConfigData.HelpPath.PathType getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getSurveyOptionID() {
            return this.surveyOptionID;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRevisionID() {
            return this.revisionID;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CustomerCenterEventType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAppUserID() {
            return this.appUserID;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAppSessionID() {
            return this.appSessionID;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getDarkMode() {
            return this.darkMode;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final CustomerCenter copy(String str, int revisionID, CustomerCenterEventType type, String appUserID, String appSessionID, long j10, boolean darkMode, String locale, CustomerCenterDisplayMode displayMode, CustomerCenterConfigData.HelpPath.PathType path, String url, String surveyOptionID) {
            AbstractC5504s.h(str, "id");
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(appUserID, "appUserID");
            AbstractC5504s.h(appSessionID, "appSessionID");
            AbstractC5504s.h(locale, "locale");
            AbstractC5504s.h(displayMode, "displayMode");
            return new CustomerCenter(str, revisionID, type, appUserID, appSessionID, j10, darkMode, locale, displayMode, path, url, surveyOptionID);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerCenter)) {
                return false;
            }
            CustomerCenter customerCenter = (CustomerCenter) other;
            return AbstractC5504s.c(this.id, customerCenter.id) && this.revisionID == customerCenter.revisionID && this.type == customerCenter.type && AbstractC5504s.c(this.appUserID, customerCenter.appUserID) && AbstractC5504s.c(this.appSessionID, customerCenter.appSessionID) && this.timestamp == customerCenter.timestamp && this.darkMode == customerCenter.darkMode && AbstractC5504s.c(this.locale, customerCenter.locale) && this.displayMode == customerCenter.displayMode && this.path == customerCenter.path && AbstractC5504s.c(this.url, customerCenter.url) && AbstractC5504s.c(this.surveyOptionID, customerCenter.surveyOptionID);
        }

        public final String getAppSessionID() {
            return this.appSessionID;
        }

        public final String getAppUserID() {
            return this.appUserID;
        }

        public final boolean getDarkMode() {
            return this.darkMode;
        }

        public final CustomerCenterDisplayMode getDisplayMode() {
            return this.displayMode;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final CustomerCenterConfigData.HelpPath.PathType getPath() {
            return this.path;
        }

        public final int getRevisionID() {
            return this.revisionID;
        }

        public final String getSurveyOptionID() {
            return this.surveyOptionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final CustomerCenterEventType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.revisionID)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.appSessionID.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.locale.hashCode()) * 31) + this.displayMode.hashCode()) * 31;
            CustomerCenterConfigData.HelpPath.PathType pathType = this.path;
            int iHashCode2 = (iHashCode + (pathType == null ? 0 : pathType.hashCode())) * 31;
            String str = this.url;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.surveyOptionID;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            return "CustomerCenter(id=" + this.id + ", revisionID=" + this.revisionID + ", type=" + this.type + ", appUserID=" + this.appUserID + ", appSessionID=" + this.appSessionID + ", timestamp=" + this.timestamp + ", darkMode=" + this.darkMode + ", locale=" + this.locale + ", displayMode=" + this.displayMode + ", path=" + this.path + ", url=" + this.url + ", surveyOptionID=" + this.surveyOptionID + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerCenter(String id2, int i10, CustomerCenterEventType type, String appUserID, String appSessionID, long j10, boolean z10, String locale, CustomerCenterDisplayMode displayMode, CustomerCenterConfigData.HelpPath.PathType pathType, String str, String str2) {
            super(null);
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(appUserID, "appUserID");
            AbstractC5504s.h(appSessionID, "appSessionID");
            AbstractC5504s.h(locale, "locale");
            AbstractC5504s.h(displayMode, "displayMode");
            this.id = id2;
            this.revisionID = i10;
            this.type = type;
            this.appUserID = appUserID;
            this.appSessionID = appSessionID;
            this.timestamp = j10;
            this.darkMode = z10;
            this.locale = locale;
            this.displayMode = displayMode;
            this.path = pathType;
            this.url = str;
            this.surveyOptionID = str2;
        }

        public static /* synthetic */ void getAppSessionID$annotations() {
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getDarkMode$annotations() {
        }

        public static /* synthetic */ void getDisplayMode$annotations() {
        }

        public static /* synthetic */ void getRevisionID$annotations() {
        }

        public static /* synthetic */ void getSurveyOptionID$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002mlB±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019Bã\u0001\b\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ(\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!HÁ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0010\u00101\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010(J\u0010\u00104\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010(J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010(J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010(J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010(J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010(JÒ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010(J\u0010\u0010A\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bA\u0010*J\u001a\u0010D\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010*R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010F\u001a\u0004\bJ\u0010(R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010F\u0012\u0004\bL\u0010M\u001a\u0004\bK\u0010(R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010F\u0012\u0004\bO\u0010M\u001a\u0004\bN\u0010(R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010F\u0012\u0004\bQ\u0010M\u001a\u0004\bP\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010F\u0012\u0004\bS\u0010M\u001a\u0004\bR\u0010(R \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010H\u0012\u0004\bU\u0010M\u001a\u0004\bT\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bW\u00102R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bY\u0010M\u001a\u0004\bX\u0010(R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Z\u0012\u0004\b\\\u0010M\u001a\u0004\b[\u00105R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010F\u0012\u0004\b^\u0010M\u001a\u0004\b]\u0010(R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010F\u0012\u0004\b`\u0010M\u001a\u0004\b_\u0010(R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010F\u0012\u0004\bb\u0010M\u001a\u0004\ba\u0010(R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010F\u0012\u0004\bd\u0010M\u001a\u0004\bc\u0010(R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010F\u0012\u0004\bf\u0010M\u001a\u0004\be\u0010(R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010g\u0012\u0004\bi\u0010M\u001a\u0004\bh\u0010<R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010F\u0012\u0004\bk\u0010M\u001a\u0004\bj\u0010(¨\u0006n"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "Lcom/revenuecat/purchases/common/events/BackendEvent;", "", DiagnosticsEntry.ID_KEY, "", DiagnosticsEntry.VERSION_KEY, "type", "appUserID", "sessionID", "offeringID", "paywallID", "paywallRevision", "", DiagnosticsEntry.TIMESTAMP_KEY, "displayMode", "", "darkMode", "localeIdentifier", "exitOfferType", "exitOfferingID", "packageID", "productID", "errorCode", b.f34648f, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()J", "component10", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "component17", "()Ljava/lang/Integer;", "component18", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getVersion", "getType", "getAppUserID", "getAppUserID$annotations", "()V", "getSessionID", "getSessionID$annotations", "getOfferingID", "getOfferingID$annotations", "getPaywallID", "getPaywallID$annotations", "getPaywallRevision", "getPaywallRevision$annotations", "J", "getTimestamp", "getDisplayMode", "getDisplayMode$annotations", "Z", "getDarkMode", "getDarkMode$annotations", "getLocaleIdentifier", "getLocaleIdentifier$annotations", "getExitOfferType", "getExitOfferType$annotations", "getExitOfferingID", "getExitOfferingID$annotations", "getPackageID", "getPackageID$annotations", "getProductID", "getProductID$annotations", "Ljava/lang/Integer;", "getErrorCode", "getErrorCode$annotations", "getErrorMessage", "getErrorMessage$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Paywalls extends BackendEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String appUserID;
        private final boolean darkMode;
        private final String displayMode;
        private final Integer errorCode;
        private final String errorMessage;
        private final String exitOfferType;
        private final String exitOfferingID;
        private final String id;
        private final String localeIdentifier;
        private final String offeringID;
        private final String packageID;
        private final String paywallID;
        private final int paywallRevision;
        private final String productID;
        private final String sessionID;
        private final long timestamp;
        private final String type;
        private final int version;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Rf.b serializer() {
                return BackendEvent$Paywalls$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC2154e
        public /* synthetic */ Paywalls(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, int i12, long j10, String str7, boolean z10, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, t0 t0Var) {
            super(i10, t0Var);
            if (4095 != (i10 & 4095)) {
                AbstractC2327f0.a(i10, 4095, BackendEvent$Paywalls$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.version = i11;
            this.type = str2;
            this.appUserID = str3;
            this.sessionID = str4;
            this.offeringID = str5;
            this.paywallID = str6;
            this.paywallRevision = i12;
            this.timestamp = j10;
            this.displayMode = str7;
            this.darkMode = z10;
            this.localeIdentifier = str8;
            if ((i10 & 4096) == 0) {
                this.exitOfferType = null;
            } else {
                this.exitOfferType = str9;
            }
            if ((i10 & 8192) == 0) {
                this.exitOfferingID = null;
            } else {
                this.exitOfferingID = str10;
            }
            if ((i10 & 16384) == 0) {
                this.packageID = null;
            } else {
                this.packageID = str11;
            }
            if ((32768 & i10) == 0) {
                this.productID = null;
            } else {
                this.productID = str12;
            }
            if ((65536 & i10) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num;
            }
            if ((i10 & 131072) == 0) {
                this.errorMessage = null;
            } else {
                this.errorMessage = str13;
            }
        }

        public static /* synthetic */ Paywalls copy$default(Paywalls paywalls, String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11, long j10, String str7, boolean z10, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, int i12, Object obj) {
            String str14;
            Integer num2;
            String str15 = (i12 & 1) != 0 ? paywalls.id : str;
            int i13 = (i12 & 2) != 0 ? paywalls.version : i10;
            String str16 = (i12 & 4) != 0 ? paywalls.type : str2;
            String str17 = (i12 & 8) != 0 ? paywalls.appUserID : str3;
            String str18 = (i12 & 16) != 0 ? paywalls.sessionID : str4;
            String str19 = (i12 & 32) != 0 ? paywalls.offeringID : str5;
            String str20 = (i12 & 64) != 0 ? paywalls.paywallID : str6;
            int i14 = (i12 & 128) != 0 ? paywalls.paywallRevision : i11;
            long j11 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? paywalls.timestamp : j10;
            String str21 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? paywalls.displayMode : str7;
            boolean z11 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? paywalls.darkMode : z10;
            String str22 = (i12 & 2048) != 0 ? paywalls.localeIdentifier : str8;
            String str23 = (i12 & 4096) != 0 ? paywalls.exitOfferType : str9;
            String str24 = str15;
            String str25 = (i12 & 8192) != 0 ? paywalls.exitOfferingID : str10;
            String str26 = (i12 & 16384) != 0 ? paywalls.packageID : str11;
            String str27 = (i12 & 32768) != 0 ? paywalls.productID : str12;
            Integer num3 = (i12 & 65536) != 0 ? paywalls.errorCode : num;
            if ((i12 & 131072) != 0) {
                num2 = num3;
                str14 = paywalls.errorMessage;
            } else {
                str14 = str13;
                num2 = num3;
            }
            return paywalls.copy(str24, i13, str16, str17, str18, str19, str20, i14, j11, str21, z11, str22, str23, str25, str26, str27, num2, str14);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Paywalls self, d output, e serialDesc) {
            BackendEvent.write$Self(self, output, serialDesc);
            output.k(serialDesc, 0, self.id);
            output.p(serialDesc, 1, self.version);
            output.k(serialDesc, 2, self.type);
            output.k(serialDesc, 3, self.appUserID);
            output.k(serialDesc, 4, self.sessionID);
            output.k(serialDesc, 5, self.offeringID);
            x0 x0Var = x0.f20253a;
            output.f(serialDesc, 6, x0Var, self.paywallID);
            output.p(serialDesc, 7, self.paywallRevision);
            output.o(serialDesc, 8, self.timestamp);
            output.k(serialDesc, 9, self.displayMode);
            output.B(serialDesc, 10, self.darkMode);
            output.k(serialDesc, 11, self.localeIdentifier);
            if (output.g(serialDesc, 12) || self.exitOfferType != null) {
                output.f(serialDesc, 12, x0Var, self.exitOfferType);
            }
            if (output.g(serialDesc, 13) || self.exitOfferingID != null) {
                output.f(serialDesc, 13, x0Var, self.exitOfferingID);
            }
            if (output.g(serialDesc, 14) || self.packageID != null) {
                output.f(serialDesc, 14, x0Var, self.packageID);
            }
            if (output.g(serialDesc, 15) || self.productID != null) {
                output.f(serialDesc, 15, x0Var, self.productID);
            }
            if (output.g(serialDesc, 16) || self.errorCode != null) {
                output.f(serialDesc, 16, J.f20144a, self.errorCode);
            }
            if (!output.g(serialDesc, 17) && self.errorMessage == null) {
                return;
            }
            output.f(serialDesc, 17, x0Var, self.errorMessage);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getDisplayMode() {
            return this.displayMode;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final boolean getDarkMode() {
            return this.darkMode;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getExitOfferType() {
            return this.exitOfferType;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getExitOfferingID() {
            return this.exitOfferingID;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getPackageID() {
            return this.packageID;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getProductID() {
            return this.productID;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAppUserID() {
            return this.appUserID;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSessionID() {
            return this.sessionID;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getOfferingID() {
            return this.offeringID;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getPaywallID() {
            return this.paywallID;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Paywalls copy(String str, int i10, String type, String appUserID, String sessionID, String offeringID, String paywallID, int paywallRevision, long j10, String displayMode, boolean darkMode, String localeIdentifier, String exitOfferType, String exitOfferingID, String packageID, String productID, Integer errorCode, String str2) {
            AbstractC5504s.h(str, "id");
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(appUserID, "appUserID");
            AbstractC5504s.h(sessionID, "sessionID");
            AbstractC5504s.h(offeringID, "offeringID");
            AbstractC5504s.h(displayMode, "displayMode");
            AbstractC5504s.h(localeIdentifier, "localeIdentifier");
            return new Paywalls(str, i10, type, appUserID, sessionID, offeringID, paywallID, paywallRevision, j10, displayMode, darkMode, localeIdentifier, exitOfferType, exitOfferingID, packageID, productID, errorCode, str2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paywalls)) {
                return false;
            }
            Paywalls paywalls = (Paywalls) other;
            return AbstractC5504s.c(this.id, paywalls.id) && this.version == paywalls.version && AbstractC5504s.c(this.type, paywalls.type) && AbstractC5504s.c(this.appUserID, paywalls.appUserID) && AbstractC5504s.c(this.sessionID, paywalls.sessionID) && AbstractC5504s.c(this.offeringID, paywalls.offeringID) && AbstractC5504s.c(this.paywallID, paywalls.paywallID) && this.paywallRevision == paywalls.paywallRevision && this.timestamp == paywalls.timestamp && AbstractC5504s.c(this.displayMode, paywalls.displayMode) && this.darkMode == paywalls.darkMode && AbstractC5504s.c(this.localeIdentifier, paywalls.localeIdentifier) && AbstractC5504s.c(this.exitOfferType, paywalls.exitOfferType) && AbstractC5504s.c(this.exitOfferingID, paywalls.exitOfferingID) && AbstractC5504s.c(this.packageID, paywalls.packageID) && AbstractC5504s.c(this.productID, paywalls.productID) && AbstractC5504s.c(this.errorCode, paywalls.errorCode) && AbstractC5504s.c(this.errorMessage, paywalls.errorMessage);
        }

        public final String getAppUserID() {
            return this.appUserID;
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

        public final String getExitOfferType() {
            return this.exitOfferType;
        }

        public final String getExitOfferingID() {
            return this.exitOfferingID;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLocaleIdentifier() {
            return this.localeIdentifier;
        }

        public final String getOfferingID() {
            return this.offeringID;
        }

        public final String getPackageID() {
            return this.packageID;
        }

        public final String getPaywallID() {
            return this.paywallID;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final String getProductID() {
            return this.productID;
        }

        public final String getSessionID() {
            return this.sessionID;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getType() {
            return this.type;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + this.offeringID.hashCode()) * 31;
            String str = this.paywallID;
            int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.paywallRevision)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.displayMode.hashCode()) * 31) + Boolean.hashCode(this.darkMode)) * 31) + this.localeIdentifier.hashCode()) * 31;
            String str2 = this.exitOfferType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.exitOfferingID;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.packageID;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.productID;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.errorCode;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            String str6 = this.errorMessage;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            return "Paywalls(id=" + this.id + ", version=" + this.version + ", type=" + this.type + ", appUserID=" + this.appUserID + ", sessionID=" + this.sessionID + ", offeringID=" + this.offeringID + ", paywallID=" + this.paywallID + ", paywallRevision=" + this.paywallRevision + ", timestamp=" + this.timestamp + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ", exitOfferType=" + this.exitOfferType + ", exitOfferingID=" + this.exitOfferingID + ", packageID=" + this.packageID + ", productID=" + this.productID + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ')';
        }

        public /* synthetic */ Paywalls(String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11, long j10, String str7, boolean z10, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, str2, str3, str4, str5, str6, i11, j10, str7, z10, str8, (i12 & 4096) != 0 ? null : str9, (i12 & 8192) != 0 ? null : str10, (i12 & 16384) != 0 ? null : str11, (32768 & i12) != 0 ? null : str12, (65536 & i12) != 0 ? null : num, (i12 & 131072) != 0 ? null : str13);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paywalls(String id2, int i10, String type, String appUserID, String sessionID, String offeringID, String str, int i11, long j10, String displayMode, boolean z10, String localeIdentifier, String str2, String str3, String str4, String str5, Integer num, String str6) {
            super(null);
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(appUserID, "appUserID");
            AbstractC5504s.h(sessionID, "sessionID");
            AbstractC5504s.h(offeringID, "offeringID");
            AbstractC5504s.h(displayMode, "displayMode");
            AbstractC5504s.h(localeIdentifier, "localeIdentifier");
            this.id = id2;
            this.version = i10;
            this.type = type;
            this.appUserID = appUserID;
            this.sessionID = sessionID;
            this.offeringID = offeringID;
            this.paywallID = str;
            this.paywallRevision = i11;
            this.timestamp = j10;
            this.displayMode = displayMode;
            this.darkMode = z10;
            this.localeIdentifier = localeIdentifier;
            this.exitOfferType = str2;
            this.exitOfferingID = str3;
            this.packageID = str4;
            this.productID = str5;
            this.errorCode = num;
            this.errorMessage = str6;
        }

        public static /* synthetic */ void getAppUserID$annotations() {
        }

        public static /* synthetic */ void getDarkMode$annotations() {
        }

        public static /* synthetic */ void getDisplayMode$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getErrorMessage$annotations() {
        }

        public static /* synthetic */ void getExitOfferType$annotations() {
        }

        public static /* synthetic */ void getExitOfferingID$annotations() {
        }

        public static /* synthetic */ void getLocaleIdentifier$annotations() {
        }

        public static /* synthetic */ void getOfferingID$annotations() {
        }

        public static /* synthetic */ void getPackageID$annotations() {
        }

        public static /* synthetic */ void getPaywallID$annotations() {
        }

        public static /* synthetic */ void getPaywallRevision$annotations() {
        }

        public static /* synthetic */ void getProductID$annotations() {
        }

        public static /* synthetic */ void getSessionID$annotations() {
        }
    }

    public /* synthetic */ BackendEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BackendEvent() {
    }

    @InterfaceC2154e
    public /* synthetic */ BackendEvent(int i10, t0 t0Var) {
    }

    public static final /* synthetic */ void write$Self(BackendEvent self, d output, e serialDesc) {
    }
}
