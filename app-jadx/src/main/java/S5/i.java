package s5;

import android.net.Uri;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements InterfaceC6433d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f59247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f59248b;

    public i(String str) {
        this(str, false);
    }

    @Override // s5.InterfaceC6433d
    public String a() {
        return this.f59247a;
    }

    @Override // s5.InterfaceC6433d
    public boolean b(Uri uri) {
        return this.f59247a.contains(uri.toString());
    }

    @Override // s5.InterfaceC6433d
    public boolean c() {
        return this.f59248b;
    }

    @Override // s5.InterfaceC6433d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f59247a.equals(((i) obj).f59247a);
        }
        return false;
    }

    @Override // s5.InterfaceC6433d
    public int hashCode() {
        return this.f59247a.hashCode();
    }

    public String toString() {
        return this.f59247a;
    }

    public i(String str, boolean z10) {
        this.f59247a = (String) k.g(str);
        this.f59248b = z10;
    }
}
