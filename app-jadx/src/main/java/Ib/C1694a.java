package Ib;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Ib.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1694a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f8878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8880c;

    public C1694a(Uri uri, int i10, int i11) {
        AbstractC5504s.h(uri, "uri");
        this.f8878a = uri;
        this.f8879b = i10;
        this.f8880c = i11;
    }

    @Override // Ib.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Jb.f a() {
        return new Jb.f(this.f8878a, this.f8879b, this.f8880c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694a)) {
            return false;
        }
        C1694a c1694a = (C1694a) obj;
        return AbstractC5504s.c(this.f8878a, c1694a.f8878a) && this.f8879b == c1694a.f8879b && this.f8880c == c1694a.f8880c;
    }

    public int hashCode() {
        return (((this.f8878a.hashCode() * 31) + Integer.hashCode(this.f8879b)) * 31) + Integer.hashCode(this.f8880c);
    }

    public String toString() {
        return "BlurhashModelProvider(uri=" + this.f8878a + ", width=" + this.f8879b + ", height=" + this.f8880c + ")";
    }
}
