package Ib;

import b5.AbstractC3012n;
import expo.modules.image.enums.ContentFit;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o f8881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ContentFit f8882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8883l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8884a;

        static {
            int[] iArr = new int[ContentFit.values().length];
            try {
                iArr[ContentFit.Contain.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentFit.Cover.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentFit.ScaleDown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8884a = iArr;
        }
    }

    public b(o target, ContentFit contentFit) {
        AbstractC5504s.h(target, "target");
        AbstractC5504s.h(contentFit, "contentFit");
        this.f8881j = target;
        this.f8882k = contentFit;
    }

    private final float c(float f10, float f11, float f12, float f13) {
        int i10 = a.f8884a[this.f8882k.ordinal()];
        if (i10 == 1) {
            return Math.min(f12 / f10, f13 / f11);
        }
        if (i10 == 2) {
            return Float.max(f12 / f10, f13 / f11);
        }
        if (i10 != 3) {
            return 1.0f;
        }
        if (f12 < f10 || f13 < f11) {
            return Math.min(f12 / f10, f13 / f11);
        }
        return 1.0f;
    }

    @Override // b5.AbstractC3012n
    public AbstractC3012n.g a(int i10, int i11, int i12, int i13) {
        return AbstractC3012n.g.QUALITY;
    }

    @Override // b5.AbstractC3012n
    public float b(int i10, int i11, int i12, int i13) {
        if (!this.f8883l) {
            this.f8881j.B(i10);
            this.f8881j.A(i11);
            this.f8883l = true;
        }
        if (i12 == Integer.MIN_VALUE || i13 == Integer.MIN_VALUE) {
            return 1.0f;
        }
        return Math.min(1.0f, c(i10, i11, i12, i13));
    }
}
