.class public final LBd/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LBd/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LBd/i;

    .line 2
    .line 3
    invoke-direct {v0}, LBd/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LBd/i;->a:LBd/i;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(Ljava/lang/String;Lexpo/modules/updates/d;)LBd/h;
    .locals 2

    .line 1
    const-string v0, "runtimeVersion"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, LBd/h;

    .line 12
    .line 13
    new-instance v1, LBd/b;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, LBd/b;-><init>(Ljava/lang/String;Lexpo/modules/updates/d;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, LBd/d;

    .line 19
    .line 20
    invoke-direct {p0, p1}, LBd/d;-><init>(Lexpo/modules/updates/d;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, LBd/f;

    .line 24
    .line 25
    invoke-direct {p1}, LBd/f;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, p0, p1}, LBd/h;-><init>(LBd/a;LBd/c;LBd/e;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
