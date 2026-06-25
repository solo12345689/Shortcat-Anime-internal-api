package e4;

import Td.L;
import Ud.AbstractC2279u;
import a4.C2569d;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import d4.InterfaceC4566a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: renamed from: e4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4648d implements InterfaceC4566a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowLayoutComponent f45799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2569d f45800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReentrantLock f45801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f45802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f45803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f45804f;

    /* JADX INFO: renamed from: e4.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {
        a(Object obj) {
            super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            j((WindowLayoutInfo) obj);
            return L.f17438a;
        }

        public final void j(WindowLayoutInfo p02) {
            AbstractC5504s.h(p02, "p0");
            ((MulticastConsumer) this.receiver).accept(p02);
        }
    }

    public C4648d(WindowLayoutComponent component, C2569d consumerAdapter) {
        AbstractC5504s.h(component, "component");
        AbstractC5504s.h(consumerAdapter, "consumerAdapter");
        this.f45799a = component;
        this.f45800b = consumerAdapter;
        this.f45801c = new ReentrantLock();
        this.f45802d = new LinkedHashMap();
        this.f45803e = new LinkedHashMap();
        this.f45804f = new LinkedHashMap();
    }

    @Override // d4.InterfaceC4566a
    public void a(K1.a callback) {
        AbstractC5504s.h(callback, "callback");
        ReentrantLock reentrantLock = this.f45801c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f45803e.get(callback);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f45802d.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(callback);
            this.f45803e.remove(callback);
            if (multicastConsumer.b()) {
                this.f45802d.remove(context);
                C2569d.b bVar = (C2569d.b) this.f45804f.remove(multicastConsumer);
                if (bVar != null) {
                    bVar.dispose();
                }
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
        ReentrantLock reentrantLock = this.f45801c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f45802d.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(callback);
                this.f45803e.put(callback, context);
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            if (l10 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f45802d.put(context, multicastConsumer2);
                this.f45803e.put(callback, context);
                multicastConsumer2.a(callback);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(AbstractC2279u.m()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f45804f.put(multicastConsumer2, this.f45800b.c(this.f45799a, O.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(multicastConsumer2)));
                }
            }
            L l11 = L.f17438a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
