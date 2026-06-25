package Pb;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends PictureDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13755b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Picture picture, int i10, int i11) {
        super(picture);
        AbstractC5504s.h(picture, "picture");
        this.f13754a = i10;
        this.f13755b = i11;
    }

    public final int a() {
        return this.f13755b;
    }

    public final int b() {
        return this.f13754a;
    }
}
