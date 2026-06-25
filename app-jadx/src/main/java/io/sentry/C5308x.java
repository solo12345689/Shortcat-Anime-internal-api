package io.sentry;

import com.adjust.sdk.Constants;
import java.io.StringReader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5308x implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f51547b = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5197f0 f51548a;

    public C5308x(InterfaceC5197f0 interfaceC5197f0) {
        this.f51548a = interfaceC5197f0;
    }

    private C5269r2 b(byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, f51547b));
        try {
            C5269r2 c5269r2 = (C5269r2) this.f51548a.c(stringReader, C5269r2.class);
            stringReader.close();
            return c5269r2;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private U2 c(byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, f51547b));
        try {
            U2 u22 = (U2) this.f51548a.c(stringReader, U2.class);
            stringReader.close();
            return u22;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        r11 = new io.sentry.C5265q2(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        return r11;
     */
    @Override // io.sentry.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.C5265q2 a(java.io.InputStream r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5308x.a(java.io.InputStream):io.sentry.q2");
    }
}
