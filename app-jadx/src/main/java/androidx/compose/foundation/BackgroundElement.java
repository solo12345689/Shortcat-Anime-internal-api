package androidx.compose.foundation;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;
import s0.C6385r0;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\r*\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "LK0/Y;", "Landroidx/compose/foundation/c;", "Ls0/r0;", "color", "Ls0/h0;", "brush", "", "alpha", "Ls0/E1;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/V0;", "LTd/L;", "inspectorInfo", "<init>", "(JLs0/h0;FLs0/E1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/c;", "node", "h", "(Landroidx/compose/foundation/c;)V", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "Ls0/h0;", "d", "F", "e", "Ls0/E1;", "f", "Lkotlin/jvm/functions/Function1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BackgroundElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6358h0 brush;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final E1 shape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1 inspectorInfo;

    public /* synthetic */ BackgroundElement(long j10, AbstractC6358h0 abstractC6358h0, float f10, E1 e12, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, abstractC6358h0, f10, e12, function1);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c create() {
        return new c(this.color, this.brush, this.alpha, this.shape, null);
    }

    public boolean equals(Object other) {
        BackgroundElement backgroundElement = other instanceof BackgroundElement ? (BackgroundElement) other : null;
        return backgroundElement != null && C6385r0.s(this.color, backgroundElement.color) && AbstractC5504s.c(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && AbstractC5504s.c(this.shape, backgroundElement.shape);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(c node) {
        node.J1(this.color);
        node.I1(this.brush);
        node.e(this.alpha);
        node.s1(this.shape);
    }

    public int hashCode() {
        int iY = C6385r0.y(this.color) * 31;
        AbstractC6358h0 abstractC6358h0 = this.brush;
        return ((((iY + (abstractC6358h0 != null ? abstractC6358h0.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        this.inspectorInfo.invoke(v02);
    }

    public /* synthetic */ BackgroundElement(long j10, AbstractC6358h0 abstractC6358h0, float f10, E1 e12, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6385r0.f58985b.j() : j10, (i10 & 2) != 0 ? null : abstractC6358h0, f10, e12, function1, null);
    }

    private BackgroundElement(long j10, AbstractC6358h0 abstractC6358h0, float f10, E1 e12, Function1 function1) {
        this.color = j10;
        this.brush = abstractC6358h0;
        this.alpha = f10;
        this.shape = e12;
        this.inspectorInfo = function1;
    }
}
