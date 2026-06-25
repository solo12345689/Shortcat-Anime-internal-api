package o4;

import androidx.work.impl.WorkDatabase;
import p4.InterfaceC5931b;

/* JADX INFO: renamed from: o4.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5818C implements i4.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f54472c = i4.i.i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WorkDatabase f54473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC5931b f54474b;

    public C5818C(WorkDatabase workDatabase, InterfaceC5931b interfaceC5931b) {
        this.f54473a = workDatabase;
        this.f54474b = interfaceC5931b;
    }
}
