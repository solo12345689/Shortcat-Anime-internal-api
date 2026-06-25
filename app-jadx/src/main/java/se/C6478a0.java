package se;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: se.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C6478a0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f59466a;

    public C6478a0(Function2 function2) {
        this.f59466a = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return AbstractC6484d0.G(this.f59466a, obj, obj2);
    }
}
