package dg;

import Df.C1271d;
import fg.AbstractC4807e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.C6683h;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class F implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final a f45298a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: dg.F$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0714a extends F {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ x f45299b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ long f45300c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ InterfaceC6685j f45301d;

            C0714a(x xVar, long j10, InterfaceC6685j interfaceC6685j) {
                this.f45299b = xVar;
                this.f45300c = j10;
                this.f45301d = interfaceC6685j;
            }

            @Override // dg.F
            public long h() {
                return this.f45300c;
            }

            @Override // dg.F
            public x j() {
                return this.f45299b;
            }

            @Override // dg.F
            public InterfaceC6685j k() {
                return this.f45301d;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ F e(a aVar, InterfaceC6685j interfaceC6685j, x xVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return aVar.c(interfaceC6685j, xVar, j10);
        }

        public static /* synthetic */ F f(a aVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.d(bArr, xVar);
        }

        public final F a(x xVar, long j10, InterfaceC6685j content) {
            AbstractC5504s.h(content, "content");
            return c(content, xVar, j10);
        }

        public final F b(String str, x xVar) {
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
            C6683h c6683hH2 = new C6683h().h2(str, charset);
            return c(c6683hH2, xVar, c6683hH2.size());
        }

        public final F c(InterfaceC6685j interfaceC6685j, x xVar, long j10) {
            AbstractC5504s.h(interfaceC6685j, "<this>");
            return new C0714a(xVar, j10, interfaceC6685j);
        }

        public final F d(byte[] bArr, x xVar) {
            AbstractC5504s.h(bArr, "<this>");
            return c(new C6683h().write(bArr), xVar, bArr.length);
        }

        private a() {
        }
    }

    private final Charset g() {
        Charset charsetC;
        x xVarJ = j();
        return (xVarJ == null || (charsetC = xVarJ.c(C1271d.f3718b)) == null) ? C1271d.f3718b : charsetC;
    }

    public final InputStream a() {
        return k().L();
    }

    public final byte[] b() throws IOException {
        long jH = h();
        if (jH > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jH);
        }
        InterfaceC6685j interfaceC6685jK = k();
        try {
            byte[] bArrE1 = interfaceC6685jK.e1();
            fe.c.a(interfaceC6685jK, null);
            int length = bArrE1.length;
            if (jH == -1 || jH == length) {
                return bArrE1;
            }
            throw new IOException("Content-Length (" + jH + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC4807e.m(k());
    }

    public abstract long h();

    public abstract x j();

    public abstract InterfaceC6685j k();

    public final String l() throws IOException {
        InterfaceC6685j interfaceC6685jK = k();
        try {
            String strW1 = interfaceC6685jK.w1(AbstractC4807e.J(interfaceC6685jK, g()));
            fe.c.a(interfaceC6685jK, null);
            return strW1;
        } finally {
        }
    }
}
