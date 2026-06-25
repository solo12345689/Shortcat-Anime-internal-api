package H7;

import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3303t;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8099b;

    public q(float f10, float f11) {
        this.f8098a = f10;
        this.f8099b = f11;
    }

    public final float a() {
        return this.f8098a;
    }

    public final float b() {
        return this.f8099b;
    }

    public final q c() {
        return new q(B.i(this.f8098a), B.i(this.f8099b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f8098a, qVar.f8098a) == 0 && Float.compare(this.f8099b, qVar.f8099b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f8098a) * 31) + Float.hashCode(this.f8099b);
    }

    public String toString() {
        return "CornerRadii(horizontal=" + this.f8098a + ", vertical=" + this.f8099b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(C3303t length, float f10, float f11) {
        this(length.b(f10), length.b(f11));
        AbstractC5504s.h(length, "length");
    }
}
