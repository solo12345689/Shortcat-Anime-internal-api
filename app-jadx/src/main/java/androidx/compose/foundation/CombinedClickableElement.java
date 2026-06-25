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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bo\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u000e*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "LK0/Y;", "Landroidx/compose/foundation/f;", "LB/m;", "interactionSource", "Lx/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LR0/h;", "role", "Lkotlin/Function0;", "LTd/L;", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "<init>", "(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Ljava/lang/String;Lie/a;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/f;", "node", "h", "(Landroidx/compose/foundation/f;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LB/m;", "Lx/I;", "d", "Z", "e", "Ljava/lang/String;", "f", "LR0/h;", "g", "Lie/a;", "i", "j", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CombinedClickableElement extends Y {

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

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String onLongClickLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC5082a onLongClick;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC5082a onDoubleClick;

    public /* synthetic */ CombinedClickableElement(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a, String str2, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, interfaceC6989I, z10, str, c2099h, interfaceC5082a, str2, interfaceC5082a2, interfaceC5082a3);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c */
    public f create() {
        return new f(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || CombinedClickableElement.class != other.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) other;
        return AbstractC5504s.c(this.interactionSource, combinedClickableElement.interactionSource) && AbstractC5504s.c(this.indicationNodeFactory, combinedClickableElement.indicationNodeFactory) && this.enabled == combinedClickableElement.enabled && AbstractC5504s.c(this.onClickLabel, combinedClickableElement.onClickLabel) && AbstractC5504s.c(this.role, combinedClickableElement.role) && this.onClick == combinedClickableElement.onClick && AbstractC5504s.c(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && this.onLongClick == combinedClickableElement.onLongClick && this.onDoubleClick == combinedClickableElement.onDoubleClick;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h */
    public void update(f node) {
        node.f2(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role);
    }

    public int hashCode() {
        B.m mVar = this.interactionSource;
        int iHashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        InterfaceC6989I interfaceC6989I = this.indicationNodeFactory;
        int iHashCode2 = (((iHashCode + (interfaceC6989I != null ? interfaceC6989I.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C2099h c2099h = this.role;
        int iN = (((iHashCode3 + (c2099h != null ? C2099h.n(c2099h.p()) : 0)) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        int iHashCode4 = (iN + (str2 != null ? str2.hashCode() : 0)) * 31;
        InterfaceC5082a interfaceC5082a = this.onLongClick;
        int iHashCode5 = (iHashCode4 + (interfaceC5082a != null ? interfaceC5082a.hashCode() : 0)) * 31;
        InterfaceC5082a interfaceC5082a2 = this.onDoubleClick;
        return iHashCode5 + (interfaceC5082a2 != null ? interfaceC5082a2.hashCode() : 0);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("combinedClickable");
        v02.b().c("indicationNodeFactory", this.indicationNodeFactory);
        v02.b().c("interactionSource", this.interactionSource);
        v02.b().c("enabled", Boolean.valueOf(this.enabled));
        v02.b().c("onClickLabel", this.onClickLabel);
        v02.b().c("role", this.role);
        v02.b().c("onClick", this.onClick);
        v02.b().c("onDoubleClick", this.onDoubleClick);
        v02.b().c("onLongClick", this.onLongClick);
        v02.b().c("onLongClickLabel", this.onLongClickLabel);
    }

    private CombinedClickableElement(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a, String str2, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3) {
        this.interactionSource = mVar;
        this.indicationNodeFactory = interfaceC6989I;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = c2099h;
        this.onClick = interfaceC5082a;
        this.onLongClickLabel = str2;
        this.onLongClick = interfaceC5082a2;
        this.onDoubleClick = interfaceC5082a3;
    }
}
