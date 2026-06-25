package Ib;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f9017a;

    public w(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        this.f9017a = uri;
    }

    @Override // Ib.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Qb.e a() {
        return new Qb.e(this.f9017a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && AbstractC5504s.c(this.f9017a, ((w) obj).f9017a);
    }

    public int hashCode() {
        return this.f9017a.hashCode();
    }

    public String toString() {
        return "ThumbhashModelProvider(uri=" + this.f9017a + ")";
    }
}
