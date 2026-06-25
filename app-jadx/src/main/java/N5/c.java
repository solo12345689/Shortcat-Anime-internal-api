package n5;

import S4.f;
import java.security.MessageDigest;
import o5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f53996b;

    public c(Object obj) {
        this.f53996b = k.e(obj);
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f53996b.toString().getBytes(f.f15942a));
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f53996b.equals(((c) obj).f53996b);
        }
        return false;
    }

    @Override // S4.f
    public int hashCode() {
        return this.f53996b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f53996b + '}';
    }
}
