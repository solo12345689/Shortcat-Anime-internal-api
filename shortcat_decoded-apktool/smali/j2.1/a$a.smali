.class final Lj2/a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj2/a;->a(LJf/e;Ljava/lang/Object;Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;LZd/i;LY/m;II)LY/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/lifecycle/k;

.field final synthetic d:Landroidx/lifecycle/k$b;

.field final synthetic e:LZd/i;

.field final synthetic f:LJf/e;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;LZd/i;LJf/e;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj2/a$a;->c:Landroidx/lifecycle/k;

    .line 2
    .line 3
    iput-object p2, p0, Lj2/a$a;->d:Landroidx/lifecycle/k$b;

    .line 4
    .line 5
    iput-object p3, p0, Lj2/a$a;->e:LZd/i;

    .line 6
    .line 7
    iput-object p4, p0, Lj2/a$a;->f:LJf/e;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(LY/Z0;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lj2/a$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lj2/a$a;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lj2/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Lj2/a$a;

    .line 2
    .line 3
    iget-object v1, p0, Lj2/a$a;->c:Landroidx/lifecycle/k;

    .line 4
    .line 5
    iget-object v2, p0, Lj2/a$a;->d:Landroidx/lifecycle/k$b;

    .line 6
    .line 7
    iget-object v3, p0, Lj2/a$a;->e:LZd/i;

    .line 8
    .line 9
    iget-object v4, p0, Lj2/a$a;->f:LJf/e;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lj2/a$a;-><init>(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;LZd/i;LJf/e;LZd/e;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lj2/a$a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Z0;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lj2/a$a;->a(LY/Z0;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lj2/a$a;->a:I

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
    iget-object p1, p0, Lj2/a$a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LY/Z0;

    .line 30
    .line 31
    iget-object v1, p0, Lj2/a$a;->c:Landroidx/lifecycle/k;

    .line 32
    .line 33
    iget-object v3, p0, Lj2/a$a;->d:Landroidx/lifecycle/k$b;

    .line 34
    .line 35
    new-instance v4, Lj2/a$a$a;

    .line 36
    .line 37
    iget-object v5, p0, Lj2/a$a;->e:LZd/i;

    .line 38
    .line 39
    iget-object v6, p0, Lj2/a$a;->f:LJf/e;

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-direct {v4, v5, v6, p1, v7}, Lj2/a$a$a;-><init>(LZd/i;LJf/e;LY/Z0;LZd/e;)V

    .line 43
    .line 44
    .line 45
    iput v2, p0, Lj2/a$a;->a:I

    .line 46
    .line 47
    invoke-static {v1, v3, v4, p0}, Landroidx/lifecycle/F;->a(Landroidx/lifecycle/k;Landroidx/lifecycle/k$b;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 55
    .line 56
    return-object p1
.end method
