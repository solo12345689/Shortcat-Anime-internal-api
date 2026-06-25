.class public abstract Lp5/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp5/a$d;,
        Lp5/a$g;,
        Lp5/a$e;,
        Lp5/a$f;
    }
.end annotation


# static fields
.field private static final a:Lp5/a$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp5/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lp5/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp5/a;->a:Lp5/a$g;

    .line 7
    .line 8
    return-void
.end method

.method private static a(LK1/d;Lp5/a$d;)LK1/d;
    .locals 1

    .line 1
    invoke-static {}, Lp5/a;->c()Lp5/a$g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, v0}, Lp5/a;->b(LK1/d;Lp5/a$d;Lp5/a$g;)LK1/d;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private static b(LK1/d;Lp5/a$d;Lp5/a$g;)LK1/d;
    .locals 1

    .line 1
    new-instance v0, Lp5/a$e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lp5/a$e;-><init>(LK1/d;Lp5/a$d;Lp5/a$g;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static c()Lp5/a$g;
    .locals 1

    .line 1
    sget-object v0, Lp5/a;->a:Lp5/a$g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static d(ILp5/a$d;)LK1/d;
    .locals 1

    .line 1
    new-instance v0, LK1/e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LK1/e;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, Lp5/a;->a(LK1/d;Lp5/a$d;)LK1/d;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static e()LK1/d;
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-static {v0}, Lp5/a;->f(I)LK1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static f(I)LK1/d;
    .locals 2

    .line 1
    new-instance v0, LK1/e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LK1/e;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lp5/a$b;

    .line 7
    .line 8
    invoke-direct {p0}, Lp5/a$b;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lp5/a$c;

    .line 12
    .line 13
    invoke-direct {v1}, Lp5/a$c;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p0, v1}, Lp5/a;->b(LK1/d;Lp5/a$d;Lp5/a$g;)LK1/d;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
