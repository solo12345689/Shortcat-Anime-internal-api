package com.revenuecat.purchases.utils.serializers;

import Td.L;
import Tf.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "LTf/a;", "LTd/L;", "invoke", "(LTf/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SealedDeserializerWithDefault$descriptor$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ SealedDeserializerWithDefault<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SealedDeserializerWithDefault$descriptor$1(SealedDeserializerWithDefault<T> sealedDeserializerWithDefault) {
        super(1);
        this.this$0 = sealedDeserializerWithDefault;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return L.f17438a;
    }

    public final void invoke(a buildClassSerialDescriptor) {
        AbstractC5504s.h(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        a.b(buildClassSerialDescriptor, ((SealedDeserializerWithDefault) this.this$0).typeDiscriminator, Sf.a.F(U.f52264a).getDescriptor(), null, false, 12, null);
    }
}
