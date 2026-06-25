package b0;

import java.util.Collection;
import java.util.List;
import je.InterfaceC5372b;
import je.InterfaceC5374d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface e extends InterfaceC2966c, InterfaceC2965b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a extends List, Collection, InterfaceC5372b, InterfaceC5374d {
        e build();
    }

    @Override // java.util.List
    e add(int i10, Object obj);

    @Override // java.util.List, java.util.Collection
    e add(Object obj);

    @Override // java.util.List, java.util.Collection
    e addAll(Collection collection);

    a builder();

    e h0(int i10);

    @Override // java.util.List, java.util.Collection
    e remove(Object obj);

    @Override // java.util.List, java.util.Collection
    e removeAll(Collection collection);

    @Override // java.util.List
    e set(int i10, Object obj);

    e t1(Function1 function1);
}
