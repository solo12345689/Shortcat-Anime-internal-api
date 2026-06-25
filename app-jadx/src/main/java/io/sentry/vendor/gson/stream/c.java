package io.sentry.vendor.gson.stream;

import com.revenuecat.purchases.common.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f51518j = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f51519k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f51520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f51521b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51522c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f51527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f51528i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f51518j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f51518j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f51519k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        E(6);
        this.f51524e = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        this.f51528i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f51520a = writer;
    }

    private c C(int i10, char c10) throws IOException {
        b();
        E(i10);
        this.f51520a.write(c10);
        return this;
    }

    private int D() {
        int i10 = this.f51522c;
        if (i10 != 0) {
            return this.f51521b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void E(int i10) {
        int i11 = this.f51522c;
        int[] iArr = this.f51521b;
        if (i11 == iArr.length) {
            this.f51521b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f51521b;
        int i12 = this.f51522c;
        this.f51522c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void F0() throws IOException {
        if (this.f51527h != null) {
            a();
            O(this.f51527h);
            this.f51527h = null;
        }
    }

    private void H(int i10) {
        this.f51521b[this.f51522c - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void O(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f51526g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.f51519k
            goto L9
        L7:
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.f51518j
        L9:
            java.io.Writer r1 = r8.f51520a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f51520a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f51520a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f51520a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f51520a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.c.O(java.lang.String):void");
    }

    private void a() throws IOException {
        int iD = D();
        if (iD == 5) {
            this.f51520a.write(44);
        } else if (iD != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        w();
        H(4);
    }

    private void b() throws IOException {
        int iD = D();
        if (iD == 1) {
            H(2);
            w();
            return;
        }
        if (iD == 2) {
            this.f51520a.append(',');
            w();
        } else {
            if (iD == 4) {
                this.f51520a.append((CharSequence) this.f51524e);
                H(5);
                return;
            }
            if (iD != 6) {
                if (iD != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f51525f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            H(7);
        }
    }

    private c j(int i10, int i11, char c10) throws IOException {
        int iD = D();
        if (iD != i11 && iD != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f51527h != null) {
            throw new IllegalStateException("Dangling name: " + this.f51527h);
        }
        this.f51522c--;
        if (iD == i11) {
            w();
        }
        this.f51520a.write(c10);
        return this;
    }

    private void w() throws IOException {
        if (this.f51523d == null) {
            return;
        }
        this.f51520a.write(10);
        int i10 = this.f51522c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f51520a.write(this.f51523d);
        }
    }

    public c B0(boolean z10) throws IOException {
        F0();
        b();
        this.f51520a.write(z10 ? com.amazon.a.a.o.b.f34640af : com.amazon.a.a.o.b.f34641ag);
        return this;
    }

    public final void F(boolean z10) {
        this.f51525f = z10;
    }

    public final void J(String str) {
        if (str == null || str.length() == 0) {
            this.f51523d = null;
            this.f51524e = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        } else {
            this.f51523d = str;
            this.f51524e = ": ";
        }
    }

    public c S(double d10) throws IOException {
        F0();
        if (this.f51525f || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f51520a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c Y(long j10) throws IOException {
        F0();
        b();
        this.f51520a.write(Long.toString(j10));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51520a.close();
        int i10 = this.f51522c;
        if (i10 > 1 || (i10 == 1 && this.f51521b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f51522c = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f51522c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f51520a.flush();
    }

    public c g() throws IOException {
        F0();
        return C(1, '[');
    }

    public c h() throws IOException {
        F0();
        return C(3, '{');
    }

    public c h0(Boolean bool) throws IOException {
        if (bool == null) {
            return z();
        }
        F0();
        b();
        this.f51520a.write(bool.booleanValue() ? com.amazon.a.a.o.b.f34640af : com.amazon.a.a.o.b.f34641ag);
        return this;
    }

    public c k() {
        return j(1, 2, ']');
    }

    public c k0(Number number) throws IOException {
        if (number == null) {
            return z();
        }
        F0();
        String string = number.toString();
        if (this.f51525f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            b();
            this.f51520a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c l() {
        return j(3, 5, '}');
    }

    public String m() {
        return this.f51523d;
    }

    public c o(String str) throws IOException {
        if (str == null) {
            return z();
        }
        F0();
        b();
        this.f51520a.append((CharSequence) str);
        return this;
    }

    public c p0(String str) throws IOException {
        if (str == null) {
            return z();
        }
        F0();
        b();
        O(str);
        return this;
    }

    public c q(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f51527h != null) {
            throw new IllegalStateException();
        }
        if (this.f51522c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f51527h = str;
        return this;
    }

    public c z() throws IOException {
        if (this.f51527h != null) {
            if (!this.f51528i) {
                this.f51527h = null;
                return this;
            }
            F0();
        }
        b();
        this.f51520a.write("null");
        return this;
    }
}
