package Tg;

import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
class b implements Pg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Permission f17559e = new Pg.b("BC", "threadLocalEcImplicitlyCa");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Permission f17560f = new Pg.b("BC", "ecImplicitlyCa");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Permission f17561g = new Pg.b("BC", "threadLocalDhDefaultParams");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Permission f17562h = new Pg.b("BC", "DhDefaultParams");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Permission f17563i = new Pg.b("BC", "acceptableEcCurves");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Permission f17564j = new Pg.b("BC", "additionalEcParameters");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadLocal f17565a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadLocal f17566b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Set f17567c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f17568d = new HashMap();

    b() {
    }
}
