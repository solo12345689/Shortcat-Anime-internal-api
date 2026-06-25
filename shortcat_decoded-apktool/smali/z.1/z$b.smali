.class final Lz/z$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/z;->n(JLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:J

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Lz/z;

.field final synthetic g:Lkotlin/jvm/internal/M;

.field final synthetic h:J


# direct methods
.method constructor <init>(Lz/z;Lkotlin/jvm/internal/M;JLZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/z$b;->f:Lz/z;

    .line 2
    .line 3
    iput-object p2, p0, Lz/z$b;->g:Lkotlin/jvm/internal/M;

    .line 4
    .line 5
    iput-wide p3, p0, Lz/z$b;->h:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lz/p;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lz/z$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lz/z$b;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lz/z$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Lz/z$b;

    .line 2
    .line 3
    iget-object v1, p0, Lz/z$b;->f:Lz/z;

    .line 4
    .line 5
    iget-object v2, p0, Lz/z$b;->g:Lkotlin/jvm/internal/M;

    .line 6
    .line 7
    iget-wide v3, p0, Lz/z$b;->h:J

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lz/z$b;-><init>(Lz/z;Lkotlin/jvm/internal/M;JLZd/e;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lz/z$b;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lz/p;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lz/z$b;->a(Lz/p;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
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
    iget v1, p0, Lz/z$b;->d:I

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
    iget-wide v0, p0, Lz/z$b;->c:J

    .line 13
    .line 14
    iget-object v2, p0, Lz/z$b;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lkotlin/jvm/internal/M;

    .line 17
    .line 18
    iget-object v3, p0, Lz/z$b;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lz/z;

    .line 21
    .line 22
    iget-object v4, p0, Lz/z$b;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Lz/z;

    .line 25
    .line 26
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lz/z$b;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lz/p;

    .line 44
    .line 45
    new-instance v1, Lz/z$b$a;

    .line 46
    .line 47
    iget-object v3, p0, Lz/z$b;->f:Lz/z;

    .line 48
    .line 49
    invoke-direct {v1, v3, p1}, Lz/z$b$a;-><init>(Lz/z;Lz/p;)V

    .line 50
    .line 51
    .line 52
    iget-object v3, p0, Lz/z$b;->f:Lz/z;

    .line 53
    .line 54
    iget-object p1, p0, Lz/z$b;->g:Lkotlin/jvm/internal/M;

    .line 55
    .line 56
    iget-wide v4, p0, Lz/z$b;->h:J

    .line 57
    .line 58
    invoke-static {v3}, Lz/z;->a(Lz/z;)Lz/n;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    iget-wide v7, p1, Lkotlin/jvm/internal/M;->a:J

    .line 63
    .line 64
    invoke-static {v3, v4, v5}, Lz/z;->l(Lz/z;J)F

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-virtual {v3, v4}, Lz/z;->t(F)F

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    iput-object v3, p0, Lz/z$b;->e:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v3, p0, Lz/z$b;->a:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p1, p0, Lz/z$b;->b:Ljava/lang/Object;

    .line 77
    .line 78
    iput-wide v7, p0, Lz/z$b;->c:J

    .line 79
    .line 80
    iput v2, p0, Lz/z$b;->d:I

    .line 81
    .line 82
    invoke-interface {v6, v1, v4, p0}, Lz/n;->a(Lz/u;FLZd/e;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-ne v1, v0, :cond_2

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_2
    move-object v2, p1

    .line 90
    move-object p1, v1

    .line 91
    move-object v4, v3

    .line 92
    move-wide v0, v7

    .line 93
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {v4, p1}, Lz/z;->t(F)F

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-static {v3, v0, v1, p1}, Lz/z;->m(Lz/z;JF)J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    iput-wide v0, v2, Lkotlin/jvm/internal/M;->a:J

    .line 108
    .line 109
    sget-object p1, LTd/L;->a:LTd/L;

    .line 110
    .line 111
    return-object p1
.end method
