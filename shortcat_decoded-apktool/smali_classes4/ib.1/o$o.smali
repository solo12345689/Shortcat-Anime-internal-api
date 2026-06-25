.class final Lib/o$o;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib/o;->requestPermissions([Ljava/lang/String;ILq7/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lib/o;

.field final synthetic c:[Ljava/lang/String;

.field final synthetic d:I

.field final synthetic e:Lq7/g;


# direct methods
.method constructor <init>(Lib/o;[Ljava/lang/String;ILq7/g;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lib/o$o;->b:Lib/o;

    .line 2
    .line 3
    iput-object p2, p0, Lib/o$o;->c:[Ljava/lang/String;

    .line 4
    .line 5
    iput p3, p0, Lib/o$o;->d:I

    .line 6
    .line 7
    iput-object p4, p0, Lib/o$o;->e:Lq7/g;

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
    new-instance v0, Lib/o$o;

    .line 2
    .line 3
    iget-object v1, p0, Lib/o$o;->b:Lib/o;

    .line 4
    .line 5
    iget-object v2, p0, Lib/o$o;->c:[Ljava/lang/String;

    .line 6
    .line 7
    iget v3, p0, Lib/o$o;->d:I

    .line 8
    .line 9
    iget-object v4, p0, Lib/o$o;->e:Lq7/g;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lib/o$o;-><init>(Lib/o;[Ljava/lang/String;ILq7/g;LZd/e;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lib/o$o;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lib/o$o;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lib/o$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lib/o$o;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lib/o$o;->a:I

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
    iget-object p1, p0, Lib/o$o;->b:Lib/o;

    .line 28
    .line 29
    invoke-static {p1}, Lib/o;->o(Lib/o;)LGf/x;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput v2, p0, Lib/o$o;->a:I

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
    iget-object p1, p0, Lib/o$o;->b:Lib/o;

    .line 43
    .line 44
    invoke-virtual {p1}, Lib/o;->z()Lcom/facebook/react/t;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, Lib/o$o;->c:[Ljava/lang/String;

    .line 49
    .line 50
    iget v1, p0, Lib/o$o;->d:I

    .line 51
    .line 52
    iget-object v2, p0, Lib/o$o;->e:Lq7/g;

    .line 53
    .line 54
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/t;->requestPermissions([Ljava/lang/String;ILq7/g;)V

    .line 55
    .line 56
    .line 57
    sget-object p1, LTd/L;->a:LTd/L;

    .line 58
    .line 59
    return-object p1
.end method
