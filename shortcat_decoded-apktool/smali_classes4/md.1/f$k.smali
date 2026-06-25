.class final Lmd/f$k;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/f;->F(Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lmd/d;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:D

.field final synthetic e:Ljava/lang/Integer;

.field final synthetic f:Ljava/lang/Integer;

.field final synthetic g:Ljava/util/Map;


# direct methods
.method constructor <init>(Lmd/d;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd/f$k;->b:Lmd/d;

    .line 2
    .line 3
    iput-object p2, p0, Lmd/f$k;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, Lmd/f$k;->d:D

    .line 6
    .line 7
    iput-object p5, p0, Lmd/f$k;->e:Ljava/lang/Integer;

    .line 8
    .line 9
    iput-object p6, p0, Lmd/f$k;->f:Ljava/lang/Integer;

    .line 10
    .line 11
    iput-object p7, p0, Lmd/f$k;->g:Ljava/util/Map;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 9

    .line 1
    new-instance v0, Lmd/f$k;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/f$k;->b:Lmd/d;

    .line 4
    .line 5
    iget-object v2, p0, Lmd/f$k;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lmd/f$k;->d:D

    .line 8
    .line 9
    iget-object v5, p0, Lmd/f$k;->e:Ljava/lang/Integer;

    .line 10
    .line 11
    iget-object v6, p0, Lmd/f$k;->f:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v7, p0, Lmd/f$k;->g:Ljava/util/Map;

    .line 14
    .line 15
    move-object v8, p2

    .line 16
    invoke-direct/range {v0 .. v8}, Lmd/f$k;-><init>(Lmd/d;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;LZd/e;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lmd/f$k;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lmd/f$k;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lmd/f$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lmd/f$k;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lmd/f$k;->a:I

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
    return-object p1

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
    iget-object v1, p0, Lmd/f$k;->b:Lmd/d;

    .line 28
    .line 29
    move p1, v2

    .line 30
    iget-object v2, p0, Lmd/f$k;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v3, p0, Lmd/f$k;->d:D

    .line 33
    .line 34
    iget-object v5, p0, Lmd/f$k;->e:Ljava/lang/Integer;

    .line 35
    .line 36
    iget-object v6, p0, Lmd/f$k;->f:Ljava/lang/Integer;

    .line 37
    .line 38
    iget-object v7, p0, Lmd/f$k;->g:Ljava/util/Map;

    .line 39
    .line 40
    iput p1, p0, Lmd/f$k;->a:I

    .line 41
    .line 42
    move-object v8, p0

    .line 43
    invoke-virtual/range {v1 .. v8}, Lmd/d;->t(Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;LZd/e;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_2

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_2
    return-object p1
.end method
