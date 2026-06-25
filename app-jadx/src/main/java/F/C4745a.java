package f;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: f.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4745a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f46795a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f46796b;

    public final void a(InterfaceC4746b listener) {
        AbstractC5504s.h(listener, "listener");
        Context context = this.f46796b;
        if (context != null) {
            listener.a(context);
        }
        this.f46795a.add(listener);
    }

    public final void b() {
        this.f46796b = null;
    }

    public final void c(Context context) {
        AbstractC5504s.h(context, "context");
        this.f46796b = context;
        Iterator it = this.f46795a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4746b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f46796b;
    }

    public final void e(InterfaceC4746b listener) {
        AbstractC5504s.h(listener, "listener");
        this.f46795a.remove(listener);
    }
}
