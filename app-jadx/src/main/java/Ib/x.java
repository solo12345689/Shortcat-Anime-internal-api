package Ib;

import android.util.Log;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import java.lang.reflect.Field;
import k5.InterfaceC5451c;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x {
    private static final Object a(ThumbnailRequestCoordinator thumbnailRequestCoordinator, String str) {
        try {
            Field declaredField = thumbnailRequestCoordinator.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(thumbnailRequestCoordinator);
        } catch (Throwable th2) {
            Log.e("ExpoImage", "Couldn't receive the `" + str + "` field", th2);
            return null;
        }
    }

    public static final InterfaceC5451c b(ThumbnailRequestCoordinator thumbnailRequestCoordinator) {
        AbstractC5504s.h(thumbnailRequestCoordinator, "<this>");
        return (InterfaceC5451c) a(thumbnailRequestCoordinator, "full");
    }
}
