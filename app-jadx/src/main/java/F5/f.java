package f5;

import S4.l;
import U4.v;
import android.content.Context;
import android.graphics.Bitmap;
import b5.C3005g;
import java.security.MessageDigest;
import o5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f46876b;

    public f(l lVar) {
        this.f46876b = (l) k.e(lVar);
    }

    @Override // S4.l
    public v a(Context context, v vVar, int i10, int i11) {
        C4776c c4776c = (C4776c) vVar.get();
        v c3005g = new C3005g(c4776c.e(), com.bumptech.glide.b.d(context).g());
        v vVarA = this.f46876b.a(context, c3005g, i10, i11);
        if (!c3005g.equals(vVarA)) {
            c3005g.recycle();
        }
        c4776c.m(this.f46876b, (Bitmap) vVarA.get());
        return vVar;
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        this.f46876b.b(messageDigest);
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f46876b.equals(((f) obj).f46876b);
        }
        return false;
    }

    @Override // S4.f
    public int hashCode() {
        return this.f46876b.hashCode();
    }
}
