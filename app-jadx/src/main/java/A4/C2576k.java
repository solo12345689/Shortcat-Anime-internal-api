package a4;

import Df.r;
import Td.AbstractC2163n;
import ie.InterfaceC5082a;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2576k implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23792f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C2576k f23793g = new C2576k(0, 0, 0, "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C2576k f23794h = new C2576k(0, 1, 0, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C2576k f23795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C2576k f23796j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f23801e;

    /* JADX INFO: renamed from: a4.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2576k a() {
            return C2576k.f23794h;
        }

        public final C2576k b(String str) {
            String strGroup;
            if (str != null && !r.l0(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i10 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i11 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            int i12 = Integer.parseInt(strGroup3);
                            String description = matcher.group(4) != null ? matcher.group(4) : "";
                            AbstractC5504s.g(description, "description");
                            return new C2576k(i10, i11, i12, description, null);
                        }
                    }
                }
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a4.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(C2576k.this.h()).shiftLeft(32).or(BigInteger.valueOf(C2576k.this.k())).shiftLeft(32).or(BigInteger.valueOf(C2576k.this.m()));
        }
    }

    static {
        C2576k c2576k = new C2576k(1, 0, 0, "");
        f23795i = c2576k;
        f23796j = c2576k;
    }

    public /* synthetic */ C2576k(int i10, int i11, int i12, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str);
    }

    private final BigInteger c() {
        Object value = this.f23801e.getValue();
        AbstractC5504s.g(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2576k other) {
        AbstractC5504s.h(other, "other");
        return c().compareTo(other.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2576k)) {
            return false;
        }
        C2576k c2576k = (C2576k) obj;
        return this.f23797a == c2576k.f23797a && this.f23798b == c2576k.f23798b && this.f23799c == c2576k.f23799c;
    }

    public final int h() {
        return this.f23797a;
    }

    public int hashCode() {
        return ((((527 + this.f23797a) * 31) + this.f23798b) * 31) + this.f23799c;
    }

    public final int k() {
        return this.f23798b;
    }

    public final int m() {
        return this.f23799c;
    }

    public String toString() {
        String str;
        if (r.l0(this.f23800d)) {
            str = "";
        } else {
            str = '-' + this.f23800d;
        }
        return this.f23797a + com.amazon.a.a.o.c.a.b.f34706a + this.f23798b + com.amazon.a.a.o.c.a.b.f34706a + this.f23799c + str;
    }

    private C2576k(int i10, int i11, int i12, String str) {
        this.f23797a = i10;
        this.f23798b = i11;
        this.f23799c = i12;
        this.f23800d = str;
        this.f23801e = AbstractC2163n.b(new b());
    }
}
