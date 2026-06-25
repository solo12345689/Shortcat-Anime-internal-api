.class final Landroidx/compose/ui/window/b$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/window/t;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/ui/window/m;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/m;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/b$e;->c:Landroidx/compose/ui/window/m;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/window/b$e;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/window/b$e;->c:Landroidx/compose/ui/window/m;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/compose/ui/window/b$e;-><init>(Landroidx/compose/ui/window/m;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/compose/ui/window/b$e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/b$e;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/window/b$e;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/window/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/b$e;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/ui/window/b$e;->a:I

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
    iget-object v1, p0, Landroidx/compose/ui/window/b$e;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LGf/O;

    .line 15
    .line 16
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/compose/ui/window/b$e;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, LGf/O;

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    :goto_0
    invoke-static {v1}, LGf/P;->g(LGf/O;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    sget-object p1, Landroidx/compose/ui/window/b$e$a;->a:Landroidx/compose/ui/window/b$e$a;

    .line 43
    .line 44
    iput-object v1, p0, Landroidx/compose/ui/window/b$e;->b:Ljava/lang/Object;

    .line 45
    .line 46
    iput v2, p0, Landroidx/compose/ui/window/b$e;->a:I

    .line 47
    .line 48
    invoke-static {p1, p0}, Landroidx/compose/ui/platform/Q0;->a(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    :goto_1
    iget-object p1, p0, Landroidx/compose/ui/window/b$e;->c:Landroidx/compose/ui/window/m;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/compose/ui/window/m;->k()V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 62
    .line 63
    return-object p1
.end method
