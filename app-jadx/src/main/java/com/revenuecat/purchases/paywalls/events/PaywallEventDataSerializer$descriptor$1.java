package com.revenuecat.purchases.paywalls.events;

import Td.L;
import Tf.a;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5490d;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LTf/a;", "LTd/L;", "invoke", "(LTf/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PaywallEventDataSerializer$descriptor$1 extends AbstractC5506u implements Function1 {
    public static final PaywallEventDataSerializer$descriptor$1 INSTANCE = new PaywallEventDataSerializer$descriptor$1();

    PaywallEventDataSerializer$descriptor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return L.f17438a;
    }

    public final void invoke(a buildClassSerialDescriptor) {
        AbstractC5504s.h(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        a.b(buildClassSerialDescriptor, "paywallIdentifier", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "presentedOfferingContext", PresentedOfferingContextSerializer.INSTANCE.getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "paywallRevision", Sf.a.C(r.f52290a).getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "sessionIdentifier", UUIDSerializer.INSTANCE.getDescriptor(), null, false, 12, null);
        U u10 = U.f52264a;
        a.b(buildClassSerialDescriptor, "displayMode", Sf.a.F(u10).getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "localeIdentifier", Sf.a.F(u10).getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "darkMode", Sf.a.x(C5490d.f52276a).getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "exitOfferType", PaywallEventDataSerializer.nullableExitOfferTypeSerializer.getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "exitOfferingIdentifier", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "packageIdentifier", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "productIdentifier", PaywallEventDataSerializer.nullableStringSerializer.getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "errorCode", PaywallEventDataSerializer.nullableIntSerializer.getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, b.f34648f, PaywallEventDataSerializer.nullableStringSerializer.getDescriptor(), null, false, 12, null);
        a.b(buildClassSerialDescriptor, "offeringIdentifier", Sf.a.F(u10).getDescriptor(), null, false, 12, null);
    }
}
