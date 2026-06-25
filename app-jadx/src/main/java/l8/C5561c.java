package l8;

import m8.C5647a;

/* JADX INFO: renamed from: l8.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5561c extends C5563e {

    /* JADX INFO: renamed from: m */
    static final int f52674m = C5563e.a("ANMF");

    /* JADX INFO: renamed from: d */
    int f52675d;

    /* JADX INFO: renamed from: e */
    int f52676e;

    /* JADX INFO: renamed from: f */
    int f52677f;

    /* JADX INFO: renamed from: g */
    int f52678g;

    /* JADX INFO: renamed from: h */
    int f52679h;

    /* JADX INFO: renamed from: i */
    byte f52680i;

    /* JADX INFO: renamed from: j */
    C5559a f52681j;

    /* JADX INFO: renamed from: k */
    C5567i f52682k;

    /* JADX INFO: renamed from: l */
    C5568j f52683l;

    @Override // l8.C5563e
    void b(C5647a c5647a) {
        int iAvailable = c5647a.available();
        this.f52675d = c5647a.d();
        this.f52676e = c5647a.d();
        this.f52677f = c5647a.a();
        this.f52678g = c5647a.a();
        this.f52679h = c5647a.d();
        this.f52680i = c5647a.peek();
        long j10 = iAvailable - this.f52692b;
        while (c5647a.available() > j10) {
            C5563e c5563eC = m.c(c5647a);
            if (c5563eC instanceof C5559a) {
                this.f52681j = (C5559a) c5563eC;
            } else if (c5563eC instanceof C5567i) {
                this.f52682k = (C5567i) c5563eC;
            } else if (c5563eC instanceof C5568j) {
                this.f52683l = (C5568j) c5563eC;
            }
        }
    }

    boolean d() {
        return (this.f52680i & 2) == 2;
    }

    boolean e() {
        return (this.f52680i & 1) == 1;
    }
}
