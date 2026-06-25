package Ib;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f8887a;

    public e(Drawable drawable) {
        AbstractC5504s.h(drawable, "drawable");
        this.f8887a = drawable;
    }

    @Override // Ib.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Lb.b a() {
        return new Lb.b(this.f8887a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC5504s.c(this.f8887a, ((e) obj).f8887a);
    }

    public int hashCode() {
        return this.f8887a.hashCode();
    }

    public String toString() {
        return "DecodedModelProvider(drawable=" + this.f8887a + ")";
    }
}
