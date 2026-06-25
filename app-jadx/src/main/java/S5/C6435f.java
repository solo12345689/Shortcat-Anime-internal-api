package s5;

import android.net.Uri;
import java.util.List;
import y5.k;

/* JADX INFO: renamed from: s5.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6435f implements InterfaceC6433d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f59244a;

    public C6435f(List list) {
        this.f59244a = (List) k.g(list);
    }

    @Override // s5.InterfaceC6433d
    public String a() {
        return ((InterfaceC6433d) this.f59244a.get(0)).a();
    }

    @Override // s5.InterfaceC6433d
    public boolean b(Uri uri) {
        for (int i10 = 0; i10 < this.f59244a.size(); i10++) {
            if (((InterfaceC6433d) this.f59244a.get(i10)).b(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // s5.InterfaceC6433d
    public boolean c() {
        return false;
    }

    public List d() {
        return this.f59244a;
    }

    @Override // s5.InterfaceC6433d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6435f) {
            return this.f59244a.equals(((C6435f) obj).f59244a);
        }
        return false;
    }

    @Override // s5.InterfaceC6433d
    public int hashCode() {
        return this.f59244a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f59244a.toString();
    }
}
