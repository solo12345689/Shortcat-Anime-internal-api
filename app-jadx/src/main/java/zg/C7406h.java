package zg;

import java.io.IOException;

/* JADX INFO: renamed from: zg.h */
/* JADX INFO: loaded from: classes5.dex */
public class C7406h extends IOException {

    /* JADX INFO: renamed from: a */
    private Throwable f66407a;

    C7406h(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f66407a;
    }

    C7406h(String str, Throwable th2) {
        super(str);
        this.f66407a = th2;
    }
}
