package U;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J.a f17885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J.a f17886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J.a f17887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final J.a f17888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final J.a f17889e;

    public U(J.a aVar, J.a aVar2, J.a aVar3, J.a aVar4, J.a aVar5) {
        this.f17885a = aVar;
        this.f17886b = aVar2;
        this.f17887c = aVar3;
        this.f17888d = aVar4;
        this.f17889e = aVar5;
    }

    public final J.a a() {
        return this.f17889e;
    }

    public final J.a b() {
        return this.f17885a;
    }

    public final J.a c() {
        return this.f17888d;
    }

    public final J.a d() {
        return this.f17887c;
    }

    public final J.a e() {
        return this.f17886b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        return AbstractC5504s.c(this.f17885a, u10.f17885a) && AbstractC5504s.c(this.f17886b, u10.f17886b) && AbstractC5504s.c(this.f17887c, u10.f17887c) && AbstractC5504s.c(this.f17888d, u10.f17888d) && AbstractC5504s.c(this.f17889e, u10.f17889e);
    }

    public int hashCode() {
        return (((((((this.f17885a.hashCode() * 31) + this.f17886b.hashCode()) * 31) + this.f17887c.hashCode()) * 31) + this.f17888d.hashCode()) * 31) + this.f17889e.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.f17885a + ", small=" + this.f17886b + ", medium=" + this.f17887c + ", large=" + this.f17888d + ", extraLarge=" + this.f17889e + ')';
    }

    public /* synthetic */ U(J.a aVar, J.a aVar2, J.a aVar3, J.a aVar4, J.a aVar5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? T.f17879a.b() : aVar, (i10 & 2) != 0 ? T.f17879a.e() : aVar2, (i10 & 4) != 0 ? T.f17879a.d() : aVar3, (i10 & 8) != 0 ? T.f17879a.c() : aVar4, (i10 & 16) != 0 ? T.f17879a.a() : aVar5);
    }
}
