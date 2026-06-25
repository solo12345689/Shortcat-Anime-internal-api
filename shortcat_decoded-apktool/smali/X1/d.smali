.class public final LX1/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LT1/i;


# instance fields
.field private final a:LT1/i;


# direct methods
.method public constructor <init>(LT1/i;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LX1/d;->a:LT1/i;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LX1/d;->a:LT1/i;

    .line 2
    .line 3
    new-instance v1, LX1/d$a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, LX1/d$a;-><init>(Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1, p2}, LT1/i;->a(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public e()LJf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/d;->a:LT1/i;

    .line 2
    .line 3
    invoke-interface {v0}, LT1/i;->e()LJf/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
