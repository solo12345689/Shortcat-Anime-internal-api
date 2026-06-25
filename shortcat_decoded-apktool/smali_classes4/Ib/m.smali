.class public LIb/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LUb/d;

.field private final b:Lexpo/modules/image/records/SourceMap;

.field private final c:Lexpo/modules/image/records/ImageLoadOptions;


# direct methods
.method public constructor <init>(LUb/d;Lexpo/modules/image/records/SourceMap;Lexpo/modules/image/records/ImageLoadOptions;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "options"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LIb/m;->a:LUb/d;

    .line 20
    .line 21
    iput-object p2, p0, LIb/m;->b:Lexpo/modules/image/records/SourceMap;

    .line 22
    .line 23
    iput-object p3, p0, LIb/m;->c:Lexpo/modules/image/records/ImageLoadOptions;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic a(LIb/m;)Lexpo/modules/image/records/ImageLoadOptions;
    .locals 0

    .line 1
    iget-object p0, p0, LIb/m;->c:Lexpo/modules/image/records/ImageLoadOptions;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, LIb/m$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LIb/m$a;

    .line 7
    .line 8
    iget v1, v0, LIb/m$a;->c:I

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
    iput v1, v0, LIb/m$a;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LIb/m$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LIb/m$a;-><init>(LIb/m;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LIb/m$a;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LIb/m$a;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LIb/m;->a:LUb/d;

    .line 56
    .line 57
    invoke-virtual {p1}, LUb/d;->B()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_6

    .line 62
    .line 63
    iget-object v2, p0, LIb/m;->b:Lexpo/modules/image/records/SourceMap;

    .line 64
    .line 65
    invoke-virtual {v2, p1}, Lexpo/modules/image/records/SourceMap;->createGlideModelProvider(Landroid/content/Context;)LIb/k;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const/4 v4, 0x0

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-interface {v2}, LIb/k;->a()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v2, v4

    .line 78
    :goto_1
    :try_start_1
    invoke-static {}, LGf/f0;->b()LGf/K;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    new-instance v6, LIb/m$b;

    .line 83
    .line 84
    invoke-direct {v6, p1, v2, p0, v4}, LIb/m$b;-><init>(Landroid/content/Context;Ljava/lang/Object;LIb/m;LZd/e;)V

    .line 85
    .line 86
    .line 87
    iput v3, v0, LIb/m$a;->c:I

    .line 88
    .line 89
    invoke-static {v5, v6, v0}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v1, :cond_4

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_4
    :goto_2
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    iget-object v0, p0, LIb/m;->c:Lexpo/modules/image/records/ImageLoadOptions;

    .line 103
    .line 104
    invoke-virtual {v0}, Lexpo/modules/image/records/ImageLoadOptions;->getTintColor()Landroid/graphics/Color;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    move-object v0, p1

    .line 111
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 112
    .line 113
    iget-object v1, p0, LIb/m;->c:Lexpo/modules/image/records/ImageLoadOptions;

    .line 114
    .line 115
    invoke-virtual {v1}, Lexpo/modules/image/records/ImageLoadOptions;->getTintColor()Landroid/graphics/Color;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Lcom/facebook/react/bridge/m;->a(Landroid/graphics/Color;)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 124
    .line 125
    .line 126
    :cond_5
    new-instance v0, Lexpo/modules/image/Image;

    .line 127
    .line 128
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, p1}, Lexpo/modules/image/Image;-><init>(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :goto_3
    new-instance v0, LIb/l;

    .line 136
    .line 137
    invoke-direct {v0, p1}, LIb/l;-><init>(Ljava/lang/Exception;)V

    .line 138
    .line 139
    .line 140
    throw v0

    .line 141
    :cond_6
    new-instance p1, Lcc/i;

    .line 142
    .line 143
    invoke-direct {p1}, Lcc/i;-><init>()V

    .line 144
    .line 145
    .line 146
    throw p1
.end method
