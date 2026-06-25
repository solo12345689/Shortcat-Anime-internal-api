package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f35695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f35696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V4.b f35697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35698d;

    public c(OutputStream outputStream, V4.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() throws IOException {
        int i10 = this.f35698d;
        if (i10 > 0) {
            this.f35695a.write(this.f35696b, 0, i10);
            this.f35698d = 0;
        }
    }

    private void b() throws IOException {
        if (this.f35698d == this.f35696b.length) {
            a();
        }
    }

    private void g() {
        byte[] bArr = this.f35696b;
        if (bArr != null) {
            this.f35697c.put(bArr);
            this.f35696b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f35695a.close();
            g();
        } catch (Throwable th2) {
            this.f35695a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f35695a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f35696b;
        int i11 = this.f35698d;
        this.f35698d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    c(OutputStream outputStream, V4.b bVar, int i10) {
        this.f35695a = outputStream;
        this.f35697c = bVar;
        this.f35696b = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f35698d;
            if (i15 == 0 && i13 >= this.f35696b.length) {
                this.f35695a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f35696b.length - i15);
            System.arraycopy(bArr, i14, this.f35696b, this.f35698d, iMin);
            this.f35698d += iMin;
            i12 += iMin;
            b();
        } while (i12 < i11);
    }
}
