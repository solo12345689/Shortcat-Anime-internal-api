package Xe;

import Df.p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f21777a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f21778b = new p("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21779c = "$context_receiver";

    private g() {
    }

    public static final f a(int i10) {
        f fVarM = f.m(f21779c + '_' + i10);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return fVarM;
    }

    public static final String b(String name) {
        AbstractC5504s.h(name, "name");
        return f21778b.i(name, "_");
    }
}
