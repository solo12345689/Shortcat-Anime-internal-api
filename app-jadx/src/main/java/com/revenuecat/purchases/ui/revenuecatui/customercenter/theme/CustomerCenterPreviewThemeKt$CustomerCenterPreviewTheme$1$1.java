package com.revenuecat.purchases.ui.revenuecatui.customercenter.theme;

import Td.L;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.AbstractC2775o0;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerCenterPreviewThemeKt$CustomerCenterPreviewTheme$1$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ boolean $isDarkTheme;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerCenterPreviewThemeKt$CustomerCenterPreviewTheme$1$1(View view, boolean z10) {
        super(0);
        this.$view = view;
        this.$isDarkTheme = z10;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m699invoke();
        return L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m699invoke() {
        Context context = this.$view.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type android.app.Activity");
        AbstractC2775o0.a(((Activity) context).getWindow(), this.$view).e(!this.$isDarkTheme);
    }
}
