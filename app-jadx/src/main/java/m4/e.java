package m4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.AbstractC5504s;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BroadcastReceiver f53190f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(intent, "intent");
            e.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, InterfaceC5931b taskExecutor) {
        super(context, taskExecutor);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(taskExecutor, "taskExecutor");
        this.f53190f = new a();
    }

    @Override // m4.h
    public void h() {
        i4.i.e().a(f.f53192a, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f53190f, j());
    }

    @Override // m4.h
    public void i() {
        i4.i.e().a(f.f53192a, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f53190f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
