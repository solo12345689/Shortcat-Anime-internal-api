package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Closeable, Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f50588m = new byte[4096];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RandomAccessFile f50589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final File f50590b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f50592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f50593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b f50594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f50595g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f50598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f50599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f50600l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f50591c = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f50596h = new byte[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f50597i = 0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f50601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f50602b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f50603c = -1;

        public a(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.f50601a = file;
        }

        public d a() throws IOException {
            RandomAccessFile randomAccessFileB0 = d.B0(this.f50601a);
            try {
                return new d(this.f50601a, randomAccessFileB0, this.f50602b, this.f50603c);
            } catch (Throwable th2) {
                randomAccessFileB0.close();
                throw th2;
            }
        }

        public a b(int i10) {
            this.f50603c = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f50604c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f50605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f50606b;

        b(long j10, int i10) {
            this.f50605a = j10;
            this.f50606b = i10;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position=" + this.f50605a + ", length=" + this.f50606b + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f50607a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f50608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f50609c;

        c() {
            this.f50608b = d.this.f50594f.f50605a;
            this.f50609c = d.this.f50597i;
        }

        private void b() {
            if (d.this.f50597i != this.f50609c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] next() {
            if (d.this.f50600l) {
                throw new IllegalStateException("closed");
            }
            b();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f50607a;
            d dVar = d.this;
            if (i10 >= dVar.f50593e) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    b bVarA1 = dVar.A1(this.f50608b);
                    byte[] bArr = new byte[bVarA1.f50606b];
                    long jI2 = d.this.i2(bVarA1.f50605a + 4);
                    this.f50608b = jI2;
                    if (!d.this.e2(jI2, bArr, 0, bVarA1.f50606b)) {
                        this.f50607a = d.this.f50593e;
                        return d.f50588m;
                    }
                    this.f50608b = d.this.i2(bVarA1.f50605a + 4 + ((long) bVarA1.f50606b));
                    this.f50607a++;
                    return bArr;
                } catch (IOException e10) {
                    throw ((Error) d.D(e10));
                } catch (OutOfMemoryError unused) {
                    d.this.c2();
                    this.f50607a = d.this.f50593e;
                    return d.f50588m;
                }
            } catch (IOException e11) {
                throw ((Error) d.D(e11));
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (d.this.f50600l) {
                throw new IllegalStateException("closed");
            }
            b();
            return this.f50607a != d.this.f50593e;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f50607a != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                d.this.a2();
                this.f50609c = d.this.f50597i;
                this.f50607a--;
            } catch (IOException e10) {
                throw ((Error) d.D(e10));
            }
        }
    }

    d(File file, RandomAccessFile randomAccessFile, boolean z10, int i10) throws IOException {
        this.f50590b = file;
        this.f50589a = randomAccessFile;
        this.f50598j = z10;
        this.f50599k = i10;
        D1();
    }

    static RandomAccessFile B0(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileY1 = y1(file2);
            try {
                randomAccessFileY1.setLength(4096L);
                randomAccessFileY1.seek(0L);
                randomAccessFileY1.writeInt(-2147483647);
                randomAccessFileY1.writeLong(4096L);
                randomAccessFileY1.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFileY1.close();
                throw th2;
            }
        }
        return y1(file);
    }

    private void D1() throws IOException {
        this.f50589a.seek(0L);
        this.f50589a.readFully(this.f50596h);
        this.f50592d = Y1(this.f50596h, 4);
        this.f50593e = O1(this.f50596h, 12);
        long jY1 = Y1(this.f50596h, 16);
        long jY12 = Y1(this.f50596h, 24);
        if (this.f50592d > this.f50589a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f50592d + ", Actual length: " + this.f50589a.length());
        }
        if (this.f50592d > 32) {
            this.f50594f = A1(jY1);
            this.f50595g = A1(jY12);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f50592d + ") is invalid.");
        }
    }

    private static int O1(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private static long Y1(byte[] bArr, int i10) {
        return ((((long) bArr[i10]) & 255) << 56) + ((((long) bArr[i10 + 1]) & 255) << 48) + ((((long) bArr[i10 + 2]) & 255) << 40) + ((((long) bArr[i10 + 3]) & 255) << 32) + ((((long) bArr[i10 + 4]) & 255) << 24) + ((((long) bArr[i10 + 5]) & 255) << 16) + ((((long) bArr[i10 + 6]) & 255) << 8) + (((long) bArr[i10 + 7]) & 255);
    }

    private long Z1() {
        return this.f50592d - h2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2() throws IOException {
        this.f50589a.close();
        this.f50590b.delete();
        this.f50589a = B0(this.f50590b);
        D1();
    }

    private void d2(long j10, long j11) throws IOException {
        long j12 = j10;
        while (j11 > 0) {
            byte[] bArr = f50588m;
            int iMin = (int) Math.min(j11, bArr.length);
            f2(j12, bArr, 0, iMin);
            long j13 = iMin;
            j11 -= j13;
            j12 += j13;
        }
    }

    private void f2(long j10, byte[] bArr, int i10, int i11) throws IOException {
        long jI2 = i2(j10);
        long j11 = ((long) i11) + jI2;
        long j12 = this.f50592d;
        if (j11 <= j12) {
            this.f50589a.seek(jI2);
            this.f50589a.write(bArr, i10, i11);
            return;
        }
        int i12 = (int) (j12 - jI2);
        this.f50589a.seek(jI2);
        this.f50589a.write(bArr, i10, i12);
        this.f50589a.seek(32L);
        this.f50589a.write(bArr, i10 + i12, i11 - i12);
    }

    private void g2(long j10) throws IOException {
        this.f50589a.setLength(j10);
        this.f50589a.getChannel().force(true);
    }

    private long h2() {
        if (this.f50593e == 0) {
            return 32L;
        }
        b bVar = this.f50595g;
        long j10 = bVar.f50605a;
        long j11 = this.f50594f.f50605a;
        return j10 >= j11 ? (j10 - j11) + 4 + ((long) bVar.f50606b) + 32 : (((j10 + 4) + ((long) bVar.f50606b)) + this.f50592d) - j11;
    }

    private void j2(long j10, int i10, long j11, long j12) throws IOException {
        this.f50589a.seek(0L);
        k2(this.f50596h, 0, -2147483647);
        l2(this.f50596h, 4, j10);
        k2(this.f50596h, 12, i10);
        l2(this.f50596h, 16, j11);
        l2(this.f50596h, 24, j12);
        this.f50589a.write(this.f50596h, 0, 32);
    }

    private static void k2(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void l2(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >> 56);
        bArr[i10 + 1] = (byte) (j10 >> 48);
        bArr[i10 + 2] = (byte) (j10 >> 40);
        bArr[i10 + 3] = (byte) (j10 >> 32);
        bArr[i10 + 4] = (byte) (j10 >> 24);
        bArr[i10 + 5] = (byte) (j10 >> 16);
        bArr[i10 + 6] = (byte) (j10 >> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    private static RandomAccessFile y1(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void z(long j10) throws IOException {
        long j11;
        long j12;
        long j13 = j10 + 4;
        long jZ1 = Z1();
        if (jZ1 >= j13) {
            return;
        }
        long j14 = this.f50592d;
        do {
            jZ1 += j14;
            j14 <<= 1;
        } while (jZ1 < j13);
        g2(j14);
        b bVar = this.f50595g;
        long jI2 = i2(bVar.f50605a + 4 + ((long) bVar.f50606b));
        if (jI2 <= this.f50594f.f50605a) {
            FileChannel channel = this.f50589a.getChannel();
            channel.position(this.f50592d);
            j11 = jI2 - 32;
            if (channel.transferTo(32L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j11 = 0;
        }
        long j15 = this.f50595g.f50605a;
        long j16 = this.f50594f.f50605a;
        if (j15 < j16) {
            long j17 = (this.f50592d + j15) - 32;
            j2(j14, this.f50593e, j16, j17);
            this.f50595g = new b(j17, this.f50595g.f50606b);
            j12 = j14;
        } else {
            j2(j14, this.f50593e, j16, j15);
            j12 = j14;
        }
        this.f50592d = j12;
        if (this.f50598j) {
            d2(32L, j11);
        }
    }

    b A1(long j10) {
        return j10 == 0 ? b.f50604c : !e2(j10, this.f50596h, 0, 4) ? b.f50604c : new b(j10, O1(this.f50596h, 0));
    }

    public void a2() throws IOException {
        b2(1);
    }

    public void b2(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i10 + ") number of elements.");
        }
        if (i10 == 0) {
            return;
        }
        if (i10 == this.f50593e) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i10 > this.f50593e) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i10 + ") than present in queue (" + this.f50593e + ").");
        }
        b bVar = this.f50594f;
        long j10 = bVar.f50605a;
        int iO1 = bVar.f50606b;
        long j11 = 0;
        int i11 = 0;
        long j12 = j10;
        while (i11 < i10) {
            j11 += (long) (iO1 + 4);
            long jI2 = i2(j12 + 4 + ((long) iO1));
            if (!e2(jI2, this.f50596h, 0, 4)) {
                return;
            }
            iO1 = O1(this.f50596h, 0);
            i11++;
            j12 = jI2;
        }
        j2(this.f50592d, this.f50593e - i10, j12, this.f50595g.f50605a);
        this.f50593e -= i10;
        this.f50597i++;
        this.f50594f = new b(j12, iO1);
        if (this.f50598j) {
            d2(j10, j11);
        }
    }

    public void clear() throws IOException {
        if (this.f50600l) {
            throw new IllegalStateException("closed");
        }
        j2(4096L, 0, 0L, 0L);
        if (this.f50598j) {
            this.f50589a.seek(32L);
            this.f50589a.write(f50588m, 0, 4064);
        }
        this.f50593e = 0;
        b bVar = b.f50604c;
        this.f50594f = bVar;
        this.f50595g = bVar;
        if (this.f50592d > 4096) {
            g2(4096L);
        }
        this.f50592d = 4096L;
        this.f50597i++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f50600l = true;
        this.f50589a.close();
    }

    boolean e2(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            long jI2 = i2(j10);
            long j11 = ((long) i11) + jI2;
            long j12 = this.f50592d;
            if (j11 <= j12) {
                this.f50589a.seek(jI2);
                this.f50589a.readFully(bArr, i10, i11);
                return true;
            }
            int i12 = (int) (j12 - jI2);
            this.f50589a.seek(jI2);
            this.f50589a.readFully(bArr, i10, i12);
            this.f50589a.seek(32L);
            this.f50589a.readFully(bArr, i10 + i12, i11 - i12);
            return true;
        } catch (EOFException unused) {
            c2();
            return false;
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable unused2) {
            c2();
            return false;
        }
    }

    long i2(long j10) {
        long j11 = this.f50592d;
        return j10 < j11 ? j10 : (j10 + 32) - j11;
    }

    public boolean isEmpty() {
        return this.f50593e == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c();
    }

    public int size() {
        return this.f50593e;
    }

    public String toString() {
        return "QueueFile{file=" + this.f50590b + ", zero=" + this.f50598j + ", length=" + this.f50592d + ", size=" + this.f50593e + ", first=" + this.f50594f + ", last=" + this.f50595g + '}';
    }

    public boolean u1() {
        return this.f50599k != -1 && size() == this.f50599k;
    }

    public void w(byte[] bArr, int i10, int i11) throws IOException {
        long jI2;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f50600l) {
            throw new IllegalStateException("closed");
        }
        if (u1()) {
            a2();
        }
        z(i11);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jI2 = 32;
        } else {
            b bVar = this.f50595g;
            jI2 = i2(bVar.f50605a + 4 + ((long) bVar.f50606b));
        }
        b bVar2 = new b(jI2, i11);
        k2(this.f50596h, 0, i11);
        f2(bVar2.f50605a, this.f50596h, 0, 4);
        f2(bVar2.f50605a + 4, bArr, i10, i11);
        j2(this.f50592d, this.f50593e + 1, zIsEmpty ? bVar2.f50605a : this.f50594f.f50605a, bVar2.f50605a);
        this.f50595g = bVar2;
        this.f50593e++;
        this.f50597i++;
        if (zIsEmpty) {
            this.f50594f = bVar2;
        }
    }

    static Throwable D(Throwable th2) throws Throwable {
        throw th2;
    }
}
