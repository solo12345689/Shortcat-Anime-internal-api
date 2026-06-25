.class final Lib/o$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib/o;->onDestroy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lib/o;


# direct methods
.method constructor <init>(Lib/o;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lib/o$i;->d:Lib/o;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 1

    .line 1
    new-instance p1, Lib/o$i;

    .line 2
    .line 3
    iget-object v0, p0, Lib/o$i;->d:Lib/o;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lib/o$i;-><init>(Lib/o;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lib/o$i;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lib/o$i;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lib/o$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lib/o$i;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lib/o$i;->c:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lib/o$i;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lib/o;

    .line 19
    .line 20
    iget-object v1, p0, Lib/o$i;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, LPf/a;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object v1, p0, Lib/o$i;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lib/o;

    .line 42
    .line 43
    iget-object v3, p0, Lib/o$i;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, LPf/a;

    .line 46
    .line 47
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object p1, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lib/o$i;->d:Lib/o;

    .line 56
    .line 57
    invoke-static {p1}, Lib/o;->p(Lib/o;)LPf/a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v1, p0, Lib/o$i;->d:Lib/o;

    .line 62
    .line 63
    iput-object p1, p0, Lib/o$i;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v1, p0, Lib/o$i;->b:Ljava/lang/Object;

    .line 66
    .line 67
    iput v3, p0, Lib/o$i;->c:I

    .line 68
    .line 69
    invoke-interface {p1, v4, p0}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-ne v3, v0, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    :goto_0
    :try_start_1
    invoke-static {v1}, Lib/o;->o(Lib/o;)LGf/x;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iput-object p1, p0, Lib/o$i;->a:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v1, p0, Lib/o$i;->b:Ljava/lang/Object;

    .line 83
    .line 84
    iput v2, p0, Lib/o$i;->c:I

    .line 85
    .line 86
    invoke-interface {v3, p0}, LGf/W;->M0(LZd/e;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    if-ne v2, v0, :cond_4

    .line 91
    .line 92
    :goto_1
    return-object v0

    .line 93
    :cond_4
    move-object v0, v1

    .line 94
    move-object v1, p1

    .line 95
    :goto_2
    :try_start_2
    invoke-static {v0}, Lib/o;->q(Lib/o;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Lsb/i;

    .line 114
    .line 115
    invoke-static {v0}, Lib/o;->m(Lib/o;)Lcom/facebook/react/ReactActivity;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-interface {v2, v3}, Lsb/i;->b(Landroid/app/Activity;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    invoke-static {v0}, Lib/o;->n(Lib/o;)Lsb/h$a;

    .line 124
    .line 125
    .line 126
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    if-eqz p1, :cond_6

    .line 128
    .line 129
    :try_start_3
    invoke-virtual {v0}, Lib/o;->z()Lcom/facebook/react/t;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Lcom/facebook/react/t;->onDestroy()V

    .line 134
    .line 135
    .line 136
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :catch_0
    move-exception p1

    .line 140
    :try_start_4
    invoke-static {}, Lib/o;->r()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v2, "Exception occurred during onDestroy with delayed app loading"

    .line 145
    .line 146
    invoke-static {v0, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->d(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_6
    invoke-virtual {v0}, Lib/o;->z()Lcom/facebook/react/t;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Lcom/facebook/react/t;->onDestroy()V

    .line 159
    .line 160
    .line 161
    :goto_4
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 162
    .line 163
    invoke-interface {v1, v4}, LPf/a;->e(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    sget-object p1, LTd/L;->a:LTd/L;

    .line 167
    .line 168
    return-object p1

    .line 169
    :catchall_1
    move-exception v0

    .line 170
    move-object v1, p1

    .line 171
    move-object p1, v0

    .line 172
    :goto_5
    invoke-interface {v1, v4}, LPf/a;->e(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    throw p1
.end method
