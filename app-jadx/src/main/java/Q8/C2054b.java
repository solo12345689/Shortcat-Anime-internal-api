package Q8;

import P8.a;
import R8.AbstractC2113n;

/* JADX INFO: renamed from: Q8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2054b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P8.a f14453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.d f14454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f14455d;

    private C2054b(P8.a aVar, a.d dVar, String str) {
        this.f14453b = aVar;
        this.f14454c = dVar;
        this.f14455d = str;
        this.f14452a = AbstractC2113n.b(aVar, dVar, str);
    }

    public static C2054b a(P8.a aVar, a.d dVar, String str) {
        return new C2054b(aVar, dVar, str);
    }

    public final String b() {
        return this.f14453b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2054b)) {
            return false;
        }
        C2054b c2054b = (C2054b) obj;
        return AbstractC2113n.a(this.f14453b, c2054b.f14453b) && AbstractC2113n.a(this.f14454c, c2054b.f14454c) && AbstractC2113n.a(this.f14455d, c2054b.f14455d);
    }

    public final int hashCode() {
        return this.f14452a;
    }
}
