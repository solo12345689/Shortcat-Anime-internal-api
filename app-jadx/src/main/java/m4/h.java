package m4;

import Td.L;
import Ud.AbstractC2279u;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k4.InterfaceC5445a;
import kotlin.jvm.internal.AbstractC5504s;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5931b f53195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f53196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f53197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f53198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f53199e;

    protected h(Context context, InterfaceC5931b taskExecutor) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(taskExecutor, "taskExecutor");
        this.f53195a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.g(applicationContext, "context.applicationContext");
        this.f53196b = applicationContext;
        this.f53197c = new Object();
        this.f53198d = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List listenersList, h this$0) {
        AbstractC5504s.h(listenersList, "$listenersList");
        AbstractC5504s.h(this$0, "this$0");
        Iterator it = listenersList.iterator();
        while (it.hasNext()) {
            ((InterfaceC5445a) it.next()).a(this$0.f53199e);
        }
    }

    public final void c(InterfaceC5445a listener) {
        AbstractC5504s.h(listener, "listener");
        synchronized (this.f53197c) {
            try {
                if (this.f53198d.add(listener)) {
                    if (this.f53198d.size() == 1) {
                        this.f53199e = e();
                        i4.i.e().a(i.f53200a, getClass().getSimpleName() + ": initial state = " + this.f53199e);
                        h();
                    }
                    listener.a(this.f53199e);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final Context d() {
        return this.f53196b;
    }

    public abstract Object e();

    public final void f(InterfaceC5445a listener) {
        AbstractC5504s.h(listener, "listener");
        synchronized (this.f53197c) {
            try {
                if (this.f53198d.remove(listener) && this.f53198d.isEmpty()) {
                    i();
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f53197c) {
            Object obj2 = this.f53199e;
            if (obj2 == null || !AbstractC5504s.c(obj2, obj)) {
                this.f53199e = obj;
                final List listB1 = AbstractC2279u.b1(this.f53198d);
                this.f53195a.a().execute(new Runnable() { // from class: m4.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(listB1, this);
                    }
                });
                L l10 = L.f17438a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
