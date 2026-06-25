package com.revenuecat.purchases.ui.revenuecatui.composables;

import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;
import w.AbstractC6906j;
import w.C6884M;
import w.EnumC6891b0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw/M;", "", "invoke", "()Lw/M;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PlaceholderDefaults$fadeAnimationSpec$2 extends AbstractC5506u implements InterfaceC5082a {
    public static final PlaceholderDefaults$fadeAnimationSpec$2 INSTANCE = new PlaceholderDefaults$fadeAnimationSpec$2();

    PlaceholderDefaults$fadeAnimationSpec$2() {
        super(0);
    }

    @Override // ie.InterfaceC5082a
    public final C6884M invoke() {
        return AbstractC6906j.e(AbstractC6906j.j(600, 200, null, 4, null), EnumC6891b0.Reverse, 0L, 4, null);
    }
}
