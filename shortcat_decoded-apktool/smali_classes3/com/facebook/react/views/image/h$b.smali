.class final Lcom/facebook/react/views/image/h$b;
.super LK6/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/image/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lcom/facebook/react/views/image/h;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/image/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/image/h$b;->c:Lcom/facebook/react/views/image/h;

    .line 2
    .line 3
    invoke-direct {p0}, LK6/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;Lw6/d;)LC5/a;
    .locals 8

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "bitmapFactory"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v3, Landroid/graphics/Rect;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/views/image/h$b;->c:Lcom/facebook/react/views/image/h;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/facebook/react/views/image/h$b;->c:Lcom/facebook/react/views/image/h;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v3, v2, v2, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/views/image/h$b;->c:Lcom/facebook/react/views/image/h;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/facebook/react/views/image/h;->g(Lcom/facebook/react/views/image/h;)LV5/q;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {}, Lcom/facebook/react/views/image/h;->h()Landroid/graphics/Matrix;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-interface/range {v1 .. v7}, LV5/q;->a(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFF)Landroid/graphics/Matrix;

    .line 50
    .line 51
    .line 52
    new-instance v0, Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Landroid/graphics/BitmapShader;

    .line 62
    .line 63
    iget-object v2, p0, Lcom/facebook/react/views/image/h$b;->c:Lcom/facebook/react/views/image/h;

    .line 64
    .line 65
    invoke-static {v2}, Lcom/facebook/react/views/image/h;->i(Lcom/facebook/react/views/image/h;)Landroid/graphics/Shader$TileMode;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v4, p0, Lcom/facebook/react/views/image/h$b;->c:Lcom/facebook/react/views/image/h;

    .line 70
    .line 71
    invoke-static {v4}, Lcom/facebook/react/views/image/h;->i(Lcom/facebook/react/views/image/h;)Landroid/graphics/Shader$TileMode;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-direct {v1, p1, v2, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lcom/facebook/react/views/image/h;->h()Landroid/graphics/Matrix;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {v1, p1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/facebook/react/views/image/h$b;->c:Lcom/facebook/react/views/image/h;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iget-object v1, p0, Lcom/facebook/react/views/image/h$b;->c:Lcom/facebook/react/views/image/h;

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {p2, p1, v1}, Lw6/d;->a(II)LC5/a;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-string p2, "createBitmap(...)"

    .line 105
    .line 106
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :try_start_0
    new-instance p2, Landroid/graphics/Canvas;

    .line 110
    .line 111
    invoke-virtual {p1}, LC5/a;->C()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Landroid/graphics/Bitmap;

    .line 116
    .line 117
    invoke-direct {p2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, v3, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, LC5/a;->g()LC5/a;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    const-string v0, "clone(...)"

    .line 128
    .line 129
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, LC5/a;->m(LC5/a;)V

    .line 133
    .line 134
    .line 135
    return-object p2

    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move-object p2, v0

    .line 138
    invoke-static {p1}, LC5/a;->m(LC5/a;)V

    .line 139
    .line 140
    .line 141
    throw p2
.end method
