.class public final Lib/o;
.super Lcom/facebook/react/t;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lib/o$a;
    }
.end annotation


# static fields
.field public static final q:Lib/o$a;

.field private static final r:Ljava/lang/String;


# instance fields
.field private final f:Lcom/facebook/react/ReactActivity;

.field private final g:Z

.field private h:Lcom/facebook/react/t;

.field private final i:Ljava/util/List;

.field private final j:Ljava/util/List;

.field private final k:Lt/a;

.field private final l:Lkotlin/Lazy;

.field private final m:Lkotlin/Lazy;

.field private final n:LGf/x;

.field private final o:LPf/a;

.field private final p:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lib/o$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lib/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lib/o;->q:Lib/o$a;

    .line 8
    .line 9
    const-class v0, Lcom/facebook/react/t;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lpe/d;->v()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lib/o;->r:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/ReactActivity;ZLcom/facebook/react/t;)V
    .locals 2

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "delegate"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/t;-><init>(Lcom/facebook/react/ReactActivity;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 16
    .line 17
    iput-boolean p2, p0, Lib/o;->g:Z

    .line 18
    .line 19
    iput-object p3, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 20
    .line 21
    sget-object p1, Lib/c;->b:Lib/c$a;

    .line 22
    .line 23
    invoke-virtual {p1}, Lib/c$a;->a()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance p2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eqz p3, :cond_0

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    check-cast p3, Lsb/g;

    .line 47
    .line 48
    iget-object v1, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 49
    .line 50
    invoke-interface {p3, v1}, Lsb/g;->b(Landroid/content/Context;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    const-string v1, "createReactActivityLifecycleListeners(...)"

    .line 55
    .line 56
    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p2, p3}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iput-object p2, p0, Lib/o;->i:Ljava/util/List;

    .line 64
    .line 65
    sget-object p1, Lib/c;->b:Lib/c$a;

    .line 66
    .line 67
    invoke-virtual {p1}, Lib/c$a;->a()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-eqz p3, :cond_1

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    check-cast p3, Lsb/g;

    .line 91
    .line 92
    iget-object v1, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 93
    .line 94
    invoke-interface {p3, v1}, Lsb/g;->d(Landroid/content/Context;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    const-string v1, "createReactActivityHandlers(...)"

    .line 99
    .line 100
    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p2, p3}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    iput-object p2, p0, Lib/o;->j:Ljava/util/List;

    .line 108
    .line 109
    new-instance p1, Lt/a;

    .line 110
    .line 111
    invoke-direct {p1}, Lt/a;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object p1, p0, Lib/o;->k:Lt/a;

    .line 115
    .line 116
    new-instance p1, Lib/k;

    .line 117
    .line 118
    invoke-direct {p1, p0}, Lib/k;-><init>(Lib/o;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iput-object p1, p0, Lib/o;->l:Lkotlin/Lazy;

    .line 126
    .line 127
    new-instance p1, Lib/l;

    .line 128
    .line 129
    invoke-direct {p1, p0}, Lib/l;-><init>(Lib/o;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iput-object p1, p0, Lib/o;->m:Lkotlin/Lazy;

    .line 137
    .line 138
    const/4 p1, 0x1

    .line 139
    invoke-static {v0, p1, v0}, LGf/z;->b(LGf/C0;ILjava/lang/Object;)LGf/x;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    iput-object p2, p0, Lib/o;->n:LGf/x;

    .line 144
    .line 145
    const/4 p2, 0x0

    .line 146
    invoke-static {p2, p1, v0}, LPf/g;->b(ZILjava/lang/Object;)LPf/a;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, p0, Lib/o;->o:LPf/a;

    .line 151
    .line 152
    new-instance p1, Lib/m;

    .line 153
    .line 154
    invoke-direct {p1}, Lib/m;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iput-object p1, p0, Lib/o;->p:Lkotlin/Lazy;

    .line 162
    .line 163
    return-void
.end method

.method private final A()Lcom/facebook/react/ReactHost;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/o;->l:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/ReactHost;

    .line 8
    .line 9
    return-object v0
.end method

.method private final B(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lib/o;->k:Lt/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/reflect/Method;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-class v0, Lcom/facebook/react/t;

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lib/o;->k:Lt/a;

    .line 23
    .line 24
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 31
    .line 32
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
.end method

.method private final D(LGf/Q;Lkotlin/jvm/functions/Function2;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;)Landroidx/lifecycle/l;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v4, Lib/o$c;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v4, p0, p2, v0}, Lib/o$c;-><init>(Lib/o;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v3, p1

    .line 17
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method static synthetic E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p1, LGf/Q;->a:LGf/Q;

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lib/o;->D(LGf/Q;Lkotlin/jvm/functions/Function2;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final F(Ljava/lang/String;ZLZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lib/o$e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lib/o$e;

    .line 7
    .line 8
    iget v1, v0, Lib/o$e;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lib/o$e;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lib/o$e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lib/o$e;-><init>(Lib/o;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lib/o$e;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lib/o$e;->d:I

    .line 32
    .line 33
    const-class v3, Ljava/lang/String;

    .line 34
    .line 35
    const-string v4, "loadApp"

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lib/o$e;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p3, p0, Lib/o;->j:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {p3}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    new-instance v2, Lib/j;

    .line 69
    .line 70
    invoke-direct {v2, p0}, Lib/j;-><init>(Lib/o;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p3, v2}, LCf/l;->L(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-static {p3}, LCf/l;->D(LCf/i;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    check-cast p3, Landroid/view/ViewGroup;

    .line 82
    .line 83
    if-eqz p3, :cond_8

    .line 84
    .line 85
    const-class p2, Lcom/facebook/react/t;

    .line 86
    .line 87
    const-string v0, "e"

    .line 88
    .line 89
    invoke-virtual {p2, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 97
    .line 98
    invoke-virtual {p2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    const-string v0, "null cannot be cast to non-null type com.facebook.react.ReactDelegate"

    .line 103
    .line 104
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    check-cast p2, Lcom/facebook/react/w;

    .line 108
    .line 109
    if-eqz p1, :cond_7

    .line 110
    .line 111
    invoke-virtual {p2, p1}, Lcom/facebook/react/w;->g(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Lcom/facebook/react/w;->f()Lcom/facebook/react/W;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const/4 p2, 0x0

    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_1

    .line 126
    :cond_3
    move-object v0, p2

    .line 127
    :goto_1
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 128
    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    move-object p2, v0

    .line 132
    check-cast p2, Landroid/view/ViewGroup;

    .line 133
    .line 134
    :cond_4
    if-eqz p2, :cond_5

    .line 135
    .line 136
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    const/4 p2, -0x1

    .line 140
    invoke-virtual {p3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 144
    .line 145
    invoke-virtual {p1, p3}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lib/o;->i:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-eqz p2, :cond_6

    .line 159
    .line 160
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    check-cast p2, Lsb/i;

    .line 165
    .line 166
    iget-object p3, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 167
    .line 168
    invoke-interface {p2, p3}, Lsb/i;->d(Landroid/app/Activity;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 173
    .line 174
    return-object p1

    .line 175
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    const-string p2, "Required value was null."

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :cond_8
    if-eqz p2, :cond_b

    .line 184
    .line 185
    invoke-direct {p0}, Lib/o;->y()Lsb/h$a;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    iput-object p1, v0, Lib/o$e;->a:Ljava/lang/Object;

    .line 190
    .line 191
    iput v5, v0, Lib/o$e;->d:I

    .line 192
    .line 193
    invoke-direct {p0, p2, v0}, Lib/o;->u(Lsb/h$a;LZd/e;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    if-ne p2, v1, :cond_9

    .line 198
    .line 199
    return-object v1

    .line 200
    :cond_9
    :goto_3
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    filled-new-array {p1}, [Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p0, v4, p2, p1}, Lib/o;->C(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    iget-object p1, p0, Lib/o;->i:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    if-eqz p2, :cond_a

    .line 222
    .line 223
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    check-cast p2, Lsb/i;

    .line 228
    .line 229
    iget-object p3, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 230
    .line 231
    invoke-interface {p2, p3}, Lsb/i;->d(Landroid/app/Activity;)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_a
    sget-object p1, LTd/L;->a:LTd/L;

    .line 236
    .line 237
    return-object p1

    .line 238
    :cond_b
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    filled-new-array {p1}, [Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-virtual {p0, v4, p2, p1}, Lib/o;->C(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    iget-object p1, p0, Lib/o;->i:Ljava/util/List;

    .line 250
    .line 251
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    if-eqz p2, :cond_c

    .line 260
    .line 261
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    check-cast p2, Lsb/i;

    .line 266
    .line 267
    iget-object p3, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 268
    .line 269
    invoke-interface {p2, p3}, Lsb/i;->d(Landroid/app/Activity;)V

    .line 270
    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_c
    sget-object p1, LTd/L;->a:LTd/L;

    .line 274
    .line 275
    return-object p1
.end method

.method private static final G(Lib/o;Lsb/h;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lsb/h;->b(Landroid/app/Activity;)Landroid/view/ViewGroup;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static final H(Lib/o;Lsb/h;)Lcom/facebook/react/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 2
    .line 3
    invoke-interface {p1, v0, p0}, Lsb/h;->a(Lcom/facebook/react/ReactActivity;Lcom/facebook/react/t;)Lcom/facebook/react/t;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic e(Lib/o;Lsb/h;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lib/o;->G(Lib/o;Lsb/h;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f()LGf/O;
    .locals 1

    .line 1
    invoke-static {}, Lib/o;->t()LGf/O;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic g(Lib/o;Lsb/h;)Lcom/facebook/react/t;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lib/o;->H(Lib/o;Lsb/h;)Lcom/facebook/react/t;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Lib/o;)Lcom/facebook/react/ReactHost;
    .locals 0

    .line 1
    invoke-static {p0}, Lib/o;->k(Lib/o;)Lcom/facebook/react/ReactHost;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Lib/o;)Lsb/h$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lib/o;->v(Lib/o;)Lsb/h$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic j(Lib/o;Lsb/h;)Lsb/h$a;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lib/o;->w(Lib/o;Lsb/h;)Lsb/h$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final k(Lib/o;)Lcom/facebook/react/ReactHost;
    .locals 0

    .line 1
    iget-object p0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/t;->getReactHost()Lcom/facebook/react/ReactHost;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final synthetic l(Lib/o;Lsb/h$a;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lib/o;->u(Lsb/h$a;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(Lib/o;)Lcom/facebook/react/ReactActivity;
    .locals 0

    .line 1
    iget-object p0, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lib/o;)Lsb/h$a;
    .locals 0

    .line 1
    invoke-direct {p0}, Lib/o;->y()Lsb/h$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lib/o;)LGf/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lib/o;->n:LGf/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lib/o;)LPf/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lib/o;->o:LPf/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lib/o;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lib/o;->i:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lib/o;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic s(Lib/o;Ljava/lang/String;ZLZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lib/o;->F(Ljava/lang/String;ZLZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final t()LGf/O;
    .locals 1

    .line 1
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method private final u(Lsb/h$a;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, LZd/k;

    .line 7
    .line 8
    invoke-static {p2}, Lae/b;->c(LZd/e;)LZd/e;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lib/o$b;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lib/o$b;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v1}, Lsb/h$a;->a(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-ne p1, p2, :cond_2

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 44
    .line 45
    return-object p1
.end method

.method private static final v(Lib/o;)Lsb/h$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lib/o;->j:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lib/n;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lib/n;-><init>(Lib/o;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, LCf/l;->L(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, LCf/l;->D(LCf/i;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lsb/h$a;

    .line 21
    .line 22
    return-object p0
.end method

.method private static final w(Lib/o;Lsb/h;)Lsb/h$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 2
    .line 3
    invoke-virtual {p0}, Lib/o;->getReactHost()Lcom/facebook/react/ReactHost;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p1, v0, p0}, Lsb/h;->c(Lcom/facebook/react/ReactActivity;Lcom/facebook/react/ReactHost;)Lsb/h$a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private final x()LGf/O;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/o;->p:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LGf/O;

    .line 8
    .line 9
    return-object v0
.end method

.method private final y()Lsb/h$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/o;->m:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsb/h$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final C(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "argTypes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "args"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lib/o;->k:Lt/a;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lt/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/reflect/Method;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    array-length v0, p2

    .line 27
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, [Ljava/lang/Class;

    .line 32
    .line 33
    const-class v0, Lcom/facebook/react/t;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-virtual {v0, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lib/o;->k:Lt/a;

    .line 44
    .line 45
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 52
    .line 53
    array-length p2, p3

    .line 54
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method protected composeLaunchOptions()Landroid/os/Bundle;
    .locals 1

    .line 1
    const-string v0, "composeLaunchOptions"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lib/o;->B(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/os/Bundle;

    .line 8
    .line 9
    return-object v0
.end method

.method protected createRootView()Lcom/facebook/react/W;
    .locals 1

    .line 1
    const-string v0, "createRootView"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lib/o;->B(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/W;

    .line 8
    .line 9
    return-object v0
.end method

.method protected getContext()Landroid/content/Context;
    .locals 1

    .line 1
    const-string v0, "getContext"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lib/o;->B(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    return-object v0
.end method

.method protected getLaunchOptions()Landroid/os/Bundle;
    .locals 1

    .line 1
    const-string v0, "getLaunchOptions"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lib/o;->B(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/os/Bundle;

    .line 8
    .line 9
    return-object v0
.end method

.method public getMainComponentName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/t;->getMainComponentName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method protected getPlainActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    const-string v0, "getPlainActivity"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lib/o;->B(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    return-object v0
.end method

.method protected getReactDelegate()Lcom/facebook/react/w;
    .locals 1

    .line 1
    const-string v0, "getReactDelegate"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lib/o;->B(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/w;

    .line 8
    .line 9
    return-object v0
.end method

.method public getReactHost()Lcom/facebook/react/ReactHost;
    .locals 1

    .line 1
    invoke-direct {p0}, Lib/o;->A()Lcom/facebook/react/ReactHost;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getReactInstanceManager()Lcom/facebook/react/H;
    .locals 2

    .line 1
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/t;->getReactInstanceManager()Lcom/facebook/react/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getReactInstanceManager(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method protected isFabricEnabled()Z
    .locals 1

    .line 1
    const-string v0, "isFabricEnabled"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lib/o;->B(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method protected isWideColorGamutEnabled()Z
    .locals 1

    .line 1
    const-string v0, "isWideColorGamutEnabled"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lib/o;->B(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method protected loadApp(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, LGf/Q;->d:LGf/Q;

    .line 2
    .line 3
    new-instance v1, Lib/o$d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lib/o$d;-><init>(Lib/o;Ljava/lang/String;LZd/e;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Lib/o;->D(LGf/Q;Lkotlin/jvm/functions/Function2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .line 1
    new-instance v0, Lib/o$f;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move v2, p1

    .line 6
    move v3, p2

    .line 7
    move-object v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Lib/o$f;-><init>(Lib/o;IILandroid/content/Intent;LZd/e;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-static {p0, p2, v0, p1, p2}, Lib/o;->E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onBackPressed()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lib/o;->n:LGf/x;

    .line 2
    .line 3
    invoke-interface {v0}, LGf/C0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lib/o;->i:Ljava/util/List;

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lsb/i;

    .line 39
    .line 40
    invoke-interface {v3}, Lsb/i;->onBackPressed()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_2
    move v2, v1

    .line 57
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v4, 0x1

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    :cond_3
    move v2, v4

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/facebook/react/t;->onBackPressed()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v2, :cond_6

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    return v1

    .line 92
    :cond_6
    :goto_2
    return v4
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    const-string v0, "newConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lib/o$g;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lib/o$g;-><init>(Lib/o;Landroid/content/res/Configuration;LZd/e;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-static {p0, v1, v0, p1, v1}, Lib/o;->E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lib/o;->j:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lib/i;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lib/i;-><init>(Lib/o;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, LCf/l;->L(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, LCf/l;->D(LCf/i;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/facebook/react/t;

    .line 21
    .line 22
    iget-object v1, p0, Lib/o;->j:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lsb/h;

    .line 39
    .line 40
    iget-object v3, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 41
    .line 42
    invoke-interface {v2, v3, v0}, Lsb/h;->d(Lcom/facebook/react/ReactActivity;Lcom/facebook/react/t;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    const-class v1, Lcom/facebook/react/ReactActivity;

    .line 55
    .line 56
    const-string v2, "h"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const/4 v2, 0x1

    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 64
    .line 65
    .line 66
    const-class v3, Ljava/lang/reflect/Field;

    .line 67
    .line 68
    const-string v4, "accessFlags"

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    and-int/lit8 v2, v2, -0x11

    .line 82
    .line 83
    invoke-virtual {v3, v1, v2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 87
    .line 88
    invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Lcom/facebook/react/t;->onCreate(Landroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    sget-object v0, LGf/Q;->d:LGf/Q;

    .line 98
    .line 99
    new-instance v1, Lib/o$h;

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    invoke-direct {v1, p0, v2}, Lib/o$h;-><init>(Lib/o;LZd/e;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, v0, v1}, Lib/o;->D(LGf/Q;Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    iget-object v0, p0, Lib/o;->i:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Lsb/i;

    .line 125
    .line 126
    iget-object v2, p0, Lib/o;->f:Lcom/facebook/react/ReactActivity;

    .line 127
    .line 128
    invoke-interface {v1, v2, p1}, Lsb/i;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_2
    return-void
.end method

.method public onDestroy()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lib/o;->x()LGf/O;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lib/o$i;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lib/o$i;-><init>(Lib/o;LZd/e;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lib/o;->n:LGf/x;

    .line 7
    .line 8
    invoke-interface {v0}, LGf/C0;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget-object v0, p0, Lib/o;->j:Ljava/util/List;

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v3, 0xa

    .line 21
    .line 22
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lsb/h;

    .line 44
    .line 45
    invoke-interface {v3, p1, p2}, Lsb/h;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_2
    move v2, v1

    .line 62
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v4, 0x1

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    :cond_3
    move v2, v4

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    if-nez v2, :cond_6

    .line 86
    .line 87
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 88
    .line 89
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/t;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    return v1

    .line 97
    :cond_6
    :goto_2
    return v4
.end method

.method public onKeyLongPress(ILandroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lib/o;->n:LGf/x;

    .line 7
    .line 8
    invoke-interface {v0}, LGf/C0;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget-object v0, p0, Lib/o;->j:Ljava/util/List;

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v3, 0xa

    .line 21
    .line 22
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lsb/h;

    .line 44
    .line 45
    invoke-interface {v3, p1, p2}, Lsb/h;->onKeyLongPress(ILandroid/view/KeyEvent;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_2
    move v2, v1

    .line 62
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v4, 0x1

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    :cond_3
    move v2, v4

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    if-nez v2, :cond_6

    .line 86
    .line 87
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 88
    .line 89
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/t;->onKeyLongPress(ILandroid/view/KeyEvent;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    return v1

    .line 97
    :cond_6
    :goto_2
    return v4
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lib/o;->n:LGf/x;

    .line 7
    .line 8
    invoke-interface {v0}, LGf/C0;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget-object v0, p0, Lib/o;->j:Ljava/util/List;

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v3, 0xa

    .line 21
    .line 22
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lsb/h;

    .line 44
    .line 45
    invoke-interface {v3, p1, p2}, Lsb/h;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :cond_2
    move v2, v1

    .line 62
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v4, 0x1

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    if-eqz v3, :cond_2

    .line 82
    .line 83
    :cond_3
    move v2, v4

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    if-nez v2, :cond_6

    .line 86
    .line 87
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 88
    .line 89
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/t;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    return v1

    .line 97
    :cond_6
    :goto_2
    return v4
.end method

.method public onNewIntent(Landroid/content/Intent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lib/o;->n:LGf/x;

    .line 2
    .line 3
    invoke-interface {v0}, LGf/C0;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lib/o;->i:Ljava/util/List;

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lsb/i;

    .line 39
    .line 40
    invoke-interface {v3, p1}, Lsb/i;->onNewIntent(Landroid/content/Intent;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_2
    move v2, v1

    .line 57
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v4, 0x1

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    :cond_3
    move v2, v4

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Lcom/facebook/react/t;->onNewIntent(Landroid/content/Intent;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez v2, :cond_6

    .line 87
    .line 88
    if-eqz p1, :cond_5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    return v1

    .line 92
    :cond_6
    :goto_2
    return v4
.end method

.method public onPause()V
    .locals 3

    .line 1
    new-instance v0, Lib/o$j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lib/o$j;-><init>(Lib/o;LZd/e;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {p0, v1, v0, v2, v1}, Lib/o;->E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 7

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "grantResults"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lib/o$k;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    move-object v2, p0

    .line 15
    move v3, p1

    .line 16
    move-object v4, p2

    .line 17
    move-object v5, p3

    .line 18
    invoke-direct/range {v1 .. v6}, Lib/o$k;-><init>(Lib/o;I[Ljava/lang/String;[ILZd/e;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-static {p0, p2, v1, p1, p2}, Lib/o;->E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    new-instance v0, Lib/o$l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lib/o$l;-><init>(Lib/o;LZd/e;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {p0, v1, v0, v2, v1}, Lib/o;->E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onUserLeaveHint()V
    .locals 3

    .line 1
    new-instance v0, Lib/o$m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lib/o$m;-><init>(Lib/o;LZd/e;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {p0, v1, v0, v2, v1}, Lib/o;->E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    new-instance v0, Lib/o$n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lib/o$n;-><init>(Lib/o;ZLZd/e;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-static {p0, v1, v0, p1, v1}, Lib/o;->E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public requestPermissions([Ljava/lang/String;ILq7/g;)V
    .locals 7

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lib/o$o;

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v2, p0

    .line 10
    move-object v3, p1

    .line 11
    move v4, p2

    .line 12
    move-object v5, p3

    .line 13
    invoke-direct/range {v1 .. v6}, Lib/o$o;-><init>(Lib/o;[Ljava/lang/String;ILq7/g;LZd/e;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-static {p0, p2, v1, p1, p2}, Lib/o;->E(Lib/o;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final z()Lcom/facebook/react/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lib/o;->h:Lcom/facebook/react/t;

    .line 2
    .line 3
    return-object v0
.end method
