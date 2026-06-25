package q6;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static final b f57655a = new b();

    /* JADX INFO: renamed from: b */
    public static final c f57656b;

    /* JADX INFO: renamed from: c */
    public static final c f57657c;

    /* JADX INFO: renamed from: d */
    public static final c f57658d;

    /* JADX INFO: renamed from: e */
    public static final c f57659e;

    /* JADX INFO: renamed from: f */
    public static final c f57660f;

    /* JADX INFO: renamed from: g */
    public static final c f57661g;

    /* JADX INFO: renamed from: h */
    public static final c f57662h;

    /* JADX INFO: renamed from: i */
    public static final c f57663i;

    /* JADX INFO: renamed from: j */
    public static final c f57664j;

    /* JADX INFO: renamed from: k */
    public static final c f57665k;

    /* JADX INFO: renamed from: l */
    public static final c f57666l;

    /* JADX INFO: renamed from: m */
    public static final c f57667m;

    /* JADX INFO: renamed from: n */
    public static final c f57668n;

    /* JADX INFO: renamed from: o */
    public static final c f57669o;

    /* JADX INFO: renamed from: p */
    public static final List f57670p;

    static {
        c cVar = new c("JPEG", "jpeg");
        f57656b = cVar;
        c cVar2 = new c("PNG", "png");
        f57657c = cVar2;
        c cVar3 = new c("GIF", "gif");
        f57658d = cVar3;
        c cVar4 = new c("BMP", "bmp");
        f57659e = cVar4;
        c cVar5 = new c("ICO", "ico");
        f57660f = cVar5;
        c cVar6 = new c("WEBP_SIMPLE", "webp");
        f57661g = cVar6;
        c cVar7 = new c("WEBP_LOSSLESS", "webp");
        f57662h = cVar7;
        c cVar8 = new c("WEBP_EXTENDED", "webp");
        f57663i = cVar8;
        c cVar9 = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f57664j = cVar9;
        c cVar10 = new c("WEBP_ANIMATED", "webp");
        f57665k = cVar10;
        c cVar11 = new c("HEIF", "heif");
        f57666l = cVar11;
        f57667m = new c("DNG", "dng");
        c cVar12 = new c("BINARY_XML", "xml");
        f57668n = cVar12;
        c cVar13 = new c("AVIF", "avif");
        f57669o = cVar13;
        f57670p = AbstractC2279u.p(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13);
    }

    private b() {
    }

    public static final boolean a(c imageFormat) {
        AbstractC5504s.h(imageFormat, "imageFormat");
        return imageFormat == f57661g || imageFormat == f57662h || imageFormat == f57663i || imageFormat == f57664j;
    }

    public static final boolean b(c imageFormat) {
        AbstractC5504s.h(imageFormat, "imageFormat");
        return a(imageFormat) || imageFormat == f57665k;
    }
}
