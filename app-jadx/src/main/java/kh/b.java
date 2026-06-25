package Kh;

import Mh.h;
import Mh.i;
import Mh.k;

/* JADX INFO: loaded from: classes5.dex */
public class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Mh.b f11163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f11164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f11165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Mh.a f11166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f11167i;

    public b(int i10, int i11, Mh.b bVar, i iVar, Mh.a aVar, h hVar, String str) {
        super(true, str);
        this.f11161c = i10;
        this.f11162d = i11;
        this.f11163e = bVar;
        this.f11164f = iVar;
        this.f11166h = aVar;
        this.f11165g = hVar;
        this.f11167i = new k(bVar, iVar).c();
    }

    public Mh.b c() {
        return this.f11163e;
    }

    public i d() {
        return this.f11164f;
    }

    public int e() {
        return this.f11162d;
    }

    public int f() {
        return this.f11161c;
    }

    public h g() {
        return this.f11165g;
    }

    public b(int i10, int i11, Mh.b bVar, i iVar, h hVar, String str) {
        this(i10, i11, bVar, iVar, Mh.c.a(bVar, iVar), hVar, str);
    }
}
