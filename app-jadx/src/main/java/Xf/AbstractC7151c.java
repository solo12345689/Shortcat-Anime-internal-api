package xf;

import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7151c implements Iterable, InterfaceC5371a {
    public /* synthetic */ AbstractC7151c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int b();

    public abstract void d(int i10, Object obj);

    public abstract Object get(int i10);

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    private AbstractC7151c() {
    }
}
