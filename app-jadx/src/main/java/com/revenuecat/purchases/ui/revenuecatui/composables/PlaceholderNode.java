package com.revenuecat.purchases.ui.revenuecatui.composables;

import K0.InterfaceC1806t;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import u0.InterfaceC6708c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;", "Landroidx/compose/ui/e$c;", "LK0/t;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "placeholder", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;)V", "Lu0/c;", "LTd/L;", "draw", "(Lu0/c;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "getPlaceholder", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "setPlaceholder", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PlaceholderNode extends e.c implements InterfaceC1806t {
    private Placeholder placeholder;

    public PlaceholderNode(Placeholder placeholder) {
        AbstractC5504s.h(placeholder, "placeholder");
        this.placeholder = placeholder;
    }

    @Override // K0.InterfaceC1806t
    public void draw(InterfaceC6708c interfaceC6708c) {
        AbstractC5504s.h(interfaceC6708c, "<this>");
        this.placeholder.draw$revenuecatui_defaultsBc8Release(interfaceC6708c);
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }

    @Override // K0.InterfaceC1794j, K0.v0
    public /* bridge */ /* synthetic */ void onDensityChange() {
        super.onDensityChange();
    }

    @Override // K0.InterfaceC1794j
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
        super.onLayoutDirectionChange();
    }

    @Override // K0.InterfaceC1806t
    public /* bridge */ /* synthetic */ void onMeasureResultChanged() {
        super.onMeasureResultChanged();
    }

    public final void setPlaceholder(Placeholder placeholder) {
        AbstractC5504s.h(placeholder, "<set-?>");
        this.placeholder = placeholder;
    }
}
