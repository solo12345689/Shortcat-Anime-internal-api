package io.sentry.android.replay.screenshot;

import Td.AbstractC2163n;
import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import ie.InterfaceC5082a;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.android.replay.r;
import io.sentry.android.replay.s;
import io.sentry.android.replay.util.q;
import io.sentry.android.replay.viewhierarchy.b;
import io.sentry.android.replay.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f50381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f50382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f50383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.replay.util.d f50384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f50385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.android.replay.util.i f50386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f50387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bitmap f50388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f50389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f50390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f50391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f50392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f50393m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f50394n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f50396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Canvas f50397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, Canvas canvas) {
            super(1);
            this.f50396b = list;
            this.f50397c = canvas;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.b node) {
            Pair pairA;
            Integer numI;
            AbstractC5504s.h(node, "node");
            if (node.c() && node.e() > 0 && node.b() > 0) {
                if (node.d() == null) {
                    return Boolean.FALSE;
                }
                if (node instanceof b.c) {
                    List listE = AbstractC2279u.e(node.d());
                    i iVar = i.this;
                    pairA = z.a(listE, Integer.valueOf(iVar.r(iVar.f50388h, node.d())));
                } else {
                    if (node instanceof b.d) {
                        b.d dVar = (b.d) node;
                        q qVarJ = dVar.j();
                        pairA = z.a(io.sentry.android.replay.util.r.d(dVar.j(), node.d(), dVar.k(), dVar.l()), Integer.valueOf(((qVarJ == null || (numI = qVarJ.f()) == null) && (numI = dVar.i()) == null) ? -16777216 : numI.intValue()));
                    } else {
                        pairA = z.a(AbstractC2279u.e(node.d()), -16777216);
                    }
                }
                List list = (List) pairA.getFirst();
                i.this.s().setColor(((Number) pairA.getSecond()).intValue());
                Canvas canvas = this.f50397c;
                i iVar2 = i.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, iVar2.s());
                }
                if (i.this.f50382b.getReplayController().o()) {
                    this.f50396b.addAll(list);
                }
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f50398a = new b();

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {
        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            i iVar = i.this;
            matrix.preScale(iVar.f50383c.e(), iVar.f50383c.f());
            return matrix;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f50400a = new d();

        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5082a {
        e() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Canvas invoke() {
            return new Canvas(i.this.u());
        }
    }

    public i(io.sentry.android.replay.b executorProvider, r rVar, C5322z3 options, s config, io.sentry.android.replay.util.d debugOverlayDrawable) {
        AbstractC5504s.h(executorProvider, "executorProvider");
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(debugOverlayDrawable, "debugOverlayDrawable");
        this.f50381a = rVar;
        this.f50382b = options;
        this.f50383c = config;
        this.f50384d = debugOverlayDrawable;
        this.f50385e = executorProvider.g();
        this.f50386f = executorProvider.b();
        Td.q qVar = Td.q.f17463c;
        this.f50387g = AbstractC2163n.a(qVar, d.f50400a);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.d(), config.c(), Bitmap.Config.ARGB_8888);
        AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(...)");
        this.f50388h = bitmapCreateBitmap;
        this.f50389i = AbstractC2163n.a(qVar, new e());
        this.f50390j = AbstractC2163n.a(qVar, new c());
        this.f50391k = new AtomicBoolean(false);
        this.f50392l = AbstractC2163n.a(qVar, b.f50398a);
        this.f50393m = new AtomicBoolean(false);
        this.f50394n = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final i iVar, final View view, int i10) {
        if (iVar.f50394n.get()) {
            iVar.f50382b.getLogger().c(EnumC5215i3.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 != 0) {
            iVar.f50382b.getLogger().c(EnumC5215i3.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i10));
            iVar.f50391k.set(false);
        } else if (iVar.f50393m.get()) {
            iVar.f50382b.getLogger().c(EnumC5215i3.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            iVar.f50391k.set(false);
        } else {
            final io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f50478m.a(view, null, 0, iVar.f50382b);
            io.sentry.android.replay.util.r.k(view, bVarA, iVar.f50382b);
            iVar.f50385e.submit(new io.sentry.android.replay.util.m("screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.screenshot.g
                @Override // java.lang.Runnable
                public final void run() {
                    i.o(this.f50375a, bVarA, view);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final i iVar, io.sentry.android.replay.viewhierarchy.b bVar, final View view) {
        if (iVar.f50394n.get() || iVar.f50388h.isRecycled()) {
            iVar.f50382b.getLogger().c(EnumC5215i3.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(iVar.f50388h);
        canvas.setMatrix(iVar.t());
        bVar.h(iVar.new a(arrayList, canvas));
        if (iVar.f50382b.getReplayController().o()) {
            iVar.f50386f.b(new Runnable() { // from class: io.sentry.android.replay.screenshot.h
                @Override // java.lang.Runnable
                public final void run() {
                    i.p(this.f50378a, view, arrayList);
                }
            });
        }
        r rVar = iVar.f50381a;
        if (rVar != null) {
            rVar.j(iVar.f50388h);
        }
        iVar.f50391k.set(true);
        iVar.f50393m.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(i iVar, View view, List list) {
        if (iVar.f50384d.getCallback() == null) {
            view.getOverlay().add(iVar.f50384d);
        }
        iVar.f50384d.b(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(i iVar) {
        if (!iVar.f50388h.isRecycled()) {
            synchronized (iVar.f50388h) {
                try {
                    if (!iVar.f50388h.isRecycled()) {
                        iVar.f50388h.recycle();
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (iVar.u().isRecycled()) {
            return;
        }
        iVar.u().recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(Bitmap bitmap, Rect rect) {
        if (this.f50394n.get() || bitmap.isRecycled() || u().isRecycled()) {
            return -16777216;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        t().mapRect(rectF);
        rectF.round(rect2);
        v().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return u().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint s() {
        return (Paint) this.f50392l.getValue();
    }

    private final Matrix t() {
        return (Matrix) this.f50390j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap u() {
        return (Bitmap) this.f50387g.getValue();
    }

    private final Canvas v() {
        return (Canvas) this.f50389i.getValue();
    }

    @Override // io.sentry.android.replay.screenshot.j
    public boolean a() {
        return this.f50391k.get();
    }

    @Override // io.sentry.android.replay.screenshot.j
    public void b() {
        r rVar;
        if (!a() || this.f50388h.isRecycled() || (rVar = this.f50381a) == null) {
            return;
        }
        rVar.j(this.f50388h);
    }

    @Override // io.sentry.android.replay.screenshot.j
    public void c(final View root) {
        AbstractC5504s.h(root, "root");
        Window windowA = y.a(root);
        if (windowA == null) {
            this.f50382b.getLogger().c(EnumC5215i3.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.f50394n.get()) {
            this.f50382b.getLogger().c(EnumC5215i3.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f50393m.set(false);
            PixelCopy.request(windowA, this.f50388h, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.e
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    i.n(this.f50372a, root, i10);
                }
            }, this.f50386f.a());
        } catch (Throwable th2) {
            this.f50382b.getLogger().b(EnumC5215i3.WARNING, "Failed to capture replay recording", th2);
            this.f50391k.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.j
    public void close() {
        this.f50394n.set(true);
        this.f50385e.submit(new io.sentry.android.replay.util.m("PixelCopyStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.f
            @Override // java.lang.Runnable
            public final void run() {
                i.q(this.f50374a);
            }
        }));
    }

    @Override // io.sentry.android.replay.screenshot.j
    public void onContentChanged() {
        this.f50393m.set(true);
    }
}
