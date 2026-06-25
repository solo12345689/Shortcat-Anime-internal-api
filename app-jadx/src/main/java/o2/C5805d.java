package o2;

import androidx.lifecycle.U;
import androidx.lifecycle.W;
import he.AbstractC4945a;
import kotlin.jvm.internal.AbstractC5504s;
import m2.AbstractC5628a;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: o2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5805d implements W.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5805d f54229b = new C5805d();

    private C5805d() {
    }

    @Override // androidx.lifecycle.W.c
    public U create(InterfaceC6014d modelClass, AbstractC5628a extras) {
        AbstractC5504s.h(modelClass, "modelClass");
        AbstractC5504s.h(extras, "extras");
        return C5806e.f54230a.a(AbstractC4945a.b(modelClass));
    }
}
