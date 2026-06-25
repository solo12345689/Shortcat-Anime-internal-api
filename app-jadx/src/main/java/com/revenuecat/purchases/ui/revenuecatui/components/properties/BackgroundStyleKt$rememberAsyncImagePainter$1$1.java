package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import G4.b;
import Td.L;
import Y.C0;
import coil.compose.AsyncImagePainter;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Error;", "it", "LTd/L;", "invoke", "(Lcoil/compose/AsyncImagePainter$State$Error;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BackgroundStyleKt$rememberAsyncImagePainter$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ C0 $cachePolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackgroundStyleKt$rememberAsyncImagePainter$1$1(C0 c02) {
        super(1);
        this.$cachePolicy$delegate = c02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AsyncImagePainter.State.Error) obj);
        return L.f17438a;
    }

    public final void invoke(AsyncImagePainter.State.Error it) {
        AbstractC5504s.h(it, "it");
        Logger.INSTANCE.w("AsyncImagePainter failed to load. Will try again disabling cache");
        this.$cachePolicy$delegate.setValue(b.WRITE_ONLY);
    }
}
