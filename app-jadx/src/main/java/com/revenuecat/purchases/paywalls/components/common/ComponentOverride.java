package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import Td.AbstractC2163n;
import Td.InterfaceC2154e;
import Td.q;
import Tf.e;
import Uf.d;
import Vf.A;
import Vf.AbstractC2327f0;
import Vf.C2321c0;
import Vf.C2324e;
import Vf.C2337k0;
import Vf.t0;
import Vf.x0;
import Wf.E;
import Wf.F;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0005\"#!$%B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB5\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJB\u0010\u001a\u001a\u00020\u0017\"\u0004\b\u0001\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "T", "", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "conditions", DiagnosticsEntry.PROPERTIES_KEY, "<init>", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/PartialComponent;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/PartialComponent;LVf/t0;)V", "T0", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LRf/b;", "typeSerial0", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;LUf/d;LTf/e;LRf/b;)V", "write$Self", "Ljava/util/List;", "getConditions", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "getProperties", "()Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "Companion", "$serializer", "ArrayOperator", "Condition", "EqualityOperator", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComponentOverride<T extends PartialComponent> {
    private static final e $cachedDescriptor;
    private final List<Condition> conditions;
    private final T properties;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {new C2324e(ConditionSerializer.INSTANCE), null};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "", "(Ljava/lang/String;I)V", "IN", "NOT_IN", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ArrayOperator {
        IN,
        NOT_IN;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, Companion.AnonymousClass1.INSTANCE);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$ArrayOperator$Companion$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return A.a("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator", ArrayOperator.values(), new String[]{"in", "not in"}, new Annotation[][]{null, null}, null);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) ArrayOperator.$cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Companion;", "", "<init>", "()V", "T0", "LRf/b;", "typeSerial0", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "serializer", "(LRf/b;)LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T0> b serializer(b typeSerial0) {
            AbstractC5504s.h(typeSerial0, "typeSerial0");
            return new ComponentOverride$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "", "(Ljava/lang/String;I)V", "EQUALS", "NOT_EQUALS", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EqualityOperator {
        EQUALS,
        NOT_EQUALS;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, Companion.AnonymousClass1.INSTANCE);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$EqualityOperator$Companion$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return A.a("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator", EqualityOperator.values(), new String[]{f.f34695b, "!="}, new Annotation[][]{null, null}, null);
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) EqualityOperator.$cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    static {
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", null, 2);
        c2337k0.g("conditions", false);
        c2337k0.g(DiagnosticsEntry.PROPERTIES_KEY, false);
        $cachedDescriptor = c2337k0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC2154e
    public /* synthetic */ ComponentOverride(int i10, List list, PartialComponent partialComponent, t0 t0Var) {
        if (3 != (i10 & 3)) {
            AbstractC2327f0.a(i10, 3, $cachedDescriptor);
        }
        this.conditions = list;
        this.properties = partialComponent;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ComponentOverride self, d output, e serialDesc, b typeSerial0) {
        output.m(serialDesc, 0, $childSerializers[0], self.conditions);
        output.m(serialDesc, 1, typeSerial0, self.properties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentOverride)) {
            return false;
        }
        ComponentOverride componentOverride = (ComponentOverride) obj;
        return AbstractC5504s.c(this.conditions, componentOverride.conditions) && AbstractC5504s.c(this.properties, componentOverride.properties);
    }

    public final /* synthetic */ List getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ PartialComponent getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (this.conditions.hashCode() * 31) + this.properties.hashCode();
    }

    public String toString() {
        return "ComponentOverride(conditions=" + this.conditions + ", properties=" + this.properties + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentOverride(List<? extends Condition> conditions, T properties) {
        AbstractC5504s.h(conditions, "conditions");
        AbstractC5504s.h(properties, "properties");
        this.conditions = conditions;
        this.properties = properties;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \b2\u00020\u0001:\r\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "", "isRule", "", "isRule$annotations", "()V", "()Z", "Compact", "Companion", "Expanded", "IntroOffer", "IntroOfferRule", "Medium", "MultiplePhaseOffers", "PromoOffer", "PromoOfferRule", "Selected", "SelectedPackage", "Unsupported", "Variable", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Unsupported;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Condition {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Compact implements Condition {
            public static final Compact INSTANCE = new Compact();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Compact$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact", Compact.INSTANCE, new Annotation[0]);
                }
            }

            private Compact() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return ConditionSerializer.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Expanded implements Condition {
            public static final Expanded INSTANCE = new Expanded();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Expanded$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded", Expanded.INSTANCE, new Annotation[0]);
                }
            }

            private Expanded() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class IntroOffer implements Condition {
            public static final IntroOffer INSTANCE = new IntroOffer();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$IntroOffer$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer", IntroOffer.INSTANCE, new Annotation[0]);
                }
            }

            private IntroOffer() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;ZLVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Z", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Z", "getValue", "isRule", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class IntroOfferRule implements Condition {
            private final EqualityOperator operator;
            private final boolean value;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final b[] $childSerializers = {EqualityOperator.INSTANCE.serializer(), null};

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ IntroOfferRule(int i10, EqualityOperator equalityOperator, boolean z10, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    AbstractC2327f0.a(i10, 3, ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE.getDescriptor());
                }
                this.operator = equalityOperator;
                this.value = z10;
            }

            public static /* synthetic */ IntroOfferRule copy$default(IntroOfferRule introOfferRule, EqualityOperator equalityOperator, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    equalityOperator = introOfferRule.operator;
                }
                if ((i10 & 2) != 0) {
                    z10 = introOfferRule.value;
                }
                return introOfferRule.copy(equalityOperator, z10);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(IntroOfferRule self, d output, e serialDesc) {
                output.m(serialDesc, 0, $childSerializers[0], self.operator);
                output.B(serialDesc, 1, self.value);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final EqualityOperator getOperator() {
                return this.operator;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final IntroOfferRule copy(EqualityOperator operator, boolean value) {
                AbstractC5504s.h(operator, "operator");
                return new IntroOfferRule(operator, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IntroOfferRule)) {
                    return false;
                }
                IntroOfferRule introOfferRule = (IntroOfferRule) other;
                return this.operator == introOfferRule.operator && this.value == introOfferRule.value;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return (this.operator.hashCode() * 31) + Boolean.hashCode(this.value);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "IntroOfferRule(operator=" + this.operator + ", value=" + this.value + ')';
            }

            public IntroOfferRule(EqualityOperator operator, boolean z10) {
                AbstractC5504s.h(operator, "operator");
                this.operator = operator;
                this.value = z10;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Medium implements Condition {
            public static final Medium INSTANCE = new Medium();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Medium$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium", Medium.INSTANCE, new Annotation[0]);
                }
            }

            private Medium() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class MultiplePhaseOffers implements Condition {
            public static final MultiplePhaseOffers INSTANCE = new MultiplePhaseOffers();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$MultiplePhaseOffers$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers", MultiplePhaseOffers.INSTANCE, new Annotation[0]);
                }
            }

            private MultiplePhaseOffers() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PromoOffer implements Condition {
            public static final PromoOffer INSTANCE = new PromoOffer();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$PromoOffer$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer", PromoOffer.INSTANCE, new Annotation[0]);
                }
            }

            private PromoOffer() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;ZLVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Z", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Z)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Z", "getValue", "isRule", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class PromoOfferRule implements Condition {
            private final EqualityOperator operator;
            private final boolean value;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final b[] $childSerializers = {EqualityOperator.INSTANCE.serializer(), null};

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ PromoOfferRule(int i10, EqualityOperator equalityOperator, boolean z10, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    AbstractC2327f0.a(i10, 3, ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE.getDescriptor());
                }
                this.operator = equalityOperator;
                this.value = z10;
            }

            public static /* synthetic */ PromoOfferRule copy$default(PromoOfferRule promoOfferRule, EqualityOperator equalityOperator, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    equalityOperator = promoOfferRule.operator;
                }
                if ((i10 & 2) != 0) {
                    z10 = promoOfferRule.value;
                }
                return promoOfferRule.copy(equalityOperator, z10);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PromoOfferRule self, d output, e serialDesc) {
                output.m(serialDesc, 0, $childSerializers[0], self.operator);
                output.B(serialDesc, 1, self.value);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final EqualityOperator getOperator() {
                return this.operator;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getValue() {
                return this.value;
            }

            public final PromoOfferRule copy(EqualityOperator operator, boolean value) {
                AbstractC5504s.h(operator, "operator");
                return new PromoOfferRule(operator, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PromoOfferRule)) {
                    return false;
                }
                PromoOfferRule promoOfferRule = (PromoOfferRule) other;
                return this.operator == promoOfferRule.operator && this.value == promoOfferRule.value;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return (this.operator.hashCode() * 31) + Boolean.hashCode(this.value);
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "PromoOfferRule(operator=" + this.operator + ", value=" + this.value + ')';
            }

            public PromoOfferRule(EqualityOperator operator, boolean z10) {
                AbstractC5504s.h(operator, "operator");
                this.operator = operator;
                this.value = z10;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Selected implements Condition {
            public static final Selected INSTANCE = new Selected();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Selected$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected", Selected.INSTANCE, new Annotation[0]);
                }
            }

            private Selected() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001aR\u0014\u0010*\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "operator", "", "", "packages", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "component2", "()Ljava/util/List;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;Ljava/util/List;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ArrayOperator;", "getOperator", "Ljava/util/List;", "getPackages", "isRule", "()Z", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class SelectedPackage implements Condition {
            private final ArrayOperator operator;
            private final List<String> packages;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final b[] $childSerializers = {ArrayOperator.INSTANCE.serializer(), new C2324e(x0.f20253a)};

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ SelectedPackage(int i10, ArrayOperator arrayOperator, List list, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    AbstractC2327f0.a(i10, 3, ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE.getDescriptor());
                }
                this.operator = arrayOperator;
                this.packages = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SelectedPackage copy$default(SelectedPackage selectedPackage, ArrayOperator arrayOperator, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    arrayOperator = selectedPackage.operator;
                }
                if ((i10 & 2) != 0) {
                    list = selectedPackage.packages;
                }
                return selectedPackage.copy(arrayOperator, list);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(SelectedPackage self, d output, e serialDesc) {
                b[] bVarArr = $childSerializers;
                output.m(serialDesc, 0, bVarArr[0], self.operator);
                output.m(serialDesc, 1, bVarArr[1], self.packages);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ArrayOperator getOperator() {
                return this.operator;
            }

            public final List<String> component2() {
                return this.packages;
            }

            public final SelectedPackage copy(ArrayOperator operator, List<String> packages) {
                AbstractC5504s.h(operator, "operator");
                AbstractC5504s.h(packages, "packages");
                return new SelectedPackage(operator, packages);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectedPackage)) {
                    return false;
                }
                SelectedPackage selectedPackage = (SelectedPackage) other;
                return this.operator == selectedPackage.operator && AbstractC5504s.c(this.packages, selectedPackage.packages);
            }

            public final ArrayOperator getOperator() {
                return this.operator;
            }

            public final List<String> getPackages() {
                return this.packages;
            }

            public int hashCode() {
                return (this.operator.hashCode() * 31) + this.packages.hashCode();
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "SelectedPackage(operator=" + this.operator + ", packages=" + this.packages + ')';
            }

            public SelectedPackage(ArrayOperator operator, List<String> packages) {
                AbstractC5504s.h(operator, "operator");
                AbstractC5504s.h(packages, "packages");
                this.operator = operator;
                this.packages = packages;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Unsupported;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unsupported implements Condition {
            public static final Unsupported INSTANCE = new Unsupported();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ComponentOverride$Condition$Unsupported$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported", Unsupported.INSTANCE, new Annotation[0]);
                }
            }

            private Unsupported() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u0010.\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "operator", "", "variable", "LWf/E;", "value", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;LWf/E;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;LWf/E;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "component2", "()Ljava/lang/String;", "component3", "()LWf/E;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;Ljava/lang/String;LWf/E;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$EqualityOperator;", "getOperator", "Ljava/lang/String;", "getVariable", "LWf/E;", "getValue", "isRule", "()Z", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Variable implements Condition {
            private final EqualityOperator operator;
            private final E value;
            private final String variable;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final b[] $childSerializers = {EqualityOperator.INSTANCE.serializer(), null, null};

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ComponentOverride$Condition$Variable$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Variable(int i10, EqualityOperator equalityOperator, String str, E e10, t0 t0Var) {
                if (7 != (i10 & 7)) {
                    AbstractC2327f0.a(i10, 7, ComponentOverride$Condition$Variable$$serializer.INSTANCE.getDescriptor());
                }
                this.operator = equalityOperator;
                this.variable = str;
                this.value = e10;
            }

            public static /* synthetic */ Variable copy$default(Variable variable, EqualityOperator equalityOperator, String str, E e10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    equalityOperator = variable.operator;
                }
                if ((i10 & 2) != 0) {
                    str = variable.variable;
                }
                if ((i10 & 4) != 0) {
                    e10 = variable.value;
                }
                return variable.copy(equalityOperator, str, e10);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Variable self, d output, e serialDesc) {
                output.m(serialDesc, 0, $childSerializers[0], self.operator);
                output.k(serialDesc, 1, self.variable);
                output.m(serialDesc, 2, F.f20888a, self.value);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final EqualityOperator getOperator() {
                return this.operator;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getVariable() {
                return this.variable;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final E getValue() {
                return this.value;
            }

            public final Variable copy(EqualityOperator operator, String variable, E value) {
                AbstractC5504s.h(operator, "operator");
                AbstractC5504s.h(variable, "variable");
                AbstractC5504s.h(value, "value");
                return new Variable(operator, variable, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Variable)) {
                    return false;
                }
                Variable variable = (Variable) other;
                return this.operator == variable.operator && AbstractC5504s.c(this.variable, variable.variable) && AbstractC5504s.c(this.value, variable.value);
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final E getValue() {
                return this.value;
            }

            public final String getVariable() {
                return this.variable;
            }

            public int hashCode() {
                return (((this.operator.hashCode() * 31) + this.variable.hashCode()) * 31) + this.value.hashCode();
            }

            @Override // com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition
            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "Variable(operator=" + this.operator + ", variable=" + this.variable + ", value=" + this.value + ')';
            }

            public Variable(EqualityOperator operator, String variable, E value) {
                AbstractC5504s.h(operator, "operator");
                AbstractC5504s.h(variable, "variable");
                AbstractC5504s.h(value, "value");
                this.operator = operator;
                this.variable = variable;
                this.value = value;
            }
        }

        default boolean isRule() {
            return false;
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static boolean isRule(Condition condition) {
                return Condition.super.isRule();
            }

            public static /* synthetic */ void isRule$annotations() {
            }
        }
    }
}
