package Jg;

import Fg.o;

/* JADX INFO: loaded from: classes5.dex */
public class b extends o implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fg.a f9692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f9694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f9695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f9696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9697g;

    public b(Fg.a aVar) {
        super(aVar);
        this.f9692b = aVar;
        int iA = aVar.a();
        this.f9693c = iA;
        this.f9694d = new byte[iA];
        this.f9695e = new byte[iA];
        this.f9696f = new byte[iA];
        this.f9697g = 0;
    }

    public static a b(Fg.a aVar) {
        return new b(aVar);
    }

    @Override // Fg.a
    public int a() {
        return this.f9692b.a();
    }
}
