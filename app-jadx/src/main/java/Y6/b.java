package y6;

import Td.AbstractC2163n;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64832c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f64833d = AbstractC2163n.b(new InterfaceC5082a() { // from class: y6.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return b.e();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64835b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern d() {
            Object value = b.f64833d.getValue();
            AbstractC5504s.g(value, "getValue(...)");
            return (Pattern) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(int i10) {
            return i10 == Integer.MAX_VALUE ? "" : String.valueOf(i10);
        }

        public final b b(int i10) {
            k.b(Boolean.valueOf(i10 >= 0));
            return new b(i10, Integer.MAX_VALUE);
        }

        public final b c(String str) {
            if (str == null) {
                return null;
            }
            try {
                String[] strArrSplit = d().split(str);
                k.b(Boolean.valueOf(strArrSplit.length == 4));
                k.b(Boolean.valueOf(AbstractC5504s.c(strArrSplit[0], "bytes")));
                String str2 = strArrSplit[1];
                AbstractC5504s.g(str2, "get(...)");
                int i10 = Integer.parseInt(str2);
                String str3 = strArrSplit[2];
                AbstractC5504s.g(str3, "get(...)");
                int i11 = Integer.parseInt(str3);
                String str4 = strArrSplit[3];
                AbstractC5504s.g(str4, "get(...)");
                int i12 = Integer.parseInt(str4);
                k.b(Boolean.valueOf(i11 > i10));
                k.b(Boolean.valueOf(i12 > i11));
                return i11 < i12 - 1 ? new b(i10, i11) : new b(i10, Integer.MAX_VALUE);
            } catch (IllegalArgumentException e10) {
                U u10 = U.f52264a;
                String str5 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                AbstractC5504s.g(str5, "format(...)");
                throw new IllegalArgumentException(str5, e10);
            }
        }

        public final b e(int i10) {
            k.b(Boolean.valueOf(i10 > 0));
            return new b(0, i10);
        }

        private a() {
        }
    }

    public b(int i10, int i11) {
        this.f64834a = i10;
        this.f64835b = i11;
    }

    public static final b d(int i10) {
        return f64832c.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern e() {
        return Pattern.compile("[-/ ]");
    }

    public static final b g(int i10) {
        return f64832c.e(i10);
    }

    public final boolean c(b bVar) {
        return bVar != null && this.f64834a <= bVar.f64834a && bVar.f64835b <= this.f64835b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        b bVar = (b) obj;
        return this.f64834a == bVar.f64834a && this.f64835b == bVar.f64835b;
    }

    public final String f() {
        U u10 = U.f52264a;
        a aVar = f64832c;
        String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f64834a), aVar.f(this.f64835b)}, 2));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }

    public int hashCode() {
        return (this.f64834a * 31) + this.f64835b;
    }

    public String toString() {
        U u10 = U.f52264a;
        a aVar = f64832c;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f64834a), aVar.f(this.f64835b)}, 2));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }
}
