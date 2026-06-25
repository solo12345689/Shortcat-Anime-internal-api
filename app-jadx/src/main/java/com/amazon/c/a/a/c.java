package com.amazon.c.a.a;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f34818a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34819b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34820c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34821d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34822e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34823f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f34824g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f34825h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f34826i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f34827j = 76;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f34830m = "US-ASCII";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f34833p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte f34831n = -5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte f34828k = 61;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte f34832o = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte f34829l = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte[] f34834q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f34831n, f34831n, -9, -9, f34831n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f34831n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, f34828k, -9, -9, -9, f34832o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f34829l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f34835r = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f34836s = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f34831n, f34831n, -9, -9, f34831n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f34831n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, f34828k, -9, -9, -9, f34832o, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, f34829l, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f34837t = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte[] f34838u = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f34831n, f34831n, -9, -9, f34831n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f34831n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, f34829l, -9, -9, -9, f34832o, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, f34828k, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f34839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f34840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f34841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f34842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f34843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f34844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f34845g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f34846h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f34847i;

        public a(InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10;
            if (this.f34840b < 0) {
                if (this.f34839a) {
                    byte[] bArr = new byte[3];
                    int i11 = 0;
                    for (int i12 = 0; i12 < 3; i12++) {
                        int i13 = ((FilterInputStream) this).in.read();
                        if (i13 < 0) {
                            break;
                        }
                        bArr[i12] = (byte) i13;
                        i11++;
                    }
                    if (i11 <= 0) {
                        return -1;
                    }
                    c.b(bArr, 0, i11, this.f34841c, 0, this.f34846h);
                    this.f34840b = 0;
                    this.f34843e = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i14 = 0;
                    while (i14 < 4) {
                        do {
                            i10 = ((FilterInputStream) this).in.read();
                            if (i10 < 0) {
                                break;
                            }
                        } while (this.f34847i[i10 & 127] <= -5);
                        if (i10 < 0) {
                            break;
                        }
                        bArr2[i14] = (byte) i10;
                        i14++;
                    }
                    if (i14 != 4) {
                        if (i14 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.f34843e = c.b(bArr2, 0, this.f34841c, 0, this.f34846h);
                    this.f34840b = 0;
                }
            }
            int i15 = this.f34840b;
            if (i15 < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            }
            if (i15 >= this.f34843e) {
                return -1;
            }
            if (this.f34839a && this.f34845g && this.f34844f >= c.f34827j) {
                this.f34844f = 0;
                return 10;
            }
            this.f34844f++;
            byte[] bArr3 = this.f34841c;
            int i16 = i15 + 1;
            this.f34840b = i16;
            byte b10 = bArr3[i15];
            if (i16 >= this.f34842d) {
                this.f34840b = -1;
            }
            return b10 & c.f34832o;
        }

        public a(InputStream inputStream, int i10) {
            super(inputStream);
            this.f34846h = i10;
            this.f34845g = (i10 & 8) > 0;
            boolean z10 = (i10 & 1) > 0;
            this.f34839a = z10;
            int i11 = z10 ? 4 : 3;
            this.f34842d = i11;
            this.f34841c = new byte[i11];
            this.f34840b = -1;
            this.f34844f = 0;
            this.f34847i = c.c(i10);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                int i13 = read();
                if (i13 >= 0) {
                    bArr[i10 + i12] = (byte) i13;
                    i12++;
                } else if (i12 == 0) {
                    return -1;
                }
            }
            return i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f34848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f34849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f34850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f34851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f34852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f34853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f34854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f34855h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f34856i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f34857j;

        public b(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public void a() throws IOException {
            int i10 = this.f34849b;
            if (i10 > 0) {
                if (!this.f34848a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(c.b(this.f34854g, this.f34850c, i10, this.f34856i));
                this.f34849b = 0;
            }
        }

        public void b() throws IOException {
            a();
            this.f34855h = true;
        }

        public void c() {
            this.f34855h = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a();
            super.close();
            this.f34850c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            if (this.f34855h) {
                ((FilterOutputStream) this).out.write(i10);
                return;
            }
            if (!this.f34848a) {
                byte b10 = this.f34857j[i10 & 127];
                if (b10 <= -5) {
                    if (b10 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.f34850c;
                int i11 = this.f34849b;
                int i12 = i11 + 1;
                this.f34849b = i12;
                bArr[i11] = (byte) i10;
                if (i12 >= this.f34851d) {
                    ((FilterOutputStream) this).out.write(this.f34854g, 0, c.b(bArr, 0, this.f34854g, 0, this.f34856i));
                    this.f34849b = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f34850c;
            int i13 = this.f34849b;
            int i14 = i13 + 1;
            this.f34849b = i14;
            bArr2[i13] = (byte) i10;
            int i15 = this.f34851d;
            if (i14 >= i15) {
                ((FilterOutputStream) this).out.write(c.b(this.f34854g, bArr2, i15, this.f34856i));
                int i16 = this.f34852e + 4;
                this.f34852e = i16;
                if (this.f34853f && i16 >= c.f34827j) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f34852e = 0;
                }
                this.f34849b = 0;
            }
        }

        public b(OutputStream outputStream, int i10) {
            super(outputStream);
            this.f34853f = (i10 & 8) != 0;
            boolean z10 = (i10 & 1) != 0;
            this.f34848a = z10;
            int i11 = z10 ? 3 : 4;
            this.f34851d = i11;
            this.f34850c = new byte[i11];
            this.f34849b = 0;
            this.f34852e = 0;
            this.f34855h = false;
            this.f34854g = new byte[4];
            this.f34856i = i10;
            this.f34857j = c.c(i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f34855h) {
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }

    private c() {
    }

    private static final byte[] b(int i10) {
        return (i10 & 16) == 16 ? f34835r : (i10 & 32) == 32 ? f34837t : f34833p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] c(int i10) {
        return (i10 & 16) == 16 ? f34836s : (i10 & 32) == 32 ? f34838u : f34834q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, byte[] bArr2, int i10, int i11) {
        b(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    public static byte[] c(byte[] bArr) {
        return c(bArr, 0, bArr.length, 0);
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            b(bArr2, bArr, iMin, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] bArrB = b(i13);
        int i14 = (i11 > 0 ? (bArr[i10] << 24) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0) | (i11 > 2 ? (bArr[i10 + 2] << 24) >>> 24 : 0);
        if (i11 == 1) {
            bArr2[i12] = bArrB[i14 >>> 18];
            bArr2[i12 + 1] = bArrB[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = f34828k;
            bArr2[i12 + 3] = f34828k;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = bArrB[i14 >>> 18];
            bArr2[i12 + 1] = bArrB[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = bArrB[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = f34828k;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = bArrB[i14 >>> 18];
        bArr2[i12 + 1] = bArrB[(i14 >>> 12) & 63];
        bArr2[i12 + 2] = bArrB[(i14 >>> 6) & 63];
        bArr2[i12 + 3] = bArrB[i14 & 63];
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i10, int i11, int i12) throws IOException {
        int i13;
        if (bArr != null) {
            if (i10 < 0 || (i13 = i10 + i11) > bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            if (i11 == 0) {
                return new byte[0];
            }
            if (i11 >= 4) {
                byte[] bArrC = c(i12);
                byte[] bArr2 = new byte[(i11 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i14 = 0;
                int iB = 0;
                while (i10 < i13) {
                    byte b10 = bArr[i10];
                    byte b11 = bArrC[b10 & f34832o];
                    if (b11 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i10] & f34832o), Integer.valueOf(i10)));
                    }
                    if (b11 >= -1) {
                        int i15 = i14 + 1;
                        bArr3[i14] = b10;
                        if (i15 > 3) {
                            iB += b(bArr3, 0, bArr2, iB, i12);
                            if (bArr[i10] == 61) {
                                break;
                            }
                            i14 = 0;
                        } else {
                            i14 = i15;
                        }
                    }
                    i10++;
                }
                byte[] bArr4 = new byte[iB];
                System.arraycopy(bArr2, 0, bArr4, 0, iB);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i11);
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    public static void a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            b(bArr2, bArr, iMin, 0);
            for (int i10 = 0; i10 < 4; i10++) {
                charBuffer.put((char) (bArr2[i10] & f34832o));
            }
        }
    }

    public static String a(Serializable serializable) {
        return a(serializable, 0);
    }

    public static byte[] b(byte[] bArr) {
        try {
            return b(bArr, 0, bArr.length, 0);
        } catch (IOException e10) {
            if (f34826i) {
                return null;
            }
            throw new AssertionError("IOExceptions only come from GZipping, which is turned off: " + e10.getMessage());
        }
    }

    public static String a(Serializable serializable, int i10) throws Throwable {
        OutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        ObjectOutputStream objectOutputStream;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream2 = null;
            objectOutputStream2 = null;
            objectOutputStream2 = null;
            objectOutputStream2 = null;
            objectOutputStream2 = null;
            objectOutputStream2 = null;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bVar = new b(byteArrayOutputStream, i10 | 1);
                    try {
                        if ((i10 & 2) != 0) {
                            gZIPOutputStream = new GZIPOutputStream(bVar);
                            try {
                                objectOutputStream2 = new ObjectOutputStream(gZIPOutputStream);
                                gZIPOutputStream = gZIPOutputStream;
                            } catch (IOException e10) {
                                e = e10;
                                objectOutputStream = objectOutputStream2;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                gZIPOutputStream = gZIPOutputStream;
                                try {
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ObjectOutputStream objectOutputStream3 = objectOutputStream;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    objectOutputStream2 = objectOutputStream3;
                                    try {
                                        objectOutputStream2.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        gZIPOutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        bVar.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream2.close();
                                gZIPOutputStream.close();
                                bVar.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream2 = new ObjectOutputStream(bVar);
                            gZIPOutputStream = null;
                        }
                        objectOutputStream2.writeObject(serializable);
                        try {
                            objectOutputStream2.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            bVar.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), f34830m);
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e11) {
                        e = e11;
                        ObjectOutputStream objectOutputStream4 = objectOutputStream2;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        objectOutputStream = objectOutputStream4;
                        gZIPOutputStream = objectOutputStream4;
                    } catch (Throwable th4) {
                        th = th4;
                        gZIPOutputStream = objectOutputStream2;
                    }
                } catch (IOException e12) {
                    e = e12;
                    gZIPOutputStream = null;
                    bVar = null;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    objectOutputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    gZIPOutputStream = null;
                    bVar = null;
                }
            } catch (IOException e13) {
                e = e13;
                gZIPOutputStream = null;
                objectOutputStream = null;
                bVar = null;
            } catch (Throwable th6) {
                th = th6;
                gZIPOutputStream = null;
                byteArrayOutputStream = null;
                bVar = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] b(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i10);
        }
        if (i11 >= 0) {
            if (i10 + i11 > bArr2.length) {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr2.length)));
            }
            if ((i12 & 2) != 0) {
                GZIPOutputStream gZIPOutputStream2 = null;
                gZIPOutputStream2 = null;
                gZIPOutputStream2 = null;
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bVar = new b(byteArrayOutputStream, i12 | 1);
                    } catch (IOException e10) {
                        e = e10;
                        bVar = null;
                        gZIPOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                    }
                } catch (IOException e11) {
                    e = e11;
                    bVar = null;
                    gZIPOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    bVar = null;
                }
                try {
                    gZIPOutputStream = new GZIPOutputStream(bVar);
                    try {
                        gZIPOutputStream.write(bArr2, i10, i11);
                        gZIPOutputStream.close();
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                        try {
                            bVar.close();
                        } catch (Exception unused2) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused3) {
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (IOException e12) {
                        e = e12;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            gZIPOutputStream2 = gZIPOutputStream;
                            try {
                                gZIPOutputStream2.close();
                            } catch (Exception unused4) {
                            }
                            try {
                                bVar.close();
                            } catch (Exception unused5) {
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused6) {
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        gZIPOutputStream2 = gZIPOutputStream;
                        gZIPOutputStream2.close();
                        bVar.close();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                    gZIPOutputStream = null;
                } catch (Throwable th6) {
                    th = th6;
                    gZIPOutputStream2.close();
                    bVar.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            } else {
                byte b10 = (i12 & 8) != 0;
                int i13 = ((i11 / 3) * 4) + (i11 % 3 > 0 ? 4 : 0);
                if (b10 != false) {
                    i13 += i13 / f34827j;
                }
                int i14 = i13;
                byte[] bArr3 = new byte[i14];
                int i15 = i11 - 2;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (i17 < i15) {
                    b(bArr2, i17 + i10, 3, bArr3, i16, i12);
                    i18 += 4;
                    if (b10 != false && i18 >= f34827j) {
                        bArr3[i16 + 4] = f34829l;
                        i16++;
                        i18 = 0;
                    }
                    i17 += 3;
                    i16 += 4;
                    bArr2 = bArr;
                }
                if (i17 < i11) {
                    b(bArr, i17 + i10, i11 - i17, bArr3, i16, i12);
                    i16 += 4;
                }
                if (i16 > i14 - 1) {
                    return bArr3;
                }
                byte[] bArr4 = new byte[i16];
                System.arraycopy(bArr3, 0, bArr4, 0, i16);
                return bArr4;
            }
        } else {
            throw new IllegalArgumentException("Cannot have length offset: " + i11);
        }
    }

    public static String c(String str) throws Throwable {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 1);
                int i10 = 0;
                while (true) {
                    try {
                        int i11 = aVar2.read(bArr, i10, 4096);
                        if (i11 < 0) {
                            break;
                        }
                        i10 += i11;
                    } catch (IOException e10) {
                        aVar = aVar2;
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVar2;
                        try {
                            aVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i10, f34830m);
                try {
                    aVar2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (IOException e11) {
                throw e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void c(String str, String str2) throws Throwable {
        byte[] bArrB = b(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(bArrB);
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e10) {
                    bufferedOutputStream = bufferedOutputStream2;
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e11) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(byte[] bArr) throws Throwable {
        String strA;
        try {
            strA = a(bArr, 0, bArr.length, 0);
        } catch (IOException e10) {
            if (!f34826i) {
                throw new AssertionError(e10.getMessage());
            }
            strA = null;
        }
        if (f34826i || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i10) {
        return a(bArr, 0, bArr.length, i10);
    }

    public static String a(byte[] bArr, int i10, int i11) throws Throwable {
        String strA;
        try {
            strA = a(bArr, i10, i11, 0);
        } catch (IOException e10) {
            if (!f34826i) {
                throw new AssertionError(e10.getMessage());
            }
            strA = null;
        }
        if (f34826i || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        byte[] bArrB = b(bArr, i10, i11, i12);
        try {
            return new String(bArrB, f34830m);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 != null) {
            if (i10 >= 0 && (i13 = i10 + 3) < bArr.length) {
                if (i11 >= 0 && (i14 = i11 + 2) < bArr2.length) {
                    byte[] bArrC = c(i12);
                    byte b10 = bArr[i10 + 2];
                    if (b10 == 61) {
                        bArr2[i11] = (byte) ((((bArrC[bArr[i10 + 1]] & f34832o) << 12) | ((bArrC[bArr[i10]] & f34832o) << 18)) >>> 16);
                        return 1;
                    }
                    byte b11 = bArr[i13];
                    if (b11 == 61) {
                        int i15 = ((bArrC[bArr[i10 + 1]] & f34832o) << 12) | ((bArrC[bArr[i10]] & f34832o) << 18) | ((bArrC[b10] & f34832o) << 6);
                        bArr2[i11] = (byte) (i15 >>> 16);
                        bArr2[i11 + 1] = (byte) (i15 >>> 8);
                        return 2;
                    }
                    int i16 = ((bArrC[bArr[i10 + 1]] & f34832o) << 12) | ((bArrC[bArr[i10]] & f34832o) << 18) | ((bArrC[b10] & f34832o) << 6) | (bArrC[b11] & f34832o);
                    bArr2[i11] = (byte) (i16 >> 16);
                    bArr2[i11 + 1] = (byte) (i16 >> 8);
                    bArr2[i14] = (byte) i16;
                    return 3;
                }
                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i11)));
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10)));
        }
        throw new NullPointerException("Destination array was null.");
    }

    public static byte[] a(String str) {
        return a(str, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:16|(6:72|17|83|18|81|19)|(3:(8:79|20|(1:22)(1:85)|71|76|29|63|30)|63|30)|27|28|71|76|29) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r5, int r6) throws java.lang.Throwable {
        /*
            if (r5 == 0) goto L8e
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L9
            goto Ld
        L9:
            byte[] r5 = r5.getBytes()
        Ld:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = c(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L1a
            r6 = r2
            goto L1b
        L1a:
            r6 = r1
        L1b:
            if (r5 == 0) goto L8d
            int r3 = r5.length
            if (r3 < r0) goto L8d
            if (r6 != 0) goto L8d
            r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L8d
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            r2.<init>()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L70
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L70
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L69
        L48:
            int r0 = r4.read(r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            if (r0 < 0) goto L58
            r2.write(r6, r1, r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            goto L48
        L52:
            r5 = move-exception
        L53:
            r0 = r2
            goto L83
        L55:
            r6 = move-exception
        L56:
            r0 = r2
            goto L7b
        L58:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r2.close()     // Catch: java.lang.Exception -> L5f
        L5f:
            r4.close()     // Catch: java.lang.Exception -> L62
        L62:
            r3.close()     // Catch: java.lang.Exception -> L8d
            goto L8d
        L66:
            r5 = move-exception
            r4 = r0
            goto L53
        L69:
            r6 = move-exception
            r4 = r0
            goto L56
        L6c:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L53
        L70:
            r6 = move-exception
            r3 = r0
            r4 = r3
            goto L56
        L74:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L83
        L78:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L7b:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L82
            r0.close()     // Catch: java.lang.Exception -> L5f
            goto L5f
        L82:
            r5 = move-exception
        L83:
            r0.close()     // Catch: java.lang.Exception -> L86
        L86:
            r4.close()     // Catch: java.lang.Exception -> L89
        L89:
            r3.close()     // Catch: java.lang.Exception -> L8c
        L8c:
            throw r5
        L8d:
            return r5
        L8e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.c.a.a.c.a(java.lang.String, int):byte[]");
    }

    public static byte[] b(String str) throws Throwable {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= 2147483647L) {
                    byte[] bArr = new byte[(int) file.length()];
                    a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i10 = 0;
                    while (true) {
                        try {
                            int i11 = aVar2.read(bArr, i10, 4096);
                            if (i11 < 0) {
                                break;
                            }
                            i10 += i11;
                        } catch (IOException e10) {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            try {
                                aVar.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    try {
                        aVar2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (IOException e11) {
                throw e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void a(byte[] bArr, String str) throws Throwable {
        if (bArr != null) {
            b bVar = null;
            try {
                try {
                    b bVar2 = new b(new FileOutputStream(str), 1);
                    try {
                        bVar2.write(bArr);
                        try {
                            bVar2.close();
                        } catch (Exception unused) {
                        }
                    } catch (IOException e10) {
                        bVar = bVar2;
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = bVar2;
                        try {
                            bVar.close();
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new NullPointerException("Data to encode was null.");
        }
    }

    public static void a(String str, String str2) throws Throwable {
        b bVar = null;
        try {
            try {
                b bVar2 = new b(new FileOutputStream(str2), 0);
                try {
                    bVar2.write(str.getBytes(f34830m));
                    try {
                        bVar2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e10) {
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    try {
                        bVar.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    public static void b(String str, String str2) throws Throwable {
        String strC = c(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(strC.getBytes(f34830m));
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e10) {
                    bufferedOutputStream = bufferedOutputStream2;
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e11) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
