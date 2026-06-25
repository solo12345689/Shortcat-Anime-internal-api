package db;

import Ud.AbstractC2279u;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: db.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4577c extends AbstractC4576b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45087b;

    public C4577c(int i10) {
        super(false, 1, null);
        this.f45087b = i10;
    }

    @Override // db.InterfaceC4575a
    public void a(List drawingOperations) {
        AbstractC5504s.h(drawingOperations, "drawingOperations");
        if (b()) {
            int i10 = this.f45087b;
            for (int iO = AbstractC2279u.o(drawingOperations); i10 < iO; iO--) {
                Collections.swap(drawingOperations, i10, iO);
                i10++;
            }
        }
    }
}
