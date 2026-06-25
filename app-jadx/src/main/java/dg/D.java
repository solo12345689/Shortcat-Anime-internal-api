package dg;

import Df.C1271d;
import fg.AbstractC4807e;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6686k;
import tg.InterfaceC6684i;
import tg.K;
import tg.Z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class D {

    /* JADX INFO: renamed from: a */
    public static final a f45262a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: dg.D$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0713a extends D {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ x f45263b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ File f45264c;

            C0713a(x xVar, File file) {
                this.f45263b = xVar;
                this.f45264c = file;
            }

            @Override // dg.D
            public long a() {
                return this.f45264c.length();
            }

            @Override // dg.D
            public x b() {
                return this.f45263b;
            }

            @Override // dg.D
            public void f(InterfaceC6684i sink) throws IOException {
                AbstractC5504s.h(sink, "sink");
                Z zJ = K.j(this.f45264c);
                try {
                    sink.O0(zJ);
                    fe.c.a(zJ, null);
                } finally {
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends D {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ x f45265b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C6686k f45266c;

            b(x xVar, C6686k c6686k) {
                this.f45265b = xVar;
                this.f45266c = c6686k;
            }

            @Override // dg.D
            public long a() {
                return this.f45266c.K();
            }

            @Override // dg.D
            public x b() {
                return this.f45265b;
            }

            @Override // dg.D
            public void f(InterfaceC6684i sink) {
                AbstractC5504s.h(sink, "sink");
                sink.A0(this.f45266c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends D {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ x f45267b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f45268c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ byte[] f45269d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ int f45270e;

            c(x xVar, int i10, byte[] bArr, int i11) {
                this.f45267b = xVar;
                this.f45268c = i10;
                this.f45269d = bArr;
                this.f45270e = i11;
            }

            @Override // dg.D
            public long a() {
                return this.f45268c;
            }

            @Override // dg.D
            public x b() {
                return this.f45267b;
            }

            @Override // dg.D
            public void f(InterfaceC6684i sink) {
                AbstractC5504s.h(sink, "sink");
                sink.write(this.f45269d, this.f45270e, this.f45268c);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ D i(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.c(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ D j(a aVar, String str, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.e(str, xVar);
        }

        public static /* synthetic */ D k(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.h(bArr, xVar, i10, i11);
        }

        public final D a(x xVar, String content) {
            AbstractC5504s.h(content, "content");
            return e(content, xVar);
        }

        public final D b(x xVar, C6686k content) {
            AbstractC5504s.h(content, "content");
            return f(content, xVar);
        }

        public final D c(x xVar, byte[] content, int i10, int i11) {
            AbstractC5504s.h(content, "content");
            return h(content, xVar, i10, i11);
        }

        public final D d(File file, x xVar) {
            AbstractC5504s.h(file, "<this>");
            return new C0713a(xVar, file);
        }

        public final D e(String str, x xVar) {
            AbstractC5504s.h(str, "<this>");
            Charset charset = C1271d.f3718b;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.f45605e.c(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = str.getBytes(charset);
            AbstractC5504s.g(bytes, "this as java.lang.String).getBytes(charset)");
            return h(bytes, xVar, 0, bytes.length);
        }

        public final D f(C6686k c6686k, x xVar) {
            AbstractC5504s.h(c6686k, "<this>");
            return new b(xVar, c6686k);
        }

        public final D g(byte[] bArr) {
            AbstractC5504s.h(bArr, "<this>");
            return k(this, bArr, null, 0, 0, 7, null);
        }

        public final D h(byte[] bArr, x xVar, int i10, int i11) {
            AbstractC5504s.h(bArr, "<this>");
            AbstractC4807e.l(bArr.length, i10, i11);
            return new c(xVar, i11, bArr, i10);
        }

        private a() {
        }
    }

    public static final D c(byte[] bArr) {
        return f45262a.g(bArr);
    }

    public abstract long a();

    public abstract x b();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(InterfaceC6684i interfaceC6684i);
}
