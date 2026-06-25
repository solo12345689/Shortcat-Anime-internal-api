package androidx.compose.ui.draw;

import K0.Y;
import Td.L;
import androidx.compose.ui.graphics.g;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6352f0;
import s0.C6385r0;
import s0.E1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0010*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103¨\u00066"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "LK0/Y;", "Ls0/f0;", "Li1/h;", "elevation", "Ls0/E1;", "shape", "", "clip", "Ls0/r0;", "ambientColor", "spotColor", "<init>", "(FLs0/E1;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/g;", "LTd/L;", "h", "()Lkotlin/jvm/functions/Function1;", "c", "()Ls0/f0;", "node", "n", "(Ls0/f0;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "k", "()F", "Ls0/E1;", "l", "()Ls0/E1;", "d", "Z", "j", "()Z", "e", "J", "i", "()J", "f", "m", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float elevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final E1 shape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotColor;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return L.f17438a;
        }

        public final void invoke(g gVar) {
            gVar.v(gVar.l1(ShadowGraphicsLayerElement.this.getElevation()));
            gVar.s1(ShadowGraphicsLayerElement.this.getShape());
            gVar.n(ShadowGraphicsLayerElement.this.getClip());
            gVar.k(ShadowGraphicsLayerElement.this.getAmbientColor());
            gVar.o(ShadowGraphicsLayerElement.this.getSpotColor());
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, E1 e12, boolean z10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, e12, z10, j10, j11);
    }

    private final Function1 h() {
        return new a();
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6352f0 create() {
        return new C6352f0(h());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return C5015h.q(this.elevation, shadowGraphicsLayerElement.elevation) && AbstractC5504s.c(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && C6385r0.s(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && C6385r0.s(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    public int hashCode() {
        return (((((((C5015h.r(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + C6385r0.y(this.ambientColor)) * 31) + C6385r0.y(this.spotColor);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("shadow");
        v02.b().c("elevation", C5015h.h(this.elevation));
        v02.b().c("shape", this.shape);
        v02.b().c("clip", Boolean.valueOf(this.clip));
        v02.b().c("ambientColor", C6385r0.m(this.ambientColor));
        v02.b().c("spotColor", C6385r0.m(this.spotColor));
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final E1 getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void update(C6352f0 node) {
        node.G1(h());
        node.F1();
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) C5015h.s(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) C6385r0.z(this.ambientColor)) + ", spotColor=" + ((Object) C6385r0.z(this.spotColor)) + ')';
    }

    private ShadowGraphicsLayerElement(float f10, E1 e12, boolean z10, long j10, long j11) {
        this.elevation = f10;
        this.shape = e12;
        this.clip = z10;
        this.ambientColor = j10;
        this.spotColor = j11;
    }
}
