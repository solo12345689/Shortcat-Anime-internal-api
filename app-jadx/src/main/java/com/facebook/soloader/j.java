package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f38584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZipEntry f38585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZipFile f38586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f38587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38588e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f38589f = 0;

    public j(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f38586c = zipFile;
        this.f38585b = zipEntry;
        this.f38587d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f38584a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    public h a(long j10) throws IOException {
        InputStream inputStream = this.f38584a;
        if (inputStream == null) {
            throw new IOException(this.f38585b.getName() + "'s InputStream is null");
        }
        long j11 = this.f38589f;
        if (j10 == j11) {
            return this;
        }
        long j12 = this.f38587d;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j10 >= j11) {
            inputStream.skip(j10 - j11);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f38586c.getInputStream(this.f38585b);
            this.f38584a = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f38585b.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j10);
        }
        this.f38589f = j10;
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f38584a;
        if (inputStream != null) {
            inputStream.close();
            this.f38588e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f38588e;
    }

    @Override // com.facebook.soloader.h
    public int j0(ByteBuffer byteBuffer, long j10) throws IOException {
        if (this.f38584a == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j11 = this.f38587d - j10;
        if (j11 <= 0) {
            return -1;
        }
        int i10 = (int) j11;
        if (iRemaining > i10) {
            iRemaining = i10;
        }
        a(j10);
        if (byteBuffer.hasArray()) {
            this.f38584a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f38584a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f38589f += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return j0(byteBuffer, this.f38589f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
