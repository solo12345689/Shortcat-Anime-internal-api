.class final LK/i$n$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i$n;->invoke(LR0/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:LK/y;

.field final synthetic d:LR0/C;

.field final synthetic e:La1/U;


# direct methods
.method constructor <init>(ZZLK/y;LR0/C;La1/U;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LK/i$n$d;->a:Z

    .line 2
    .line 3
    iput-boolean p2, p0, LK/i$n$d;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, LK/i$n$d;->c:LK/y;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$n$d;->d:LR0/C;

    .line 8
    .line 9
    iput-object p5, p0, LK/i$n$d;->e:La1/U;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(LU0/e;)Ljava/lang/Boolean;
    .locals 10

    .line 1
    iget-boolean v0, p0, LK/i$n$d;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, LK/i$n$d;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, LK/i$n$d;->c:LK/y;

    .line 11
    .line 12
    invoke-virtual {v0}, LK/y;->g()La1/c0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, LK/i$n$d;->c:LK/y;

    .line 19
    .line 20
    sget-object v2, LK/L;->a:LK/L$a;

    .line 21
    .line 22
    new-instance v3, La1/o;

    .line 23
    .line 24
    invoke-direct {v3}, La1/o;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v4, La1/a;

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-direct {v4, p1, v5}, La1/a;-><init>(LU0/e;I)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    new-array v6, v6, [La1/i;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    aput-object v3, v6, v7

    .line 38
    .line 39
    aput-object v4, v6, v5

    .line 40
    .line 41
    invoke-static {v6}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1}, LK/y;->n()La1/l;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v1}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v2, v3, v4, v1, v0}, LK/L$a;->g(Ljava/util/List;La1/l;Lkotlin/jvm/functions/Function1;La1/c0;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, LTd/L;->a:LTd/L;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v0, 0x0

    .line 60
    :goto_0
    if-nez v0, :cond_2

    .line 61
    .line 62
    iget-object v0, p0, LK/i$n$d;->e:La1/U;

    .line 63
    .line 64
    iget-object v1, p0, LK/i$n$d;->c:LK/y;

    .line 65
    .line 66
    invoke-virtual {v0}, La1/U;->l()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v0}, La1/U;->k()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    invoke-static {v3, v4}, LU0/W0;->n(J)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-virtual {v0}, La1/U;->k()J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    invoke-static {v4, v5}, LU0/W0;->i(J)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-static {v2, v3, v4, p1}, LDf/r;->G0(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v0}, La1/U;->k()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    invoke-static {v2, v3}, LU0/W0;->n(J)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {p1}, LU0/e;->length()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    add-int/2addr v0, p1

    .line 107
    invoke-static {v0}, LU0/X0;->a(I)J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    invoke-virtual {v1}, LK/y;->m()Lkotlin/jvm/functions/Function1;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    new-instance v3, La1/U;

    .line 116
    .line 117
    const/4 v8, 0x4

    .line 118
    const/4 v9, 0x0

    .line 119
    const/4 v7, 0x0

    .line 120
    invoke-direct/range {v3 .. v9}, La1/U;-><init>(Ljava/lang/String;JLU0/W0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_3
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LU0/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LK/i$n$d;->a(LU0/e;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
