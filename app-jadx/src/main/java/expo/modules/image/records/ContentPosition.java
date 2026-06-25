package expo.modules.image.records;

import Df.r;
import Ib.n;
import android.graphics.Matrix;
import android.graphics.RectF;
import ie.q;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u000f\u001a\u0004\u0018\u00010\f*\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2.\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u001dR(\u0010\"\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u001dR(\u0010%\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\u001d¨\u0006*"}, d2 = {"Lexpo/modules/image/records/ContentPosition;", "Ljc/b;", "<init>", "()V", "", "Lexpo/modules/image/records/ContentPositionValue;", "", "isReverse", "Landroid/graphics/RectF;", "imageRect", "viewRect", "Lkotlin/Function5;", "", "Lexpo/modules/image/records/CalcAxisOffset;", "calcAxisOffset", "calcOffset", "(Ljava/lang/Object;ZLandroid/graphics/RectF;Landroid/graphics/RectF;Lie/q;)Ljava/lang/Float;", "offsetX", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)F", "offsetY", "Landroid/graphics/Matrix;", "to", "LTd/L;", "apply$expo_image_release", "(Landroid/graphics/Matrix;Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "apply", "top", "Ljava/lang/Object;", "getTop", "()Ljava/lang/Object;", "getTop$annotations", "bottom", "getBottom", "getBottom$annotations", "right", "getRight", "getRight$annotations", "left", "getLeft", "getLeft$annotations", "Companion", "a", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentPosition implements InterfaceC5364b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ContentPosition center = new ContentPosition();
    private final Object bottom;
    private final Object left;
    private final Object right;
    private final Object top;

    /* JADX INFO: renamed from: expo.modules.image.records.ContentPosition$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ContentPosition a() {
            return ContentPosition.center;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46108a = new b();

        b() {
            super(5, n.class, "calcXTranslation", "calcXTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        @Override // ie.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return j(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }

        public final Float j(float f10, RectF p12, RectF p22, boolean z10, boolean z11) {
            AbstractC5504s.h(p12, "p1");
            AbstractC5504s.h(p22, "p2");
            return Float.valueOf(n.b(f10, p12, p22, z10, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class c extends AbstractC5502p implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46109a = new c();

        c() {
            super(5, n.class, "calcXTranslation", "calcXTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        @Override // ie.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return j(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }

        public final Float j(float f10, RectF p12, RectF p22, boolean z10, boolean z11) {
            AbstractC5504s.h(p12, "p1");
            AbstractC5504s.h(p22, "p2");
            return Float.valueOf(n.b(f10, p12, p22, z10, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class d extends AbstractC5502p implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f46110a = new d();

        d() {
            super(5, n.class, "calcYTranslation", "calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        @Override // ie.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return j(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }

        public final Float j(float f10, RectF p12, RectF p22, boolean z10, boolean z11) {
            AbstractC5504s.h(p12, "p1");
            AbstractC5504s.h(p22, "p2");
            return Float.valueOf(n.d(f10, p12, p22, z10, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class e extends AbstractC5502p implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f46111a = new e();

        e() {
            super(5, n.class, "calcYTranslation", "calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F", 1);
        }

        @Override // ie.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return j(((Number) obj).floatValue(), (RectF) obj2, (RectF) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }

        public final Float j(float f10, RectF p12, RectF p22, boolean z10, boolean z11) {
            AbstractC5504s.h(p12, "p1");
            AbstractC5504s.h(p22, "p2");
            return Float.valueOf(n.d(f10, p12, p22, z10, z11));
        }
    }

    private final Float calcOffset(Object obj, boolean z10, RectF rectF, RectF rectF2, q qVar) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Float) qVar.invoke(Float.valueOf((float) ((Number) obj).doubleValue()), rectF, rectF2, Boolean.FALSE, Boolean.valueOf(z10));
        }
        String str = (String) obj;
        return Float.valueOf(AbstractC5504s.c(str, "center") ? ((Number) qVar.invoke(Float.valueOf(50.0f), rectF, rectF2, Boolean.TRUE, Boolean.valueOf(z10))).floatValue() : ((Number) qVar.invoke(Float.valueOf(Float.parseFloat(r.D0(str, "%"))), rectF, rectF2, Boolean.TRUE, Boolean.valueOf(z10))).floatValue());
    }

    private final float offsetX(RectF imageRect, RectF viewRect) {
        Float fCalcOffset = calcOffset(this.left, false, imageRect, viewRect, b.f46108a);
        if (fCalcOffset != null) {
            return fCalcOffset.floatValue();
        }
        Float fCalcOffset2 = calcOffset(this.right, true, imageRect, viewRect, c.f46109a);
        return fCalcOffset2 != null ? fCalcOffset2.floatValue() : n.c(50.0f, imageRect, viewRect, true, false, 16, null);
    }

    private final float offsetY(RectF imageRect, RectF viewRect) {
        Float fCalcOffset = calcOffset(this.top, false, imageRect, viewRect, d.f46110a);
        if (fCalcOffset != null) {
            return fCalcOffset.floatValue();
        }
        Float fCalcOffset2 = calcOffset(this.bottom, true, imageRect, viewRect, e.f46111a);
        return fCalcOffset2 != null ? fCalcOffset2.floatValue() : n.e(50.0f, imageRect, viewRect, true, false, 16, null);
    }

    public final void apply$expo_image_release(Matrix to, RectF imageRect, RectF viewRect) {
        AbstractC5504s.h(to, "to");
        AbstractC5504s.h(imageRect, "imageRect");
        AbstractC5504s.h(viewRect, "viewRect");
        to.postTranslate(offsetX(imageRect, viewRect), offsetY(imageRect, viewRect));
    }

    public final Object getBottom() {
        return this.bottom;
    }

    public final Object getLeft() {
        return this.left;
    }

    public final Object getRight() {
        return this.right;
    }

    public final Object getTop() {
        return this.top;
    }

    @InterfaceC5363a
    public static /* synthetic */ void getBottom$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getLeft$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getRight$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getTop$annotations() {
    }
}
