package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d f31650a = androidx.concurrent.futures.d.B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f31651b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f31652c = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f31653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f31654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f31655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f31656d;

        b(int i10, int i11, long j10, long j11) {
            this.f31653a = i10;
            this.f31654b = i11;
            this.f31655c = j10;
            this.f31656d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f31653a);
                dataOutputStream.writeInt(this.f31654b);
                dataOutputStream.writeLong(this.f31655c);
                dataOutputStream.writeLong(this.f31656d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f31654b == bVar.f31654b && this.f31655c == bVar.f31655c && this.f31653a == bVar.f31653a && this.f31656d == bVar.f31656d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f31654b), Long.valueOf(this.f31655c), Integer.valueOf(this.f31653a), Long.valueOf(this.f31656d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f31657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f31658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f31659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f31660d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f31657a = i10;
            this.f31659c = z11;
            this.f31658b = z10;
            this.f31660d = z12;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f31652c = cVar;
        f31650a.x(cVar);
        return f31652c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.h.c c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.h.c(android.content.Context, boolean):androidx.profileinstaller.h$c");
    }
}
