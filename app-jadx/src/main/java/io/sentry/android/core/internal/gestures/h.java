package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.C5322z3;
import io.sentry.a4;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Window.Callback f49785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f49786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GestureDetectorCompat f49787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5322z3 f49788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f49789f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements b {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface b {
        default MotionEvent a(MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public h(Window.Callback callback, Context context, g gVar, C5322z3 c5322z3) {
        this(callback, new GestureDetectorCompat(context, gVar, new Handler(Looper.getMainLooper())), gVar, c5322z3, new a());
    }

    private void b(MotionEvent motionEvent) {
        this.f49787d.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f49786c.k(motionEvent);
        }
    }

    public Window.Callback a() {
        return this.f49785b;
    }

    public void c() {
        this.f49786c.m(a4.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                b(this.f49789f.a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, g gVar, C5322z3 c5322z3, b bVar) {
        super(callback);
        this.f49785b = callback;
        this.f49786c = gVar;
        this.f49788e = c5322z3;
        this.f49787d = gestureDetectorCompat;
        this.f49789f = bVar;
    }
}
