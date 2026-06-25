package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f38581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileInputStream f38582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FileChannel f38583c;

    public i(File file) {
        this.f38581a = file;
        a();
    }

    public void a() {
        FileInputStream fileInputStream = new FileInputStream(this.f38581a);
        this.f38582b = fileInputStream;
        this.f38583c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38582b.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f38583c.isOpen();
    }

    @Override // com.facebook.soloader.h
    public int j0(ByteBuffer byteBuffer, long j10) {
        return this.f38583c.read(byteBuffer, j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f38583c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f38583c.write(byteBuffer);
    }
}
