.class public final LT1/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LT1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LT1/j;

    .line 2
    .line 3
    invoke-direct {v0}, LT1/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LT1/j;->a:LT1/j;

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
    .locals 1

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
    if-eqz p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p2, LU1/a;

    .line 20
    .line 21
    invoke-direct {p2}, LU1/a;-><init>()V

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object v0, LT1/h;->a:LT1/h$a;

    .line 25
    .line 26
    invoke-virtual {v0, p3}, LT1/h$a;->b(Ljava/util/List;)Lkotlin/jvm/functions/Function2;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-static {p3}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    new-instance v0, LT1/k;

    .line 35
    .line 36
    invoke-direct {v0, p1, p3, p2, p4}, LT1/k;-><init>(LT1/E;Ljava/util/List;LT1/e;LGf/O;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method
