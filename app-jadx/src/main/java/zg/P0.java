package zg;

import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
abstract class P0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InputStream f66364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66365b;

    P0(InputStream inputStream, int i10) {
        this.f66364a = inputStream;
        this.f66365b = i10;
    }

    int a() {
        return this.f66365b;
    }

    protected void b(boolean z10) {
        InputStream inputStream = this.f66364a;
        if (inputStream instanceof M0) {
            ((M0) inputStream).h(z10);
        }
    }
}
