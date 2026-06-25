package androidx.compose.ui.input.pointer;

import E0.C1312w;
import E0.InterfaceC1313x;
import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "LK0/Y;", "LE0/w;", "LE0/x;", "icon", "", "overrideDescendants", "<init>", "(LE0/x;Z)V", "c", "()LE0/w;", "node", "LTd/L;", "h", "(LE0/w;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "LE0/x;", "getIcon", "()LE0/x;", "Z", "getOverrideDescendants", "()Z", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PointerHoverIconModifierElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC1313x icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean overrideDescendants;

    public PointerHoverIconModifierElement(InterfaceC1313x interfaceC1313x, boolean z10) {
        this.icon = interfaceC1313x;
        this.overrideDescendants = z10;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1312w create() {
        return new C1312w(this.icon, this.overrideDescendants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) other;
        return AbstractC5504s.c(this.icon, pointerHoverIconModifierElement.icon) && this.overrideDescendants == pointerHoverIconModifierElement.overrideDescendants;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(C1312w node) {
        node.R1(this.icon);
        node.S1(this.overrideDescendants);
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("pointerHoverIcon");
        v02.b().c("icon", this.icon);
        v02.b().c("overrideDescendants", Boolean.valueOf(this.overrideDescendants));
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ')';
    }
}
