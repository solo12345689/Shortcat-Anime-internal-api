.class final Lt/O$a$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/O$a;-><init>(Lt/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field e:I

.field private synthetic f:Ljava/lang/Object;

.field final synthetic g:Lt/O;

.field final synthetic h:Lt/O$a;


# direct methods
.method constructor <init>(Lt/O;Lt/O$a;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt/O$a$a;->g:Lt/O;

    .line 2
    .line 3
    iput-object p2, p0, Lt/O$a$a;->h:Lt/O$a;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LCf/k;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lt/O$a$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lt/O$a$a;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lt/O$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance v0, Lt/O$a$a;

    .line 2
    .line 3
    iget-object v1, p0, Lt/O$a$a;->g:Lt/O;

    .line 4
    .line 5
    iget-object v2, p0, Lt/O$a$a;->h:Lt/O$a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lt/O$a$a;-><init>(Lt/O;Lt/O$a;LZd/e;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lt/O$a$a;->f:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LCf/k;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lt/O$a$a;->a(LCf/k;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lt/O$a$a;->e:I

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
    iget v1, p0, Lt/O$a$a;->d:I

    .line 13
    .line 14
    iget-object v3, p0, Lt/O$a$a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, [J

    .line 17
    .line 18
    iget-object v4, p0, Lt/O$a$a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Lt/O;

    .line 21
    .line 22
    iget-object v5, p0, Lt/O$a$a;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Lt/O$a;

    .line 25
    .line 26
    iget-object v6, p0, Lt/O$a$a;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, LCf/k;

    .line 29
    .line 30
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lt/O$a$a;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, LCf/k;

    .line 48
    .line 49
    iget-object v1, p0, Lt/O$a$a;->g:Lt/O;

    .line 50
    .line 51
    invoke-static {v1}, Lt/O;->d(Lt/O;)Lt/N;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v3, p0, Lt/O$a$a;->h:Lt/O$a;

    .line 56
    .line 57
    iget-object v4, p0, Lt/O$a$a;->g:Lt/O;

    .line 58
    .line 59
    iget-object v5, v1, Lt/Z;->c:[J

    .line 60
    .line 61
    iget v1, v1, Lt/Z;->e:I

    .line 62
    .line 63
    move-object v6, v5

    .line 64
    move-object v5, v3

    .line 65
    move-object v3, v6

    .line 66
    move-object v6, p1

    .line 67
    :goto_0
    const p1, 0x7fffffff

    .line 68
    .line 69
    .line 70
    if-eq v1, p1, :cond_3

    .line 71
    .line 72
    aget-wide v7, v3, v1

    .line 73
    .line 74
    const/16 p1, 0x1f

    .line 75
    .line 76
    shr-long/2addr v7, p1

    .line 77
    const-wide/32 v9, 0x7fffffff

    .line 78
    .line 79
    .line 80
    and-long/2addr v7, v9

    .line 81
    long-to-int p1, v7

    .line 82
    invoke-virtual {v5, v1}, Lt/O$a;->b(I)V

    .line 83
    .line 84
    .line 85
    invoke-static {v4}, Lt/O;->d(Lt/O;)Lt/N;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    iget-object v7, v7, Lt/Z;->b:[Ljava/lang/Object;

    .line 90
    .line 91
    aget-object v1, v7, v1

    .line 92
    .line 93
    iput-object v6, p0, Lt/O$a$a;->f:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v5, p0, Lt/O$a$a;->a:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v4, p0, Lt/O$a$a;->b:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v3, p0, Lt/O$a$a;->c:Ljava/lang/Object;

    .line 100
    .line 101
    iput p1, p0, Lt/O$a$a;->d:I

    .line 102
    .line 103
    iput v2, p0, Lt/O$a$a;->e:I

    .line 104
    .line 105
    invoke-virtual {v6, v1, p0}, LCf/k;->d(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    if-ne v1, v0, :cond_2

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_2
    move v1, p1

    .line 113
    goto :goto_0

    .line 114
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 115
    .line 116
    return-object p1
.end method
