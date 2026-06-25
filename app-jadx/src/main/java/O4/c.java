package O4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f12991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f12992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f12993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12995e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, c.this.f12992b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f12991a;
        byte[] bArr = this.f12993c;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f12994d = 0;
        this.f12995e = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f12991a) {
            try {
                if (this.f12993c != null) {
                    this.f12993c = null;
                    this.f12991a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean g() {
        return this.f12995e == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String h() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f12991a
            monitor-enter(r0)
            byte[] r1 = r7.f12993c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f12994d     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f12995e     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.b()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f12994d     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f12995e     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f12993c     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f12994d     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f12992b     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f12994d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            O4.c$a r1 = new O4.c$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f12995e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f12994d     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f12993c     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f12994d     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f12995e     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f12995e = r2     // Catch: java.lang.Throwable -> L11
            r7.b()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f12994d     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f12995e     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f12993c     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f12994d     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f12994d = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.h():java.lang.String");
    }

    c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(d.f12997a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f12991a = inputStream;
        this.f12992b = charset;
        this.f12993c = new byte[i10];
    }
}
