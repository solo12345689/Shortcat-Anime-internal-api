package c4;

import a4.C2567b;
import android.graphics.Rect;
import androidx.core.view.L0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2567b f33504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0 f33505b;

    public k(C2567b _bounds, L0 _windowInsetsCompat) {
        AbstractC5504s.h(_bounds, "_bounds");
        AbstractC5504s.h(_windowInsetsCompat, "_windowInsetsCompat");
        this.f33504a = _bounds;
        this.f33505b = _windowInsetsCompat;
    }

    public final Rect a() {
        return this.f33504a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return AbstractC5504s.c(this.f33504a, kVar.f33504a) && AbstractC5504s.c(this.f33505b, kVar.f33505b);
    }

    public int hashCode() {
        return (this.f33504a.hashCode() * 31) + this.f33505b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f33504a + ", windowInsetsCompat=" + this.f33505b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(Rect rect, L0 l02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            l02 = new L0.a().a();
            AbstractC5504s.g(l02, "Builder().build()");
        }
        this(rect, l02);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect bounds, L0 insets) {
        this(new C2567b(bounds), insets);
        AbstractC5504s.h(bounds, "bounds");
        AbstractC5504s.h(insets, "insets");
    }
}
