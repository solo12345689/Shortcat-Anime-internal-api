.class public abstract Lx6/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(Ly5/n;LB5/d;Lx6/x$a;)Lx6/n;
    .locals 7

    .line 1
    new-instance v1, Lx6/r$a;

    .line 2
    .line 3
    invoke-direct {v1}, Lx6/r$a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lx6/w;

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    move-object v3, p0

    .line 12
    move-object v2, p2

    .line 13
    invoke-direct/range {v0 .. v6}, Lx6/w;-><init>(Lx6/D;Lx6/x$a;Ly5/n;Lx6/n$b;ZZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, LB5/d;->a(LB5/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
