package com.revenuecat.purchases.common.verification;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1 extends AbstractC5506u implements Function1 {
    public static final SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1 INSTANCE = new SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1();

    SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Pair<String, String> it) {
        AbstractC5504s.h(it, "it");
        return (CharSequence) it.c();
    }
}
