.class public final Lub/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LIf/g;

.field private final b:LGf/C0;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    const/4 v1, -0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v1, v2, v2, v0, v2}, LIf/j;->b(ILIf/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LIf/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lub/n;->a:LIf/g;

    .line 12
    .line 13
    sget-object v3, LGf/v0;->a:LGf/v0;

    .line 14
    .line 15
    new-instance v6, Lub/n$b;

    .line 16
    .line 17
    invoke-direct {v6, p0, v2}, Lub/n$b;-><init>(Lub/n;LZd/e;)V

    .line 18
    .line 19
    .line 20
    const/4 v7, 0x3

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lub/n;->b:LGf/C0;

    .line 29
    .line 30
    return-void
.end method

.method public static final synthetic a(Lub/n;)LIf/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lub/n;->a:LIf/g;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Lie/a;)V
    .locals 2

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lub/n$a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lub/n$a;-><init>(Lub/n;Lie/a;LZd/e;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-static {v1, v0, p1, v1}, LGf/i;->f(LZd/i;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
