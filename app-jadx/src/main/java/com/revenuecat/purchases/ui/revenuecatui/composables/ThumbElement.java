package com.revenuecat.purchases.ui.revenuecatui.composables;

import B.k;
import K0.H;
import K0.Y;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbElement;", "LK0/Y;", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;", "LB/k;", "interactionSource", "", "checked", "<init>", "(LB/k;Z)V", "create", "()Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;", "node", "LTd/L;", "update", "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "component1", "()LB/k;", "component2", "()Z", "copy", "(LB/k;Z)Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "LB/k;", "getInteractionSource", "Z", "getChecked", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class ThumbElement extends Y {
    private final boolean checked;
    private final k interactionSource;

    public ThumbElement(k interactionSource, boolean z10) {
        AbstractC5504s.h(interactionSource, "interactionSource");
        this.interactionSource = interactionSource;
        this.checked = z10;
    }

    public static /* synthetic */ ThumbElement copy$default(ThumbElement thumbElement, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = thumbElement.interactionSource;
        }
        if ((i10 & 2) != 0) {
            z10 = thumbElement.checked;
        }
        return thumbElement.copy(kVar, z10);
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
    public final k getInteractionSource() {
        return this.interactionSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    public final ThumbElement copy(k interactionSource, boolean checked) {
        AbstractC5504s.h(interactionSource, "interactionSource");
        return new ThumbElement(interactionSource, checked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) other;
        return AbstractC5504s.c(this.interactionSource, thumbElement.interactionSource) && this.checked == thumbElement.checked;
    }

    @Override // androidx.compose.ui.e.b, androidx.compose.ui.e
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return super.foldIn(obj, function2);
    }

    @Override // androidx.compose.ui.e.b
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return super.foldOut(obj, function2);
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final k getInteractionSource() {
        return this.interactionSource;
    }

    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + Boolean.hashCode(this.checked);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        AbstractC5504s.h(v02, "<this>");
        v02.d("switchThumb");
        v02.b().c("interactionSource", this.interactionSource);
        v02.b().c("checked", Boolean.valueOf(this.checked));
    }

    @Override // androidx.compose.ui.e
    public /* bridge */ /* synthetic */ e then(e eVar) {
        return super.then(eVar);
    }

    public String toString() {
        return "ThumbElement(interactionSource=" + this.interactionSource + ", checked=" + this.checked + ')';
    }

    @Override // K0.Y
    public ThumbNode create() {
        return new ThumbNode(this.interactionSource, this.checked);
    }

    @Override // K0.Y
    public void update(ThumbNode node) {
        AbstractC5504s.h(node, "node");
        node.setInteractionSource(this.interactionSource);
        if (node.getChecked() != this.checked) {
            H.b(node);
        }
        node.setChecked(this.checked);
        node.update();
    }
}
