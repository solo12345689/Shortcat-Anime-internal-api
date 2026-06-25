package Ka;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10969a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference f10970b;

    private a() {
    }

    public final void a() {
        EditText editText;
        WeakReference weakReference = f10970b;
        if (weakReference == null || (editText = (EditText) weakReference.get()) == null) {
            return;
        }
        Ba.c.e(editText);
    }

    public final EditText b() {
        WeakReference weakReference = f10970b;
        if (weakReference != null) {
            return (EditText) weakReference.get();
        }
        return null;
    }

    public final void c(EditText textInput) {
        AbstractC5504s.h(textInput, "textInput");
        f10970b = new WeakReference(textInput);
    }
}
