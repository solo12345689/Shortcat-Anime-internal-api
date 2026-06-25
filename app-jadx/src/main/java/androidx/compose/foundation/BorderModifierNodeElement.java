package androidx.compose.foundation;

import K0.Y;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;
import s0.C6385r0;
import s0.E1;
import s0.F1;
import x.C7008f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "LK0/Y;", "Lx/f;", "Li1/h;", "width", "Ls0/h0;", "brush", "Ls0/E1;", "shape", "<init>", "(FLs0/h0;Ls0/E1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Lx/f;", "node", "LTd/L;", "h", "(Lx/f;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWidth-D9Ej5fM", "()F", "Ls0/h0;", "getBrush", "()Ls0/h0;", "d", "Ls0/E1;", "getShape", "()Ls0/E1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BorderModifierNodeElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6358h0 brush;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final E1 shape;

    public /* synthetic */ BorderModifierNodeElement(float f10, AbstractC6358h0 abstractC6358h0, E1 e12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, abstractC6358h0, e12);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C7008f create() {
        return new C7008f(this.width, this.brush, this.shape, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) other;
        return C5015h.q(this.width, borderModifierNodeElement.width) && AbstractC5504s.c(this.brush, borderModifierNodeElement.brush) && AbstractC5504s.c(this.shape, borderModifierNodeElement.shape);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(C7008f node) {
        node.S1(this.width);
        node.R1(this.brush);
        node.s1(this.shape);
    }

    public int hashCode() {
        return (((C5015h.r(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("border");
        v02.b().c("width", C5015h.h(this.width));
        if (this.brush instanceof F1) {
            v02.b().c("color", C6385r0.m(((F1) this.brush).a()));
            v02.e(C6385r0.m(((F1) this.brush).a()));
        } else {
            v02.b().c("brush", this.brush);
        }
        v02.b().c("shape", this.shape);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C5015h.s(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f10, AbstractC6358h0 abstractC6358h0, E1 e12) {
        this.width = f10;
        this.brush = abstractC6358h0;
        this.shape = e12;
    }
}
