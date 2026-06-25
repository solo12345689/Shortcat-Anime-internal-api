package T2;

import T2.d;
import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f17107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f17108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GestureDetector f17109e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f17105a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f17106b = new PointF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile float f17110f = 3.1415927f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f17107c = aVar;
        this.f17108d = f10;
        this.f17109e = new GestureDetector(context, this);
    }

    @Override // T2.d.a
    public void a(float[] fArr, float f10) {
        this.f17110f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f17105a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f17105a.x) / this.f17108d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f17105a;
        float f12 = (y10 - pointF.y) / this.f17108d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f17110f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f17106b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f17107c.b(this.f17106b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f17107c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f17109e.onTouchEvent(motionEvent);
    }
}
