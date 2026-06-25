.class final LG/C$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG/C;->Y(IFLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LG/C;

.field final synthetic c:F

.field final synthetic d:I


# direct methods
.method constructor <init>(LG/C;FILZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/C$e;->b:LG/C;

    .line 2
    .line 3
    iput p2, p0, LG/C$e;->c:F

    .line 4
    .line 5
    iput p3, p0, LG/C$e;->d:I

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
.method public final a(Lz/u;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LG/C$e;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LG/C$e;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LG/C$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance p1, LG/C$e;

    .line 2
    .line 3
    iget-object v0, p0, LG/C$e;->b:LG/C;

    .line 4
    .line 5
    iget v1, p0, LG/C$e;->c:F

    .line 6
    .line 7
    iget v2, p0, LG/C$e;->d:I

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, LG/C$e;-><init>(LG/C;FILZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lz/u;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LG/C$e;->a(Lz/u;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LG/C$e;->a:I

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
    iget-object p1, p0, LG/C$e;->b:LG/C;

    .line 28
    .line 29
    iput v2, p0, LG/C$e;->a:I

    .line 30
    .line 31
    invoke-static {p1, p0}, LG/C;->g(LG/C;LZd/e;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    iget p1, p0, LG/C$e;->c:F

    .line 39
    .line 40
    float-to-double v0, p1

    .line 41
    const-wide/high16 v3, -0x4020000000000000L    # -0.5

    .line 42
    .line 43
    cmpg-double v3, v3, v0

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    if-gtz v3, :cond_3

    .line 47
    .line 48
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 49
    .line 50
    cmpg-double v0, v0, v5

    .line 51
    .line 52
    if-gtz v0, :cond_3

    .line 53
    .line 54
    move v4, v2

    .line 55
    :cond_3
    if-eqz v4, :cond_4

    .line 56
    .line 57
    iget-object p1, p0, LG/C$e;->b:LG/C;

    .line 58
    .line 59
    iget v0, p0, LG/C$e;->d:I

    .line 60
    .line 61
    invoke-static {p1, v0}, LG/C;->h(LG/C;I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iget-object v0, p0, LG/C$e;->b:LG/C;

    .line 66
    .line 67
    iget v1, p0, LG/C$e;->c:F

    .line 68
    .line 69
    invoke-virtual {v0, p1, v1, v2}, LG/C;->i0(IFZ)V

    .line 70
    .line 71
    .line 72
    sget-object p1, LTd/L;->a:LTd/L;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v1, "pageOffsetFraction "

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p1, " is not within the range -0.5 to 0.5"

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0
.end method
