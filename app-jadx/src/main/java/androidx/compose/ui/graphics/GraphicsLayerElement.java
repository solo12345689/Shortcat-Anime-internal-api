package androidx.compose.ui.graphics;

import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import s0.E1;
import s0.u1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b5\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020$*\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00122\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b8\u00107R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u00107R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u00107R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u00107R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\bA\u00107R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u00107R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bE\u00107R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bY\u0010KR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bZ\u0010I\u001a\u0004\b[\u0010KR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010/R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b_\u0010]\u001a\u0004\b`\u0010/R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d¨\u0006e"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "LK0/Y;", "Landroidx/compose/ui/graphics/i;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/j;", "transformOrigin", "Ls0/E1;", "shape", "", "clip", "Ls0/u1;", "renderEffect", "Ls0/r0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/e;", "compositingStrategy", "Landroidx/compose/ui/graphics/c;", "blendMode", "Landroidx/compose/ui/graphics/d;", "colorFilter", "<init>", "(FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILandroidx/compose/ui/graphics/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/ui/graphics/i;", "node", "LTd/L;", "h", "(Landroidx/compose/ui/graphics/i;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getScaleX", "()F", "getScaleY", "d", "getAlpha", "e", "getTranslationX", "f", "getTranslationY", "g", "getShadowElevation", "getRotationX", "i", "getRotationY", "j", "getRotationZ", "k", "getCameraDistance", "l", "J", "getTransformOrigin-SzJe1aQ", "()J", "m", "Ls0/E1;", "getShape", "()Ls0/E1;", "n", "Z", "getClip", "()Z", "o", "Ls0/u1;", "getRenderEffect", "()Ls0/u1;", "p", "getAmbientShadowColor-0d7_KjU", "q", "getSpotShadowColor-0d7_KjU", "r", "I", "getCompositingStrategy--NrFUSI", "s", "getBlendMode-0nO6VwU", "t", "Landroidx/compose/ui/graphics/d;", "getColorFilter", "()Landroidx/compose/ui/graphics/d;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class GraphicsLayerElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final float shadowElevation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationX;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationY;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationZ;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cameraDistance;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long transformOrigin;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final E1 shape;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final u1 renderEffect;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientShadowColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotShadowColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final int compositingStrategy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final int blendMode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final d colorFilter;

    public /* synthetic */ GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, E1 e12, boolean z10, u1 u1Var, long j11, long j12, int i10, int i11, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, e12, z10, u1Var, j11, j12, i10, i11, dVar);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i create() {
        return new i(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) other;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && j.e(this.transformOrigin, graphicsLayerElement.transformOrigin) && AbstractC5504s.c(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && AbstractC5504s.c(this.renderEffect, graphicsLayerElement.renderEffect) && C6385r0.s(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && C6385r0.s(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && e.g(this.compositingStrategy, graphicsLayerElement.compositingStrategy) && c.G(this.blendMode, graphicsLayerElement.blendMode) && AbstractC5504s.c(this.colorFilter, graphicsLayerElement.colorFilter);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(i node) {
        node.l(this.scaleX);
        node.y(this.scaleY);
        node.e(this.alpha);
        node.F(this.translationX);
        node.g(this.translationY);
        node.v(this.shadowElevation);
        node.s(this.rotationX);
        node.t(this.rotationY);
        node.w(this.rotationZ);
        node.r(this.cameraDistance);
        node.t0(this.transformOrigin);
        node.s1(this.shape);
        node.n(this.clip);
        node.G(this.renderEffect);
        node.k(this.ambientShadowColor);
        node.o(this.spotShadowColor);
        node.X(this.compositingStrategy);
        node.c(this.blendMode);
        node.d(this.colorFilter);
        node.P1();
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + j.h(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31;
        u1 u1Var = this.renderEffect;
        int iHashCode2 = (((((((((iHashCode + (u1Var == null ? 0 : u1Var.hashCode())) * 31) + C6385r0.y(this.ambientShadowColor)) * 31) + C6385r0.y(this.spotShadowColor)) * 31) + e.h(this.compositingStrategy)) * 31) + c.H(this.blendMode)) * 31;
        d dVar = this.colorFilter;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("graphicsLayer");
        v02.b().c("scaleX", Float.valueOf(this.scaleX));
        v02.b().c("scaleY", Float.valueOf(this.scaleY));
        v02.b().c("alpha", Float.valueOf(this.alpha));
        v02.b().c("translationX", Float.valueOf(this.translationX));
        v02.b().c("translationY", Float.valueOf(this.translationY));
        v02.b().c("shadowElevation", Float.valueOf(this.shadowElevation));
        v02.b().c("rotationX", Float.valueOf(this.rotationX));
        v02.b().c("rotationY", Float.valueOf(this.rotationY));
        v02.b().c("rotationZ", Float.valueOf(this.rotationZ));
        v02.b().c("cameraDistance", Float.valueOf(this.cameraDistance));
        v02.b().c("transformOrigin", j.b(this.transformOrigin));
        v02.b().c("shape", this.shape);
        v02.b().c("clip", Boolean.valueOf(this.clip));
        v02.b().c("renderEffect", this.renderEffect);
        v02.b().c("ambientShadowColor", C6385r0.m(this.ambientShadowColor));
        v02.b().c("spotShadowColor", C6385r0.m(this.spotShadowColor));
        v02.b().c("compositingStrategy", e.d(this.compositingStrategy));
        v02.b().c("blendMode", c.D(this.blendMode));
        v02.b().c("colorFilter", this.colorFilter);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) j.i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) C6385r0.z(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) C6385r0.z(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) e.i(this.compositingStrategy)) + ", blendMode=" + ((Object) c.I(this.blendMode)) + ", colorFilter=" + this.colorFilter + ')';
    }

    private GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, E1 e12, boolean z10, u1 u1Var, long j11, long j12, int i10, int i11, d dVar) {
        this.scaleX = f10;
        this.scaleY = f11;
        this.alpha = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.shadowElevation = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.rotationZ = f18;
        this.cameraDistance = f19;
        this.transformOrigin = j10;
        this.shape = e12;
        this.clip = z10;
        this.renderEffect = u1Var;
        this.ambientShadowColor = j11;
        this.spotShadowColor = j12;
        this.compositingStrategy = i10;
        this.blendMode = i11;
        this.colorFilter = dVar;
    }
}
