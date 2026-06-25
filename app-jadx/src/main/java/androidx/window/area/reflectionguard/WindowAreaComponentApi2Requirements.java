package androidx.window.area.reflectionguard;

import android.app.Activity;
import androidx.window.extensions.core.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface WindowAreaComponentApi2Requirements {
    void addRearDisplayStatusListener(Consumer<Integer> consumer);

    void endRearDisplaySession();

    void removeRearDisplayStatusListener(Consumer<Integer> consumer);

    void startRearDisplaySession(Activity activity, Consumer<Integer> consumer);
}
