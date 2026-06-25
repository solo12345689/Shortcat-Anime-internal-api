package mf;

import kotlin.jvm.functions.Function1;
import mf.C5681l;

/* JADX INFO: renamed from: mf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C5680k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5681l f53426a;

    public C5680k(C5681l c5681l) {
        this.f53426a = c5681l;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C5681l.c(this.f53426a, (C5681l.a) obj);
    }
}
