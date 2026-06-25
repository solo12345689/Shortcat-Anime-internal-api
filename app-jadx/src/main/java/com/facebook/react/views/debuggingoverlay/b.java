package com.facebook.react.views.debuggingoverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f37882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f37883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f37884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f37885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f37886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        Paint paint = new Paint();
        this.f37882a = paint;
        this.f37883b = new HashMap();
        this.f37884c = new HashMap();
        Paint paint2 = new Paint();
        this.f37885d = paint2;
        this.f37886e = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar, int i10) {
        bVar.f37883b.remove(Integer.valueOf(i10));
        bVar.f37884c.remove(Integer.valueOf(i10));
        bVar.invalidate();
    }

    public final void b() {
        this.f37886e.clear();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        super.onDraw(canvas);
        for (Object obj : this.f37883b.values()) {
            AbstractC5504s.g(obj, "next(...)");
            c cVar = (c) obj;
            this.f37882a.setColor(cVar.a());
            canvas.drawRect(cVar.c(), this.f37882a);
            final int iB = cVar.b();
            Runnable runnable = new Runnable() { // from class: com.facebook.react.views.debuggingoverlay.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(this.f37880a, iB);
                }
            };
            if (!this.f37884c.containsKey(Integer.valueOf(iB))) {
                this.f37884c.put(Integer.valueOf(iB), runnable);
                UiThreadUtil.runOnUiThread(runnable, 2000L);
            }
        }
        Iterator it = this.f37886e.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.f37885d);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> elementsRectangles) {
        AbstractC5504s.h(elementsRectangles, "elementsRectangles");
        this.f37886e = elementsRectangles;
        invalidate();
    }

    public final void setTraceUpdates(List<c> traceUpdates) {
        AbstractC5504s.h(traceUpdates, "traceUpdates");
        for (c cVar : traceUpdates) {
            int iB = cVar.b();
            if (this.f37884c.containsKey(Integer.valueOf(iB))) {
                Runnable runnable = (Runnable) this.f37884c.get(Integer.valueOf(iB));
                if (runnable != null) {
                    UiThreadUtil.removeOnUiThread(runnable);
                }
                this.f37884c.remove(Integer.valueOf(iB));
            }
            this.f37883b.put(Integer.valueOf(iB), cVar);
        }
        invalidate();
    }
}
