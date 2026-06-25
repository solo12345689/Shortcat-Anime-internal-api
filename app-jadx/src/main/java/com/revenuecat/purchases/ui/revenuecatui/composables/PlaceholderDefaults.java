package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.AbstractC2163n;
import kotlin.Lazy;
import kotlin.Metadata;
import w.C6884M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderDefaults;", "", "<init>", "()V", "Lw/M;", "", "fadeAnimationSpec$delegate", "Lkotlin/Lazy;", "getFadeAnimationSpec", "()Lw/M;", "fadeAnimationSpec", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlaceholderDefaults {
    public static final PlaceholderDefaults INSTANCE = new PlaceholderDefaults();

    /* JADX INFO: renamed from: fadeAnimationSpec$delegate, reason: from kotlin metadata */
    private static final Lazy fadeAnimationSpec = AbstractC2163n.b(PlaceholderDefaults$fadeAnimationSpec$2.INSTANCE);
    public static final int $stable = 8;

    private PlaceholderDefaults() {
    }

    public final C6884M getFadeAnimationSpec() {
        return (C6884M) fadeAnimationSpec.getValue();
    }
}
