package Td;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f17478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f17479c;

    public y(Object obj, Object obj2, Object obj3) {
        this.f17477a = obj;
        this.f17478b = obj2;
        this.f17479c = obj3;
    }

    public final Object a() {
        return this.f17477a;
    }

    public final Object b() {
        return this.f17478b;
    }

    public final Object c() {
        return this.f17479c;
    }

    public final Object d() {
        return this.f17477a;
    }

    public final Object e() {
        return this.f17478b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return AbstractC5504s.c(this.f17477a, yVar.f17477a) && AbstractC5504s.c(this.f17478b, yVar.f17478b) && AbstractC5504s.c(this.f17479c, yVar.f17479c);
    }

    public final Object f() {
        return this.f17479c;
    }

    public int hashCode() {
        Object obj = this.f17477a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f17478b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f17479c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f17477a + ", " + this.f17478b + ", " + this.f17479c + ')';
    }
}
