package b5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: renamed from: b5.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3017t implements S4.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S4.l f33201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33202c;

    public C3017t(S4.l lVar, boolean z10) {
        this.f33201b = lVar;
        this.f33202c = z10;
    }

    private U4.v d(Context context, U4.v vVar) {
        return T.c(context.getResources(), vVar);
    }

    @Override // S4.l
    public U4.v a(Context context, U4.v vVar, int i10, int i11) {
        V4.d dVarG = com.bumptech.glide.b.d(context).g();
        Drawable drawable = (Drawable) vVar.get();
        U4.v vVarA = AbstractC3016s.a(dVarG, drawable, i10, i11);
        if (vVarA != null) {
            U4.v vVarA2 = this.f33201b.a(context, vVarA, i10, i11);
            if (!vVarA2.equals(vVarA)) {
                return d(context, vVarA2);
            }
            vVarA2.recycle();
            return vVar;
        }
        if (!this.f33202c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        this.f33201b.b(messageDigest);
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (obj instanceof C3017t) {
            return this.f33201b.equals(((C3017t) obj).f33201b);
        }
        return false;
    }

    @Override // S4.f
    public int hashCode() {
        return this.f33201b.hashCode();
    }

    public S4.l c() {
        return this;
    }
}
