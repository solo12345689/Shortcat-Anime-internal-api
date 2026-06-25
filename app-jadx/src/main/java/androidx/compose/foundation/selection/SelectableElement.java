package androidx.compose.foundation.selection;

import B.m;
import K0.Y;
import R0.C2099h;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\r*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "LK0/Y;", "Landroidx/compose/foundation/selection/b;", "", "selected", "LB/m;", "interactionSource", "Lx/I;", "indicationNodeFactory", "enabled", "LR0/h;", "role", "Lkotlin/Function0;", "LTd/L;", "onClick", "<init>", "(ZLB/m;Lx/I;ZLR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/selection/b;", "node", "h", "(Landroidx/compose/foundation/selection/b;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Z", "LB/m;", "d", "Lx/I;", "e", "f", "LR0/h;", "g", "Lie/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SelectableElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m interactionSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6989I indicationNodeFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C2099h role;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5082a onClick;

    public /* synthetic */ SelectableElement(boolean z10, m mVar, InterfaceC6989I interfaceC6989I, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, mVar, interfaceC6989I, z11, c2099h, interfaceC5082a);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b create() {
        return new b(this.selected, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || SelectableElement.class != other.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) other;
        return this.selected == selectableElement.selected && AbstractC5504s.c(this.interactionSource, selectableElement.interactionSource) && AbstractC5504s.c(this.indicationNodeFactory, selectableElement.indicationNodeFactory) && this.enabled == selectableElement.enabled && AbstractC5504s.c(this.role, selectableElement.role) && this.onClick == selectableElement.onClick;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(b node) {
        node.f2(this.selected, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.selected) * 31;
        m mVar = this.interactionSource;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        InterfaceC6989I interfaceC6989I = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (interfaceC6989I != null ? interfaceC6989I.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        C2099h c2099h = this.role;
        return ((iHashCode3 + (c2099h != null ? C2099h.n(c2099h.p()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("selectable");
        v02.b().c("selected", Boolean.valueOf(this.selected));
        v02.b().c("interactionSource", this.interactionSource);
        v02.b().c("indicationNodeFactory", this.indicationNodeFactory);
        v02.b().c("enabled", Boolean.valueOf(this.enabled));
        v02.b().c("role", this.role);
        v02.b().c("onClick", this.onClick);
    }

    private SelectableElement(boolean z10, m mVar, InterfaceC6989I interfaceC6989I, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        this.selected = z10;
        this.interactionSource = mVar;
        this.indicationNodeFactory = interfaceC6989I;
        this.enabled = z11;
        this.role = c2099h;
        this.onClick = interfaceC5082a;
    }
}
