package com.revenuecat.purchases.ui.revenuecatui.data;

import U.C2175l;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelFactory;", "Landroidx/lifecycle/W$d;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "resourceProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "options", "LU/l;", "colorScheme", "", "isDarkMode", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "shouldDisplayBlock", "preview", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;LU/l;ZLkotlin/jvm/functions/Function1;Z)V", "Landroidx/lifecycle/U;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/U;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "LU/l;", "Z", "Lkotlin/jvm/functions/Function1;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallViewModelFactory extends W.d {
    public static final int $stable = 8;
    private final C2175l colorScheme;
    private final boolean isDarkMode;
    private final PaywallOptions options;
    private final boolean preview;
    private final ResourceProvider resourceProvider;
    private final Function1 shouldDisplayBlock;

    public /* synthetic */ PaywallViewModelFactory(ResourceProvider resourceProvider, PaywallOptions paywallOptions, C2175l c2175l, boolean z10, Function1 function1, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(resourceProvider, paywallOptions, c2175l, z10, function1, (i10 & 32) != 0 ? false : z11);
    }

    @Override // androidx.lifecycle.W.d, androidx.lifecycle.W.c
    public <T extends U> T create(Class<T> modelClass) {
        AbstractC5504s.h(modelClass, "modelClass");
        return new PaywallViewModelImpl(this.resourceProvider, null, this.options, this.colorScheme, this.isDarkMode, this.shouldDisplayBlock, this.preview, null, 130, null);
    }

    public PaywallViewModelFactory(ResourceProvider resourceProvider, PaywallOptions options, C2175l colorScheme, boolean z10, Function1 function1, boolean z11) {
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(colorScheme, "colorScheme");
        this.resourceProvider = resourceProvider;
        this.options = options;
        this.colorScheme = colorScheme;
        this.isDarkMode = z10;
        this.shouldDisplayBlock = function1;
        this.preview = z11;
    }
}
