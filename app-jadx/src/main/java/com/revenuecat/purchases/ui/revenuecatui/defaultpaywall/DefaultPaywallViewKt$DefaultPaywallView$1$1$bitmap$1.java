package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Gf.O;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import android.content.Context;
import com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1", f = "DefaultPaywallView.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "Landroid/graphics/Bitmap;", "<anonymous>", "(LGf/O;)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 8, 0})
final class DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1 extends l implements Function2 {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1(Context context, e eVar) {
        super(2, eVar);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        return new DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1(this.$context, eVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((DefaultPaywallViewKt$DefaultPaywallView$1$1$bitmap$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2605b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        return AppStyleExtractor.INSTANCE.getAppIconBitmap(this.$context);
    }
}
