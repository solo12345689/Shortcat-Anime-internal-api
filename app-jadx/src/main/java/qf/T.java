package qf;

import java.util.List;
import kotlin.jvm.functions.Function1;
import rf.AbstractC6317g;

/* JADX INFO: loaded from: classes5.dex */
class T implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f58015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f58016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0 f58017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f58018d;

    public T(v0 v0Var, List list, r0 r0Var, boolean z10) {
        this.f58015a = v0Var;
        this.f58016b = list;
        this.f58017c = r0Var;
        this.f58018d = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return V.l(this.f58015a, this.f58016b, this.f58017c, this.f58018d, (AbstractC6317g) obj);
    }
}
