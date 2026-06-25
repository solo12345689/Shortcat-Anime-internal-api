package Qb;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f14798a;

    public e(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        this.f14798a = uri;
    }

    public final Uri a() {
        return this.f14798a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC5504s.c(this.f14798a, ((e) obj).f14798a);
    }

    public int hashCode() {
        return this.f14798a.hashCode();
    }

    public String toString() {
        return "ThumbhashModel(uri=" + this.f14798a + ")";
    }
}
