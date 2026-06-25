package expo.modules.kotlin.services;

import Ub.A;
import android.content.Context;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/services/AppDirectoriesService;", "Lexpo/modules/kotlin/services/Service;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "contextHolder", "()Landroid/content/Context;", "Ljava/io/File;", "a", "()Ljava/io/File;", "cacheDirectory", "c", "persistentFilesDirectory", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AppDirectoriesService implements Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WeakReference contextHolder;

    public AppDirectoriesService(Context context) {
        AbstractC5504s.h(context, "context");
        this.contextHolder = A.a(context);
    }

    private final Context b() {
        Object obj = this.contextHolder.get();
        if (obj != null) {
            return (Context) obj;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public File a() {
        File cacheDir = b().getCacheDir();
        AbstractC5504s.g(cacheDir, "getCacheDir(...)");
        return cacheDir;
    }

    public File c() {
        File filesDir = b().getFilesDir();
        AbstractC5504s.g(filesDir, "getFilesDir(...)");
        return filesDir;
    }
}
