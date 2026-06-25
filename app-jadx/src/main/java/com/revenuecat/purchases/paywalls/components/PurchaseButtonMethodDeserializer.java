package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.z;
import Ud.S;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonMethodDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseButtonMethodDeserializer extends SealedDeserializerWithDefault<PurchaseButtonComponent.Method> {
    public static final PurchaseButtonMethodDeserializer INSTANCE = new PurchaseButtonMethodDeserializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonMethodDeserializer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$InAppCheckout;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return PurchaseButtonComponent.Method.InAppCheckout.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonMethodDeserializer$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return PurchaseButtonComponent.Method.WebCheckout.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonMethodDeserializer$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return PurchaseButtonComponent.Method.WebProductSelection.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonMethodDeserializer$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return PurchaseButtonComponent.Method.CustomWebCheckout.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonMethodDeserializer$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PurchaseButtonComponent.Method invoke(String it) {
            AbstractC5504s.h(it, "it");
            return PurchaseButtonComponent.Method.Unknown.INSTANCE;
        }
    }

    private PurchaseButtonMethodDeserializer() {
        super("Method", S.l(z.a("in_app_checkout", AnonymousClass1.INSTANCE), z.a("web_checkout", AnonymousClass2.INSTANCE), z.a("web_product_selection", AnonymousClass3.INSTANCE), z.a("custom_web_checkout", AnonymousClass4.INSTANCE)), AnonymousClass5.INSTANCE, null, 8, null);
    }
}
