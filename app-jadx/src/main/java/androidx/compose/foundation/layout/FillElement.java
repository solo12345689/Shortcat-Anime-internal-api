package androidx.compose.foundation.layout;

import C.EnumC1143n;
import K0.Y;
import androidx.compose.ui.platform.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "LK0/Y;", "Landroidx/compose/foundation/layout/i;", "LC/n;", "direction", "", "fraction", "", "inspectorName", "<init>", "(LC/n;FLjava/lang/String;)V", "c", "()Landroidx/compose/foundation/layout/i;", "node", "LTd/L;", "h", "(Landroidx/compose/foundation/layout/i;)V", "Landroidx/compose/ui/platform/V0;", "inspectableProperties", "(Landroidx/compose/ui/platform/V0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LC/n;", "F", "d", "Ljava/lang/String;", "e", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FillElement extends Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC1143n direction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.FillElement$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FillElement a(float f10) {
            return new FillElement(EnumC1143n.Vertical, f10, "fillMaxHeight");
        }

        public final FillElement b(float f10) {
            return new FillElement(EnumC1143n.Both, f10, "fillMaxSize");
        }

        public final FillElement c(float f10) {
            return new FillElement(EnumC1143n.Horizontal, f10, "fillMaxWidth");
        }

        private Companion() {
        }
    }

    public FillElement(EnumC1143n enumC1143n, float f10, String str) {
        this.direction = enumC1143n;
        this.fraction = f10;
        this.inspectorName = str;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i create() {
        return new i(this.direction, this.fraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) other;
        return this.direction == fillElement.direction && this.fraction == fillElement.fraction;
    }

    @Override // K0.Y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(i node) {
        node.E1(this.direction);
        node.F1(this.fraction);
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    @Override // K0.Y
    public void inspectableProperties(V0 v02) {
        v02.d(this.inspectorName);
        v02.b().c("fraction", Float.valueOf(this.fraction));
    }
}
