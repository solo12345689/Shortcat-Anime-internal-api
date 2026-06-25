package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.C3166k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/android/billingclient/api/k;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lcom/android/billingclient/api/k;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class QueryProductDetailsUseCase$onOk$4$1$1 extends AbstractC5506u implements Function1 {
    public static final QueryProductDetailsUseCase$onOk$4$1$1 INSTANCE = new QueryProductDetailsUseCase$onOk$4$1$1();

    QueryProductDetailsUseCase$onOk$4$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(C3166k c3166k) {
        String string = c3166k.toString();
        AbstractC5504s.g(string, "it.toString()");
        return string;
    }
}
