package androidx.work.impl;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f32700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f32701b;

    static {
        String strI = i4.i.i("WrkDbPathHelper");
        AbstractC5504s.g(strI, "tagWithPrefix(\"WrkDbPathHelper\")");
        f32700a = strI;
        f32701b = new String[]{"-journal", "-shm", "-wal"};
    }
}
