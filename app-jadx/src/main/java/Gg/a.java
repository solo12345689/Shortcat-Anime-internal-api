package Gg;

import Fg.c;
import Fg.d;

/* JADX INFO: loaded from: classes5.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f7622d;

    public a(String str, int i10) {
        this(str, i10, null, d.ANY);
    }

    @Override // Fg.c
    public String t() {
        return this.f7619a;
    }

    public a(String str, int i10, Object obj, d dVar) {
        this.f7619a = str;
        this.f7620b = i10;
        this.f7621c = obj;
        if (obj instanceof d) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        this.f7622d = dVar;
    }
}
