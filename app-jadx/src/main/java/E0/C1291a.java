package E0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: E0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1291a implements InterfaceC1313x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4129b;

    public C1291a(int i10) {
        this.f4129b = i10;
    }

    public final int a() {
        return this.f4129b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(C1291a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f4129b == ((C1291a) obj).f4129b;
    }

    public int hashCode() {
        return this.f4129b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f4129b + ')';
    }
}
