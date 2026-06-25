.class final Lw/a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/a;->s(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lw/a;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lw/a;Ljava/lang/Object;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/a$b;->b:Lw/a;

    .line 2
    .line 3
    iput-object p2, p0, Lw/a$b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lw/a$b;->create(LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lw/a$b;

    .line 6
    .line 7
    sget-object v0, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lw/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance v0, Lw/a$b;

    .line 2
    .line 3
    iget-object v1, p0, Lw/a$b;->b:Lw/a;

    .line 4
    .line 5
    iget-object v2, p0, Lw/a$b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lw/a$b;-><init>(Lw/a;Ljava/lang/Object;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LZd/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw/a$b;->a(LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lw/a$b;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lw/a$b;->b:Lw/a;

    .line 12
    .line 13
    invoke-static {p1}, Lw/a;->b(Lw/a;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lw/a$b;->b:Lw/a;

    .line 17
    .line 18
    iget-object v0, p0, Lw/a$b;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lw/a;->a(Lw/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, Lw/a$b;->b:Lw/a;

    .line 25
    .line 26
    invoke-virtual {v0}, Lw/a;->j()Lw/k;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, Lw/k;->v(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lw/a$b;->b:Lw/a;

    .line 34
    .line 35
    invoke-static {v0, p1}, Lw/a;->d(Lw/a;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, LTd/L;->a:LTd/L;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method
