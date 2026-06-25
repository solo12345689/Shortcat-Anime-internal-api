package C2;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
import q2.C6088c;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: C2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1161i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f2743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f2744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f2745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f2746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f2747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1157e f2748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C1162j f2749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C6088c f2750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2751j;

    /* JADX INFO: renamed from: C2.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            r2.m.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            r2.m.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: C2.i$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C1161i c1161i = C1161i.this;
            c1161i.f(C1157e.f(c1161i.f2742a, C1161i.this.f2750i, C1161i.this.f2749h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (t2.a0.u(audioDeviceInfoArr, C1161i.this.f2749h)) {
                C1161i.this.f2749h = null;
            }
            C1161i c1161i = C1161i.this;
            c1161i.f(C1157e.f(c1161i.f2742a, C1161i.this.f2750i, C1161i.this.f2749h));
        }
    }

    /* JADX INFO: renamed from: C2.i$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f2753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f2754b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f2753a = contentResolver;
            this.f2754b = uri;
        }

        public void a() {
            this.f2753a.registerContentObserver(this.f2754b, false, this);
        }

        public void b() {
            this.f2753a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            C1161i c1161i = C1161i.this;
            c1161i.f(C1157e.f(c1161i.f2742a, C1161i.this.f2750i, C1161i.this.f2749h));
        }
    }

    /* JADX INFO: renamed from: C2.i$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C1161i c1161i = C1161i.this;
            c1161i.f(C1157e.e(context, intent, c1161i.f2750i, C1161i.this.f2749h));
        }
    }

    /* JADX INFO: renamed from: C2.i$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface f {
        void a(C1157e c1157e);
    }

    C1161i(Context context, f fVar, C6088c c6088c, C1162j c1162j) {
        Context applicationContext = context.getApplicationContext();
        this.f2742a = applicationContext;
        this.f2743b = (f) AbstractC6614a.e(fVar);
        this.f2750i = c6088c;
        this.f2749h = c1162j;
        Handler handlerE = t2.a0.E();
        this.f2744c = handlerE;
        this.f2745d = new c();
        this.f2746e = new e();
        Uri uriI = C1157e.i();
        this.f2747f = uriI != null ? new d(handlerE, applicationContext.getContentResolver(), uriI) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(C1157e c1157e) {
        if (!this.f2751j || c1157e.equals(this.f2748g)) {
            return;
        }
        this.f2748g = c1157e;
        this.f2743b.a(c1157e);
    }

    public void g(C1157e c1157e) {
        f(c1157e);
    }

    public C1157e h() {
        if (this.f2751j) {
            return (C1157e) AbstractC6614a.e(this.f2748g);
        }
        this.f2751j = true;
        d dVar = this.f2747f;
        if (dVar != null) {
            dVar.a();
        }
        c cVar = this.f2745d;
        if (cVar != null) {
            b.a(this.f2742a, cVar, this.f2744c);
        }
        C1157e c1157eE = C1157e.e(this.f2742a, this.f2742a.registerReceiver(this.f2746e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f2744c), this.f2750i, this.f2749h);
        this.f2748g = c1157eE;
        return c1157eE;
    }

    public void i(C6088c c6088c) {
        this.f2750i = c6088c;
        f(C1157e.f(this.f2742a, c6088c, this.f2749h));
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        C1162j c1162j = this.f2749h;
        if (Objects.equals(audioDeviceInfo, c1162j == null ? null : c1162j.f2757a)) {
            return;
        }
        C1162j c1162j2 = audioDeviceInfo != null ? new C1162j(audioDeviceInfo) : null;
        this.f2749h = c1162j2;
        f(C1157e.f(this.f2742a, this.f2750i, c1162j2));
    }

    public void k() {
        if (this.f2751j) {
            this.f2748g = null;
            c cVar = this.f2745d;
            if (cVar != null) {
                b.b(this.f2742a, cVar);
            }
            this.f2742a.unregisterReceiver(this.f2746e);
            d dVar = this.f2747f;
            if (dVar != null) {
                dVar.b();
            }
            this.f2751j = false;
        }
    }
}
