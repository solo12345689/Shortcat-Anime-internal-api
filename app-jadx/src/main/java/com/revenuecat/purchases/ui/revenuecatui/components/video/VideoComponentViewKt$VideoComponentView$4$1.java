package com.revenuecat.purchases.ui.revenuecatui.components.video;

import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import Td.L;
import Y.C0;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI0/p;", "coordinates", "LTd/L;", "invoke", "(LI0/p;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class VideoComponentViewKt$VideoComponentView$4$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ C0 $isVisible$delegate;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoComponentViewKt$VideoComponentView$4$1(View view, C0 c02) {
        super(1);
        this.$view = view;
        this.$isVisible$delegate = c02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1690p) obj);
        return L.f17438a;
    }

    public final void invoke(InterfaceC1690p coordinates) {
        AbstractC5504s.h(coordinates, "coordinates");
        VideoComponentViewKt.VideoComponentView$lambda$6(this.$isVisible$delegate, VideoComponentViewKt.isVisibleInViewport(AbstractC1691q.c(coordinates), this.$view.getWidth(), this.$view.getHeight()));
    }
}
