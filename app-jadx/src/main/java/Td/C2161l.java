package Td;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Td.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2161l implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17453e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2161l f17454f = C2162m.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17458d;

    /* JADX INFO: renamed from: Td.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2161l(int i10, int i11, int i12) {
        this.f17455a = i10;
        this.f17456b = i11;
        this.f17457c = i12;
        this.f17458d = b(i10, i11, i12);
    }

    private final int b(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + com.amazon.a.a.o.c.a.b.f34706a + i11 + com.amazon.a.a.o.c.a.b.f34706a + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2161l other) {
        AbstractC5504s.h(other, "other");
        return this.f17458d - other.f17458d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C2161l c2161l = obj instanceof C2161l ? (C2161l) obj : null;
        return c2161l != null && this.f17458d == c2161l.f17458d;
    }

    public int hashCode() {
        return this.f17458d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17455a);
        sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
        sb2.append(this.f17456b);
        sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
        sb2.append(this.f17457c);
        return sb2.toString();
    }

    public C2161l(int i10, int i11) {
        this(i10, i11, 0);
    }
}
