package S3;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15911a = new d();

    private d() {
    }

    public static final File a(Context context) {
        AbstractC5504s.h(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC5504s.g(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
