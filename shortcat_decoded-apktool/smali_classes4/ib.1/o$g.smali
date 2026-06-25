.class final Lib/o$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib/o;->onConfigurationChanged(Landroid/content/res/Configuration;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lib/o;

.field final synthetic c:Landroid/content/res/Configuration;


# direct methods
.method constructor <init>(Lib/o;Landroid/content/res/Configuration;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lib/o$g;->b:Lib/o;

    .line 2
    .line 3
    iput-object p2, p0, Lib/o$g;->c:Landroid/content/res/Configuration;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance p1, Lib/o$g;

    .line 2
    .line 3
    iget-object v0, p0, Lib/o$g;->b:Lib/o;

    .line 4
    .line 5
    iget-object v1, p0, Lib/o$g;->c:Landroid/content/res/Configuration;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lib/o$g;-><init>(Lib/o;Landroid/content/res/Configuration;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lib/o$g;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lib/o$g;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lib/o$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lib/o$g;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lib/o$g;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lib/o$g;->b:Lib/o;

    .line 28
    .line 29
    invoke-static {p1}, Lib/o;->o(Lib/o;)LGf/x;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput v2, p0, Lib/o$g;->a:I

    .line 34
    .line 35
    invoke-interface {p1, p0}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    iget-object p1, p0, Lib/o$g;->b:Lib/o;

    .line 43
    .line 44
    invoke-virtual {p1}, Lib/o;->z()Lcom/facebook/react/t;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, Lib/o$g;->c:Landroid/content/res/Configuration;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/facebook/react/t;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 51
    .line 52
    .line 53
    sget-object p1, LTd/L;->a:LTd/L;

    .line 54
    .line 55
    return-object p1
.end method
