package Xf;

import Tf.m;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f21903a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f21904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21905c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21906a = new a();

        private a() {
        }
    }

    public F() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f21904b = iArr;
        this.f21905c = -1;
    }

    private final void e() {
        int i10 = this.f21905c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f21903a, i10);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        this.f21903a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f21904b, i10);
        AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
        this.f21904b = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f21905c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f21903a[i11];
            if (obj instanceof Tf.e) {
                Tf.e eVar = (Tf.e) obj;
                if (!AbstractC5504s.c(eVar.h(), m.b.f17535a)) {
                    int i12 = this.f21904b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(eVar.l(i12));
                    }
                } else if (this.f21904b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f21904b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f21906a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public final void b() {
        int i10 = this.f21905c;
        int[] iArr = this.f21904b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f21905c = i10 - 1;
        }
        int i11 = this.f21905c;
        if (i11 != -1) {
            this.f21905c = i11 - 1;
        }
    }

    public final void c(Tf.e sd2) {
        AbstractC5504s.h(sd2, "sd");
        int i10 = this.f21905c + 1;
        this.f21905c = i10;
        if (i10 == this.f21903a.length) {
            e();
        }
        this.f21903a[i10] = sd2;
    }

    public final void d() {
        int[] iArr = this.f21904b;
        int i10 = this.f21905c;
        if (iArr[i10] == -2) {
            this.f21903a[i10] = a.f21906a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f21904b;
        int i10 = this.f21905c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f21905c = i11;
            if (i11 == this.f21903a.length) {
                e();
            }
        }
        Object[] objArr = this.f21903a;
        int i12 = this.f21905c;
        objArr[i12] = obj;
        this.f21904b[i12] = -2;
    }

    public final void g(int i10) {
        this.f21904b[this.f21905c] = i10;
    }

    public String toString() {
        return a();
    }
}
