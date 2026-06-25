package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f38601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileLock f38602b;

    private n(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f38601a = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f38602b = fileLockLock;
        } catch (Throwable th2) {
            this.f38601a.close();
            throw th2;
        }
    }

    public static n a(File file) {
        return new n(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f38602b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f38601a.close();
        }
    }
}
