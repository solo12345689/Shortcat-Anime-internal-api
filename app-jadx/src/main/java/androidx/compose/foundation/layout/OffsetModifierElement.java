package androidx.compose.foundation.layout;

import K0.Y;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.OffsetElement, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/o;", "Li1/h;", "x", "y", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/V0;", "LTd/L;", "inspectorInfo", "<init>", "(FFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/o;", "node", "h", "(Landroidx/compose/foundation/layout/o;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "F", "getX-D9Ej5fM", "()F", "getY-D9Ej5fM", "d", "Z", "getRtlAware", "()Z", "e", "Lkotlin/jvm/functions/Function1;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OffsetModifierElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float x;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float y;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rtlAware;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1 inspectorInfo;

    public /* synthetic */ OffsetModifierElement(float f10, float f11, boolean z10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10, function1);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o create() {
        return new o(this.x, this.y, this.rtlAware, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        OffsetModifierElement offsetModifierElement = other instanceof OffsetModifierElement ? (OffsetModifierElement) other : null;
        return offsetModifierElement != null && C5015h.q(this.x, offsetModifierElement.x) && C5015h.q(this.y, offsetModifierElement.y) && this.rtlAware == offsetModifierElement.rtlAware;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(o node) {
        node.I1(this.x);
        node.J1(this.y);
        node.H1(this.rtlAware);
    }

    public int hashCode() {
        return (((C5015h.r(this.x) * 31) + C5015h.r(this.y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        this.inspectorInfo.invoke(v02);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) C5015h.s(this.x)) + ", y=" + ((Object) C5015h.s(this.y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    private OffsetModifierElement(float f10, float f11, boolean z10, Function1 function1) {
        this.x = f10;
        this.y = f11;
        this.rtlAware = z10;
        this.inspectorInfo = function1;
    }
}
