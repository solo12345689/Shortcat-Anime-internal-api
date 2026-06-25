package o5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5824a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f54522a = new AtomicReference();

    /* JADX INFO: renamed from: o5.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f54525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f54526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f54527c;

        b(byte[] bArr, int i10, int i11) {
            this.f54527c = bArr;
            this.f54525a = i10;
            this.f54526b = i11;
        }
    }

    public static ByteBuffer a(File file) throws Throwable {
        Throwable th2;
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th4) {
                th2 = th4;
                fileChannel = channel;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th2;
                }
                try {
                    randomAccessFile.close();
                    throw th2;
                } catch (IOException unused4) {
                    throw th2;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f54522a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                f54522a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private static b c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        b bVarC = c(byteBuffer);
        if (bVarC != null && bVarC.f54525a == 0 && bVarC.f54526b == bVarC.f54527c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            channel = randomAccessFile.getChannel();
            channel.write(byteBuffer);
            channel.force(false);
            channel.close();
            randomAccessFile.close();
            try {
                channel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    public static InputStream g(ByteBuffer byteBuffer) {
        return new C0847a(byteBuffer);
    }

    /* JADX INFO: renamed from: o5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0847a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f54523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f54524b = -1;

        C0847a(ByteBuffer byteBuffer) {
            this.f54523a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f54523a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f54524b = this.f54523a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f54523a.hasRemaining()) {
                return this.f54523a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i10 = this.f54524b;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f54523a.position(i10);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (!this.f54523a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, available());
            ByteBuffer byteBuffer = this.f54523a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f54523a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, available());
            this.f54523a.get(bArr, i10, iMin);
            return iMin;
        }
    }
}
