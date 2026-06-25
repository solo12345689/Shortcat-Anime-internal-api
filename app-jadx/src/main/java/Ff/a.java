package Ff;

import Df.r;
import Td.F;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0089a f6658c = new C0089a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f6659d = new a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6661b;

    /* JADX INFO: renamed from: Ff.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0089a {
        public /* synthetic */ C0089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new a(j10, j11, null);
        }

        public final a b() {
            return a.f6659d;
        }

        public final a c(String uuidString) {
            AbstractC5504s.h(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return b.b(uuidString);
            }
            if (length == 36) {
                return b.c(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + c.g(uuidString, 64) + "\" of length " + uuidString.length());
        }

        private C0089a() {
        }
    }

    public /* synthetic */ a(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        AbstractC5504s.h(other, "other");
        long j10 = this.f6660a;
        return j10 != other.f6660a ? Long.compare(F.b(j10) ^ Long.MIN_VALUE, F.b(other.f6660a) ^ Long.MIN_VALUE) : Long.compare(F.b(this.f6661b) ^ Long.MIN_VALUE, F.b(other.f6661b) ^ Long.MIN_VALUE);
    }

    public final String c() {
        byte[] bArr = new byte[36];
        b.a(this.f6660a, bArr, 0, 0, 4);
        bArr[8] = 45;
        b.a(this.f6660a, bArr, 9, 4, 6);
        bArr[13] = 45;
        b.a(this.f6660a, bArr, 14, 6, 8);
        bArr[18] = 45;
        b.a(this.f6661b, bArr, 19, 0, 2);
        bArr[23] = 45;
        b.a(this.f6661b, bArr, 24, 2, 8);
        return r.x(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6660a == aVar.f6660a && this.f6661b == aVar.f6661b;
    }

    public int hashCode() {
        return Long.hashCode(this.f6660a ^ this.f6661b);
    }

    public String toString() {
        return c();
    }

    private a(long j10, long j11) {
        this.f6660a = j10;
        this.f6661b = j11;
    }
}
