package androidx.compose.ui.draw;

import I0.InterfaceC1680f;
import K0.AbstractC1807u;
import K0.H;
import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import r0.C6230l;
import w0.AbstractC6923b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0014*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LK0/Y;", "Landroidx/compose/ui/draw/PainterNode;", "Lw0/b;", "painter", "", "sizeToIntrinsics", "Ll0/e;", "alignment", "LI0/f;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/d;", "colorFilter", "<init>", "(Lw0/b;ZLl0/e;LI0/f;FLandroidx/compose/ui/graphics/d;)V", "c", "()Landroidx/compose/ui/draw/PainterNode;", "node", "LTd/L;", "h", "(Landroidx/compose/ui/draw/PainterNode;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lw0/b;", "getPainter", "()Lw0/b;", "b", "Z", "getSizeToIntrinsics", "()Z", "Ll0/e;", "getAlignment", "()Ll0/e;", "d", "LI0/f;", "getContentScale", "()LI0/f;", "e", "F", "getAlpha", "()F", "f", "Landroidx/compose/ui/graphics/d;", "getColorFilter", "()Landroidx/compose/ui/graphics/d;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class PainterElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l0.e alignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC1680f contentScale;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.graphics.d colorFilter;
    private final AbstractC6923b painter;

    public PainterElement(AbstractC6923b abstractC6923b, boolean z10, l0.e eVar, InterfaceC1680f interfaceC1680f, float f10, androidx.compose.ui.graphics.d dVar) {
        this.painter = abstractC6923b;
        this.sizeToIntrinsics = z10;
        this.alignment = eVar;
        this.contentScale = interfaceC1680f;
        this.alpha = f10;
        this.colorFilter = dVar;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public PainterModifier create() {
        return new PainterModifier(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) other;
        return AbstractC5504s.c(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && AbstractC5504s.c(this.alignment, painterElement.alignment) && AbstractC5504s.c(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && AbstractC5504s.c(this.colorFilter, painterElement.colorFilter);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(PainterModifier node) {
        boolean sizeToIntrinsics = node.getSizeToIntrinsics();
        boolean z10 = this.sizeToIntrinsics;
        boolean z11 = sizeToIntrinsics != z10 || (z10 && !C6230l.f(node.getPainter().k(), this.painter.k()));
        node.N1(this.painter);
        node.O1(this.sizeToIntrinsics);
        node.L1(this.alignment);
        node.M1(this.contentScale);
        node.e(this.alpha);
        node.d(this.colorFilter);
        if (z11) {
            H.b(node);
        }
        AbstractC1807u.a(node);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        androidx.compose.ui.graphics.d dVar = this.colorFilter;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("paint");
        v02.b().c("painter", this.painter);
        v02.b().c("sizeToIntrinsics", Boolean.valueOf(this.sizeToIntrinsics));
        v02.b().c("alignment", this.alignment);
        v02.b().c("contentScale", this.contentScale);
        v02.b().c("alpha", Float.valueOf(this.alpha));
        v02.b().c("colorFilter", this.colorFilter);
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
