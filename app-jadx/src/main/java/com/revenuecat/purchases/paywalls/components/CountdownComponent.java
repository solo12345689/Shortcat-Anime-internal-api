package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.AbstractC2163n;
import Td.InterfaceC2154e;
import Td.q;
import Tf.e;
import Uf.d;
import Vf.A;
import Vf.AbstractC2327f0;
import Vf.t0;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import java.util.Date;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 )2\u00020\u0001:\u0004*)+,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBS\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010$¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "style", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "countFrom", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "countdownStack", "endStack", "fallback", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/StackComponent;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "getStyle", "()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getCountFrom", "()Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "getCountFrom$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getCountdownStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getCountdownStack$annotations", "getEndStack", "getEndStack$annotations", "getFallback", "Companion", "$serializer", "CountFrom", "CountdownStyle", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CountdownComponent implements PaywallComponent {
    private final CountFrom countFrom;
    private final StackComponent countdownStack;
    private final StackComponent endStack;
    private final StackComponent fallback;
    private final CountdownStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {null, CountFrom.INSTANCE.serializer(), null, null, null};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return CountdownComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "", "(Ljava/lang/String;I)V", "DAYS", "HOURS", "MINUTES", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum CountFrom {
        DAYS,
        HOURS,
        MINUTES;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, Companion.AnonymousClass1.INSTANCE);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountFrom;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.CountdownComponent$CountFrom$Companion$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return A.a("com.revenuecat.purchases.paywalls.components.CountdownComponent.CountFrom", CountFrom.values(), new String[]{"days", "hours", "minutes"}, new Annotation[][]{null, null, null}, null);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) CountFrom.$cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "", "", "type", "Ljava/util/Date;", "date", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Date;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "getDate$annotations", "()V", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CountdownStyle {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Date date;
        private final String type;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent$CountdownStyle;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return CountdownComponent$CountdownStyle$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC2154e
        public /* synthetic */ CountdownStyle(int i10, String str, Date date, t0 t0Var) {
            if (3 != (i10 & 3)) {
                AbstractC2327f0.a(i10, 3, CountdownComponent$CountdownStyle$$serializer.INSTANCE.getDescriptor());
            }
            this.type = str;
            this.date = date;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CountdownStyle self, d output, e serialDesc) {
            output.k(serialDesc, 0, self.type);
            output.m(serialDesc, 1, ISO8601DateSerializer.INSTANCE, self.date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountdownStyle)) {
                return false;
            }
            CountdownStyle countdownStyle = (CountdownStyle) obj;
            return AbstractC5504s.c(this.type, countdownStyle.type) && AbstractC5504s.c(this.date, countdownStyle.date);
        }

        public final /* synthetic */ Date getDate() {
            return this.date;
        }

        public final /* synthetic */ String getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CountdownStyle(type=" + this.type + ", date=" + this.date + ')';
        }

        public CountdownStyle(String type, Date date) {
            AbstractC5504s.h(type, "type");
            AbstractC5504s.h(date, "date");
            this.type = type;
            this.date = date;
        }

        public static /* synthetic */ void getDate$annotations() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ CountdownComponent(int i10, CountdownStyle countdownStyle, CountFrom countFrom, StackComponent stackComponent, StackComponent stackComponent2, StackComponent stackComponent3, t0 t0Var) {
        if (5 != (i10 & 5)) {
            AbstractC2327f0.a(i10, 5, CountdownComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.style = countdownStyle;
        if ((i10 & 2) == 0) {
            this.countFrom = CountFrom.DAYS;
        } else {
            this.countFrom = countFrom;
        }
        this.countdownStack = stackComponent;
        if ((i10 & 8) == 0) {
            this.endStack = null;
        } else {
            this.endStack = stackComponent2;
        }
        if ((i10 & 16) == 0) {
            this.fallback = null;
        } else {
            this.fallback = stackComponent3;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CountdownComponent self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        output.m(serialDesc, 0, CountdownComponent$CountdownStyle$$serializer.INSTANCE, self.style);
        if (output.g(serialDesc, 1) || self.countFrom != CountFrom.DAYS) {
            output.m(serialDesc, 1, bVarArr[1], self.countFrom);
        }
        StackComponent$$serializer stackComponent$$serializer = StackComponent$$serializer.INSTANCE;
        output.m(serialDesc, 2, stackComponent$$serializer, self.countdownStack);
        if (output.g(serialDesc, 3) || self.endStack != null) {
            output.f(serialDesc, 3, stackComponent$$serializer, self.endStack);
        }
        if (!output.g(serialDesc, 4) && self.fallback == null) {
            return;
        }
        output.f(serialDesc, 4, stackComponent$$serializer, self.fallback);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownComponent)) {
            return false;
        }
        CountdownComponent countdownComponent = (CountdownComponent) obj;
        return AbstractC5504s.c(this.style, countdownComponent.style) && this.countFrom == countdownComponent.countFrom && AbstractC5504s.c(this.countdownStack, countdownComponent.countdownStack) && AbstractC5504s.c(this.endStack, countdownComponent.endStack) && AbstractC5504s.c(this.fallback, countdownComponent.fallback);
    }

    public final /* synthetic */ CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final /* synthetic */ StackComponent getCountdownStack() {
        return this.countdownStack;
    }

    public final /* synthetic */ StackComponent getEndStack() {
        return this.endStack;
    }

    public final /* synthetic */ StackComponent getFallback() {
        return this.fallback;
    }

    public final /* synthetic */ CountdownStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = ((((this.style.hashCode() * 31) + this.countFrom.hashCode()) * 31) + this.countdownStack.hashCode()) * 31;
        StackComponent stackComponent = this.endStack;
        int iHashCode2 = (iHashCode + (stackComponent == null ? 0 : stackComponent.hashCode())) * 31;
        StackComponent stackComponent2 = this.fallback;
        return iHashCode2 + (stackComponent2 != null ? stackComponent2.hashCode() : 0);
    }

    public String toString() {
        return "CountdownComponent(style=" + this.style + ", countFrom=" + this.countFrom + ", countdownStack=" + this.countdownStack + ", endStack=" + this.endStack + ", fallback=" + this.fallback + ')';
    }

    public CountdownComponent(CountdownStyle style, CountFrom countFrom, StackComponent countdownStack, StackComponent stackComponent, StackComponent stackComponent2) {
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(countFrom, "countFrom");
        AbstractC5504s.h(countdownStack, "countdownStack");
        this.style = style;
        this.countFrom = countFrom;
        this.countdownStack = countdownStack;
        this.endStack = stackComponent;
        this.fallback = stackComponent2;
    }

    public /* synthetic */ CountdownComponent(CountdownStyle countdownStyle, CountFrom countFrom, StackComponent stackComponent, StackComponent stackComponent2, StackComponent stackComponent3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(countdownStyle, (i10 & 2) != 0 ? CountFrom.DAYS : countFrom, stackComponent, (i10 & 8) != 0 ? null : stackComponent2, (i10 & 16) != 0 ? null : stackComponent3);
    }

    public static /* synthetic */ void getCountFrom$annotations() {
    }

    public static /* synthetic */ void getCountdownStack$annotations() {
    }

    public static /* synthetic */ void getEndStack$annotations() {
    }
}
