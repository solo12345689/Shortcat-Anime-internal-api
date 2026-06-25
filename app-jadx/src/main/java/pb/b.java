package Pb;

import Ib.d;
import S4.h;
import U4.v;
import a5.j;
import android.content.Context;
import android.graphics.Picture;
import android.graphics.RectF;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g5.InterfaceC4854e;
import kotlin.jvm.internal.AbstractC5504s;
import q5.g;
import q5.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements InterfaceC4854e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13753a;

    public b(Context context) {
        AbstractC5504s.h(context, "context");
        this.f13753a = context;
    }

    @Override // g5.InterfaceC4854e
    public v a(v toTranscode, h options) {
        AbstractC5504s.h(toTranscode, "toTranscode");
        AbstractC5504s.h(options, "options");
        Object obj = toTranscode.get();
        AbstractC5504s.g(obj, "get(...)");
        g gVar = (g) obj;
        RectF rectFG = gVar.g();
        int iHeight = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        int iWidth = rectFG != null ? (int) rectFG.width() : 512;
        RectF rectFG2 = gVar.g();
        if (rectFG2 != null) {
            iHeight = (int) rectFG2.height();
        }
        Integer num = (Integer) options.c(d.f8885a.a());
        if (num != null) {
            l.b(gVar, num.intValue());
        }
        Picture pictureO = gVar.o();
        AbstractC5504s.g(pictureO, "renderToPicture(...)");
        return new j(new c(pictureO, iWidth, iHeight));
    }
}
