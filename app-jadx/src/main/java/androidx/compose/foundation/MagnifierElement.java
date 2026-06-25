package androidx.compose.foundation;

import K0.Y;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import i1.C5018k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.C6990J;
import x.InterfaceC7002W;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\t*\u00020$H\u0016¢\u0006\u0004\b%\u0010&R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010+R\u001a\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "LK0/Y;", "Lx/J;", "Lkotlin/Function1;", "Li1/d;", "Lr0/f;", "sourceCenter", "magnifierCenter", "Li1/k;", "LTd/L;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Li1/h;", "cornerRadius", "elevation", "clippingEnabled", "Lx/W;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLx/W;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Lx/J;", "node", "h", "(Lx/J;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "b", "Lkotlin/jvm/functions/Function1;", "d", "e", "F", "f", "Z", "g", "J", "i", "j", "k", "Lx/W;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MagnifierElement extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1 sourceCenter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1 magnifierCenter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1 onSizeChanged;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float zoom;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean useTextDefault;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float cornerRadius;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean clippingEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC7002W platformMagnifierFactory;

    public /* synthetic */ MagnifierElement(Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC7002W interfaceC7002W, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f10, z10, j10, f11, f12, z11, interfaceC7002W);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6990J create() {
        return new C6990J(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) other;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && C5018k.f(this.size, magnifierElement.size) && C5015h.q(this.cornerRadius, magnifierElement.cornerRadius) && C5015h.q(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && AbstractC5504s.c(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(C6990J node) {
        node.M1(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        Function1 function1 = this.magnifierCenter;
        int iHashCode2 = (((((((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + C5018k.i(this.size)) * 31) + C5015h.r(this.cornerRadius)) * 31) + C5015h.r(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        Function1 function12 = this.onSizeChanged;
        return ((iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d("magnifier");
        v02.b().c("sourceCenter", this.sourceCenter);
        v02.b().c("magnifierCenter", this.magnifierCenter);
        v02.b().c("zoom", Float.valueOf(this.zoom));
        v02.b().c("size", C5018k.c(this.size));
        v02.b().c("cornerRadius", C5015h.h(this.cornerRadius));
        v02.b().c("elevation", C5015h.h(this.elevation));
        v02.b().c("clippingEnabled", Boolean.valueOf(this.clippingEnabled));
    }

    private MagnifierElement(Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC7002W interfaceC7002W) {
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.onSizeChanged = function13;
        this.zoom = f10;
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f11;
        this.elevation = f12;
        this.clippingEnabled = z11;
        this.platformMagnifierFactory = interfaceC7002W;
    }
}
