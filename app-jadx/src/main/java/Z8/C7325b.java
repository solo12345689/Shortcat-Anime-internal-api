package z8;

import r8.AbstractC6283i;
import r8.AbstractC6289o;

/* JADX INFO: renamed from: z8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C7325b extends AbstractC7334k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f65990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6289o f65991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6283i f65992c;

    C7325b(long j10, AbstractC6289o abstractC6289o, AbstractC6283i abstractC6283i) {
        this.f65990a = j10;
        if (abstractC6289o == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f65991b = abstractC6289o;
        if (abstractC6283i == null) {
            throw new NullPointerException("Null event");
        }
        this.f65992c = abstractC6283i;
    }

    @Override // z8.AbstractC7334k
    public AbstractC6283i b() {
        return this.f65992c;
    }

    @Override // z8.AbstractC7334k
    public long c() {
        return this.f65990a;
    }

    @Override // z8.AbstractC7334k
    public AbstractC6289o d() {
        return this.f65991b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7334k) {
            AbstractC7334k abstractC7334k = (AbstractC7334k) obj;
            if (this.f65990a == abstractC7334k.c() && this.f65991b.equals(abstractC7334k.d()) && this.f65992c.equals(abstractC7334k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f65990a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f65991b.hashCode()) * 1000003) ^ this.f65992c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f65990a + ", transportContext=" + this.f65991b + ", event=" + this.f65992c + "}";
    }
}
