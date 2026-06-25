package C6;

import E6.k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f2875a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, k encodedImage) {
        super(str);
        AbstractC5504s.h(encodedImage, "encodedImage");
        this.f2875a = encodedImage;
    }

    public final k a() {
        return this.f2875a;
    }
}
