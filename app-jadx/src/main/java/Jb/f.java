package Jb;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f9485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9487c;

    public f(Uri uri, int i10, int i11) {
        AbstractC5504s.h(uri, "uri");
        this.f9485a = uri;
        this.f9486b = i10;
        this.f9487c = i11;
    }

    public final int a() {
        return this.f9487c;
    }

    public final Uri b() {
        return this.f9485a;
    }

    public final int c() {
        return this.f9486b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC5504s.c(this.f9485a, fVar.f9485a) && this.f9486b == fVar.f9486b && this.f9487c == fVar.f9487c;
    }

    public int hashCode() {
        return (((this.f9485a.hashCode() * 31) + Integer.hashCode(this.f9486b)) * 31) + Integer.hashCode(this.f9487c);
    }

    public String toString() {
        return "BlurhashModel(uri=" + this.f9485a + ", width=" + this.f9486b + ", height=" + this.f9487c + ")";
    }
}
