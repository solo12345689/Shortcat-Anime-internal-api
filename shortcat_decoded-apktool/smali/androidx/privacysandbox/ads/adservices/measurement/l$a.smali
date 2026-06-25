.class final Landroidx/privacysandbox/ads/adservices/measurement/l$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/privacysandbox/ads/adservices/measurement/l;->l(Landroidx/privacysandbox/ads/adservices/measurement/l;Landroidx/privacysandbox/ads/adservices/measurement/m;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/privacysandbox/ads/adservices/measurement/l;


# direct methods
.method constructor <init>(Landroidx/privacysandbox/ads/adservices/measurement/m;Landroidx/privacysandbox/ads/adservices/measurement/l;LZd/e;)V
    .locals 0

    .line 1
    iput-object p2, p0, Landroidx/privacysandbox/ads/adservices/measurement/l$a;->c:Landroidx/privacysandbox/ads/adservices/measurement/l;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance v0, Landroidx/privacysandbox/ads/adservices/measurement/l$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Landroidx/privacysandbox/ads/adservices/measurement/l$a;->c:Landroidx/privacysandbox/ads/adservices/measurement/l;

    .line 5
    .line 6
    invoke-direct {v0, v1, v2, p2}, Landroidx/privacysandbox/ads/adservices/measurement/l$a;-><init>(Landroidx/privacysandbox/ads/adservices/measurement/m;Landroidx/privacysandbox/ads/adservices/measurement/l;LZd/e;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, v0, Landroidx/privacysandbox/ads/adservices/measurement/l$a;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/privacysandbox/ads/adservices/measurement/l$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/privacysandbox/ads/adservices/measurement/l$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/privacysandbox/ads/adservices/measurement/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/privacysandbox/ads/adservices/measurement/l$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/privacysandbox/ads/adservices/measurement/l$a;->a:I

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1

    .line 16
    :cond_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Landroidx/privacysandbox/ads/adservices/measurement/l$a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, LGf/O;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1
.end method
