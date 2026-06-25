package com.revenuecat.purchases.common.events;

import Rf.b;
import Rf.h;
import Td.AbstractC2163n;
import Td.InterfaceC2154e;
import Td.q;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.t0;
import com.revenuecat.purchases.common.events.BackendEvent;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0011\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/utils/Event;", "<init>", "()V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent;LUf/d;LTf/e;)V", "Companion", "Ad", "CustomPaywall", "CustomerCenter", "Paywalls", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BackendStoredEvent implements Event {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, Companion.AnonymousClass1.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$Ad;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$Ad;", "getEvent", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Ad extends BackendStoredEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BackendEvent.Ad event;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Ad;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return BackendStoredEvent$Ad$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC2154e
        public /* synthetic */ Ad(int i10, BackendEvent.Ad ad2, t0 t0Var) {
            super(i10, t0Var);
            if (1 != (i10 & 1)) {
                AbstractC2327f0.a(i10, 1, BackendStoredEvent$Ad$$serializer.INSTANCE.getDescriptor());
            }
            this.event = ad2;
        }

        public static /* synthetic */ Ad copy$default(Ad ad2, BackendEvent.Ad ad3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ad3 = ad2.event;
            }
            return ad2.copy(ad3);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Ad self, d output, e serialDesc) {
            BackendStoredEvent.write$Self(self, output, serialDesc);
            output.m(serialDesc, 0, BackendEvent$Ad$$serializer.INSTANCE, self.event);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BackendEvent.Ad getEvent() {
            return this.event;
        }

        public final Ad copy(BackendEvent.Ad event) {
            AbstractC5504s.h(event, "event");
            return new Ad(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ad) && AbstractC5504s.c(this.event, ((Ad) other).event);
        }

        public final BackendEvent.Ad getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            return "Ad(event=" + this.event + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ad(BackendEvent.Ad event) {
            super(null);
            AbstractC5504s.h(event, "event");
            this.event = event;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.events.BackendStoredEvent$Companion$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // ie.InterfaceC5082a
            public final b invoke() {
                return new h("com.revenuecat.purchases.common.events.BackendStoredEvent", O.b(BackendStoredEvent.class), new InterfaceC6014d[]{O.b(Ad.class), O.b(CustomPaywall.class), O.b(CustomerCenter.class), O.b(Paywalls.class)}, new b[]{BackendStoredEvent$Ad$$serializer.INSTANCE, BackendStoredEvent$CustomPaywall$$serializer.INSTANCE, BackendStoredEvent$CustomerCenter$$serializer.INSTANCE, BackendStoredEvent$Paywalls$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ b get$cachedSerializer() {
            return (b) BackendStoredEvent.$cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomPaywall;", "getEvent", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomPaywall extends BackendStoredEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BackendEvent.CustomPaywall event;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomPaywall;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return BackendStoredEvent$CustomPaywall$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC2154e
        public /* synthetic */ CustomPaywall(int i10, BackendEvent.CustomPaywall customPaywall, t0 t0Var) {
            super(i10, t0Var);
            if (1 != (i10 & 1)) {
                AbstractC2327f0.a(i10, 1, BackendStoredEvent$CustomPaywall$$serializer.INSTANCE.getDescriptor());
            }
            this.event = customPaywall;
        }

        public static /* synthetic */ CustomPaywall copy$default(CustomPaywall customPaywall, BackendEvent.CustomPaywall customPaywall2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customPaywall2 = customPaywall.event;
            }
            return customPaywall.copy(customPaywall2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomPaywall self, d output, e serialDesc) {
            BackendStoredEvent.write$Self(self, output, serialDesc);
            output.m(serialDesc, 0, BackendEvent$CustomPaywall$$serializer.INSTANCE, self.event);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BackendEvent.CustomPaywall getEvent() {
            return this.event;
        }

        public final CustomPaywall copy(BackendEvent.CustomPaywall event) {
            AbstractC5504s.h(event, "event");
            return new CustomPaywall(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomPaywall) && AbstractC5504s.c(this.event, ((CustomPaywall) other).event);
        }

        public final BackendEvent.CustomPaywall getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            return "CustomPaywall(event=" + this.event + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPaywall(BackendEvent.CustomPaywall event) {
            super(null);
            AbstractC5504s.h(event, "event");
            this.event = event;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "getEvent", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomerCenter extends BackendStoredEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BackendEvent.CustomerCenter event;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return BackendStoredEvent$CustomerCenter$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC2154e
        public /* synthetic */ CustomerCenter(int i10, BackendEvent.CustomerCenter customerCenter, t0 t0Var) {
            super(i10, t0Var);
            if (1 != (i10 & 1)) {
                AbstractC2327f0.a(i10, 1, BackendStoredEvent$CustomerCenter$$serializer.INSTANCE.getDescriptor());
            }
            this.event = customerCenter;
        }

        public static /* synthetic */ CustomerCenter copy$default(CustomerCenter customerCenter, BackendEvent.CustomerCenter customerCenter2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customerCenter2 = customerCenter.event;
            }
            return customerCenter.copy(customerCenter2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomerCenter self, d output, e serialDesc) {
            BackendStoredEvent.write$Self(self, output, serialDesc);
            output.m(serialDesc, 0, BackendEvent$CustomerCenter$$serializer.INSTANCE, self.event);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BackendEvent.CustomerCenter getEvent() {
            return this.event;
        }

        public final CustomerCenter copy(BackendEvent.CustomerCenter event) {
            AbstractC5504s.h(event, "event");
            return new CustomerCenter(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CustomerCenter) && AbstractC5504s.c(this.event, ((CustomerCenter) other).event);
        }

        public final BackendEvent.CustomerCenter getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            return "CustomerCenter(event=" + this.event + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerCenter(BackendEvent.CustomerCenter event) {
            super(null);
            AbstractC5504s.h(event, "event");
            this.event = event;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "getEvent", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Paywalls extends BackendStoredEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BackendEvent.Paywalls event;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return BackendStoredEvent$Paywalls$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC2154e
        public /* synthetic */ Paywalls(int i10, BackendEvent.Paywalls paywalls, t0 t0Var) {
            super(i10, t0Var);
            if (1 != (i10 & 1)) {
                AbstractC2327f0.a(i10, 1, BackendStoredEvent$Paywalls$$serializer.INSTANCE.getDescriptor());
            }
            this.event = paywalls;
        }

        public static /* synthetic */ Paywalls copy$default(Paywalls paywalls, BackendEvent.Paywalls paywalls2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywalls2 = paywalls.event;
            }
            return paywalls.copy(paywalls2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Paywalls self, d output, e serialDesc) {
            BackendStoredEvent.write$Self(self, output, serialDesc);
            output.m(serialDesc, 0, BackendEvent$Paywalls$$serializer.INSTANCE, self.event);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BackendEvent.Paywalls getEvent() {
            return this.event;
        }

        public final Paywalls copy(BackendEvent.Paywalls event) {
            AbstractC5504s.h(event, "event");
            return new Paywalls(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Paywalls) && AbstractC5504s.c(this.event, ((Paywalls) other).event);
        }

        public final BackendEvent.Paywalls getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            return "Paywalls(event=" + this.event + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paywalls(BackendEvent.Paywalls event) {
            super(null);
            AbstractC5504s.h(event, "event");
            this.event = event;
        }
    }

    public /* synthetic */ BackendStoredEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BackendStoredEvent() {
    }

    @InterfaceC2154e
    public /* synthetic */ BackendStoredEvent(int i10, t0 t0Var) {
    }

    public static final /* synthetic */ void write$Self(BackendStoredEvent self, d output, e serialDesc) {
    }
}
