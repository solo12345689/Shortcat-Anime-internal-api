package A4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x4.f f281c;

    public g(Drawable drawable, boolean z10, x4.f fVar) {
        super(null);
        this.f279a = drawable;
        this.f280b = z10;
        this.f281c = fVar;
    }

    public final x4.f a() {
        return this.f281c;
    }

    public final Drawable b() {
        return this.f279a;
    }

    public final boolean c() {
        return this.f280b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return AbstractC5504s.c(this.f279a, gVar.f279a) && this.f280b == gVar.f280b && this.f281c == gVar.f281c;
    }

    public int hashCode() {
        return (((this.f279a.hashCode() * 31) + Boolean.hashCode(this.f280b)) * 31) + this.f281c.hashCode();
    }
}
