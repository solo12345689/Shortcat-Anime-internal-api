package androidx.compose.foundation;

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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "LK0/Y;", "Landroidx/compose/foundation/e;", "LB/m;", "interactionSource", "Lx/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LR0/h;", "role", "Lkotlin/Function0;", "LTd/L;", "onClick", "<init>", "(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/e;", "node", "h", "(Landroidx/compose/foundation/e;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LB/m;", "Lx/I;", "d", "Z", "e", "Ljava/lang/String;", "f", "LR0/h;", "g", "Lie/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ClickableElement extends Y {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final B.m interactionSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC6989I indicationNodeFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String onClickLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C2099h role;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC5082a onClick;

    public /* synthetic */ ClickableElement(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, interfaceC6989I, z10, str, c2099h, interfaceC5082a);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c */
    public e create() {
        return new e(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ClickableElement.class != other.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) other;
        return AbstractC5504s.c(this.interactionSource, clickableElement.interactionSource) && AbstractC5504s.c(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.enabled == clickableElement.enabled && AbstractC5504s.c(this.onClickLabel, clickableElement.onClickLabel) && AbstractC5504s.c(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h */
    public void update(e node) {
        node.e2(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    public int hashCode() {
        B.m mVar = this.interactionSource;
        int iHashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        InterfaceC6989I interfaceC6989I = this.indicationNodeFactory;
        int iHashCode2 = (((iHashCode + (interfaceC6989I != null ? interfaceC6989I.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C2099h c2099h = this.role;
        return ((iHashCode3 + (c2099h != null ? C2099h.n(c2099h.p()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("clickable");
        v02.b().c("enabled", Boolean.valueOf(this.enabled));
        v02.b().c("onClick", this.onClick);
        v02.b().c("onClickLabel", this.onClickLabel);
        v02.b().c("role", this.role);
        v02.b().c("interactionSource", this.interactionSource);
        v02.b().c("indicationNodeFactory", this.indicationNodeFactory);
    }

    private ClickableElement(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        this.interactionSource = mVar;
        this.indicationNodeFactory = interfaceC6989I;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = c2099h;
        this.onClick = interfaceC5082a;
    }
}
