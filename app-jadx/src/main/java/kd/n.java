package Kd;

import H2.i;
import P9.X;
import Ud.AbstractC2279u;
import android.net.Uri;
import expo.modules.video.records.VideoTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import q2.AbstractC6079K;
import q2.C6109x;
import q2.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {
    public static final List b(h0 h0Var, androidx.media3.exoplayer.hls.d dVar) {
        i.b bVar;
        H2.i iVar;
        List list;
        Object next;
        ArrayList arrayList = new ArrayList();
        X it = h0Var.b().iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            h0.a aVar = (h0.a) it.next();
            int i10 = aVar.f56884a;
            for (int i11 = 0; i11 < i10; i11++) {
                C6109x c6109xD = aVar.d(i11);
                AbstractC5504s.g(c6109xD, "getTrackFormat(...)");
                boolean zJ = aVar.j(i11);
                if (dVar == null || (iVar = dVar.f30866a) == null || (list = iVar.f7804e) == null) {
                    bVar = null;
                } else {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (AbstractC5504s.c(((i.b) next).f7818b.f57008a, c6109xD.f57008a)) {
                            break;
                        }
                    }
                    bVar = (i.b) next;
                }
                Uri uri = bVar != null ? bVar.f7817a : null;
                if (AbstractC6079K.t(c6109xD.f57022o)) {
                    arrayList.add(VideoTrack.INSTANCE.a(c6109xD, zJ, uri));
                }
            }
        }
        return AbstractC2279u.j0(arrayList);
    }
}
