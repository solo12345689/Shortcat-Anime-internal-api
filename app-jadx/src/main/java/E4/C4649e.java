package e4;

import Td.L;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import d4.InterfaceC4566a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: e4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4649e implements InterfaceC4566a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowLayoutComponent f45805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f45806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f45807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f45808d;

    public C4649e(WindowLayoutComponent component) {
        AbstractC5504s.h(component, "component");
        this.f45805a = component;
        this.f45806b = new ReentrantLock();
        this.f45807c = new LinkedHashMap();
        this.f45808d = new LinkedHashMap();
    }

    @Override // d4.InterfaceC4566a
    public void a(K1.a callback) {
        AbstractC5504s.h(callback, "callback");
        ReentrantLock reentrantLock = this.f45806b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f45808d.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f45807c.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(callback);
            this.f45808d.remove(callback);
            if (multicastConsumer.b()) {
                this.f45807c.remove(context);
                this.f45805a.removeWindowLayoutInfoListener(multicastConsumer);
            }
            L l10 = L.f17438a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // d4.InterfaceC4566a
    public void b(Context context, Executor executor, K1.a callback) {
        L l10;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(callback, "callback");
        ReentrantLock reentrantLock = this.f45806b;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f45807c.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(callback);
                this.f45808d.put(callback, context);
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f45807c.put(context, multicastConsumer2);
                this.f45808d.put(callback, context);
                multicastConsumer2.a(callback);
                this.f45805a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            L l11 = L.f17438a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
