.class public final Lc4/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lc4/f;


# instance fields
.field private final b:Lc4/l;

.field private final c:Ld4/a;


# direct methods
.method public constructor <init>(Lc4/l;Ld4/a;)V
    .locals 1

    .line 1
    const-string v0, "windowMetricsCalculator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "windowBackend"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lc4/i;->b:Lc4/l;

    .line 15
    .line 16
    iput-object p2, p0, Lc4/i;->c:Ld4/a;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic b(Lc4/i;)Ld4/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lc4/i;->c:Ld4/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)LJf/e;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc4/i$a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lc4/i$a;-><init>(Lc4/i;Landroid/content/Context;LZd/e;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LJf/g;->e(Lkotlin/jvm/functions/Function2;)LJf/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p1, v0}, LJf/g;->s(LJf/e;LZd/i;)LJf/e;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method
