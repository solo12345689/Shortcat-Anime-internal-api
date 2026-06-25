package db;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: db.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4578d extends AbstractC4576b {
    public C4578d() {
        super(false, 1, null);
    }

    @Override // db.InterfaceC4575a
    public void a(List drawingOperations) {
        AbstractC5504s.h(drawingOperations, "drawingOperations");
        if (b()) {
            AbstractC2279u.Z(drawingOperations);
        }
    }
}
