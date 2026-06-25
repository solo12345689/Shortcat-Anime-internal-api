package M3;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements S3.h, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f12210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Callable f12211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final S3.h f12213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f12214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12215h;

    public u(Context context, String str, File file, Callable callable, int i10, S3.h delegate) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(delegate, "delegate");
        this.f12208a = context;
        this.f12209b = str;
        this.f12210c = file;
        this.f12211d = callable;
        this.f12212e = i10;
        this.f12213f = delegate;
    }

    private final void b(File file, boolean z10) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f12209b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f12208a.getAssets().open(this.f12209b));
            AbstractC5504s.g(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f12210c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f12210c).getChannel();
            AbstractC5504s.g(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f12211d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                AbstractC5504s.g(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f12208a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        AbstractC5504s.g(output, "output");
        O3.c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        AbstractC5504s.g(intermediateFile, "intermediateFile");
        g(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void g(File file, boolean z10) {
        f fVar = this.f12214g;
        if (fVar == null) {
            AbstractC5504s.u("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    private final void j(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f12208a.getDatabasePath(databaseName);
        f fVar = this.f12214g;
        f fVar2 = null;
        if (fVar == null) {
            AbstractC5504s.u("databaseConfiguration");
            fVar = null;
        }
        U3.a aVar = new U3.a(databaseName, this.f12208a.getFilesDir(), fVar.f12133s);
        try {
            U3.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    AbstractC5504s.g(databaseFile, "databaseFile");
                    b(databaseFile, z10);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                AbstractC5504s.g(databaseFile, "databaseFile");
                int iC = O3.b.c(databaseFile);
                if (iC == this.f12212e) {
                    aVar.d();
                    return;
                }
                f fVar3 = this.f12214g;
                if (fVar3 == null) {
                    AbstractC5504s.u("databaseConfiguration");
                } else {
                    fVar2 = fVar3;
                }
                if (fVar2.a(iC, this.f12212e)) {
                    aVar.d();
                    return;
                }
                if (this.f12208a.deleteDatabase(databaseName)) {
                    try {
                        b(databaseFile, z10);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
        aVar.d();
        throw th2;
    }

    @Override // M3.g
    public S3.h a() {
        return this.f12213f;
    }

    @Override // S3.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f12215h = false;
    }

    @Override // S3.h
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // S3.h
    public S3.g getWritableDatabase() {
        if (!this.f12215h) {
            j(true);
            this.f12215h = true;
        }
        return a().getWritableDatabase();
    }

    public final void h(f databaseConfiguration) {
        AbstractC5504s.h(databaseConfiguration, "databaseConfiguration");
        this.f12214g = databaseConfiguration;
    }

    @Override // S3.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        a().setWriteAheadLoggingEnabled(z10);
    }
}
