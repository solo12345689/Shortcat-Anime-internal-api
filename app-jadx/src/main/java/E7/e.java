package E7;

import H7.j;
import H7.p;
import Ud.AbstractC2279u;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.B;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends LayerDrawable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f5747l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f5749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f5750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E7.a f5751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f5752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f5753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Drawable f5754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f5755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f5756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private H7.h f5757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private j f5758k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable[] b(Drawable drawable, List list, E7.a aVar, b bVar, c cVar, Drawable drawable2, List list2, h hVar) {
            ArrayList arrayList = new ArrayList();
            if (drawable != null) {
                arrayList.add(drawable);
            }
            arrayList.addAll(AbstractC2279u.U(list));
            if (aVar != null) {
                arrayList.add(aVar);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            arrayList.addAll(AbstractC2279u.U(list2));
            if (hVar != null) {
                arrayList.add(hVar);
            }
            return (Drawable[]) arrayList.toArray(new Drawable[0]);
        }

        private a() {
        }
    }

    public /* synthetic */ e(Context context, Drawable drawable, List list, E7.a aVar, b bVar, c cVar, Drawable drawable2, List list2, h hVar, H7.h hVar2, j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : drawable, (i10 & 4) != 0 ? AbstractC2279u.m() : list, (i10 & 8) != 0 ? null : aVar, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : cVar, (i10 & 64) != 0 ? null : drawable2, (i10 & 128) != 0 ? AbstractC2279u.m() : list2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : hVar, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : hVar2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : jVar);
    }

    public final E7.a a() {
        return this.f5751d;
    }

    public final b b() {
        return this.f5752e;
    }

    public final c c() {
        return this.f5753f;
    }

    public final H7.h d() {
        return this.f5757j;
    }

    public final j e() {
        return this.f5758k;
    }

    public final List f() {
        return this.f5755h;
    }

    public final Drawable g() {
        return this.f5749b;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        AbstractC5504s.h(outline, "outline");
        j jVar = this.f5758k;
        if (jVar == null || !jVar.b()) {
            outline.setRect(getBounds());
            return;
        }
        Path path = new Path();
        j jVar2 = this.f5758k;
        p pVarC = jVar2 != null ? jVar2.c(getLayoutDirection(), this.f5748a, getBounds().width(), getBounds().height()) : null;
        H7.h hVar = this.f5757j;
        RectF rectFA = hVar != null ? hVar.a(getLayoutDirection(), this.f5748a) : null;
        if (pVarC != null) {
            RectF rectF = new RectF(getBounds());
            B b10 = B.f37368a;
            path.addRoundRect(rectF, new float[]{b10.b(pVarC.c().a() + (rectFA != null ? rectFA.left : 0.0f)), b10.b(pVarC.c().b() + (rectFA != null ? rectFA.top : 0.0f)), b10.b(pVarC.d().a() + (rectFA != null ? rectFA.right : 0.0f)), b10.b(pVarC.d().b() + (rectFA != null ? rectFA.top : 0.0f)), b10.b(pVarC.b().a() + (rectFA != null ? rectFA.right : 0.0f)), b10.b(pVarC.b().b() + (rectFA != null ? rectFA.bottom : 0.0f)), b10.b(pVarC.a().a() + (rectFA != null ? rectFA.left : 0.0f)), b10.b(pVarC.a().b() + (rectFA != null ? rectFA.bottom : 0.0f))}, Path.Direction.CW);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }

    public final List h() {
        return this.f5750c;
    }

    public final h i() {
        return this.f5756i;
    }

    public final void j(H7.h hVar) {
        this.f5757j = hVar;
    }

    public final void k(j jVar) {
        this.f5758k = jVar;
    }

    public final e l(E7.a aVar) {
        return new e(this.f5748a, this.f5749b, this.f5750c, aVar, this.f5752e, this.f5753f, this.f5754g, this.f5755h, this.f5756i, this.f5757j, this.f5758k);
    }

    public final e m(b bVar) {
        return new e(this.f5748a, this.f5749b, this.f5750c, this.f5751d, bVar, this.f5753f, this.f5754g, this.f5755h, this.f5756i, this.f5757j, this.f5758k);
    }

    public final e n(c border) {
        AbstractC5504s.h(border, "border");
        return new e(this.f5748a, this.f5749b, this.f5750c, this.f5751d, this.f5752e, border, this.f5754g, this.f5755h, this.f5756i, this.f5757j, this.f5758k);
    }

    public final e o(Drawable drawable) {
        return new e(this.f5748a, this.f5749b, this.f5750c, this.f5751d, this.f5752e, this.f5753f, drawable, this.f5755h, this.f5756i, this.f5757j, this.f5758k);
    }

    public final e p(h outline) {
        AbstractC5504s.h(outline, "outline");
        return new e(this.f5748a, this.f5749b, this.f5750c, this.f5751d, this.f5752e, this.f5753f, this.f5754g, this.f5755h, outline, this.f5757j, this.f5758k);
    }

    public final e q(List outerShadows, List innerShadows) {
        AbstractC5504s.h(outerShadows, "outerShadows");
        AbstractC5504s.h(innerShadows, "innerShadows");
        return new e(this.f5748a, this.f5749b, outerShadows, this.f5751d, this.f5752e, this.f5753f, this.f5754g, innerShadows, this.f5756i, this.f5757j, this.f5758k);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Drawable drawable, List outerShadows, E7.a aVar, b bVar, c cVar, Drawable drawable2, List innerShadows, h hVar, H7.h hVar2, j jVar) {
        super(f5747l.b(drawable, outerShadows, aVar, bVar, cVar, drawable2, innerShadows, hVar));
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(outerShadows, "outerShadows");
        AbstractC5504s.h(innerShadows, "innerShadows");
        this.f5748a = context;
        this.f5749b = drawable;
        this.f5750c = outerShadows;
        this.f5751d = aVar;
        this.f5752e = bVar;
        this.f5753f = cVar;
        this.f5754g = drawable2;
        this.f5755h = innerShadows;
        this.f5756i = hVar;
        this.f5757j = hVar2;
        this.f5758k = jVar;
        setPaddingMode(1);
    }
}
