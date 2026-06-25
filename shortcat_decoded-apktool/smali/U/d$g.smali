.class final LU/d$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LU0/Y0;ZLkotlin/jvm/functions/Function2;Lie/o;FLC/P;LU/k0;LU/m0;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:F

.field final synthetic c:LU/m0;


# direct methods
.method constructor <init>(LU/m0;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/d$g;->c:LU/m0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LGf/O;FLZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, LU/d$g;

    .line 2
    .line 3
    iget-object v0, p0, LU/d$g;->c:LU/m0;

    .line 4
    .line 5
    invoke-direct {p1, v0, p3}, LU/d$g;-><init>(LU/m0;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput p2, p1, LU/d$g;->b:F

    .line 9
    .line 10
    sget-object p2, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, LU/d$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/O;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, LZd/e;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, LU/d$g;->a(LGf/O;FLZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LU/d$g;->a:I

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
    iget p1, p0, LU/d$g;->b:F

    .line 28
    .line 29
    iget-object v1, p0, LU/d$g;->c:LU/m0;

    .line 30
    .line 31
    invoke-interface {v1}, LU/m0;->getState()LU/n0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v3, p0, LU/d$g;->c:LU/m0;

    .line 36
    .line 37
    invoke-interface {v3}, LU/m0;->c()Lw/z;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v4, p0, LU/d$g;->c:LU/m0;

    .line 42
    .line 43
    invoke-interface {v4}, LU/m0;->d()Lw/i;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iput v2, p0, LU/d$g;->a:I

    .line 48
    .line 49
    invoke-static {v1, p1, v3, v4, p0}, LU/d;->l(LU/n0;FLw/z;Lw/i;LZd/e;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 57
    .line 58
    return-object p1
.end method
