package s0;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: s0.b0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6340b0 extends androidx.compose.ui.graphics.d {

    /* JADX INFO: renamed from: c */
    private final long f58926c;

    /* JADX INFO: renamed from: d */
    private final int f58927d;

    public /* synthetic */ C6340b0(long j10, int i10, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, colorFilter);
    }

    public final int b() {
        return this.f58927d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6340b0)) {
            return false;
        }
        C6340b0 c6340b0 = (C6340b0) obj;
        return C6385r0.s(this.f58926c, c6340b0.f58926c) && androidx.compose.ui.graphics.c.G(this.f58927d, c6340b0.f58927d);
    }

    public int hashCode() {
        return (C6385r0.y(this.f58926c) * 31) + androidx.compose.ui.graphics.c.H(this.f58927d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) C6385r0.z(this.f58926c)) + ", blendMode=" + ((Object) androidx.compose.ui.graphics.c.I(this.f58927d)) + ')';
    }

    public /* synthetic */ C6340b0(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10);
    }

    private C6340b0(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f58926c = j10;
        this.f58927d = i10;
    }

    private C6340b0(long j10, int i10) {
        this(j10, i10, F.a(j10, i10), null);
    }
}
