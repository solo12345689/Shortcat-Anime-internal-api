package androidx.compose.foundation.layout;

import K0.Y;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\f*\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/t;", "Li1/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/V0;", "LTd/L;", "inspectorInfo", "<init>", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/t;", "node", "h", "(Landroidx/compose/foundation/layout/t;)V", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "F", "d", "e", "f", "Z", "g", "Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float maxWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float maxHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceIncoming;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1 inspectorInfo;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, function1);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t create() {
        return new t(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) other;
        return C5015h.q(this.minWidth, sizeElement.minWidth) && C5015h.q(this.minHeight, sizeElement.minHeight) && C5015h.q(this.maxWidth, sizeElement.maxWidth) && C5015h.q(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(t node) {
        node.J1(this.minWidth);
        node.I1(this.minHeight);
        node.H1(this.maxWidth);
        node.G1(this.maxHeight);
        node.F1(this.enforceIncoming);
    }

    public int hashCode() {
        return (((((((C5015h.r(this.minWidth) * 31) + C5015h.r(this.minHeight)) * 31) + C5015h.r(this.maxWidth)) * 31) + C5015h.r(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        this.inspectorInfo.invoke(v02);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5015h.f48547b.c() : f10, (i10 & 2) != 0 ? C5015h.f48547b.c() : f11, (i10 & 4) != 0 ? C5015h.f48547b.c() : f12, (i10 & 8) != 0 ? C5015h.f48547b.c() : f13, z10, function1, null);
    }

    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, Function1 function1) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
        this.inspectorInfo = function1;
    }
}
