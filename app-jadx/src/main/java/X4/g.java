package x4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f63896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f63897b;

    public g(Drawable drawable, boolean z10) {
        this.f63896a = drawable;
        this.f63897b = z10;
    }

    public final Drawable a() {
        return this.f63896a;
    }

    public final boolean b() {
        return this.f63897b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC5504s.c(this.f63896a, gVar.f63896a) && this.f63897b == gVar.f63897b;
    }

    public int hashCode() {
        return (this.f63896a.hashCode() * 31) + Boolean.hashCode(this.f63897b);
    }
}
