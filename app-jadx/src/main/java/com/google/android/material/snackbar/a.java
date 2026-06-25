package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f42822c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f42823a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f42824b = new Handler(Looper.getMainLooper(), new C0645a());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0645a implements Handler.Callback {
        C0645a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            android.support.v4.media.session.b.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i10) {
        throw null;
    }

    static a b() {
        if (f42822c == null) {
            f42822c = new a();
        }
        return f42822c;
    }

    private boolean d(b bVar) {
        return false;
    }

    void c(c cVar) {
        synchronized (this.f42823a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f42823a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f42823a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
