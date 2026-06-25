package androidx.window.layout.adapter.extensions;

import K1.a;
import Td.L;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import c4.j;
import e4.C4650f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "LK1/a;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/extensions/core/util/function/Consumer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "value", "LTd/L;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "Lc4/j;", "listener", "a", "(LK1/a;)V", "c", "", "b", "()Z", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Lc4/j;", "lastKnownValue", "", "d", "Ljava/util/Set;", "registeredListeners", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MulticastConsumer implements a, Consumer<WindowLayoutInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock globalLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private j lastKnownValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set registeredListeners;

    public MulticastConsumer(Context context) {
        AbstractC5504s.h(context, "context");
        this.context = context;
        this.globalLock = new ReentrantLock();
        this.registeredListeners = new LinkedHashSet();
    }

    public final void a(a listener) {
        AbstractC5504s.h(listener, "listener");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            j jVar = this.lastKnownValue;
            if (jVar != null) {
                listener.accept(jVar);
            }
            this.registeredListeners.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean b() {
        return this.registeredListeners.isEmpty();
    }

    public final void c(a listener) {
        AbstractC5504s.h(listener, "listener");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            this.registeredListeners.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // K1.a
    public void accept(WindowLayoutInfo value) {
        AbstractC5504s.h(value, "value");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            j jVarB = C4650f.f45809a.b(this.context, value);
            this.lastKnownValue = jVarB;
            Iterator it = this.registeredListeners.iterator();
            while (it.hasNext()) {
                ((a) it.next()).accept(jVarB);
            }
            L l10 = L.f17438a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
