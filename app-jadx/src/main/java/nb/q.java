package nb;

import Td.z;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54103c;

    public q(String base64Image, int i10, int i11) {
        AbstractC5504s.h(base64Image, "base64Image");
        this.f54101a = base64Image;
        this.f54102b = i10;
        this.f54103c = i11;
    }

    public final Bundle a() {
        return G1.c.a(z.a("data", this.f54101a), z.a("size", G1.c.a(z.a("width", Integer.valueOf(this.f54102b)), z.a("height", Integer.valueOf(this.f54103c)))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return AbstractC5504s.c(this.f54101a, qVar.f54101a) && this.f54102b == qVar.f54102b && this.f54103c == qVar.f54103c;
    }

    public int hashCode() {
        return (((this.f54101a.hashCode() * 31) + Integer.hashCode(this.f54102b)) * 31) + Integer.hashCode(this.f54103c);
    }

    public String toString() {
        return "ImageResult(base64Image=" + this.f54101a + ", width=" + this.f54102b + ", height=" + this.f54103c + ")";
    }
}
