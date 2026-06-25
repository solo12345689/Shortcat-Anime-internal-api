package U3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0325a f19113e = new C0325a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f19114f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f19116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lock f19117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f19118d;

    /* JADX INFO: renamed from: U3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0325a {
        public /* synthetic */ C0325a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f19114f) {
                try {
                    Map map = a.f19114f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        private C0325a() {
        }
    }

    public a(String name, File file, boolean z10) {
        File file2;
        AbstractC5504s.h(name, "name");
        this.f19115a = z10;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f19116b = file2;
        this.f19117c = f19113e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f19115a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f19117c.lock();
        if (z10) {
            try {
                File file = this.f19116b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f19116b).getChannel();
                channel.lock();
                this.f19118d = channel;
            } catch (IOException e10) {
                this.f19118d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f19118d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f19117c.unlock();
    }
}
