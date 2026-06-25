package androidx.compose.foundation;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "LK0/Y;", "Landroidx/compose/foundation/l;", "LB/k;", "interactionSource", "Lx/I;", "indication", "<init>", "(LB/k;Lx/I;)V", "c", "()Landroidx/compose/foundation/l;", "Landroidx/compose/ui/platform/V0;", "LTd/L;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "node", "h", "(Landroidx/compose/foundation/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LB/k;", "Lx/I;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class IndicationModifierElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final B.k interactionSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6989I indication;

    public IndicationModifierElement(B.k kVar, InterfaceC6989I interfaceC6989I) {
        this.interactionSource = kVar;
        this.indication = interfaceC6989I;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l create() {
        return new l(this.indication.a(this.interactionSource));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) other;
        return AbstractC5504s.c(this.interactionSource, indicationModifierElement.interactionSource) && AbstractC5504s.c(this.indication, indicationModifierElement.indication);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(l node) {
        node.K1(this.indication.a(this.interactionSource));
    }

    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + this.indication.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("indication");
        v02.b().c("interactionSource", this.interactionSource);
        v02.b().c("indication", this.indication);
    }
}
