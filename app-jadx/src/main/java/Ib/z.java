package Ib;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f9022a;

    public z(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        this.f9022a = uri;
    }

    @Override // Ib.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uri a() {
        return this.f9022a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && AbstractC5504s.c(this.f9022a, ((z) obj).f9022a);
    }

    public int hashCode() {
        return this.f9022a.hashCode();
    }

    public String toString() {
        return "UriModelProvider(uri=" + this.f9022a + ")";
    }
}
