package t2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: t2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6615b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f60579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f60580b;

    /* JADX INFO: renamed from: t2.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f60581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f60582b = false;

        public a(File file) {
            this.f60581a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f60582b) {
                return;
            }
            this.f60582b = true;
            flush();
            try {
                this.f60581a.getFD().sync();
            } catch (IOException e10) {
                AbstractC6635w.j("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f60581a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f60581a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f60581a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f60581a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f60581a.write(bArr, i10, i11);
        }
    }

    public C6615b(File file) {
        this.f60579a = file;
        this.f60580b = new File(file.getPath() + ".bak");
    }

    private void e() {
        if (this.f60580b.exists()) {
            this.f60579a.delete();
            this.f60580b.renameTo(this.f60579a);
        }
    }

    public void a() {
        this.f60579a.delete();
        this.f60580b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f60580b.delete();
    }

    public boolean c() {
        return this.f60579a.exists() || this.f60580b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f60579a);
    }

    public OutputStream f() throws IOException {
        if (this.f60579a.exists()) {
            if (this.f60580b.exists()) {
                this.f60579a.delete();
            } else if (!this.f60579a.renameTo(this.f60580b)) {
                AbstractC6635w.i("AtomicFile", "Couldn't rename file " + this.f60579a + " to backup file " + this.f60580b);
            }
        }
        try {
            return new a(this.f60579a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f60579a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f60579a, e10);
            }
            try {
                return new a(this.f60579a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f60579a, e11);
            }
        }
    }
}
