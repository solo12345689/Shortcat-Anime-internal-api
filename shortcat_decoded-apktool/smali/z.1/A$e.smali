.class final Lz/A$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/A;->h(LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LE0/L;

.field final synthetic d:Lie/o;

.field final synthetic e:Lkotlin/jvm/functions/Function1;

.field final synthetic f:Lz/s;


# direct methods
.method constructor <init>(LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;Lz/s;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/A$e;->c:LE0/L;

    .line 2
    .line 3
    iput-object p2, p0, Lz/A$e;->d:Lie/o;

    .line 4
    .line 5
    iput-object p3, p0, Lz/A$e;->e:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iput-object p4, p0, Lz/A$e;->f:Lz/s;

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
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Lz/A$e;

    .line 2
    .line 3
    iget-object v1, p0, Lz/A$e;->c:LE0/L;

    .line 4
    .line 5
    iget-object v2, p0, Lz/A$e;->d:Lie/o;

    .line 6
    .line 7
    iget-object v3, p0, Lz/A$e;->e:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget-object v4, p0, Lz/A$e;->f:Lz/s;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lz/A$e;-><init>(LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;Lz/s;LZd/e;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lz/A$e;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz/A$e;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lz/A$e;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lz/A$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lz/A$e;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lz/A$e;->a:I

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
    iget-object p1, p0, Lz/A$e;->b:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v4, p1

    .line 30
    check-cast v4, LGf/O;

    .line 31
    .line 32
    iget-object p1, p0, Lz/A$e;->c:LE0/L;

    .line 33
    .line 34
    new-instance v3, Lz/A$e$a;

    .line 35
    .line 36
    iget-object v5, p0, Lz/A$e;->d:Lie/o;

    .line 37
    .line 38
    iget-object v6, p0, Lz/A$e;->e:Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    iget-object v7, p0, Lz/A$e;->f:Lz/s;

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    invoke-direct/range {v3 .. v8}, Lz/A$e$a;-><init>(LGf/O;Lie/o;Lkotlin/jvm/functions/Function1;Lz/s;LZd/e;)V

    .line 44
    .line 45
    .line 46
    iput v2, p0, Lz/A$e;->a:I

    .line 47
    .line 48
    invoke-static {p1, v3, p0}, Lz/o;->c(LE0/L;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

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
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 56
    .line 57
    return-object p1
.end method
