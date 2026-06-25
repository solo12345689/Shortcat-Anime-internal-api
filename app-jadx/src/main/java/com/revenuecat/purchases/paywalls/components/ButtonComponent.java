package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.h;
import Td.AbstractC2163n;
import Td.InterfaceC2154e;
import Td.q;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.C2321c0;
import Vf.t0;
import Vf.x0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0005\"#!$%B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "action", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "transition", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "getAction", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "getTransition", "()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "Companion", "$serializer", "Action", "Destination", "UrlMethod", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonComponent implements PaywallComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Action action;
    private final StackComponent stack;
    private final PaywallTransition transition;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "", "Companion", "NavigateBack", "NavigateTo", "RestorePurchases", "Unknown", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateBack;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$RestorePurchases;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$Unknown;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Action {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return ActionSerializer.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateBack;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateBack implements Action {
            public static final NavigateBack INSTANCE = new NavigateBack();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$Action$NavigateBack$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateBack", NavigateBack.INSTANCE, new Annotation[0]);
                }
            }

            private NavigateBack() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "destination", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;LUf/d;LTf/e;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "getDestination", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class NavigateTo implements Action {
            private final Destination destination;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final b[] $childSerializers = {new h("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", O.b(Destination.class), new InterfaceC6014d[]{O.b(Destination.CustomerCenter.class), O.b(Destination.PrivacyPolicy.class), O.b(Destination.Sheet.class), O.b(Destination.Terms.class), O.b(Destination.Unknown.class), O.b(Destination.Url.class)}, new b[]{new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", Destination.CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Destination.Unknown.INSTANCE, new Annotation[0]), ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0])};

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Action$NavigateTo$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ NavigateTo(int i10, Destination destination, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    AbstractC2327f0.a(i10, 1, ButtonComponent$Action$NavigateTo$$serializer.INSTANCE.getDescriptor());
                }
                this.destination = destination;
            }

            public static /* synthetic */ NavigateTo copy$default(NavigateTo navigateTo, Destination destination, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    destination = navigateTo.destination;
                }
                return navigateTo.copy(destination);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Destination getDestination() {
                return this.destination;
            }

            public final NavigateTo copy(Destination destination) {
                AbstractC5504s.h(destination, "destination");
                return new NavigateTo(destination);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateTo) && AbstractC5504s.c(this.destination, ((NavigateTo) other).destination);
            }

            public final /* synthetic */ Destination getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return "NavigateTo(destination=" + this.destination + ')';
            }

            public NavigateTo(Destination destination) {
                AbstractC5504s.h(destination, "destination");
                this.destination = destination;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$RestorePurchases;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RestorePurchases implements Action {
            public static final RestorePurchases INSTANCE = new RestorePurchases();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$Action$RestorePurchases$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.RestorePurchases", RestorePurchases.INSTANCE, new Annotation[0]);
                }
            }

            private RestorePurchases() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unknown implements Action {
            public static final Unknown INSTANCE = new Unknown();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$Action$Unknown$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return ButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "", "Companion", "CustomerCenter", "PrivacyPolicy", "Sheet", "Terms", "Unknown", "Url", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$CustomerCenter;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Destination {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return new h("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", O.b(Destination.class), new InterfaceC6014d[]{O.b(CustomerCenter.class), O.b(PrivacyPolicy.class), O.b(Sheet.class), O.b(Terms.class), O.b(Unknown.class), O.b(Url.class)}, new b[]{new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Unknown.INSTANCE, new Annotation[0]), ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$CustomerCenter;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CustomerCenter implements Destination {
            public static final CustomerCenter INSTANCE = new CustomerCenter();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$CustomerCenter$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]);
                }
            }

            private CustomerCenter() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;LUf/d;LTf/e;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class PrivacyPolicy implements Destination {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ PrivacyPolicy(int i10, String str, UrlMethod urlMethod, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, str, urlMethod, t0Var);
            }

            /* JADX INFO: renamed from: copy-26kQY28$default */
            public static /* synthetic */ PrivacyPolicy m269copy26kQY28$default(PrivacyPolicy privacyPolicy, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = privacyPolicy.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = privacyPolicy.method;
                }
                return privacyPolicy.m271copy26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PrivacyPolicy self, d output, e serialDesc) {
                output.m(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m343boximpl(self.urlLid));
                output.m(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.method);
            }

            /* JADX INFO: renamed from: component1-z7Tp-4o, reason: from getter */
            public final String getUrlLid() {
                return this.urlLid;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final UrlMethod getMethod() {
                return this.method;
            }

            /* JADX INFO: renamed from: copy-26kQY28 */
            public final PrivacyPolicy m271copy26kQY28(String urlLid, UrlMethod method) {
                AbstractC5504s.h(urlLid, "urlLid");
                AbstractC5504s.h(method, "method");
                return new PrivacyPolicy(urlLid, method, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PrivacyPolicy)) {
                    return false;
                }
                PrivacyPolicy privacyPolicy = (PrivacyPolicy) other;
                return LocalizationKey.m346equalsimpl0(this.urlLid, privacyPolicy.urlLid) && this.method == privacyPolicy.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            /* JADX INFO: renamed from: getUrlLid-z7Tp-4o */
            public final /* synthetic */ String m272getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.m347hashCodeimpl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "PrivacyPolicy(urlLid=" + ((Object) LocalizationKey.m348toStringimpl(this.urlLid)) + ", method=" + this.method + ')';
            }

            public /* synthetic */ PrivacyPolicy(String str, UrlMethod urlMethod, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, urlMethod);
            }

            private PrivacyPolicy(int i10, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    AbstractC2327f0.a(i10, 3, ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private PrivacyPolicy(String urlLid, UrlMethod method) {
                AbstractC5504s.h(urlLid, "urlLid");
                AbstractC5504s.h(method, "method");
                this.urlLid = urlLid;
                this.method = method;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010#¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "", DiagnosticsEntry.ID_KEY, "name", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "", "backgroundBlur", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "component4", "()Z", "component5", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;ZLcom/revenuecat/purchases/paywalls/components/properties/Size;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "Z", "getBackgroundBlur", "getBackgroundBlur$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Sheet implements Destination {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean backgroundBlur;
            private final String id;
            private final String name;
            private final Size size;
            private final StackComponent stack;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Sheet;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Destination$Sheet$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Sheet(int i10, String str, String str2, StackComponent stackComponent, boolean z10, Size size, t0 t0Var) {
                if (31 != (i10 & 31)) {
                    AbstractC2327f0.a(i10, 31, ButtonComponent$Destination$Sheet$$serializer.INSTANCE.getDescriptor());
                }
                this.id = str;
                this.name = str2;
                this.stack = stackComponent;
                this.backgroundBlur = z10;
                this.size = size;
            }

            public static /* synthetic */ Sheet copy$default(Sheet sheet, String str, String str2, StackComponent stackComponent, boolean z10, Size size, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = sheet.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = sheet.name;
                }
                if ((i10 & 4) != 0) {
                    stackComponent = sheet.stack;
                }
                if ((i10 & 8) != 0) {
                    z10 = sheet.backgroundBlur;
                }
                if ((i10 & 16) != 0) {
                    size = sheet.size;
                }
                Size size2 = size;
                StackComponent stackComponent2 = stackComponent;
                return sheet.copy(str, str2, stackComponent2, z10, size2);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Sheet self, d output, e serialDesc) {
                output.k(serialDesc, 0, self.id);
                output.f(serialDesc, 1, x0.f20253a, self.name);
                output.m(serialDesc, 2, StackComponent$$serializer.INSTANCE, self.stack);
                output.B(serialDesc, 3, self.backgroundBlur);
                output.f(serialDesc, 4, Size$$serializer.INSTANCE, self.size);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final StackComponent getStack() {
                return this.stack;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final boolean getBackgroundBlur() {
                return this.backgroundBlur;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Size getSize() {
                return this.size;
            }

            public final Sheet copy(String str, String name, StackComponent stack, boolean backgroundBlur, Size size) {
                AbstractC5504s.h(str, "id");
                AbstractC5504s.h(stack, "stack");
                return new Sheet(str, name, stack, backgroundBlur, size);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Sheet)) {
                    return false;
                }
                Sheet sheet = (Sheet) other;
                return AbstractC5504s.c(this.id, sheet.id) && AbstractC5504s.c(this.name, sheet.name) && AbstractC5504s.c(this.stack, sheet.stack) && this.backgroundBlur == sheet.backgroundBlur && AbstractC5504s.c(this.size, sheet.size);
            }

            public final /* synthetic */ boolean getBackgroundBlur() {
                return this.backgroundBlur;
            }

            public final /* synthetic */ String getId() {
                return this.id;
            }

            public final /* synthetic */ String getName() {
                return this.name;
            }

            public final /* synthetic */ Size getSize() {
                return this.size;
            }

            public final /* synthetic */ StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                String str = this.name;
                int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.stack.hashCode()) * 31) + Boolean.hashCode(this.backgroundBlur)) * 31;
                Size size = this.size;
                return iHashCode2 + (size != null ? size.hashCode() : 0);
            }

            public String toString() {
                return "Sheet(id=" + this.id + ", name=" + this.name + ", stack=" + this.stack + ", backgroundBlur=" + this.backgroundBlur + ", size=" + this.size + ')';
            }

            public Sheet(String id2, String str, StackComponent stack, boolean z10, Size size) {
                AbstractC5504s.h(id2, "id");
                AbstractC5504s.h(stack, "stack");
                this.id = id2;
                this.name = str;
                this.stack = stack;
                this.backgroundBlur = z10;
                this.size = size;
            }

            public static /* synthetic */ void getBackgroundBlur$annotations() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;LUf/d;LTf/e;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Terms implements Destination {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Destination$Terms$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Terms(int i10, String str, UrlMethod urlMethod, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, str, urlMethod, t0Var);
            }

            /* JADX INFO: renamed from: copy-26kQY28$default */
            public static /* synthetic */ Terms m273copy26kQY28$default(Terms terms, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = terms.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = terms.method;
                }
                return terms.m275copy26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Terms self, d output, e serialDesc) {
                output.m(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m343boximpl(self.urlLid));
                output.m(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.method);
            }

            /* JADX INFO: renamed from: component1-z7Tp-4o, reason: from getter */
            public final String getUrlLid() {
                return this.urlLid;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final UrlMethod getMethod() {
                return this.method;
            }

            /* JADX INFO: renamed from: copy-26kQY28 */
            public final Terms m275copy26kQY28(String urlLid, UrlMethod method) {
                AbstractC5504s.h(urlLid, "urlLid");
                AbstractC5504s.h(method, "method");
                return new Terms(urlLid, method, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Terms)) {
                    return false;
                }
                Terms terms = (Terms) other;
                return LocalizationKey.m346equalsimpl0(this.urlLid, terms.urlLid) && this.method == terms.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            /* JADX INFO: renamed from: getUrlLid-z7Tp-4o */
            public final /* synthetic */ String m276getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.m347hashCodeimpl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "Terms(urlLid=" + ((Object) LocalizationKey.m348toStringimpl(this.urlLid)) + ", method=" + this.method + ')';
            }

            public /* synthetic */ Terms(String str, UrlMethod urlMethod, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, urlMethod);
            }

            private Terms(int i10, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    AbstractC2327f0.a(i10, 3, ButtonComponent$Destination$Terms$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private Terms(String urlLid, UrlMethod method) {
                AbstractC5504s.h(urlLid, "urlLid");
                AbstractC5504s.h(method, "method");
                this.urlLid = urlLid;
                this.method = method;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "<init>", "()V", "LRf/b;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unknown implements Destination {
            public static final Unknown INSTANCE = new Unknown();
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = AbstractC2163n.a(q.f17462b, AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Unknown$1 */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // ie.InterfaceC5082a
                public final b invoke() {
                    return new C2321c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;LUf/d;LTf/e;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Url implements Destination {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Destination$Url$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Url(int i10, String str, UrlMethod urlMethod, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, str, urlMethod, t0Var);
            }

            /* JADX INFO: renamed from: copy-26kQY28$default */
            public static /* synthetic */ Url m277copy26kQY28$default(Url url, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = url.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = url.method;
                }
                return url.m279copy26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Url self, d output, e serialDesc) {
                output.m(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m343boximpl(self.urlLid));
                output.m(serialDesc, 1, UrlMethodDeserializer.INSTANCE, self.method);
            }

            /* JADX INFO: renamed from: component1-z7Tp-4o, reason: from getter */
            public final String getUrlLid() {
                return this.urlLid;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final UrlMethod getMethod() {
                return this.method;
            }

            /* JADX INFO: renamed from: copy-26kQY28 */
            public final Url m279copy26kQY28(String urlLid, UrlMethod method) {
                AbstractC5504s.h(urlLid, "urlLid");
                AbstractC5504s.h(method, "method");
                return new Url(urlLid, method, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Url)) {
                    return false;
                }
                Url url = (Url) other;
                return LocalizationKey.m346equalsimpl0(this.urlLid, url.urlLid) && this.method == url.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            /* JADX INFO: renamed from: getUrlLid-z7Tp-4o */
            public final /* synthetic */ String m280getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.m347hashCodeimpl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "Url(urlLid=" + ((Object) LocalizationKey.m348toStringimpl(this.urlLid)) + ", method=" + this.method + ')';
            }

            public /* synthetic */ Url(String str, UrlMethod urlMethod, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, urlMethod);
            }

            private Url(int i10, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    AbstractC2327f0.a(i10, 3, ButtonComponent$Destination$Url$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private Url(String urlLid, UrlMethod method) {
                AbstractC5504s.h(urlLid, "urlLid");
                AbstractC5504s.h(method, "method");
                this.urlLid = urlLid;
                this.method = method;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "", "(Ljava/lang/String;I)V", "IN_APP_BROWSER", "EXTERNAL_BROWSER", "DEEP_LINK", "UNKNOWN", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UrlMethod {
        IN_APP_BROWSER,
        EXTERNAL_BROWSER,
        DEEP_LINK,
        UNKNOWN;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return UrlMethodDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @InterfaceC2154e
    public /* synthetic */ ButtonComponent(int i10, Action action, StackComponent stackComponent, PaywallTransition paywallTransition, t0 t0Var) {
        if (3 != (i10 & 3)) {
            AbstractC2327f0.a(i10, 3, ButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.action = action;
        this.stack = stackComponent;
        if ((i10 & 4) == 0) {
            this.transition = null;
        } else {
            this.transition = paywallTransition;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ButtonComponent self, d output, e serialDesc) {
        output.m(serialDesc, 0, ActionSerializer.INSTANCE, self.action);
        output.m(serialDesc, 1, StackComponent$$serializer.INSTANCE, self.stack);
        if (!output.g(serialDesc, 2) && self.transition == null) {
            return;
        }
        output.f(serialDesc, 2, PaywallTransition$$serializer.INSTANCE, self.transition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponent)) {
            return false;
        }
        ButtonComponent buttonComponent = (ButtonComponent) obj;
        return AbstractC5504s.c(this.action, buttonComponent.action) && AbstractC5504s.c(this.stack, buttonComponent.stack) && AbstractC5504s.c(this.transition, buttonComponent.transition);
    }

    public final /* synthetic */ Action getAction() {
        return this.action;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public final /* synthetic */ PaywallTransition getTransition() {
        return this.transition;
    }

    public int hashCode() {
        int iHashCode = ((this.action.hashCode() * 31) + this.stack.hashCode()) * 31;
        PaywallTransition paywallTransition = this.transition;
        return iHashCode + (paywallTransition == null ? 0 : paywallTransition.hashCode());
    }

    public String toString() {
        return "ButtonComponent(action=" + this.action + ", stack=" + this.stack + ", transition=" + this.transition + ')';
    }

    public ButtonComponent(Action action, StackComponent stack, PaywallTransition paywallTransition) {
        AbstractC5504s.h(action, "action");
        AbstractC5504s.h(stack, "stack");
        this.action = action;
        this.stack = stack;
        this.transition = paywallTransition;
    }

    public /* synthetic */ ButtonComponent(Action action, StackComponent stackComponent, PaywallTransition paywallTransition, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(action, stackComponent, (i10 & 4) != 0 ? null : paywallTransition);
    }
}
