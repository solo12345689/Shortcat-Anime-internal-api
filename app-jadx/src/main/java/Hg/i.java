package Hg;

import Fg.j;

/* JADX INFO: loaded from: classes5.dex */
abstract class i {

    private static class a implements Fg.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Fg.d f8644c;

        public a(int i10, String str, Fg.d dVar) {
            this.f8642a = i10;
            this.f8643b = str;
            this.f8644c = dVar;
        }

        @Override // Fg.c
        public String t() {
            return this.f8643b;
        }
    }

    private static class b implements Fg.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Fg.d f8648d;

        public b(int i10, int i11, String str, Fg.d dVar) {
            this.f8645a = i10;
            this.f8646b = i11;
            this.f8647c = str;
            this.f8648d = dVar;
        }

        @Override // Fg.c
        public String t() {
            return this.f8647c;
        }
    }

    static Fg.c a(j jVar, int i10, Fg.d dVar) {
        return new b(jVar.d() * 4, i10, jVar.c(), dVar);
    }

    static Fg.c b(j jVar, Fg.d dVar) {
        return new a(jVar.d() * 4, jVar.c(), dVar);
    }
}
