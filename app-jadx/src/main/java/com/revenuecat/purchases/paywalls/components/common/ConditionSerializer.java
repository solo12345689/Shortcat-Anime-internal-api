package com.revenuecat.purchases.paywalls.components.common;

import Rf.b;
import Td.z;
import Ud.S;
import com.adjust.sdk.Constants;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ConditionSerializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConditionSerializer extends SealedDeserializerWithDefault<ComponentOverride.Condition> {
    public static final ConditionSerializer INSTANCE = new ConditionSerializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.Compact.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$10 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass10 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        AnonymousClass10() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.SelectedPackage.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$11 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass11 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        AnonymousClass11() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.Variable.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$12 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass12 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        AnonymousClass12() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ComponentOverride.Condition invoke(String it) {
            AbstractC5504s.h(it, "it");
            return ComponentOverride.Condition.Unsupported.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.Medium.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.Expanded.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.IntroOffer.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$5 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass5 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.IntroOfferRule.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$6 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultiplePhaseOffers;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass6 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.MultiplePhaseOffers.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$7 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass7 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.Selected.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$8 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOffer;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass8 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        AnonymousClass8() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.PromoOffer.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.ConditionSerializer$9 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass9 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        AnonymousClass9() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return ComponentOverride.Condition.PromoOfferRule.INSTANCE.serializer();
        }
    }

    private ConditionSerializer() {
        super("Condition", S.l(z.a("compact", AnonymousClass1.INSTANCE), z.a(Constants.MEDIUM, AnonymousClass2.INSTANCE), z.a("expanded", AnonymousClass3.INSTANCE), z.a("intro_offer", AnonymousClass4.INSTANCE), z.a("intro_offer_condition", AnonymousClass5.INSTANCE), z.a("multiple_intro_offers", AnonymousClass6.INSTANCE), z.a("selected", AnonymousClass7.INSTANCE), z.a("promo_offer", AnonymousClass8.INSTANCE), z.a("promo_offer_condition", AnonymousClass9.INSTANCE), z.a("selected_package_condition", AnonymousClass10.INSTANCE), z.a("variable_condition", AnonymousClass11.INSTANCE)), AnonymousClass12.INSTANCE, null, 8, null);
    }
}
