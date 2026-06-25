package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.b;
import com.facebook.imageutils.TiffUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static SimpleDateFormat f29648T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static SimpleDateFormat f29649U;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final d[] f29653Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final d[] f29654Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final d[] f29655a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final d[] f29656b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final d[] f29657c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final d f29658d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final d[] f29659e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final d[] f29660f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final d[] f29661g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final d[] f29662h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final d[][] f29663i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final d[] f29664j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final HashMap[] f29665k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f29666l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashSet f29667m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashMap f29668n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final Charset f29669o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final byte[] f29670p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final byte[] f29671q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f29672r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f29673s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f29674t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f29676u0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f29683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f29684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap[] f29687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f29688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f29689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f29690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f29695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f29697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f29698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f29699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f29700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f29701t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f29675u = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List f29677v = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f29678w = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f29679x = {8, 8, 8};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f29680y = {4};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f29681z = {8};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final byte[] f29629A = {-1, -40, -1};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final byte[] f29630B = {102, 116, 121, 112};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final byte[] f29631C = {109, 105, 102, 49};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final byte[] f29632D = {104, 101, 105, 99};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final byte[] f29633E = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final byte[] f29634F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final byte[] f29635G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final byte[] f29636H = {101, 88, 73, 102};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final byte[] f29637I = {73, 72, 68, 82};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final byte[] f29638J = {73, 69, 78, 68};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final byte[] f29639K = {82, 73, 70, 70};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final byte[] f29640L = {87, 69, 66, 80};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final byte[] f29641M = {69, 88, 73, 70};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final byte[] f29642N = {-99, 1, 42};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final byte[] f29643O = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final byte[] f29644P = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final byte[] f29645Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final byte[] f29646R = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final byte[] f29647S = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    static final String[] f29650V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    static final int[] f29651W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    static final byte[] f29652X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ByteOrder f29705e = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ByteOrder f29706f = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DataInputStream f29707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteOrder f29708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f29710d;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f29709c;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f29707a.available();
        }

        public long b() {
            return ((long) readInt()) & 4294967295L;
        }

        public void g(ByteOrder byteOrder) {
            this.f29708b = byteOrder;
        }

        public void h(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f29707a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f29710d == null) {
                        this.f29710d = new byte[8192];
                    }
                    iSkip = this.f29707a.read(this.f29710d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f29709c += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f29709c++;
            return this.f29707a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f29709c++;
            return this.f29707a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f29709c++;
            int i10 = this.f29707a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f29709c += 2;
            return this.f29707a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f29709c += i11;
            this.f29707a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f29709c += 4;
            int i10 = this.f29707a.read();
            int i11 = this.f29707a.read();
            int i12 = this.f29707a.read();
            int i13 = this.f29707a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f29708b;
            if (byteOrder == f29705e) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == f29706f) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f29708b);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f29709c += 8;
            int i10 = this.f29707a.read();
            int i11 = this.f29707a.read();
            int i12 = this.f29707a.read();
            int i13 = this.f29707a.read();
            int i14 = this.f29707a.read();
            int i15 = this.f29707a.read();
            int i16 = this.f29707a.read();
            int i17 = this.f29707a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f29708b;
            if (byteOrder == f29705e) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == f29706f) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f29708b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f29709c += 2;
            int i10 = this.f29707a.read();
            int i11 = this.f29707a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f29708b;
            if (byteOrder == f29705e) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == f29706f) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f29708b);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f29709c += 2;
            return this.f29707a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f29709c++;
            return this.f29707a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f29709c += 2;
            int i10 = this.f29707a.read();
            int i11 = this.f29707a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f29708b;
            if (byteOrder == f29705e) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == f29706f) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f29708b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f29708b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f29707a = dataInputStream;
            dataInputStream.mark(0);
            this.f29709c = 0;
            this.f29708b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f29707a.read(bArr, i10, i11);
            this.f29709c += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f29709c += bArr.length;
            this.f29707a.readFully(bArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f29713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f29714d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f29669o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f29651W[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f29651W[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f29719a);
                byteBufferWrap.putInt((int) eVar.f29720b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f29651W[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double h(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                if (((long[]) objK).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                if (((int[]) objK).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objK;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f34694a);
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f34694a);
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(com.amazon.a.a.o.b.f.f34694a);
                    }
                }
                return sb2.toString();
            }
            if (!(objK instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objK;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f29719a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f29720b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(com.amazon.a.a.o.b.f.f34694a);
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:18:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:114:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object k(java.nio.ByteOrder r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.f29650V[this.f29711a] + ", data length:" + this.f29714d.length + ")";
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f29711a = i10;
            this.f29712b = i11;
            this.f29713c = j10;
            this.f29714d = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f29719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f29720b;

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f29719a = 0L;
                this.f29720b = 1L;
            } else {
                this.f29719a = j10;
                this.f29720b = j11;
            }
        }

        public double a() {
            return this.f29719a / this.f29720b;
        }

        public String toString() {
            return this.f29719a + "/" + this.f29720b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD, 1)};
        f29653Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f29654Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f29655a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f29656b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", TiffUtil.TIFF_TAG_ORIENTATION, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f29657c0 = dVarArr5;
        f29658d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f29659e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f29660f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f29661g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f29662h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f29663i0 = dVarArr10;
        f29664j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f29665k0 = new HashMap[dVarArr10.length];
        f29666l0 = new HashMap[dVarArr10.length];
        f29667m0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f29668n0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f29669o0 = charsetForName;
        f29670p0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f29671q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f29648T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f29649U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f29663i0;
            if (i10 >= dVarArr11.length) {
                HashMap map = f29668n0;
                d[] dVarArr12 = f29664j0;
                map.put(Integer.valueOf(dVarArr12[0].f29715a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f29715a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f29715a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f29715a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f29715a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f29715a), 8);
                f29672r0 = Pattern.compile(".*[1-9].*");
                f29673s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f29674t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f29676u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f29665k0[i10] = new HashMap();
            f29666l0[i10] = new HashMap();
            for (d dVar : dVarArr11[i10]) {
                f29665k0[i10].put(Integer.valueOf(dVar.f29715a), dVar);
                f29666l0[i10].put(dVar.f29716b, dVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    private boolean A(HashMap map) {
        c cVar;
        int i10;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f29689h);
            int[] iArr2 = f29679x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f29685d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f29689h)) == 1 && Arrays.equals(iArr, f29681z)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f29675u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean B(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f29689h) <= 512 && cVar2.i(this.f29689h) <= 512;
    }

    private boolean C(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f29639K;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f29640L;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f29639K.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:48:0x009b, B:50:0x009f), top: B:61:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void D(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lba
            r0 = 0
            r1 = r0
        L4:
            androidx.exifinterface.media.a$d[][] r2 = androidx.exifinterface.media.a.f29663i0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap[] r2 = r4.f29687f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Laf
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f29686e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.g(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f29685d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f29685d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = M(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            androidx.exifinterface.media.a$f r0 = new androidx.exifinterface.media.a$f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f29686e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.n(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f29685d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.e(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.h(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.m(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.k(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f29697p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.L(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f29685d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.f(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.o(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = androidx.exifinterface.media.a.f29675u
            if (r5 == 0) goto Lae
            r4.F()
            return
        L9b:
            boolean r0 = androidx.exifinterface.media.a.f29675u     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lae
            r4.F()
        Lae:
            return
        Laf:
            r4.a()
            boolean r0 = androidx.exifinterface.media.a.f29675u
            if (r0 == 0) goto Lb9
            r4.F()
        Lb9:
            throw r5
        Lba:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.D(java.io.InputStream):void");
    }

    private void E(b bVar) throws IOException {
        ByteOrder byteOrderG = G(bVar);
        this.f29689h = byteOrderG;
        bVar.g(byteOrderG);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f29685d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.h(i12);
        }
    }

    private void F() {
        for (int i10 = 0; i10 < this.f29687f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f29687f[i10].size());
            for (Map.Entry entry : this.f29687f[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.f29689h) + "'");
            }
        }
    }

    private ByteOrder G(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f29675u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f29675u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void H(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        E(fVar);
        I(fVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I(androidx.exifinterface.media.a.f r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.I(androidx.exifinterface.media.a$f, int):void");
    }

    private void J(int i10, String str, String str2) {
        if (this.f29687f[i10].isEmpty() || this.f29687f[i10].get(str) == null) {
            return;
        }
        HashMap map = this.f29687f[i10];
        map.put(str2, map.get(str));
        this.f29687f[i10].remove(str);
    }

    private void K(f fVar, int i10) throws Throwable {
        c cVar = (c) this.f29687f[i10].get("ImageLength");
        c cVar2 = (c) this.f29687f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f29687f[i10].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f29687f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i11 = cVar3.i(this.f29689h);
            int i12 = cVar3.i(this.f29689h);
            fVar.j(i11);
            byte[] bArr = new byte[i12];
            fVar.read(bArr);
            f(new b(bArr), i11, i10);
        }
    }

    private void L(b bVar) throws Throwable {
        HashMap map = this.f29687f[4];
        c cVar = (c) map.get("Compression");
        if (cVar == null) {
            this.f29696o = 6;
            p(bVar, map);
            return;
        }
        int i10 = cVar.i(this.f29689h);
        this.f29696o = i10;
        if (i10 != 1) {
            if (i10 == 6) {
                p(bVar, map);
                return;
            } else if (i10 != 7) {
                return;
            }
        }
        if (A(map)) {
            q(bVar, map);
        }
    }

    private static boolean M(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void N(int i10, int i11) throws Throwable {
        if (this.f29687f[i10].isEmpty() || this.f29687f[i11].isEmpty()) {
            if (f29675u) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f29687f[i10].get("ImageLength");
        c cVar2 = (c) this.f29687f[i10].get("ImageWidth");
        c cVar3 = (c) this.f29687f[i11].get("ImageLength");
        c cVar4 = (c) this.f29687f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f29675u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f29675u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i12 = cVar.i(this.f29689h);
        int i13 = cVar2.i(this.f29689h);
        int i14 = cVar3.i(this.f29689h);
        int i15 = cVar4.i(this.f29689h);
        if (i12 >= i14 || i13 >= i15) {
            return;
        }
        HashMap[] mapArr = this.f29687f;
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private void O(f fVar, int i10) throws Throwable {
        c cVarF;
        c cVarF2;
        c cVar = (c) this.f29687f[i10].get("DefaultCropSize");
        c cVar2 = (c) this.f29687f[i10].get("SensorTopBorder");
        c cVar3 = (c) this.f29687f[i10].get("SensorLeftBorder");
        c cVar4 = (c) this.f29687f[i10].get("SensorBottomBorder");
        c cVar5 = (c) this.f29687f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                K(fVar, i10);
                return;
            }
            int i11 = cVar2.i(this.f29689h);
            int i12 = cVar4.i(this.f29689h);
            int i13 = cVar5.i(this.f29689h);
            int i14 = cVar3.i(this.f29689h);
            if (i12 <= i11 || i13 <= i14) {
                return;
            }
            c cVarF3 = c.f(i12 - i11, this.f29689h);
            c cVarF4 = c.f(i13 - i14, this.f29689h);
            this.f29687f[i10].put("ImageLength", cVarF3);
            this.f29687f[i10].put("ImageWidth", cVarF4);
            return;
        }
        if (cVar.f29711a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f29689h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarF = c.d(eVarArr[0], this.f29689h);
            cVarF2 = c.d(eVarArr[1], this.f29689h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f29689h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarF = c.f(iArr[0], this.f29689h);
            cVarF2 = c.f(iArr[1], this.f29689h);
        }
        this.f29687f[i10].put("ImageWidth", cVarF);
        this.f29687f[i10].put("ImageLength", cVarF2);
    }

    private void P() throws Throwable {
        N(0, 5);
        N(0, 4);
        N(5, 4);
        c cVar = (c) this.f29687f[1].get("PixelXDimension");
        c cVar2 = (c) this.f29687f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f29687f[0].put("ImageWidth", cVar);
            this.f29687f[0].put("ImageLength", cVar2);
        }
        if (this.f29687f[4].isEmpty() && B(this.f29687f[5])) {
            HashMap[] mapArr = this.f29687f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!B(this.f29687f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        J(0, "ThumbnailOrientation", "Orientation");
        J(0, "ThumbnailImageLength", "ImageLength");
        J(0, "ThumbnailImageWidth", "ImageWidth");
        J(5, "ThumbnailOrientation", "Orientation");
        J(5, "ThumbnailImageLength", "ImageLength");
        J(5, "ThumbnailImageWidth", "ImageWidth");
        J(4, "Orientation", "ThumbnailOrientation");
        J(4, "ImageLength", "ThumbnailImageLength");
        J(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.f29687f[0].put("DateTime", c.a(strB));
        }
        if (b("ImageWidth") == null) {
            this.f29687f[0].put("ImageWidth", c.b(0L, this.f29689h));
        }
        if (b("ImageLength") == null) {
            this.f29687f[0].put("ImageLength", c.b(0L, this.f29689h));
        }
        if (b("Orientation") == null) {
            this.f29687f[0].put("Orientation", c.b(0L, this.f29689h));
        }
        if (b("LightSource") == null) {
            this.f29687f[1].put("LightSource", c.b(0L, this.f29689h));
        }
    }

    private c d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f29675u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f29663i0.length; i10++) {
            c cVar = (c) this.f29687f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void e(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0508b.a(mediaMetadataRetriever, new C0507a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f29687f[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata), this.f29689h));
                }
                if (strExtractMetadata2 != null) {
                    this.f29687f[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata2), this.f29689h));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    this.f29687f[0].put("Orientation", c.f(i10 != 90 ? i10 != 180 ? i10 != 270 ? 1 : 8 : 3 : 6, this.f29689h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.j(i11);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, f29670p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    if (fVar.read(bArr2) != i14) {
                        throw new IOException("Can't read exif");
                    }
                    this.f29697p = i13;
                    H(bArr2, 0);
                }
                if (f29675u) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[FALL_THROUGH] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(androidx.exifinterface.media.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.f(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (u(bArr)) {
            return 4;
        }
        if (x(bArr)) {
            return 9;
        }
        if (t(bArr)) {
            return 12;
        }
        if (v(bArr)) {
            return 7;
        }
        if (y(bArr)) {
            return 10;
        }
        if (w(bArr)) {
            return 13;
        }
        return C(bArr) ? 14 : 0;
    }

    private void h(f fVar) throws Throwable {
        int i10;
        int i11;
        k(fVar);
        c cVar = (c) this.f29687f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f29714d);
            fVar2.g(this.f29689h);
            byte[] bArr = f29633E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.j(0L);
            byte[] bArr3 = f29634F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.j(12L);
            }
            I(fVar2, 6);
            c cVar2 = (c) this.f29687f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f29687f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f29687f[5].put("JPEGInterchangeFormat", cVar2);
                this.f29687f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f29687f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f29689h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarF = c.f(i14, this.f29689h);
                c cVarF2 = c.f(i15, this.f29689h);
                this.f29687f[0].put("ImageWidth", cVarF);
                this.f29687f[0].put("ImageLength", cVarF2);
            }
        }
    }

    private void i(b bVar) throws Throwable {
        if (f29675u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.g(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f29635G;
        bVar.h(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f29637I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f29638J)) {
                    return;
                }
                if (Arrays.equals(bArr2, f29636H)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f29697p = i11;
                        H(bArr3, 0);
                        P();
                        L(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.h(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) throws Throwable {
        boolean z10 = f29675u;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.h(i10 - bVar.a());
        bVar.read(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.h(i12 - bVar.a());
        bVar.g(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f29658d0.f29715a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarF = c.f(s10, this.f29689h);
                c cVarF2 = c.f(s11, this.f29689h);
                this.f29687f[0].put("ImageLength", cVarF);
                this.f29687f[0].put("ImageWidth", cVarF2);
                if (f29675u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.h(unsignedShort2);
        }
    }

    private void k(f fVar) throws Throwable {
        c cVar;
        E(fVar);
        I(fVar, 0);
        O(fVar, 0);
        O(fVar, 5);
        O(fVar, 4);
        P();
        if (this.f29685d != 8 || (cVar = (c) this.f29687f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f29714d);
        fVar2.g(this.f29689h);
        fVar2.h(6);
        I(fVar2, 9);
        c cVar2 = (c) this.f29687f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f29687f[1].put("ColorSpace", cVar2);
        }
    }

    private void m(f fVar) throws Throwable {
        if (f29675u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = (c) this.f29687f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f29714d), (int) cVar.f29713c, 5);
        }
        c cVar2 = (c) this.f29687f[0].get("ISO");
        c cVar3 = (c) this.f29687f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f29687f[1].put("PhotographicSensitivity", cVar2);
    }

    private void n(f fVar) throws IOException {
        byte[] bArr = f29670p0;
        fVar.h(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f29697p = bArr.length;
        H(bArr2, 0);
    }

    private void o(b bVar) throws Throwable {
        if (f29675u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.g(ByteOrder.LITTLE_ENDIAN);
        bVar.h(f29639K.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f29640L;
        bVar.h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f29641M, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f29697p = i12;
                        H(bArr3, 0);
                        L(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.h(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void p(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f29689h);
        int i11 = cVar2.i(this.f29689h);
        if (this.f29685d == 7) {
            i10 += this.f29698q;
        }
        if (i10 > 0 && i11 > 0) {
            this.f29690i = true;
            if (this.f29682a == null && this.f29684c == null && this.f29683b == null) {
                byte[] bArr = new byte[i11];
                bVar.skip(i10);
                bVar.read(bArr);
                this.f29695n = bArr;
            }
            this.f29693l = i10;
            this.f29694m = i11;
        }
        if (f29675u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + i11);
        }
    }

    private void q(b bVar, HashMap map) {
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrB = androidx.exifinterface.media.b.b(cVar.k(this.f29689h));
        long[] jArrB2 = androidx.exifinterface.media.b.b(cVar2.k(this.f29689h));
        if (jArrB == null || jArrB.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrB2 == null || jArrB2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrB.length != jArrB2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrB2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f29692k = true;
        this.f29691j = true;
        this.f29690i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jArrB.length; i13++) {
            int i14 = (int) jArrB[i13];
            int i15 = (int) jArrB2[i13];
            if (i13 < jArrB.length - 1 && i14 + i15 != jArrB[i13 + 1]) {
                this.f29692k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j12 = i16;
            if (bVar.skip(j12) != j12) {
                Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                return;
            }
            int i17 = i11 + i16;
            byte[] bArr2 = new byte[i15];
            if (bVar.read(bArr2) != i15) {
                Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                return;
            }
            i11 = i17 + i15;
            System.arraycopy(bArr2, 0, bArr, i12, i15);
            i12 += i15;
        }
        this.f29695n = bArr;
        if (this.f29692k) {
            this.f29693l = (int) jArrB[0];
            this.f29694m = i10;
        }
    }

    private static boolean r(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f29670p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f29670p0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean t(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.read(bArr2);
                    if (!Arrays.equals(bArr2, f29630B)) {
                        bVar2.close();
                        return false;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j10 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return false;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z10 = false;
                    boolean z11 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        if (bVar2.read(bArr3) != 4) {
                            bVar2.close();
                            return false;
                        }
                        if (j12 != 1) {
                            if (Arrays.equals(bArr3, f29631C)) {
                                z10 = true;
                            } else if (Arrays.equals(bArr3, f29632D)) {
                                z11 = true;
                            }
                            if (z10 && z11) {
                                bVar2.close();
                                return true;
                            }
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f29675u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        return false;
    }

    private static boolean u(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f29629A;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean v(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder byteOrderG = G(bVar);
            this.f29689h = byteOrderG;
            bVar.g(byteOrderG);
            short s10 = bVar.readShort();
            boolean z10 = s10 == 20306 || s10 == 21330;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean w(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f29635G;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean x(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean y(byte[] bArr) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder byteOrderG = G(bVar);
            this.f29689h = byteOrderG;
            bVar.g(byteOrderG);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean z(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f29675u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD != null) {
            if (!f29667m0.contains(str)) {
                return cVarD.j(this.f29689h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarD.f29711a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarD.f29711a);
                    return null;
                }
                e[] eVarArr = (e[]) cVarD.k(this.f29689h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f29719a / eVar.f29720b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f29719a / eVar2.f29720b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f29719a / eVar3.f29720b)));
            }
            try {
                return Double.toString(cVarD.h(this.f29689h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD != null) {
            try {
                return cVarD.i(this.f29689h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return SensibleDefaults.X_OFFSET;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public boolean s() {
        int iC = c("Orientation", 1);
        return iC == 2 || iC == 7 || iC == 4 || iC == 5;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f29707a.mark(Integer.MAX_VALUE);
        }

        public void j(long j10) throws IOException {
            int i10 = this.f29709c;
            if (i10 > j10) {
                this.f29709c = 0;
                this.f29707a.reset();
            } else {
                j10 -= (long) i10;
            }
            h((int) j10);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f29707a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.io.InputStream r4, int r5) {
        /*
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.a$d[][] r0 = androidx.exifinterface.media.a.f29663i0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f29687f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f29688g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f29689h = r0
            if (r4 == 0) goto L6a
            r0 = 0
            r3.f29682a = r0
            r1 = 1
            if (r5 != r1) goto L3c
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = androidx.exifinterface.media.a.f29670p0
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = r(r5)
            if (r4 != 0) goto L34
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L34:
            r3.f29686e = r1
            r3.f29684c = r0
            r3.f29683b = r0
            r4 = r5
            goto L66
        L3c:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L48
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f29684c = r5
            r3.f29683b = r0
            goto L66
        L48:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L62
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = z(r1)
            if (r1 == 0) goto L62
            r3.f29684c = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f29683b = r5
            goto L66
        L62:
            r3.f29684c = r0
            r3.f29683b = r0
        L66:
            r3.D(r4)
            return
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.<init>(java.io.InputStream, int):void");
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f29718d;

        d(String str, int i10, int i11) {
            this.f29716b = str;
            this.f29715a = i10;
            this.f29717c = i11;
            this.f29718d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f29717c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f29718d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f29716b = str;
            this.f29715a = i10;
            this.f29717c = i11;
            this.f29718d = i12;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0507a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f29702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f29703b;

        C0507a(f fVar) {
            this.f29703b = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f29702a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f29703b.available())) {
                        return -1;
                    }
                    this.f29703b.j(j10);
                    this.f29702a = j10;
                }
                if (i11 > this.f29703b.available()) {
                    i11 = this.f29703b.available();
                }
                int i12 = this.f29703b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f29702a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f29702a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
