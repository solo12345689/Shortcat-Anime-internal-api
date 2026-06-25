package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Td.z;
import Ud.S;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraintDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SizeConstraintDeserializer extends SealedDeserializerWithDefault<SizeConstraint> {
    public static final SizeConstraintDeserializer INSTANCE = new SizeConstraintDeserializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return SizeConstraint.Fit.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return SizeConstraint.Fill.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "invoke", "()LRf/b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final b invoke() {
            return SizeConstraint.Fixed.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SizeConstraint invoke(String it) {
            AbstractC5504s.h(it, "it");
            return SizeConstraint.Fit.INSTANCE;
        }
    }

    private SizeConstraintDeserializer() {
        super("SizeConstraint", S.l(z.a("fit", AnonymousClass1.INSTANCE), z.a("fill", AnonymousClass2.INSTANCE), z.a("fixed", AnonymousClass3.INSTANCE)), AnonymousClass4.INSTANCE, null, 8, null);
    }
}
