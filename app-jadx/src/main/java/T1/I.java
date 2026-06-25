package T1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class I extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f16789a;

    public I(FileOutputStream fileOutputStream) {
        AbstractC5504s.h(fileOutputStream, "fileOutputStream");
        this.f16789a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f16789a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f16789a.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        AbstractC5504s.h(b10, "b");
        this.f16789a.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) throws IOException {
        AbstractC5504s.h(bytes, "bytes");
        this.f16789a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
