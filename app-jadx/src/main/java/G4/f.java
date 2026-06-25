package G4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a */
    private final Drawable f7267a;

    /* JADX INFO: renamed from: b */
    private final h f7268b;

    /* JADX INFO: renamed from: c */
    private final Throwable f7269c;

    public f(Drawable drawable, h hVar, Throwable th2) {
        super(null);
        this.f7267a = drawable;
        this.f7268b = hVar;
        this.f7269c = th2;
    }

    @Override // G4.i
    public Drawable a() {
        return this.f7267a;
    }

    @Override // G4.i
    public h b() {
        return this.f7268b;
    }

    public final Throwable c() {
        return this.f7269c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC5504s.c(a(), fVar.a()) && AbstractC5504s.c(b(), fVar.b()) && AbstractC5504s.c(this.f7269c, fVar.f7269c);
    }

    public int hashCode() {
        Drawable drawableA = a();
        return ((((drawableA != null ? drawableA.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.f7269c.hashCode();
    }
}
