package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import t2.InterfaceC6623j;
import t2.InterfaceC6631s;

/* JADX INFO: renamed from: androidx.media3.exoplayer.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2878d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f30590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6631s f30591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30592d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.media3.exoplayer.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f30593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC6631s f30594b;

        public a(InterfaceC6631s interfaceC6631s, b bVar) {
            this.f30594b = interfaceC6631s;
            this.f30593a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (C2878d.this.f30592d) {
                this.f30593a.n();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f30594b.i(new Runnable() { // from class: androidx.media3.exoplayer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f30585a.b();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void n();
    }

    public C2878d(Context context, Looper looper, Looper looper2, b bVar, InterfaceC6623j interfaceC6623j) {
        this.f30589a = context.getApplicationContext();
        this.f30591c = interfaceC6623j.e(looper, null);
        this.f30590b = new a(interfaceC6623j.e(looper2, null), bVar);
    }

    public void d(boolean z10) {
        if (z10 == this.f30592d) {
            return;
        }
        if (z10) {
            this.f30591c.i(new Runnable() { // from class: androidx.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2878d c2878d = this.f30577a;
                    c2878d.f30589a.registerReceiver(c2878d.f30590b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f30592d = true;
        } else {
            this.f30591c.i(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    C2878d c2878d = this.f30580a;
                    c2878d.f30589a.unregisterReceiver(c2878d.f30590b);
                }
            });
            this.f30592d = false;
        }
    }
}
