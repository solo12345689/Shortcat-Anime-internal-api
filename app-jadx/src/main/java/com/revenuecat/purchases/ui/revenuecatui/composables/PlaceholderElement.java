package com.revenuecat.purchases.ui.revenuecatui.composables;

import K0.Y;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0006¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderElement;", "LK0/Y;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "placeholder", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;)V", "create", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;", "node", "LTd/L;", "update", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderNode;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "component1", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "copy", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;)Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;", "getPlaceholder", "setPlaceholder", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class PlaceholderElement extends Y {
    private Placeholder placeholder;

    public PlaceholderElement(Placeholder placeholder) {
        AbstractC5504s.h(placeholder, "placeholder");
        this.placeholder = placeholder;
    }

    public static /* synthetic */ PlaceholderElement copy$default(PlaceholderElement placeholderElement, Placeholder placeholder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            placeholder = placeholderElement.placeholder;
        }
        return placeholderElement.copy(placeholder);
    }

    @Override // androidx.compose.ui.e.b, androidx.compose.ui.e
    public /* bridge */ /* synthetic */ boolean all(Function1 function1) {
        return super.all(function1);
    }

    @Override // androidx.compose.ui.e.b
    public /* bridge */ /* synthetic */ boolean any(Function1 function1) {
        return super.any(function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }

    public final PlaceholderElement copy(Placeholder placeholder) {
        AbstractC5504s.h(placeholder, "placeholder");
        return new PlaceholderElement(placeholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlaceholderElement) && AbstractC5504s.c(this.placeholder, ((PlaceholderElement) other).placeholder);
    }

    @Override // androidx.compose.ui.e.b, androidx.compose.ui.e
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return super.foldIn(obj, function2);
    }

    @Override // androidx.compose.ui.e.b
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return super.foldOut(obj, function2);
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        return this.placeholder.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        AbstractC5504s.h(v02, "<this>");
        v02.d("placeholder");
        v02.b().c("placeholder", this.placeholder);
        v02.b().c("loadingDescription", "Loading..");
    }

    public final void setPlaceholder(Placeholder placeholder) {
        AbstractC5504s.h(placeholder, "<set-?>");
        this.placeholder = placeholder;
    }

    @Override // androidx.compose.ui.e
    public /* bridge */ /* synthetic */ e then(e eVar) {
        return super.then(eVar);
    }

    public String toString() {
        return "PlaceholderElement(placeholder=" + this.placeholder + ')';
    }

    @Override // K0.Y
    public PlaceholderNode create() {
        return new PlaceholderNode(this.placeholder);
    }

    @Override // K0.Y
    public void update(PlaceholderNode node) {
        AbstractC5504s.h(node, "node");
        node.setPlaceholder(this.placeholder);
    }
}
