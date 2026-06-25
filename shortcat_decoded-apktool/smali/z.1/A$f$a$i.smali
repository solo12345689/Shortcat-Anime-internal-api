.class final Lz/A$f$a$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/A$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lie/o;

.field final synthetic c:Lz/s;

.field final synthetic d:LE0/C;


# direct methods
.method constructor <init>(Lie/o;Lz/s;LE0/C;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/A$f$a$i;->b:Lie/o;

    .line 2
    .line 3
    iput-object p2, p0, Lz/A$f$a$i;->c:Lz/s;

    .line 4
    .line 5
    iput-object p3, p0, Lz/A$f$a$i;->d:LE0/C;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance p1, Lz/A$f$a$i;

    .line 2
    .line 3
    iget-object v0, p0, Lz/A$f$a$i;->b:Lie/o;

    .line 4
    .line 5
    iget-object v1, p0, Lz/A$f$a$i;->c:Lz/s;

    .line 6
    .line 7
    iget-object v2, p0, Lz/A$f$a$i;->d:LE0/C;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lz/A$f$a$i;-><init>(Lie/o;Lz/s;LE0/C;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz/A$f$a$i;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lz/A$f$a$i;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lz/A$f$a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lz/A$f$a$i;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

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
    iget v1, p0, Lz/A$f$a$i;->a:I

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
    iget-object p1, p0, Lz/A$f$a$i;->b:Lie/o;

    .line 28
    .line 29
    iget-object v1, p0, Lz/A$f$a$i;->c:Lz/s;

    .line 30
    .line 31
    iget-object v3, p0, Lz/A$f$a$i;->d:LE0/C;

    .line 32
    .line 33
    invoke-virtual {v3}, LE0/C;->h()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-static {v3, v4}, Lr0/f;->d(J)Lr0/f;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iput v2, p0, Lz/A$f$a$i;->a:I

    .line 42
    .line 43
    invoke-interface {p1, v1, v3, p0}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 51
    .line 52
    return-object p1
.end method
