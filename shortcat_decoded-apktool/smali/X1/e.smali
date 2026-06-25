.class public final LX1/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LX1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LX1/e;

    .line 2
    .line 3
    invoke-direct {v0}, LX1/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LX1/e;->a:LX1/e;

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


# virtual methods
.method public final a(LT1/E;LU1/b;Ljava/util/List;LGf/O;)LT1/i;
    .locals 2

    .line 1
    const-string v0, "storage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "migrations"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "scope"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LX1/d;

    .line 17
    .line 18
    sget-object v1, LT1/j;->a:LT1/j;

    .line 19
    .line 20
    invoke-virtual {v1, p1, p2, p3, p4}, LT1/j;->a(LT1/E;LU1/b;Ljava/util/List;LGf/O;)LT1/i;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {v0, p1}, LX1/d;-><init>(LT1/i;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final b(LU1/b;Ljava/util/List;LGf/O;Lie/a;)LT1/i;
    .locals 7

    .line 1
    const-string v0, "migrations"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scope"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "produceFile"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LT1/o;

    .line 17
    .line 18
    sget-object v2, LX1/h;->a:LX1/h;

    .line 19
    .line 20
    new-instance v4, LX1/e$a;

    .line 21
    .line 22
    invoke-direct {v4, p4}, LX1/e$a;-><init>(Lie/a;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct/range {v1 .. v6}, LT1/o;-><init>(LT1/A;Lkotlin/jvm/functions/Function1;Lie/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1, p1, p2, p3}, LX1/e;->a(LT1/E;LU1/b;Ljava/util/List;LGf/O;)LT1/i;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance p2, LX1/d;

    .line 36
    .line 37
    invoke-direct {p2, p1}, LX1/d;-><init>(LT1/i;)V

    .line 38
    .line 39
    .line 40
    return-object p2
.end method
