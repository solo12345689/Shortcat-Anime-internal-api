package v;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.InterfaceC6878G;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f61685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f61686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6878G f61687c;

    public /* synthetic */ u(float f10, long j10, InterfaceC6878G interfaceC6878G, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, interfaceC6878G);
    }

    public final InterfaceC6878G a() {
        return this.f61687c;
    }

    public final float b() {
        return this.f61685a;
    }

    public final long c() {
        return this.f61686b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f61685a, uVar.f61685a) == 0 && androidx.compose.ui.graphics.j.e(this.f61686b, uVar.f61686b) && AbstractC5504s.c(this.f61687c, uVar.f61687c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f61685a) * 31) + androidx.compose.ui.graphics.j.h(this.f61686b)) * 31) + this.f61687c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f61685a + ", transformOrigin=" + ((Object) androidx.compose.ui.graphics.j.i(this.f61686b)) + ", animationSpec=" + this.f61687c + ')';
    }

    private u(float f10, long j10, InterfaceC6878G interfaceC6878G) {
        this.f61685a = f10;
        this.f61686b = j10;
        this.f61687c = interfaceC6878G;
    }
}
